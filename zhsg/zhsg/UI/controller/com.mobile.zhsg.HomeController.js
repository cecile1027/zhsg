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

var username =$cache.read("username");
function addTrouble(sender, args){	
	var json = {};
	json["title"] = "新隐患";
	json["proj_no"] = "1116";
	json["safe_yh_level"] = "NORMAL";
    var targetday = new Date();
    json["rectification_period"] = targetday.getFullYear()+"-"+(targetday.getMonth()+1<10?("0"+(targetday.getMonth()+1)):targetday.getMonth()+1)+"-"+(targetday.getDate()<10?("0"+targetday.getDate()):targetday.getDate());
	$view.open({
			"viewid" : "com.mobile.zhsg.NewTrouble",//目标页面（首字母大写）全名，
			"isKeep" : "true",//保留当前页面不关闭
			"row":json,
			"callback":"newTroubleBack()"//回调的JS方法
	});

}

function error(){
	alert("网络异常，新建隐患失败");
}
function newTroubleBack() {
    load();
}










function load(sender, args){
	var i = $id("flipperdefine0").get("viewindex");
//	showBadges();

		
	if(i==0){
//		if($cache.read("allList")==null || $cache.read("allList")==""){
//			alert("allList");
			$service.callAction({
				"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//所有
				"action" : "searchSafeDailyHidDangerlist",//方法名,
				"params" : "{keytype:\"All\",username: "+username+",keyvalue: \"1\"}",//自定义参数
				"callback" : function(){
					var list = $ctx.getJSONObject();
                    setItemDetail(list)
//					alert($jsonToString(list));
					$ctx.push(list);
					$cache.write("allList", list);
				},//请求回来后执行的ActionID
				"error" : "error()"//失败回调的ActionId
			});
//		}else{
//			$ctx.push($cache.read("allList"));
//		}
		
	}else if(i==1){
//		if($cache.read("rectificatedList")==null || $cache.read("rectificatedList")==""){
			$service.callAction({
				"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//所有
				"action" : "searchSafeDailyHidDangerlist",//方法名,
				"params" : "{keytype:\"Rectificated\",username: "+username+",keyvalue: \"1\"}",//自定义参数
				"callback" : function(){
					var list = $ctx.getJSONObject();
                    setItemDetail(list)
					$ctx.push(list);
					
					$cache.write("rectificatedList", list);
				},//请求回来后执行的ActionID
				"error" : "error()"//失败回调的ActionId
			});
//		}else{
//			$ctx.push($cache.read("rectificatedList"));
//		}

	}else if(i==2){
//		if($cache.read("createdList")==null || $cache.read("createdList")==""){
			$service.callAction({
				"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//所有
				"action" : "searchSafeDailyHidDangerlist",//方法名,
				"params" : "{keytype:\"Created\",username: "+username+",keyvalue: \"1\"}",//自定义参数
				"callback" : function(){
					var list = $ctx.getJSONObject();
                    setItemDetail(list)
					$ctx.push(list);

					$cache.write("createdList", list);
				},//请求回来后执行的ActionID
				"error" : "error()"//失败回调的ActionId
			});
//		}else{
//			$ctx.push($cache.read("createdList"));
//		}
	}else if(i==3){
//		if($cache.read("issuedList")==null || $cache.read("issuedList")==""){
			$service.callAction({
				"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//所有
				"action" : "searchSafeDailyHidDangerlist",//方法名,
				"params" : "{keytype:\"Issued\",username: "+username+",keyvalue: \"1\"}",//自定义参数
				"callback" : function(){
					var list = $ctx.getJSONObject();
                    setItemDetail(list)
					$ctx.push(list);					
					$cache.write("issuedList", list);
				},//请求回来后执行的ActionID
				"error" : "error()"//失败回调的ActionId
			});
//		}else{
//			$ctx.push($cache.read("issuedList"));
//		}

	}

}

/*
function getResult(){
	var list = $ctx.getJSONObject();
	$ctx.push(list);
}
*/

function setItemDetail(list){
    var list = list.list;
    for(i = 0; i<list.length;i++){
        var json = list[i];

        //设置隐患等级背景色
        var level = json.safe_yh_level;
        if(level == "NORMAL"){
            json.color0 = "#1680fa";
        }else{
            json.color0 = "#ff3c3c";
        }

        //设置隐患状态图标
        var rowstate = json.rowstate;
        if(rowstate == "Created"){
            json["rowstate_image"] = "created.png";
        }else if(rowstate == "Issued"){
            json["rowstate_image"] = "issued.png";
        }else if(rowstate == "Rectificated"){
            json["rowstate_image"] = "rectificated.png";
        }else if(rowstate == "Revised"){
            json["rowstate_image"] = "revised.png";
        }else if(rowstate == "Closed"){
            json["rowstate_image"] = "closed.png";
        }

        //设置整改期限背景色
        var rectification_period = json.rectification_period.replace("-","/");
        var day = (new Date(rectification_period) - new Date())/(24*60*60*1000);
//       alert(day);
        if(rowstate == "Closed"){
            json["color1"] = "#DCDDDD";
        }else{
            if(day<=-1){
                json["color1"] = "#FF3c3c";
            }
            if(day<=1&& day>-1){
                json["color1"] = "#FF7777";
            }
            if(day<=3&&day>1){
                json["color1"] = "#feb568";
            }
            if(day<=7&&day>3){
                json["color1"] = "#fedb6e";
            }
        }

    }
}

