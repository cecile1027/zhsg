<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="TroubleDetail" controller="TroubleDetailController" namespace="com.mobile.zhsg">
    <import ref="TroubleDetail.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <Scrollview id="Scrollview_viewPage0" height="fill" width="fill" hScrollEnabled="disabled">
        <div id="viewPage0" onload="load()">
            <navigatorbar id="navigatorbar0" title="隐患详情" class="navigatorbarclass">
                <input id="button0" class="buttonclass" onclick="back()" type="button"/>
                <label id="label0"/> 
            </navigatorbar>
            <div id="panel0">
                <div id="panel1">
                    <label id="label1" bindfield="safe_yh_level_name">一般</label>
                    <label id="label2" bindfield="ope_area_no">工作区</label>
                    <label id="label3">label</label>
                    <label id="label4" bindfield="rowstate_name">已创建</label> 
                </div>
                <div id="panel2">
                    <label id="label5" bindfield="respon_unit_desc">责任单位</label>
                    <label id="label6"/>
                    <label id="label7" bindfield="duty_officer_name">责任人</label> 
                </div>
                <div id="panel3">
                    <label id="label10" bindfield="yh_sub_type_describe">细化</label>
                    <label id="label11"/>
                    <label id="period" bindfield="rectification_period">整改截止时间</label> 
                </div>
                <div id="panel4">
                    <label id="label13">隐患描述</label>
                    <label id="label14"/>
                    <input id="button1" value="展开" class="textbtnclass" type="button"/> 
                </div>
                <label id="label15" bindfield="hazard_desc" type="multiline">隐患描述</label> 
            </div>
            <div id="panel5">
                <label id="label16">整改后取证</label> 
            </div>
            <div id="panel6">
                <gallery id="aftergallery" bindField="afterAtt" itemindex="0" scaletype="fitcenter" spacing="12dp" datasource="" itemwidth="60"/> 
            </div>
            <div id="panel7">
                <label id="label17">整改前取证</label> 
            </div>
            <div id="panel8">
                <gallery id="beforegallery" bindField="beforeAtt" itemindex="0" scaletype="fitcenter" spacing="12dp" datasource="" itemwidth="60"/> 
            </div>
            <div id="panel9">
                <label id="label19">审核历史</label>
                <label id="label22"/>
                <image id="image0" scaletype="fitcenter" src="row_indicator.png"/> 
            </div> 
        </div>
    </Scrollview> 
</window>
