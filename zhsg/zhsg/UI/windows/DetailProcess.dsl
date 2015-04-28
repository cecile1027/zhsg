<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="DetailProcess" controller="DetailProcessController" namespace="com.mobile.zhsg">
    <import ref="DetailProcess.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="审核历史" class="navigatorbarclass">
            <input id="button0" class="buttonclass" type="button"/>
            <label id="label0"/> 
        </navigatorbar>
        <listView id="listviewdefine0">
            <div id="panel0">
                <div id="panel1">
                    <div id="panel3">
                        <label id="label1" bindfield="approve_person">审核人</label>
                        <label id="label2" bindfield="approve_time">审核时间</label> 
                    </div>
                    <div id="panel4">
                        <label id="label3">审核意见</label> 
                    </div>
                    <label id="label4" bindfield="approve_desc" type="multiline">（意见）</label> 
                </div>
                <div id="panel2"/> 
            </div> 
        </listView> 
    </div> 
</window>