function showBadges(){
	if($cache.read("listLength")==null || $cache.read("listLength")==""){
		$service.callAction({
			"viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//获取首页各列列表长度
			"action" : "getSafeDailyHidDangerCount",//方法名,
			"params" : {"username":username},//自定义参数
			"autoDataBinding" : false,//请求回来会是否进行数据绑定，默认不绑定
			"contextmapping" : "listLength",//列表长度
			"callback" : "setLength()",//请求回来后执行的ActionID
			"error" : "error()"//失败回调的ActionId
		})
	}else{
		listLength = $cache.read("listLength");
	}
				
}
function setLength(){
	listLength = $ctx.getJSONObject("listLength").list;
//	alert($jsonToString(listLength));
//	alert(listLength.rectificatedLength);
//	alert(listLength.createdLength);
	$cache.write("listLength", listLength);
	
	$badge.showBadge({
		"target" : "togglebutton1",//要显示角标的目标控件的id
		"text" : listLength.rectificatedLength,//角标显示的内容
		"position" : "topright"//显示在target控件的位置 topright | topleft | bottomright | bottomleft
	})
	
	$badge.showBadge({
		"target" : "togglebutton2",//要显示角标的目标控件的id
		"text" : listLength.createdLength,//角标显示的内容
		"position" : "topright"//显示在target控件的位置 topright | topleft | bottomright | bottomleft
	})
}	
function error(sender,msg) {
  	alert($jsonToString(msg));
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

var listLength;
var allList;
var rectificatedList;
var createdList;
var issuedList;

function back(sender, args){
//	$cache.write("listLength", "");
//	$cache.write("allList", "");
//	$cache.write("rectificatedList", "");
//	$cache.write("createdList", "");
//	$cache.write("issuedList", "");
    if(confirm("是否退出程序?")){
        $view.close();
    }

}
function search(sender, args){
		var search = $id("search0").get("value");
        var i = $id("flipperdefine0").get("viewindex");
        var type;
        if(i == 0 ){
            type = "searchAll";
        }else if(i == 1){
            type = "searchRectificated";
        }else if(i == 2){
            type = "searchCreated";
        }else if(i == 3){
            type = "searchIssued";
        }
        alert(type);
		$service.callAction({
            "viewid" : "com.yonyou.uap.safetw.SafeDailyHidDangerCtl",//所有
            "action" : "searchSafeDailyHidDangerlist",//方法名,
			"params" : {"keytype":type,"username":username,"keyvalue":search},//自定义参数
			"callback" : function(){
                var list = $ctx.getJSONObject();
                setItemDetail(list)
                $ctx.push(list);
                $cache.write("issuedList", list);
            },//请求回来后执行的ActionID
			"error" : "error()"//失败回调的ActionId
		})
	
}
function itemClick() {
  	var i = $id("flipperdefine0").get("viewindex");
	var row = $stringToJSON($id("widget"+i).get("row"));
//	alert(row);
//	alert($jsonToString(row));
	var viewid;
	if(i == 0){
		var state = row.rowstate;
//		alert(row.rowstate);
		if(state=="Created"){
			viewid = "com.mobile.zhsg.NewTrouble";
            row["title"] = "退回隐患";
		}else if(state=="Issued"){
			viewid = "com.mobile.zhsg.RevisedTrouble";
		}else if(state=="Revised"){
			viewid = "com.mobile.zhsg.RevisedTrouble";
		}else if(state=="Rectificated"){
			viewid = "com.mobile.zhsg.RectificatedTrouble";
		}else if(state=="Closed"){
			viewid = "com.mobile.zhsg.TroubleDetail";
		}
	}else if(i==1){
		viewid = "com.mobile.zhsg.RectificatedTrouble";
	}else if(i==2){
		viewid = "com.mobile.zhsg.NewTrouble";
		row["title"] = "退回隐患";
	}else if(i == 3){
		viewid = "com.mobile.zhsg.RevisedTrouble";
	}
	
	$view.open({
		"viewid" : viewid,//目标页面（首字母大写）全名，
		"isKeep" : "true",//保留当前页面不关闭
		"callback":"load()",//回调的JS方法
		"row" :row
	});

}
com.mobile.zhsg.HomeController.prototype = {
    initialize : com$mobile$zhsg$HomeController$initialize,
    evaljs : com$mobile$zhsg$HomeController$evaljs
};
com.mobile.zhsg.HomeController.registerClass('com.mobile.zhsg.HomeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
