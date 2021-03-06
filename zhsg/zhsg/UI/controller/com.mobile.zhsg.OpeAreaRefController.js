//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.OpeAreaRefController');
com.mobile.zhsg.OpeAreaRefController = function() {
    com.mobile.zhsg.OpeAreaRefController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$OpeAreaRefController$initialize(){
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
    
function com$mobile$zhsg$OpeAreaRefController$evaljs(js){
    eval(js)
}
function loadList(sender, args){
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeLovListCtl",//后台带包名的Controller名
		"action" : "searchOperationArea",//方法名,	
		"params" : {"keytype":"All","keyvalue":"1"},//自定义参数
		"callback" : function(){
			var list = $ctx.getJSONObject();
			$ctx.push(list);
		},//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})
}

function error(sender,msg){
	alert($jsonToString(msg));
}
function itemClick(sender, args){
	var row = $id("listviewdefine0").get("row");
	$view.close({
		"resultCode" : "15",
		"result" : row,
	})
}
function search(sender, args){
	var search = $id("search0").get("value");
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeLovListCtl",//后台带包名的Controller名
		"action" : "searchOperationArea",//方法名,	
		"params" : {"keytype":"search","keyvalue":search},//自定义参数
		"callback" : function(){
			var list = $ctx.getJSONObject();
			$ctx.push(list);
		},//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})
}
function back(sender, args){
	$view.close();
}
com.mobile.zhsg.OpeAreaRefController.prototype = {
    initialize : com$mobile$zhsg$OpeAreaRefController$initialize,
    evaljs : com$mobile$zhsg$OpeAreaRefController$evaljs
};
com.mobile.zhsg.OpeAreaRefController.registerClass('com.mobile.zhsg.OpeAreaRefController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
