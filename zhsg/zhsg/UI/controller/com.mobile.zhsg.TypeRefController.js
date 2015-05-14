//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.TypeRefController');
com.mobile.zhsg.TypeRefController = function() {
    com.mobile.zhsg.TypeRefController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$TypeRefController$initialize(){
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
    
function com$mobile$zhsg$TypeRefController$evaljs(js){
    eval(js)
}
function back(sender, args){
	$view.close();
}
function search(sender, args){

}
function load(sender, args){
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeLovListCtl",//后台带包名的Controller名
		"action" : "YhTypeAll",//方法名,	
		"params" : {"keytype":"All","keyvalue":"1"},//自定义参数
		"callback" : function(){
			var list = $ctx.getJSONObject();
//			alert($jsonToString(list));
			$ctx.push(list);
		},//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})
}
function itemClick(sender, args){
	var row = $id("listviewdefine0").get("row");
//	alert($jsonToString(row));
	$view.close({
		"resultCode" : "15",
		"result" : row
	})

}
com.mobile.zhsg.TypeRefController.prototype = {
    initialize : com$mobile$zhsg$TypeRefController$initialize,
    evaljs : com$mobile$zhsg$TypeRefController$evaljs
};
com.mobile.zhsg.TypeRefController.registerClass('com.mobile.zhsg.TypeRefController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
