<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Login" controller="LoginController" namespace="com.mobile.zhsg">
    <import ref="Login.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0" onload="load()">
        <navigatorbar id="navigatorbar0" title="安全巡检" class="navigatorbarclass">
            <label id="label0"/>
            <input id="button0" value="登陆" class="buttonclass" onclick="login()" type="button"/> 
        </navigatorbar>
        <div id="panel0">
            <div id="panel1">
                <input id="textbox0" bindfield="username" maxlength="256" placeholder="用户名" type="text"/>
                <div id="panel3"/> 
            </div>
            <div id="panel2">
                <input id="pwinput" bindfield="password" maxlength="256" placeholder="密码" type="password" onchange="passwordChange()"/>
                <input id="textinput" maxlength="256" placeholder="文本输入框" type="text" onchange="passwordChange()"/>
                <input id="showButton" class="textbtnclass" onclick="showPassword()" type="button"/> 
            </div> 
        </div> 
    </div> 
</window>
