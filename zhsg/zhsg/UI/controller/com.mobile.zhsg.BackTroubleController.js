//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.BackTroubleController');
com.mobile.zhsg.BackTroubleController = function() {
    com.mobile.zhsg.BackTroubleController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$BackTroubleController$initialize(){
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
    
function com$mobile$zhsg$BackTroubleController$evaljs(js){
    eval(js)
}
function previous(sender, args){

	
}
function next(sender, args){

}
function moreOperate(sender, args){

	$menu.openDropDownList({
		"controlid" : "more",//目标控件的id
		"dropDownListWidth" : "100",//菜单项的宽度
		"dropItemsArray" : [{
			"name" : "验证关闭",//菜单项名称
			"action" : "close()"//点击该菜单项时执行的JS方法
			//"image" : "btn_fav.png"//菜单项的icon
		},{
			"name" : "退回",//菜单项名称
			"action" : "backover()"//点击该菜单项时执行的JS方法 
			//"image" : "btn_set.png"//菜单项的icon
		}],
		"background":"#2d5aa7",
       "panelstyle":"round-div",
       "border-color":"#ffffff",
       "showtype":"right"

	})
}

com.mobile.zhsg.BackTroubleController.prototype = {
    initialize : com$mobile$zhsg$BackTroubleController$initialize,
    evaljs : com$mobile$zhsg$BackTroubleController$evaljs
};
com.mobile.zhsg.BackTroubleController.registerClass('com.mobile.zhsg.BackTroubleController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
