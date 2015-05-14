//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.RectificatedTroubleController');
com.mobile.zhsg.RectificatedTroubleController = function() {
    com.mobile.zhsg.RectificatedTroubleController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$RectificatedTroubleController$initialize(){
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
    
function com$mobile$zhsg$RectificatedTroubleController$evaljs(js){
    eval(js)
}

var img_length = 5;

function load(sender, args){
	var row = $param.getJSONObject("row");
	var level = row.safe_yh_level;

	if(level=="NORMAL"){
		$id("label1").set("background", "#1680fa");
	}else{
		$id("label1").set("background", "#ff3c3c");
	}
    var rowstate = row.rowstate;
    if(rowstate == "Created"){
         $id("label3").set("background-image","created.png");
    }else if(rowstate == "Issued"){
        $id("label3").set("background-image","issued.png");
    }else if(rowstate == "Rectificated"){
        $id("label3").set("background-image","rectificated.png");
    }else if(rowstate == "Revised"){
        $id("label3").set("background-image","revised.png");
    }else if(rowstate == "Closed"){
        $id("label3").set("background-image","closed.png");
    }
	$ctx.push(row);

    var rectification_period = row.rectification_period.replace("-","/");
    var day = (new Date(rectification_period) - new Date())/(24*60*60*1000)
    if(day<=-1){
        $id("period").set("color","#FF3c3c");
    }
    if(day<=1&& day>-1){
        $id("period").set("color","#FF7777");
    }
    if(day<=3&&day>1){
        $id("period").set("color","#feb568");
    }
    if(day<=7&&day>3){
        $id("period").set("color","#fedb6e");
    }
}
function redo(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.BackTrouble",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"load()",//回调的JS方法
		"row": $ctx.getJSONObject()
	});
}

function back(sender, args){
	$view.close();
}
function rectificate(sender, args){
	$ctx.dataCollect();
	var json = $ctx.getJSONObject();
	if(json.drafter==null||json.drafter==""){
		json["drafter"] = $cache.read("username");
	};
	json["rowstate"] = "Closed";
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//提交隐患
		"action" : "modify",//方法名,
		"params" : json,//自定义参数
		"contextmapping":"none",
		"callback" : function(){
//			uploadImg (json);
			$view.close({
			"resultCode" : "15"
//			"result" : $ctx.getJSONObject()
			})
		},//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})


}

function error(sender,msg){
	alert($jsonToString(msg));
}
function loadSmallPic(sender, args){
    var json = $ctx.getJSONObject();
    
    if(sender == "beforegallery"){
        var befoerUrl = json["beforeUrl"];
        if(befoerUrl!=null && befoerUrl !=""){
            for(var i = 0 ; i<befoerUrl.length ; i++){

            }
        }


    }else if(sender == "aftergallery"){


    }

}

    function downloadPic(url){
        var filename = url.substring(url.lastIndexOf("/")+1 , url.length-1);
       $file.download({
           "url" : url,//下载文件的url
           "locate" : "download/image",//下载后文件存放的路径
           "filename" : filename,//下载后重命名的文件名
           "override" : "true",//下载后是否覆盖同名文件
           "callback" : "downloadCB()"//下载后的回调方法,locate+filename可以访问文件(即download/image/newfile.png)
       })
    }
function openBigPic(sender, args){
	if(sender == "beforegallery"){
		
		
	}else if(sender == "aftergallery"){
		
		
	}
}
com.mobile.zhsg.RectificatedTroubleController.prototype = {
    initialize : com$mobile$zhsg$RectificatedTroubleController$initialize,
    evaljs : com$mobile$zhsg$RectificatedTroubleController$evaljs
};
com.mobile.zhsg.RectificatedTroubleController.registerClass('com.mobile.zhsg.RectificatedTroubleController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
