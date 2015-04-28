<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="PersonRef" controller="PersonRefController" namespace="com.mobile.zhsg">
    <import ref="PersonRef.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="责任人" class="navigatorbarclass">
            <input id="button1" class="textbtnclass" type="button"/>
            <label id="label0"/>
            <input id="button0" class="buttonclass" type="button"/> 
        </navigatorbar>
        <search id="search0" localstorage="true" placeholder="搜索"/>
        <listView id="listviewdefine0" onload="loadList()">
            <div id="panel0">
                <div id="panel1">
                    <label id="label1">编码</label>
                    <label id="label2">名称</label> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </div> 
</window>
