//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.SelectImageController');
com.mobile.zhsg.SelectImageController = function() {
    com.mobile.zhsg.SelectImageController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$SelectImageController$initialize(){
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
    
function com$mobile$zhsg$SelectImageController$evaljs(js){
    eval(js)
}
function selectPic(sender, args){
//	alert($param.getString("att_length"));
	var att_length = parseInt($param.getString("att_length"));	
//	alert(att_length);
	var str = $id("imageselector0").get("selectedimages");
    
    var pathlist = $stringToJSON(str);
//    alert(pathlist.length + att_length);
    if(pathlist.length + att_length>9){
    	alert("图片总数不能超过9张，请重新选择");
    }else{
    	$view.close({
			"resultCode" : "15",
			"selectedimages" : pathlist
		});
    }
	
}
function loadPic(sender, args){
	/*
	$camera.openPhotoAlbum({
		bindfield : "images",
		callback : function (){
//			alert($ctx.getString("images"));
	        var badge = ($ctx.getString("images")).split("/");
	        filepath = "/";
	        for(var i=1;i<(badge.length-1);i++){
	        	filepath = filepath + badge[i] + "/";
	        }
	        $id("imageselector0").set("path",filepath);
	        $cache.write("photoPath", filepath);
		}
	});
	*/
	var path = $service.call("UMDevice.getAlbumPath", {}, true);
//	alert(path);
	$id("imageselector0").set("path",path+"/");
}
function back(sender, args){
	$view.close();
}
com.mobile.zhsg.SelectImageController.prototype = {
    initialize : com$mobile$zhsg$SelectImageController$initialize,
    evaljs : com$mobile$zhsg$SelectImageController$evaljs
};
com.mobile.zhsg.SelectImageController.registerClass('com.mobile.zhsg.SelectImageController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
