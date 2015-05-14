<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="BackTrouble" controller="BackTroubleController" namespace="com.mobile.zhsg">
    <import ref="BackTrouble.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <Scrollview id="Scrollview_viewPage0" height="fill" width="fill" hScrollEnabled="disabled">
        <div id="viewPage0" onload="load()">
            <navigatorbar id="navigatorbar0" title="隐患详情" class="navigatorbarclass">
                <input id="button0" class="buttonclass" onclick="back()" type="button"/>
                <label id="label0"/>
                <input id="more" value="提交" class="textbtnclass" onclick="commit()" type="button"/> 
            </navigatorbar>
            <div id="panel0">
                <div id="panel1">
                    <label id="label1" bindfield="safe_yh_level_name">一般</label>
                    <label id="label2" bindfield="ope_area_no">工作区</label>
                    <label id="label3"/>
                    <label id="label4" bindfield="rowstate_name">已创建</label> 
                </div>
                <div id="panel4">
                    <label id="label13">隐患描述</label>
                    <label id="label14"/>
                    <input id="button1" value="展开" class="textbtnclass" type="button"/> 
                </div>
                <label id="label15" bindfield="hazard_desc" type="multiline">隐患描述</label> 
            </div>
            <div id="panel11">
                <div id="panel12">
                    <label id="label8">退回原由</label> 
                </div>
                <textArea bindfield="approve_desc" id="textarea0" placeholder="（意见）"/> 
            </div>
            <div id="panel9">
                <label id="label19" bindfield="sendperson">抄送人</label>
                <label id="label22"/>
                <input id="button2" class="textbtnclass" type="button"/> 
            </div>
            <div id="panel2">
                <label id="label5" type="multiline"/> 
            </div> 
        </div>
    </Scrollview> 
</window>
