<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="SelectImage" controller="SelectImageController" namespace="com.mobile.zhsg">
    <import ref="SelectImage.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="隐患详情" class="navigatorbarclass">
            <input id="button0" class="buttonclass" onclick="back()" type="button"/>
            <label id="label0"/>
            <input id="button1" value="完成" class="textbtnclass" onclick="selectPic()" type="button"/> 
        </navigatorbar>
        <imageselector id="imageselector0" onload="loadPic()"/> 
    </div> 
</window>
