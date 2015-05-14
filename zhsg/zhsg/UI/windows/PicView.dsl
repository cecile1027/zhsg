<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="PicView" controller="PicViewController" namespace="com.mobile.zhsg">
    <import ref="PicView.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" class="navigatorbarclass">
            <input id="button0" class="buttonclass" onclick="back()" type="button"/>
            <div id="panel0">
                <label id="label0">2/2</label> 
            </div>
            <input id="button1" class="textbtnclass" onclick="delPic()" type="button"/> 
        </navigatorbar>
        <div id="panel1">
            <imageflipper id="imageflipper0" titleheight="0" bindfield="images" descheight="0" interval="2000" onload="loadPic()" onnextflipper="next()" flipperbtnvisible="false" onpreviousflipper="previous()" isloop="true" scaletype="fitcenter" autoflip="false">
                <imageflipperitem id="imageflipper0_0" title="标题" description="" src=""/>
                <imageflipperitem id="imageflipper0_1" title="标题" description="" src=""/>
                <imageflipperitem id="imageflipper0_2" title="标题" description="" src=""/> 
            </imageflipper> 
        </div> 
    </div> 
</window>
