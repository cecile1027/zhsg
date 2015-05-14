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

var row;
function load(sender, args){
	row = $param.getJSONObject("row");
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
}

function back(sender, args){	
	$view.close({
		"resultCode" : "15",
		"row" : row
	})
}
function commit(sender, args){
	$ctx.dataCollect();
	var json = $ctx.getJSONObject();
	if(json.drafter==null||json.drafter==""){
		json["drafter"] = $cache.read("username");
	};
	json["rowstate"] = "Revised";
	$service.callAction({
		"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//提交隐患
		"action" : "modify",//方法名,
		"params" : json,//自定义参数
		"contextmapping":"none",
		"callback" : function(){
            $view.open({
                "viewid" : "com.mobile.zhsg.Home",//目标页面（首字母大写）全名，
                "isKeep" : "false"
            });
		},//请求回来后执行的ActionID
		"error" : "error()"//失败回调的ActionId
	})
	
}

    function error(sender,msg){
        alert($jsonToString(msg));
    }
com.mobile.zhsg.BackTroubleController.prototype = {
    initialize : com$mobile$zhsg$BackTroubleController$initialize,
    evaljs : com$mobile$zhsg$BackTroubleController$evaljs
};
com.mobile.zhsg.BackTroubleController.registerClass('com.mobile.zhsg.BackTroubleController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
