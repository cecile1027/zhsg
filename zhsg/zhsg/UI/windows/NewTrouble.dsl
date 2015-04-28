<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="NewTrouble" controller="NewTroubleController" namespace="com.mobile.zhsg">
    <import ref="NewTrouble.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <import ref="AddAttachment.w" type="widget"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="新隐患" class="navigatorbarclass">
            <input id="button0" class="buttonclass" type="button"/>
            <label id="label0"/>
            <input id="button1" value="提交" class="buttonclass" onclick="commit()" type="button"/> 
        </navigatorbar>
        <Scrollview id="Scrollview_total" height="fill" width="fill" hScrollEnabled="disabled">
            <div id="total">
                <div id="div1">
                    <div id="panel0">
                        <label id="label2">项目名称</label>
                        <label id="label3"/>
                        <label id="label4" bindfield="proj_no">名称</label>
                        <label id="label5"/>
                        <image id="image0" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="brpanel0"/>
                    <div id="panel2" onclick="area()">
                        <label id="label9">工作区</label>
                        <label id="label10"/>
                        <label id="label11" bindfield="ope_area_desc">选择</label>
                        <label id="label12"/>
                        <image id="image2" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel2"/>
                    <div id="panel3" onclick="org()">
                        <label id="label13">责任单位</label>
                        <label id="label14"/>
                        <label id="label15" bindfield="org_desc">选择</label>
                        <label id="label16" onclick=""/>
                        <image id="image3" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel3"/>
                    <div id="panel12" onclick="person()">
                        <label id="label31">责任人</label>
                        <label id="label32"/>
                        <label id="label33" bindfield="name">选择</label>
                        <label id="label34"/>
                        <image id="image6" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="panel13"/> 
                </div>
                <div id="div2">
                    <div id="brpanel4"/>
                    <div id="panel5" onclick="type()">
                        <label id="label21">分类</label>
                        <label id="label22"/>
                        <label id="label23" bindfield="type_describe">细化</label>
                        <label id="label24"/>
                        <image id="image5" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel5"/>
                    <div id="panel6">
                        <label id="label25">等级</label>
                        <label id="label26"/>
                        <toggleButtonGroup id="togglebuttongroup0">
                            <toggleButton id="togglebutton0" bindfield="safe_yh_level" value="0" textOff="一般" textOn="一般" type="button" checked="true"/>
                            <toggleButton id="togglebutton1" bindfield="safe_yh_level" value="1" textOff="重大" textOn="重大" type="button"/> 
                        </toggleButtonGroup> 
                    </div>
                    <div id="brpanel6"/>
                    <div id="panel7">
                        <label id="label29">整改截止时间</label>
                        <label id="label30"/>
                        <input id="dateinput0" bindfield="rectification_period" placeholder="2015-04-22" value="2015-04-22" format="yyyy-MM-dd" type="date"/> 
                    </div>
                    <div id="brpanel7"/>
                    <div id="panel8">
                        <div id="panel15">
                            <input id="day1" value="1天" class="textbtnclass" onclick="addDay()" type="button"/> 
                        </div>
                        <div id="panel16">
                            <input id="day3" value="3天" class="textbtnclass" onclick="addDay()" type="button"/> 
                        </div>
                        <div id="panel17">
                            <input id="day5" value="7天" class="textbtnclass" onclick="addDay()" type="button"/> 
                        </div> 
                    </div>
                    <div id="brpanel8"/>
                    <div id="panel14"/> 
                </div>
                <div id="panel4" onclick="sendPerson()">
                    <label id="label17">抄送人</label>
                    <label id="label18"/>
                    <input id="button2" class="textbtnclass" onclick="sendPerson()" type="button"/> 
                </div>
                <div id="panel1"/>
                <div id="panel18">
                    <label id="label1" bindfield="sendperson" type="multiline">（抄送人）</label> 
                </div>
                <div id="panel9">
                    <label id="label27">隐患描述</label> 
                </div>
                <textArea id="textarea0" bindfield="hazard_desc" placeholder="（非必填）"/>
                <div id="panel10">
                    <label id="label28">上传取证</label> 
                </div>
                <div id="attpanel1">
                    <div id="panel22">
                        <image id="attimage1" onclick="addPic()" scaletype="fitcenter" src="addimg_normal.png"/> 
                    </div>
                    <div id="panel23">
                        <image id="attimage2" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel21">
                        <image id="attimage3" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div>
                <div id="attpanel2">
                    <div id="panel24">
                        <image id="attimage4" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel25">
                        <image id="attimage5" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel26">
                        <image id="attimage6" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div>
                <div id="attpanel3">
                    <div id="panel27">
                        <image id="attimage7" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel28">
                        <image id="attimage8" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel29">
                        <image id="attimage9" visible="false" onclick="addPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div> 
            </div>
        </Scrollview>
        <widget id="widget0" ref="AddAttachment"/> 
    </div> 
</window>
