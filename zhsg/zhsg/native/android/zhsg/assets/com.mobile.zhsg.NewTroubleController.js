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


    var username = $cache.read("username");
    var attachments = new Array();
    var att_length  = 0;
    var json;
    var url = "http://"+$cache.read("host")+":"+$cache.read("port")+"/umserver/upload";
    $ctx.put("att_length" ,att_length );

    /**
     * 点击图片事件
     * @param sender 当前图片为加号时点击增加图片，其他图片时点击查看大图并且有删除功能
     * @param args
     */
    function clickPic(sender, args){
        var addimage = $id(sender).get("src");
        if(addimage=="addimg_normal.png"){
            addAttachment();
        }else{
            $view.open({
                "viewid" : "com.mobile.zhsg.PicView",//目标页面（首字母大写）全名，
                "isKeep" : "true",//保留当前页面不关闭
                "callback":"loadPic()",//回调的JS方法
                "images" : attachments
            });
        }
    }

    /**
     * 重新加载图片
     */
	function loadPic(){
        //图片区域回到初始无图状态
//        alert("重新加载图片");
        var data = $param.getJSONArray("data");
        if(data.length !=attachments.length ){
            attachments = data;
    //      alert($jsonToString(attachments));
            for(var j = 0; j < 9; j++){
                if(j == 0){
                    $id("attimage"+j).set("visible", true);
                    $id("attimage"+j).set("src", "addimg_normal.png");
                }else{
                    $id("attimage"+j).set("visible", false);
                    $id("attimage"+j).set("src", "");
                }

            }
            $id("attpanel2").set("display", "none");
            $id("attpanel3").set("display", "none");

            //加载图片


            var total_length = attachments.length;
//        $alert("total_length:" + total_length + "\n" + "att_length:" + att_length);

            if(total_length+1 > 3 && total_length+1<=6){
                $id("attpanel2").set("display", "block");
            }else if(total_length+1 > 6){
                $id("attpanel2").set("display", "block");
                $id("attpanel3").set("display", "block");
            }

            for(var i = 0;i<total_length;i++){
//        	alert(attachments[i]);
                $id("attimage"+(i+1)).set("visible", true);
                $id("attimage"+(i+1)).setAttribute("src",attachments[i]);
            }
            if (total_length+1 <= 9) {
                $id("attimage"+(total_length+1)).set("visible", true);
                $id("attimage"+(total_length+1)).set("src", "addimg_normal.png");
            }

            att_length = total_length;
            $ctx.put("att_length",att_length);
            $ctx.put("attachments",attachments);

        }

	}

    function addAttachment(sender, args){
    	$ctx.dataCollect();
        if($ctx.getString("attachments")!=""){
            attachments = $ctx.getJSONArray("attachments");
            att_length = $ctx.getString("att_length");
        }
        $ctx.put("att_length",att_length);

        if(att_length>9){
            alert("最多只能选择9张图片");
        }else{
            var json = {
                "viewid":"widget0",
                "single" : "true",
                "istouch":"true",
                "popgravity":"popbottom"
            };
            $view.openPop(json)
        }

    }

    function openCamera() {
        var json = {
            "viewid":"widget0"
        };
        $view.closePop(json);
        $camera.open({
            bindfield : "attachment",
            callback : "setphoto()"
        });

    }
    
    function  openPhoto(){
        var json = {
            "viewid":"widget0"
        };
        $view.closePop(json);
        $view.open({
            "viewid" : "com.mobile.zhsg.SelectImage",//目标页面（首字母大写）全名，
            "isKeep" : "true",
            "callback":"imagecallback()",
            "att_length":att_length
        });

    }
    
	function openFile() {
	  
	}


    function imagecallback(){
        att_length = parseInt($ctx.getString("att_length"));
        json = $param.getJSONObject("selectedimages");
//        alert("图片路径"+ $jsonToString(json));

        if($ctx.getString("attachments")!=""){       	
            attachments = $ctx.getJSONArray("attachments");
//            alert($jsonToString(attachments));
        }
		
        for(var f = 0;f<json.length;f++){
//        	alert("第"+f+"张图:"+json[f]);
            attachments.push(json[f]);
        }
        
//      alert("attachments:"+$jsonToString(attachments));

        var total_length = json.length+ att_length;
//        $alert("total_length:" + total_length + "\n" + "att_length:" + att_length);

        if(total_length+1 > 3 && total_length+1<=6){
            $id("attpanel2").set("display", "block");
        }else if(total_length+1 > 6){
            $id("attpanel2").set("display", "block");
            $id("attpanel3").set("display", "block");
        }

        for(var i = att_length+1, j=0;i<=total_length;i++,j++){
            $id("attimage"+i).set("visible", true);
            $id("attimage"+i).setAttribute("src",json[j]);
        }
        if (total_length+1 <= 9) {
//        	alert("加号"+(total_length+1));
        	$id("attimage"+(total_length+1)).set("visible", true);
            $id("attimage"+(total_length+1)).set("src", "addimg_normal.png");
        }
        
        att_length = total_length;
        $ctx.put("att_length",att_length);
        $ctx.put("attachments",attachments);
    }




    function setphoto(){
        var attachment = $ctx.getString("attachment");
        att_length = parseInt($ctx.getString("att_length"));
//        alert(attachment);

        if($ctx.getString("attachments")!=""){
            attachments = $ctx.getJSONArray("attachments");
//            alert("attachments:" + $jsonToString(attachments));
        }
//      var att_length = attachments.push(attachment);
//		alert(att_length);
        attachments.push(attachment);
//        alert("attachments:" + $jsonToString(attachments));
        var total_length = 1+ att_length;
		
//		$alert("total_length:" + total_length + "\n" + "att_length:" + att_length);
        if(total_length+1 > 3 && total_length <= 6){
            $id("attpanel2").set("display", "block");
        }else if(total_length+1 >6){
            $id("attpanel2").set("display", "block");
            $id("attpanel3").set("display", "block");
        }
        
        $id("attimage"+total_length).set("visible", true);
        $id("attimage"+total_length).setAttribute("src",attachment);

        if (total_length+1 <= 9) {
        	$id("attimage" + (total_length+1)).set("visible", true);
            $id("attimage" + (total_length+1)).set("src", "addimg_normal.png");
        }
        att_length = total_length;

        $ctx.put("att_length" ,att_length);
        $ctx.put("attachments",attachments);
    }

