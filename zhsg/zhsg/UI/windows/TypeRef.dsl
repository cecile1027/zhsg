<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="TypeRef" controller="TypeRefController" namespace="com.mobile.zhsg">  
    <import ref="TypeRef.css" type="css"/>  
    <link type="text/css" href="sys/theme.css"/>  
    <div id="viewPage0"> 
        <navigatorbar id="navigatorbar0" title="隐患分类" class="navigatorbarclass"> 
            <input id="button0" class="buttonclass" onclick="back()" type="button"/>  
            <label id="label0"/> 
        </navigatorbar>  
        <search id="search0" placeholder="搜索" localstorage="true" onsearch="search()"/>  
        <listView id="listviewdefine0" bindfield="list,row" onuprefersh="load()" onload="load()" onItemClick="itemClick()"> 
            <div id="panel0"> 
                <div id="panel1"> 
                    <label id="label1" bindfield="yh_type_describe">分类</label> 
                </div>  
                <div id="panel2"/> 
            </div>  
            <div id="panel3"> 
                <div id="panel4"> 
                    <label id="label2" bindfield="yh_sub_type">细类编码</label>  
                    <label id="label3" bindfield="yh_sub_type_describe">细类名称</label> 
                </div>  
                <div id="panel5"/> 
            </div> 
        </listView> 
    </div> 
</window>
