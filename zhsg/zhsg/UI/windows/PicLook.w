<?xml version="1.0" encoding="UTF-8"?>

<region id="region1">
    <import ref="PicLook.css" type="css"/>
    <widget-define xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="PicLook">
        <div id="panel0">
            <div id="panel1">
                <label id="label0"/>
                <input id="button0" class="textbtnclass" onclick="closePop()" type="button"/> 
            </div>
            <image id="image0" errimage="picture.png" onload="loadBigPic()" scaletype="fitcenter" src="picture.png"/> 
        </div> 
    </widget-define> 
</region>