function addDay(sender, args){
	var day = new String(sender).charAt(3);
//	alert(day);
//	var dayArray = $id("dateinput0").get("value").split("-");
//	var dayArray = new Array();
//	dayArray[0] = new Date().getFullYear();
//	dayArray[1] = new Date().getMonth();
//	dayArray[2] = new Date().getDate();
//	var nowday = new Date(dayArray[0],parseInt(dayArray[1]),parseInt(dayArray[2]));
//	alert(new Date());
//	alert("月份：" + new Date().getMonth());
    var targetday = new Date(new Date().getTime()+day*24*60*60*1000);

	$id("dateinput0").set("value",targetday.getFullYear()+"-"+(targetday.getMonth()+1<10?("0"+(targetday.getMonth()+1)):targetday.getMonth()+1)+"-"+(targetday.getDate()<10?("0"+targetday.getDate()):targetday.getDate()));

}



function area(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.OpeAreaRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":function(){
			getResult("area");
		}
		//回调的JS方法
	});

}

function org(sender, args){
	$ctx.dataCollect();
	var ope_area_no = $ctx.getString("ope_area_no");
	$view.open({
		"viewid" : "com.mobile.zhsg.OrgRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":function(){
			getResult("org");
		},//回调的JS方法
		"data":ope_area_no
	});
}


function person(sender, args){
	$ctx.dataCollect();
	var ope_area_no = $ctx.getString("ope_area_no");
	var respon_unit = $ctx.getString("respon_unit");
	$view.open({
		"viewid" : "com.mobile.zhsg.PersonRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":function(){
			getResult("person");
		},//回调的JS方法
		"data":{"ope_area_no":ope_area_no,"respon_unit":respon_unit}
	});

}


function type(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.TypeRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":function(){
			getResult("type");
		}//回调的JS方法
	});

}


function sendPerson(sender, args){
	$view.open({
		"viewid" : "com.mobile.zhsg.SendPersonRef",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":function(){
			getResult("sendPerson");
		}//回调的JS方法
	});
}

function getResult(arg){
	$ctx.dataCollect();
	var json = $ctx.getJSONObject();
	var result = $param.getJSONObject("result");
//	alert($jsonToString(json));
	if(arg=="area"){
//		alert("arear");
		$ctx.put("ope_area_no",result.ope_area_no);
		$ctx.put("ope_area_desc",result.ope_area_desc);
		
	}else if(arg=="org"){
//		alert("org");
		$ctx.put("respon_unit",result.respon_unit);
		$ctx.put("respon_unit_desc",result.respon_unit_desc);
//		alert($jsonToString(json));
	}else if(arg=="person"){
		$ctx.put("duty_officer",result.duty_officer);
		$ctx.put("duty_officer_name",result.duty_officer_name);
	}else if(arg=="type"){
		$ctx.put("yh_type",result.yh_type);
		$ctx.put("yh_sub_type",result.yh_sub_type);
		$ctx.put("yh_sub_type_describe",result.yh_sub_type_describe);
	}else if(arg=="sendPerson"){
		$ctx.put("person_code",result.person_code);
		$ctx.put("person_name",result.person_name);
	}
	$ctx.dataBind();

}


