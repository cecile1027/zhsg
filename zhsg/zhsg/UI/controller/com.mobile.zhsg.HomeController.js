//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.HomeController');
com.mobile.zhsg.HomeController = function() {
    com.mobile.zhsg.HomeController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$HomeController$initialize(){
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
    
function com$mobile$zhsg$HomeController$evaljs(js){
    eval(js)
}
function addTrouble(sender, args){	
	/*
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//后台带包名的Controller名
		"action" : "load",//方法名,
		"params" : {a:1,b:2},//登录信息
		"autoDataBinding" : false,//请求回来会是否进行数据绑定，默认不绑定
		"callback" : "addnew()",//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})	
	*/
	addnew();
}
function addnew(){
	$view.open({
		"viewid" : "com.mobile.zhsg.NewTrouble",//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"reload()"//回调的JS方法
	});
}
function error(){
	alert("网络异常，新建隐患失败");
}
function reload(argument) {
  
}
function load(sender, args){
	var i = $id("flipperdefine0").get("viewindex");
	
	var list = {
		list:[
	{"safe_yh_level":0,"ope_area_desc":"安全区1","rowstate":"Created","color0":"#ffffff"},
	{"safe_yh_level":1,"ope_area_desc":"安全区2","rowstate":"Created","color0":"#595757"},
	{"safe_yh_level":2,"ope_area_desc":"安全区3","rowstate":"Created","color0":"#f1f1f1"}
	]};
	
		var list2 = {
		list:[
	{"safe_yh_level":3,"ope_area_desc":"安全区4","rowstate":"Created","color0":"#ffffff"},
	{"safe_yh_level":4,"ope_area_desc":"安全区5","rowstate":"Created","color0":"#595757"},
	{"safe_yh_level":5,"ope_area_desc":"安全区6","rowstate":"Created","color0":"#f1f1f1"}
	]};
	
		var list3 = {
		list:[
	{"safe_yh_level":6,"ope_area_desc":"安全区7","rowstate":"Created","color0":"#ffffff"},
	{"safe_yh_level":7,"ope_area_desc":"安全区8","rowstate":"Created","color0":"#595757"},
	{"safe_yh_level":8,"ope_area_desc":"安全区9","rowstate":"Created","color0":"#f1f1f1"}
	]};
	
		var list4 = {
		list:[
	{"safe_yh_level":9,"ope_area_desc":"安全区10","rowstate":"Created","color0":"#ffffff"},
	{"safe_yh_level":10,"ope_area_desc":"安全区11","rowstate":"Created","color0":"#595757"},
	{"safe_yh_level":11,"ope_area_desc":"安全区12","rowstate":"Created","color0":"#f1f1f1"}
	]};
	
	if(i==0){
		alert(i);
		$ctx.push(list);
	}else if(i==1){
		alert(i);
		$ctx.push(list2);
	}else if(i==2){
		alert(i);
		$ctx.push(list3);
	}else if(i==3){
		alert(i);
		$ctx.push(list4);
	}	

}

function toggleChange(sender, args){
	var i = $id("togglebuttongroup0").get("selectedvalue");
	$id("flipperdefine0").set("viewindex",i);
}

function previous(sender, args){
	var i = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup0").set("selectedvalue", i);
	load();
}
function next(sender, args){
	var i = $id("flipperdefine0").get("viewindex");
	$id("togglebuttongroup0").set("selectedvalue", i);
	load();
}
function back(sender, args){
	$view.close();
}
function search(sender, args){

}
function itemClick() {
  	var i = $id("flipperdefine0").get("viewindex");
	var row = $id("flipperdefine0_widget"+i).get("row");
	var viewid;
	if(i == 0){
		viewid = ""
	}else if(i==1){
		viewid = "com.mobile.zhsg.RectificatedTrouble";
	}else if(i==2){
		viewid = "com.mobile.zhsg.NewTrouble";
	}else if(i == 3){
		viewid = "";
	}
		if(i == 0){
		$view.open({
		"viewid" : viewid,//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"load()",//回调的JS方法
		"row" :row
	});
	
	}

}
com.mobile.zhsg.HomeController.prototype = {
    initialize : com$mobile$zhsg$HomeController$initialize,
    evaljs : com$mobile$zhsg$HomeController$evaljs
};
com.mobile.zhsg.HomeController.registerClass('com.mobile.zhsg.HomeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
