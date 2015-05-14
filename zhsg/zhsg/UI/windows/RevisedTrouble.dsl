<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="RevisedTrouble" controller="RevisedTroubleController" namespace="com.mobile.zhsg">
    <import ref="RevisedTrouble.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <Scrollview id="Scrollview_viewPage0" height="fill" width="fill" hScrollEnabled="disabled">
        <div id="viewPage0" onload="load()">
            <navigatorbar id="navigatorbar0" title="隐患详情" class="navigatorbarclass">
                <input id="button0" class="buttonclass" onclick="back()" type="button"/>
                <label id="label0"/> 
            </navigatorbar>
            <div id="panel0">
                <div id="panel1">
                    <label bindfield="safe_yh_level_name" id="label1">一般</label>
                    <label bindfield="ope_area_no" id="label2">工作区</label>
                    <label id="label3">label</label>
                    <label bindfield="rowstate_name" id="label4">已创建</label> 
                </div>
                <div id="panel2">
                    <label bindfield="respon_unit_desc" id="label5">责任单位</label>
                    <label id="label6"/>
                    <label bindfield="duty_officer_name" id="label7">责任人</label> 
                </div>
                <div id="panel3">
                    <label bindfield="yh_sub_type_describe" id="label10">细化</label>
                    <label id="label11"/>
                    <label bindfield="rectification_period" id="period">整改截止时间</label> 
                </div>
                <div id="panel4">
                    <label id="label13">隐患描述</label>
                    <label id="label14"/>
                    <input id="button1" value="展开" class="textbtnclass" type="button"/> 
                </div>
                <label bindfield="hazard_desc" id="label15" type="multiline">隐患描述</label> 
            </div>
            <div id="panel7">
                <label id="label17">整改前取证</label> 
            </div>
            <div id="panel8">
                <gallery id="beforegallery" bindField="beforeAtt" onload="loadSmallPic()" itemindex="0" onitemclick="openBigPic()" scaletype="fitcenter" spacing="12dp" datasource="" itemwidth="60"/> 
            </div>
            <div id="panel9" onclick="history()">
                <label id="label19">审核历史</label>
                <label id="label22"/>
                <image id="image0" scaletype="fitcenter" src="row_indicator.png"/> 
            </div> 
        </div>
    </Scrollview> 
</window>
