<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Home" controller="HomeController" namespace="com.mobile.zhsg">
    <import ref="Home.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <import ref="TroubleListWidget.w" type="widget"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="安全巡查" class="navigatorbarclass">
            <input id="button0" class="buttonclass" onclick="back()" type="button"/>
            <label id="label0"/>
            <input id="button1" value="消息" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <search id="search0" placeholder="搜索" localstorage="true" onsearch="search()"/>
        <div id="panel0">
            <div id="panel3">
                <toggleButtonGroup id="togglebuttongroup0" onchange="toggleChange()">
                    <toggleButton id="togglebutton0" value="0" class="togglebtnitemclass" textOff="所有" textOn="所有" type="button" checked="true"/>
                    <toggleButton id="togglebutton1" value="1" class="togglebtnitemclass" textOff="待验证" textOn="待验证" type="button"/>
                    <toggleButton id="togglebutton2" value="2" class="togglebtnitemclass" textOff="被退回" textOn="被退回" type="button"/>
                    <toggleButton id="togglebutton3" value="3" class="togglebtnitemclass" textOff="整改中" textOn="整改中" type="button"/> 
                </toggleButtonGroup>
                <div id="panel4"/> 
            </div>
            <flipper id="flipperdefine0" onnextflipper="next()" onload="load()" onpreviousflipper="previous()" viewindex="1">
                <div id="listpanel0" title="页面1">
                    <widget id="widget0" ref="TroubleListWidget"/> 
                </div>
                <div id="listpanel1" title="页面2">
                    <widget id="widget1" ref="TroubleListWidget"/> 
                </div>
                <div id="listpanel2" title="页面3">
                    <widget id="widget2" ref="TroubleListWidget"/> 
                </div>
                <div id="listpanel3" title="页面4">
                    <widget id="widget3" ref="TroubleListWidget"/> 
                </div> 
            </flipper> 
        </div>
        <div id="panel1">
            <tabbar id="tabbar0">
                <tabbaritem id="tabbaritem0" tabbarItemType="icontext" text="隐患列表" target="com.mobile.zhsg.Home" class="tabitemclass" checked="true"/>
                <tabbaritem id="tabbaritem1" tabbarItemType="icon" class="tabitemclass" onclick="addTrouble()"/>
                <tabbaritem id="tabbaritem2" tabbarItemType="icontext" text="个人中心" class="tabitemclass"/> 
            </tabbar>
            <div id="panel2"/> 
        </div> 
    </div> 
</window>
