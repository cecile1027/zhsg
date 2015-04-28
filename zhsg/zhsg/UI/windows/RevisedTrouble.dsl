<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="RevisedTrouble" controller="RevisedTroubleController" namespace="com.mobile.zhsg">
    <import ref="RevisedTrouble.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <Scrollview id="Scrollview_viewPage0" height="fill" width="fill" hScrollEnabled="disabled">
        <div id="viewPage0">
            <navigatorbar id="navigatorbar0" title="隐患详情" class="navigatorbarclass">
                <input id="button0" class="buttonclass" type="button"/>
                <label id="label0"/> 
            </navigatorbar>
            <div id="panel0">
                <div id="panel1">
                    <label bindfield="safe_yh_level" id="label1">一般</label>
                    <label bindfield="ope_area_desc" id="label2">工作区</label>
                    <label id="label3">label</label>
                    <label bindfield="rowstate" id="label4">已创建</label> 
                </div>
                <div id="panel2">
                    <label bindfield="org_desc" id="label5">责任单位</label>
                    <label id="label6"/>
                    <label bindfield="name" id="label7">责任人</label> 
                </div>
                <div id="panel3">
                    <label bindfield="type_describe" id="label10">细化</label>
                    <label id="label11"/>
                    <label bindfield="rectification_period" id="label12">整改截止时间</label> 
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
                <div id="afterPrevious" onclick="previous()">
                    <input id="button3" class="textbtnclass" type="button"/> 
                </div>
                <Scrollview id="Scrollview_panel10" height="fill" vScrollEnabled="always" hScrollEnabled="disabled">
                    <div id="panel10">
                        <div id="panel13">
                            <image id="afterImage1" scaletype="fitcenter" src="picture"/> 
                        </div>
                        <div id="panel14">
                            <image id="afterImage2" scaletype="fitcenter" src="picture"/> 
                        </div>
                        <div id="panel15">
                            <image id="afterImage3" scaletype="fitcenter" src="picture"/> 
                        </div>
                        <div id="panel16">
                            <image id="afterImage4" scaletype="fitcenter" src="picture"/> 
                        </div> 
                    </div>
                </Scrollview>
                <div id="afterNext" onclick="next()">
                    <input id="button2" class="textbtnclass" type="button"/> 
                </div> 
            </div>
            <div id="panel9">
                <label id="label19">审核历史</label>
                <label id="label22"/>
                <image id="image0" scaletype="fitcenter" src="row_indicator.png"/> 
            </div> 
        </div>
    </Scrollview> 
</window>
