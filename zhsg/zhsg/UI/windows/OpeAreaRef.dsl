<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OpeAreaRef" controller="OpeAreaRefController" namespace="com.mobile.zhsg">
    <import ref="OpeAreaRef.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="工作区" class="navigatorbarclass">
            <input id="button1" class="textbtnclass" type="button"/>
            <label id="label0"/> 
        </navigatorbar>
        <search id="search0" localstorage="true" placeholder="搜索"/>
        <listView id="listviewdefine0" onload="loadList()">
            <div id="panel0">
                <div id="panel1" onload="load()">
                    <label id="label1" bindfield="ope_area_no">编码</label>
                    <label id="label2" bindfield="ope_area_desc">名称</label> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </div> 
</window>
