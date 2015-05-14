<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OrgRef" controller="OrgRefController" namespace="com.mobile.zhsg">
    <import ref="OrgRef.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="责任单位" class="navigatorbarclass">
            <input id="button1" class="textbtnclass" onclick="back()" type="button"/>
            <label id="label0"/>
            <input id="button0" class="buttonclass" onclick="more()" type="button"/> 
        </navigatorbar>
        <search id="search0" placeholder="搜索" localstorage="true" onsearch="search()"/>
        <listView id="listviewdefine0" bindfield="list" onload="loadList()" onItemClick="itemClick()">
            <div id="panel0">
                <div id="panel1">
                    <label id="label1" bindfield="respon_unit">编码</label>
                    <label id="label2" bindfield="respon_unit_desc">名称</label> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </div> 
</window>
