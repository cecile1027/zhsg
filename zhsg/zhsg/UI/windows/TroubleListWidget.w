<?xml version="1.0" encoding="UTF-8"?>

<region id="region1">
    <import ref="TroubleListWidget.css" type="css"/>
    <widget-define xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="TroubleListWidget" context="">
        <listView id="listviewdefine0" bindfield="list" onItemClick="itemClick()">
            <div id="panel0">
                <div id="panel1">
                    <div id="panel3">
                        <label id="label0" bindfield="safe_yh_level" background="#{widget.color0}">一般</label>
                        <label id="label1" bindfield="ope_area_desc">工作区</label>
                        <label id="label2">label</label>
                        <label id="label3" bindfield="rowstate">整改中</label> 
                    </div>
                    <div id="panel4">
                        <label id="label4">隐患描述</label> 
                    </div>
                    <div id="panel5">
                        <label id="label5" bindfield="hazard_desc" type="multiline"/> 
                    </div> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </widget-define> 
</region>
