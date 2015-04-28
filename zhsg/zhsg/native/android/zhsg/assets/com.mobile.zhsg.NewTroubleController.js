//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.NewTroubleController');
com.mobile.zhsg.NewTroubleController = function() {
    com.mobile.zhsg.NewTroubleController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$NewTroubleController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$mobile$zhsg$NewTroubleController$evaljs(js){
    eval(js)
}

function addAttachment(sender, args){
	var att_length = 0;
	if($ctx.getString("attachments")!=""){
		var attachments = $ctx.getJSONArray("attachments");
		att_length = attachments.length;		
	}
	$ctx.put("att_length",att_length);
	
	if(att_length>9){
			alert("最多只能选择9张图片");
	}else{
		var json = {
		"viewid":"widget0",
		"single" : "true",
		"popgravity":"popbottom"
		};
	$view.openPop(json)
	}
	
}

function openCamera() {
  $camera.open({
      bindfield : "attachment",
      callback : "setphoto()"
  })
}

function  openPhoto(){
//  $camera.openPhotoAlbum({
//      bindfield : "attachment",
//      callback : "setphoto()"
//  })

	$view.open({
		"viewid" : "com.mobile.zhsg.SelectImage",//目标页面（首字母大写）全名，
		"isKeep" : "true",
		"callback":"imagecallback()"
	});
}

function imagecallback(){
    if($ctx.getString("attachments")!=""){
        attachments = $ctx.getJSONArray("attachments");
    }else{
        attachments = new Array();
    }

    var att_length = $ctx.getString("att_length");
 	var json = $param.getJSONObject("selectedimages");
	$alert("json:" + $jsonToString(json));
    attachments.push(json);
    $ctx.put("attachments",attachments);
	var len = json.length;
//	att_length = len+ att_length;
	var total_length = len+ parseInt(att_length);
	if(total_length>3&&total_length<=6){
		$id("attpanel2").set("display", "block");
	}else if(total_length>6){
		$id("attpanel2").set("display", "block");
		$id("attpanel3").set("display", "block");
	}
    alert(total_length);
	for(var i = att_length;i<=total_length;i++){
		$id("attimage"+i).set("visible", true);
        $id("attimage"+i).setAttribute("src",json[i-1]);
        alert(json[i-1]);
	}
		
	/*
	for(var i=0;i<9;i++){
		$id("image"+i).set("display", "none");
	}
	for(var i = 0; i < len; i++){
		$id("image"+i).set("src", json[i]);
		$id("image"+i).set("display", "block");
    }
    if(len<9){
    	$id("image"+i).set("src", "icon_add.png");
    	$id("image"+i).set("display", "block");
    }
    */
}

function openFile() {
  
}

function setphoto(){
	var attachment = $ctx.getString("attachment");
	var attachments;
	if($ctx.getString("attachments")!=""){
		attachments = $ctx.getJSONArray("attachments");
	}else{
		attachments = new Array();
	} 
	var att_length = attachments.push(attachment);
//	alert(att_length);
	$ctx.put("attachments",attachments);
	
	if(attachments.length>0){
		if(attachments.length<4){
			$id("attachment"+attachments.length).setAttribute("display", "block");
			$id("attachment"+attachments.length).set("src", attachment);
		}
	}
}

function addDay(sender, args){
	var day = new String(sender).charAt(3);
//	alert(day);
	var dayArray = $id("dateinput0").get("value").split("-");
	var nowday = new Date(dayArray[0],parseInt(dayArray[1]),parseInt(dayArray[2]));
//	alert(nowday);
    var targetday = new Date(nowday.getTime()+day*24*60*60*1000);

	$id("dateinput0").set("value",targetday.getFullYear()+"-"+(targetday.getMonth()<10?("0"+targetday.getMonth()):targetday.getMonth())+"-"+(targetday.getDate()<10?("0"+targetday.getDate()):targetday.getDate()));

}


function addPic(sender, args){
	var addimage = $id(sender).get("src");
	if(addimage=="addimg_normal.png"){
		addAttachment();
	}

}
function area(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.OpeAreaRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"mycallback()"//回调的JS方法
	});
}


function org(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.OrgRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"mycallback()"//回调的JS方法
	});
}


function person(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.PersonRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"mycallback()"//回调的JS方法
	});

}


function type(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.TypeRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"mycallback()"//回调的JS方法
	});

}


function sendPerson(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.SendPersonRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"mycallback()"//回调的JS方法
	});
}

function commit(sender, args){

}
com.mobile.zhsg.NewTroubleController.prototype = {
    initialize : com$mobile$zhsg$NewTroubleController$initialize,
    evaljs : com$mobile$zhsg$NewTroubleController$evaljs
};
com.mobile.zhsg.NewTroubleController.registerClass('com.mobile.zhsg.NewTroubleController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
