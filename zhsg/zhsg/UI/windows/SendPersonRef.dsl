<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="SendPersonRef" controller="SendPersonRefController" namespace="com.mobile.zhsg">
    <import ref="SendPersonRef.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="抄送人" class="navigatorbarclass">
            <input id="button1" class="textbtnclass" type="button"/>
            <label id="label0"/>
            <input id="button0" value="确定" class="buttonclass" type="button"/> 
        </navigatorbar>
        <search id="search0" localstorage="true" placeholder="搜索"/>
        <listView id="listviewdefine0" onload="loadList()">
            <div id="panel0">
                <div id="panel1">
                    <label id="label1" bindfield="person_code">编码</label>
                    <label id="label2" bindfield="person_name">名称</label>
                    <input id="checkbox0" type="checkbox" checked="checked"/> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </div> 
</window>
