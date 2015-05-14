<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="NewTrouble" controller="NewTroubleController" namespace="com.mobile.zhsg">
    <import ref="NewTrouble.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <import ref="AddAttachment.w" type="widget"/>
    <div id="viewPage0" onload="load()">
        <navigatorbar id="navigatorbar0" title="新隐患" class="navigatorbarclass">
            <input id="backbutton0" class="buttonclass" onclick="onback()" type="button"/>
            <label id="space0"/>
            <input id="commit" value="提交" class="buttonclass" onclick="commit()" type="button"/> 
        </navigatorbar>
        <Scrollview id="Scrollview_total" height="fill" width="fill" hScrollEnabled="disabled">
            <div id="total">
                <div id="div1">
                    <div id="divpanel0">
                        <label id="projectLable">项目名称</label>
                        <label id="space1"/>
                        <label id="projText" bindfield="proj_no">名称</label>
                        <image id="rowflag0" scaletype="fitcenter"/> 
                    </div>
                    <div id="brpanel0"/>
                    <div id="divpanel1" onclick="area()">
                        <label id="areaLable">工作区</label>
                        <label id="space2"/>
                        <label id="areaText" bindfield="ope_area_no">选择</label>
                        <label id="sp2"/>
                        <image id="rowflag1" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel2"/>
                    <div id="divpanel2" onclick="org()">
                        <label id="unitLable">责任单位</label>
                        <label id="space3"/>
                        <label id="unitText" bindfield="respon_unit_desc">选择</label>
                        <label id="sp3"/>
                        <image id="rowflag3" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel3"/>
                    <div id="divpanel3" onclick="person()">
                        <label id="unitpersonLable">责任人</label>
                        <label id="space4"/>
                        <label id="officeText" bindfield="duty_officer_name">选择</label>
                        <label id="sp4"/>
                        <image id="rowflag4" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="panel13"/> 
                </div>
                <div id="div2">
                    <div id="divpanel4" onclick="type()">
                        <label id="label21">分类</label>
                        <label id="label22"/>
                        <label id="label23" bindfield="yh_sub_type_describe">细化</label>
                        <label id="label24"/>
                        <image id="image5" scaletype="fitcenter" src="row_indicator.png"/> 
                    </div>
                    <div id="brpanel5"/>
                    <div id="divpanel5">
                        <label id="label25">等级</label>
                        <label id="label26"/>
                        <toggleButtonGroup id="togglebuttongroup0" bindfield="safe_yh_level">
                            <toggleButton id="togglebutton0" value="NORMAL" textOff="一般" textOn="一般" type="button" checked="true"/>
                            <toggleButton id="togglebutton1" value="GRAVE" textOff="重大" textOn="重大" type="button"/> 
                        </toggleButtonGroup> 
                    </div>
                    <div id="brpanel6"/>
                    <div id="divpanel6">
                        <label id="label29">整改截止时间</label>
                        <label id="label30"/>
                        <input id="dateinput0" bindfield="rectification_period" placeholder="2015-04-22" value="2015-04-23" format="yyyy-MM-dd" type="date"/> 
                    </div>
                    <div id="brpanel7"/>
                    <div id="divpanel7">
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
                </div>
                <div id="div3" onclick="sendPerson()">
                    <label id="label17">抄送人</label>
                    <label id="label18"/>
                    <input id="addPersonButton" class="textbtnclass" onclick="sendPerson()" type="button"/> 
                </div>
                <div id="div4"/>
                <div id="div5">
                    <label id="sendPersonText" bindfield="sendperson" type="multiline">（抄送人）</label> 
                </div>
                <div id="div6">
                    <label id="label27">隐患描述</label> 
                </div>
                <textArea id="textArea" bindfield="hazard_desc" placeholder="（非必填）"/>
                <div id="div7">
                    <label id="label28">上传取证</label> 
                </div>
                <div id="attpanel1">
                    <div id="panel22">
                        <image id="attimage1" onclick="clickPic()" scaletype="fitcenter" src="addimg_normal.png"/> 
                    </div>
                    <div id="panel23">
                        <image id="attimage2" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel21">
                        <image id="attimage3" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div>
                <div id="attpanel2">
                    <div id="panel24">
                        <image id="attimage4" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel25">
                        <image id="attimage5" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel26">
                        <image id="attimage6" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div>
                <div id="attpanel3">
                    <div id="panel27">
                        <image id="attimage7" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel28">
                        <image id="attimage8" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div>
                    <div id="panel29">
                        <image id="attimage9" visible="false" onclick="clickPic()" scaletype="fitcenter" src=""/> 
                    </div> 
                </div> 
            </div>
        </Scrollview>
        <widget id="widget0" ref="AddAttachment"/> 
    </div> 
</window>