function commit(sender, args){

        $ctx.dataCollect();
        json = $ctx.getJSONObject();
        if(json.drafter==null||json.drafter==""){
            json["drafter"] = $cache.read("username");
        };

        var message = "";
        if(json.ope_area_no == null || json.ope_area_no ==""){
            message += "工作区、";
        }
        if(json.respon_unit_desc == null || json.respon_unit_desc =="") {
            message += "责任单位、";
        }
        if(json.duty_officer_name == null || json.duty_officer_name == ""){
            message += "责任人、"
        }
        if(json.yh_sub_type_describe == null || json.yh_sub_type_describe =="" ){
            message += "分类、"
        }

        if(message == ""){
            uploadImg();
        }else{
            message = message.substring(0,message.length-1);
            message += "为必选项，不能为空";
            alert(message);

        }

//        uploadImg();

 }



    function uploadData(){
        alert($jsonToString(pcUrl));
        if(pcUrl.length != attachments.length){
            count = 0;
            alert("图片上传出错");
        }else {
            json["pcUrl"] = pcUrl;
            json["host"] = $cache.read("host");
            json["port"] = $cache.read("port");
            if(json.title == "新隐患"){
                $service.callAction({
                    "viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//提交隐患
                    "action" : "save",//方法名,
                    "params" : json,//自定义参数
                    "contextmapping":"none",
                    "callback" : function(){
                        //               uploadImg (json);
                        $view.close({
                            "resultCode" : "15"
                            //			"result" : $ctx.getJSONObject()
                        })
                    },//请求回来后执行的ActionID
                    "error" : "error()"//失败回调的ActionId
                })
            }else if(json.title == "退回隐患"){
                json["rowstate"] = "Issued";
                $service.callAction({
                    "viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//提交隐患
                    "action" : "modify",//方法名,
                    "params" : json,//自定义参数
                    "contextmapping":"none",
                    "callback" : function(){
                        //                uploadImg (json);
                        $view.close({
                            "resultCode" : "15"
                            //			"result" : $ctx.getJSONObject()
                        })
                    },//请求回来后执行的ActionID
                    "error" : "error()"//失败回调的ActionId
                })
            }

        }
    }

var pcUrl = new Array();
var count = 0;
var json;
function uploadImg () {
	
	/*
	alert("下载");
	$file.download({
			"url" : "http://10.1.214.100:8080/help/mobrt/%23UAP%23/1/4/1431504338770/1431063686301.jpg",//下载文件的url
			"locate" : "uapDownload/image",//下载后文件存放的路径
			"filename" : "newfile.jpg",//下载后重命名的文件名
			"override" : "true",//下载后是否覆盖同名文件
			"callback" : function(){
				alert("newfile.jpg");
			}//下载后的回调方法,locate+filename可以访问文件(即download/image/newfile.png)
	})
	*/

//    alert(url);
//	alert($jsonToString(attachments));
    for(var i = 0; i<attachments.length;i++){
        var filename = attachments[i];
//      alert(filename);
        $file.upload({
            "url" : url,//上传服务器端路径
            "filename" : filename,//上传文件的路径+文件名
            "bindfield" : "fileInfo",//上传后的返回值，类型为JSONObject（其中从键值url可以获取上传后该文件的url）
            "callback" : "uploadCB()"//上传后的回调方法
        })
    }
}

function uploadCB(){
//    alert("上传返回");
    count ++;
	var fileInfo = $ctx.getString("fileInfo");
//    alert(fileInfo);
    if(fileInfo!=null && fileInfo!=""){
        var file_path = $ctx.getJSONObject("fileInfo").file_path;
//        alert(file_path.url);
        pcUrl.push(file_path);    	

    }
    
    if(count == attachments.length){
          uploadData();
    }
    
}

function load(sender, args){
	var row = $param.getJSONObject("row");
	$id("navigatorbar0").set("title", row.title);
	var safe_yh_level = row.safe_yh_level;
	if(safe_yh_level=="NORMAL"){
		$id("togglebutton0").set("checked", true);
		$id("togglebutton1").set("checked", false);
	}else if(safe_yh_level=="GRAVE"){
		$id("togglebutton0").set("checked", false);
		$id("togglebutton1").set("checked", true);
	}
	$ctx.push(row);
}

function onback(sender, args){
	$view.close();
}

function error(sender,msg){
    count = 0;
	alert($jsonToString(msg));
	
}

com.mobile.zhsg.NewTroubleController.prototype = {
    initialize : com$mobile$zhsg$NewTroubleController$initialize,
    evaljs : com$mobile$zhsg$NewTroubleController$evaljs
};
com.mobile.zhsg.NewTroubleController.registerClass('com.mobile.zhsg.NewTroubleController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
