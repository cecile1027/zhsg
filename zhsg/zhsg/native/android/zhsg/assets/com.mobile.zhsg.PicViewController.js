//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.PicViewController');
com.mobile.zhsg.PicViewController = function() {
    com.mobile.zhsg.PicViewController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$PicViewController$initialize(){
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
 
var images = new Array();
var attachments;
function com$mobile$zhsg$PicViewController$evaljs(js){
    eval(js)
}

var index;
function loadPic(sender, args){
//	alert("查看图片");

    attachments = $param.getJSONArray("images");
//	alert($jsonToString(attachments));
    for(var i = 0 ;i<attachments.length;i++){
        var image = {"src":attachments[i],"title":("图片"+i),"description":""};
        images.push(image);
    }
	var json = {"images":images};
	$ctx.push(json);
    index = $id("imageflipper0").get("viewindex");
    setTitle();

}
function setTitle(){
	var imagesLength = images.length;
    var title = (parseInt(index)+1)+"/"+imagesLength;
    $id("label0").set("value",title);
}

    
function delPic(sender, args){
	index = $id("imageflipper0").get("viewindex");
    images.remove(index);
    attachments.remove(index);
    var json = {"images":images};
    $ctx.push(json);
    index = $id("imageflipper0").get("viewindex");
    setTitle();
}
function back(sender, args){
	alert($jsonToString(attachments));
	$view.close({
		"resultCode" : "15",
		"data" : attachments
	})
}
function next(sender, args){
	index = $id("imageflipper0").get("viewindex");
    setTitle();

}
function previous(sender, args){
	index = $id("imageflipper0").get("viewindex");
    setTitle();
}
com.mobile.zhsg.PicViewController.prototype = {
    initialize : com$mobile$zhsg$PicViewController$initialize,
    evaljs : com$mobile$zhsg$PicViewController$evaljs
};
com.mobile.zhsg.PicViewController.registerClass('com.mobile.zhsg.PicViewController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
