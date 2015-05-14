//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.mobile.zhsg.LoginController');
com.mobile.zhsg.LoginController = function() {
    com.mobile.zhsg.LoginController.initializeBase(this);
    this.initialize();
}
function com$mobile$zhsg$LoginController$initialize(){
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
    
function com$mobile$zhsg$LoginController$evaljs(js){
    eval(js)
}

var username;
var password;

//var host = "218.247.140.251";
var host = "10.1.214.100";
//var host = "10.2.112.81";
var port = "8080";


function login(sender, args){
	$cache.write("host", host);
	$cache.write("port", port);	
	
	$service.writeConfig({
        "host" : host,//向configure中写入host键值
        "port" : port//向configure中写入port键值
    })
	$ctx.dataCollect();
	var userinfo = $ctx.getJSONObject();
	username = userinfo.username;
	
	if($id("pwinput").get("display") == "block"){
		password = $id("pwinput").get("value");
	}else{
		password = $id("textinput").get("value");
	}
	userinfo["password"] = password;
	
//	alert($jsonToString(userinfo));
//	alert(username);
//	alert(password);
    if(username == "" || password == ""){
    	alert("用户名和密码不能为空");
    }else if((username =="ZHANGLJ" && password =="ZHANGLJ")||(username =="CNPE" && password =="CNPE")||(username =="WANGYANG" && password =="WANGYANG")||(username =="YUHCA" && password =="YUHCA")){
        
        $cache.write("username", username);    
    	$view.open({
		"viewid" : "com.mobile.zhsg.Home",//目标页面（首字母大写）全名，
		"isKeep" : "false",
		"data":userinfo
	    });
    }else{                 
        $alert("用户名或密码错误");
    }           

}
function passwordChange(sender, args){
	if(sender == "pwinput"){
		password = $id("pwinput").get("value");
	}else if(sender == "textinput"){
		password = $id("textinput").get("value");
	}	
//	alert(password);
	if(password.length>0){
//		alert(password.length);
        $id("showButton").setAttribute("display","block");
    }else if(password==null || password.length==0){
//    	alert(password.length);
        $id("showButton").setAttribute("display","none");
    }
}


function showPassword(sender, args){
//	password = $id("pwinput").get("value");	
	if($id("showButton").get("background-image")=="pw_show.png"){
		password = $id("pwinput").get("value");	
//		alert(password);
//		alert($id("showButton").get("background-image"));
		$id("showButton").set("background-image","pw_hidden.png");
		$id("pwinput").set("display", "none");
		$id("textinput").set("display", "block");
		$id("textinput").set("value", password);
		
	}else{
//		alert($id("showButton").get("background-image"));
		password = $id("textinput").get("value");	
//		alert(password);
		$id("showButton").set("background-image","pw_show.png");
		$id("pwinput").set("display", "block");
		$id("textinput").set("display", "none");
		$id("pwinput").set("value", password);
		
	}	
	
}
function load(sender, args){
	if($cache.read("username")!=null && $cache.read("username")!=""){
//		alert($cache.read("username"));
		$id("textbox0").set("value", $cache.read("username"));
	}
}
com.mobile.zhsg.LoginController.prototype = {
    initialize : com$mobile$zhsg$LoginController$initialize,
    evaljs : com$mobile$zhsg$LoginController$evaljs
};
com.mobile.zhsg.LoginController.registerClass('com.mobile.zhsg.LoginController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
