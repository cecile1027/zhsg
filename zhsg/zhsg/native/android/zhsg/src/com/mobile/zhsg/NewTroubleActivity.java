package com.mobile.zhsg;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class NewTroubleActivity extends UMWindowActivity {

	protected UMWindow NewTrouble = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton backbutton0 = null;
protected UMLabel space0 = null;
protected UMButton commit = null;
protected UMScrollView Scrollview_total = null;
protected XVerticalLayout total = null;
protected XVerticalLayout div1 = null;
protected XHorizontalLayout divpanel0 = null;
protected UMLabel projectLable = null;
protected UMLabel space1 = null;
protected UMLabel projText = null;
protected UMImage rowflag0 = null;
protected XRelativeLayout brpanel0 = null;
protected XHorizontalLayout divpanel1 = null;
protected UMLabel areaLable = null;
protected UMLabel space2 = null;
protected UMLabel areaText = null;
protected UMLabel sp2 = null;
protected UMImage rowflag1 = null;
protected XRelativeLayout brpanel2 = null;
protected XHorizontalLayout divpanel2 = null;
protected UMLabel unitLable = null;
protected UMLabel space3 = null;
protected UMLabel unitText = null;
protected UMLabel sp3 = null;
protected UMImage rowflag3 = null;
protected XRelativeLayout brpanel3 = null;
protected XHorizontalLayout divpanel3 = null;
protected UMLabel unitpersonLable = null;
protected UMLabel space4 = null;
protected UMLabel officeText = null;
protected UMLabel sp4 = null;
protected UMImage rowflag4 = null;
protected XRelativeLayout panel13 = null;
protected XVerticalLayout div2 = null;
protected XHorizontalLayout divpanel4 = null;
protected UMLabel label21 = null;
protected UMLabel label22 = null;
protected UMLabel label23 = null;
protected UMLabel label24 = null;
protected UMImage image5 = null;
protected XRelativeLayout brpanel5 = null;
protected XHorizontalLayout divpanel5 = null;
protected UMLabel label25 = null;
protected UMLabel label26 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected XRelativeLayout brpanel6 = null;
protected XHorizontalLayout divpanel6 = null;
protected UMLabel label29 = null;
protected UMLabel label30 = null;
protected UMDateEdit dateinput0 = null;
protected XRelativeLayout brpanel7 = null;
protected XHorizontalLayout divpanel7 = null;
protected XVerticalLayout panel15 = null;
protected UMButton day1 = null;
protected XVerticalLayout panel16 = null;
protected UMButton day3 = null;
protected XVerticalLayout panel17 = null;
protected UMButton day5 = null;
protected XHorizontalLayout brpanel8 = null;
protected XHorizontalLayout div3 = null;
protected UMLabel label17 = null;
protected UMLabel label18 = null;
protected UMButton addPersonButton = null;
protected XRelativeLayout div4 = null;
protected XRelativeLayout div5 = null;
protected UMLabel sendPersonText = null;
protected XHorizontalLayout div6 = null;
protected UMLabel label27 = null;
protected UMTextArea textArea = null;
protected XHorizontalLayout div7 = null;
protected UMLabel label28 = null;
protected XHorizontalLayout attpanel1 = null;
protected XVerticalLayout panel22 = null;
protected UMImage attimage1 = null;
protected XVerticalLayout panel23 = null;
protected UMImage attimage2 = null;
protected XVerticalLayout panel21 = null;
protected UMImage attimage3 = null;
protected XHorizontalLayout attpanel2 = null;
protected XVerticalLayout panel24 = null;
protected UMImage attimage4 = null;
protected XVerticalLayout panel25 = null;
protected UMImage attimage5 = null;
protected XVerticalLayout panel26 = null;
protected UMImage attimage6 = null;
protected XHorizontalLayout attpanel3 = null;
protected XVerticalLayout panel27 = null;
protected UMImage attimage7 = null;
protected XVerticalLayout panel28 = null;
protected UMImage attimage8 = null;
protected XVerticalLayout panel29 = null;
protected UMImage attimage9 = null;
protected XVerticalLayout widget0 = null;
protected UMButton widget0_button0 = null;
protected UMButton widget0_button1 = null;
protected UMButton widget0_button2 = null;

	
	protected final static int ID_NEWTROUBLE = 2126840543;
protected final static int ID_VIEWPAGE0 = 316282646;
protected final static int ID_NAVIGATORBAR0 = 1349299910;
protected final static int ID_BACKBUTTON0 = 2055732578;
protected final static int ID_SPACE0 = 797009679;
protected final static int ID_COMMIT = 1470432524;
protected final static int ID_SCROLLVIEW_TOTAL = 1309486440;
protected final static int ID_TOTAL = 965821448;
protected final static int ID_DIV1 = 236290733;
protected final static int ID_DIVPANEL0 = 211979944;
protected final static int ID_PROJECTLABLE = 1708684241;
protected final static int ID_SPACE1 = 878735597;
protected final static int ID_PROJTEXT = 220149144;
protected final static int ID_ROWFLAG0 = 512721776;
protected final static int ID_BRPANEL0 = 410175420;
protected final static int ID_DIVPANEL1 = 129664283;
protected final static int ID_AREALABLE = 556685943;
protected final static int ID_SPACE2 = 1846347183;
protected final static int ID_AREATEXT = 245814320;
protected final static int ID_SP2 = 1034270765;
protected final static int ID_ROWFLAG1 = 879198231;
protected final static int ID_BRPANEL2 = 691911874;
protected final static int ID_DIVPANEL2 = 746929084;
protected final static int ID_UNITLABLE = 1455200471;
protected final static int ID_SPACE3 = 2112433610;
protected final static int ID_UNITTEXT = 49381616;
protected final static int ID_SP3 = 594182216;
protected final static int ID_ROWFLAG3 = 528590240;
protected final static int ID_BRPANEL3 = 1639419287;
protected final static int ID_DIVPANEL3 = 789223249;
protected final static int ID_UNITPERSONLABLE = 1737742514;
protected final static int ID_SPACE4 = 1838505;
protected final static int ID_OFFICETEXT = 1540375482;
protected final static int ID_SP4 = 1700644601;
protected final static int ID_ROWFLAG4 = 584483967;
protected final static int ID_PANEL13 = 1699084089;
protected final static int ID_DIV2 = 536660966;
protected final static int ID_DIVPANEL4 = 46678211;
protected final static int ID_LABEL21 = 1104374698;
protected final static int ID_LABEL22 = 2046083594;
protected final static int ID_LABEL23 = 865425427;
protected final static int ID_LABEL24 = 964823349;
protected final static int ID_IMAGE5 = 2143467598;
protected final static int ID_BRPANEL5 = 2058766314;
protected final static int ID_DIVPANEL5 = 562744587;
protected final static int ID_LABEL25 = 83774595;
protected final static int ID_LABEL26 = 47784217;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1997056945;
protected final static int ID_TOGGLEBUTTON0 = 2113268236;
protected final static int ID_TOGGLEBUTTON1 = 1578505889;
protected final static int ID_BRPANEL6 = 976601436;
protected final static int ID_DIVPANEL6 = 1031598594;
protected final static int ID_LABEL29 = 1964332263;
protected final static int ID_LABEL30 = 426119529;
protected final static int ID_DATEINPUT0 = 845785395;
protected final static int ID_BRPANEL7 = 191915914;
protected final static int ID_DIVPANEL7 = 165337817;
protected final static int ID_PANEL15 = 1410684442;
protected final static int ID_DAY1 = 1283926782;
protected final static int ID_PANEL16 = 1928626579;
protected final static int ID_DAY3 = 718538055;
protected final static int ID_PANEL17 = 609803981;
protected final static int ID_DAY5 = 1492919172;
protected final static int ID_BRPANEL8 = 483353762;
protected final static int ID_DIV3 = 233342162;
protected final static int ID_LABEL17 = 1320286744;
protected final static int ID_LABEL18 = 1400824503;
protected final static int ID_ADDPERSONBUTTON = 1370756818;
protected final static int ID_DIV4 = 664760986;
protected final static int ID_DIV5 = 1056444455;
protected final static int ID_SENDPERSONTEXT = 1256161225;
protected final static int ID_DIV6 = 619238621;
protected final static int ID_LABEL27 = 1292681661;
protected final static int ID_TEXTAREA = 735049201;
protected final static int ID_DIV7 = 903636328;
protected final static int ID_LABEL28 = 1475460089;
protected final static int ID_ATTPANEL1 = 1468921084;
protected final static int ID_PANEL22 = 360605990;
protected final static int ID_ATTIMAGE1 = 700962046;
protected final static int ID_PANEL23 = 843922605;
protected final static int ID_ATTIMAGE2 = 655008925;
protected final static int ID_PANEL21 = 620404115;
protected final static int ID_ATTIMAGE3 = 1484547418;
protected final static int ID_ATTPANEL2 = 602875950;
protected final static int ID_PANEL24 = 2002465557;
protected final static int ID_ATTIMAGE4 = 340747895;
protected final static int ID_PANEL25 = 2095201695;
protected final static int ID_ATTIMAGE5 = 149988226;
protected final static int ID_PANEL26 = 604517008;
protected final static int ID_ATTIMAGE6 = 29878433;
protected final static int ID_ATTPANEL3 = 1984811795;
protected final static int ID_PANEL27 = 115029005;
protected final static int ID_ATTIMAGE7 = 977119567;
protected final static int ID_PANEL28 = 1213162873;
protected final static int ID_ATTIMAGE8 = 1253699011;
protected final static int ID_PANEL29 = 616051846;
protected final static int ID_ATTIMAGE9 = 872363215;
protected final static int ID_WIDGET0 = 2051058484;
protected final static int ID_WIDGET0_BUTTON0 = 2145758440;
protected final static int ID_WIDGET0_BUTTON1 = 1412026043;
protected final static int ID_WIDGET0_BUTTON2 = 364176576;

	
	
	@Override
	public String getControllerName() {
		return "NewTroubleController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.mobile.zhsg";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		UMDslConfigure configure = new UMDslConfigure();
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup,configure);
this.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("NewTrouble",ID_NEWTROUBLE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("backbutton0",ID_BACKBUTTON0);
  idmap.put("space0",ID_SPACE0);
  idmap.put("commit",ID_COMMIT);
  idmap.put("Scrollview_total",ID_SCROLLVIEW_TOTAL);
  idmap.put("total",ID_TOTAL);
  idmap.put("div1",ID_DIV1);
  idmap.put("divpanel0",ID_DIVPANEL0);
  idmap.put("projectLable",ID_PROJECTLABLE);
  idmap.put("space1",ID_SPACE1);
  idmap.put("projText",ID_PROJTEXT);
  idmap.put("rowflag0",ID_ROWFLAG0);
  idmap.put("brpanel0",ID_BRPANEL0);
  idmap.put("divpanel1",ID_DIVPANEL1);
  idmap.put("areaLable",ID_AREALABLE);
  idmap.put("space2",ID_SPACE2);
  idmap.put("areaText",ID_AREATEXT);
  idmap.put("sp2",ID_SP2);
  idmap.put("rowflag1",ID_ROWFLAG1);
  idmap.put("brpanel2",ID_BRPANEL2);
  idmap.put("divpanel2",ID_DIVPANEL2);
  idmap.put("unitLable",ID_UNITLABLE);
  idmap.put("space3",ID_SPACE3);
  idmap.put("unitText",ID_UNITTEXT);
  idmap.put("sp3",ID_SP3);
  idmap.put("rowflag3",ID_ROWFLAG3);
  idmap.put("brpanel3",ID_BRPANEL3);
  idmap.put("divpanel3",ID_DIVPANEL3);
  idmap.put("unitpersonLable",ID_UNITPERSONLABLE);
  idmap.put("space4",ID_SPACE4);
  idmap.put("officeText",ID_OFFICETEXT);
  idmap.put("sp4",ID_SP4);
  idmap.put("rowflag4",ID_ROWFLAG4);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("div2",ID_DIV2);
  idmap.put("divpanel4",ID_DIVPANEL4);
  idmap.put("label21",ID_LABEL21);
  idmap.put("label22",ID_LABEL22);
  idmap.put("label23",ID_LABEL23);
  idmap.put("label24",ID_LABEL24);
  idmap.put("image5",ID_IMAGE5);
  idmap.put("brpanel5",ID_BRPANEL5);
  idmap.put("divpanel5",ID_DIVPANEL5);
  idmap.put("label25",ID_LABEL25);
  idmap.put("label26",ID_LABEL26);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("brpanel6",ID_BRPANEL6);
  idmap.put("divpanel6",ID_DIVPANEL6);
  idmap.put("label29",ID_LABEL29);
  idmap.put("label30",ID_LABEL30);
  idmap.put("dateinput0",ID_DATEINPUT0);
  idmap.put("brpanel7",ID_BRPANEL7);
  idmap.put("divpanel7",ID_DIVPANEL7);
  idmap.put("panel15",ID_PANEL15);
  idmap.put("day1",ID_DAY1);
  idmap.put("panel16",ID_PANEL16);
  idmap.put("day3",ID_DAY3);
  idmap.put("panel17",ID_PANEL17);
  idmap.put("day5",ID_DAY5);
  idmap.put("brpanel8",ID_BRPANEL8);
  idmap.put("div3",ID_DIV3);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label18",ID_LABEL18);
  idmap.put("addPersonButton",ID_ADDPERSONBUTTON);
  idmap.put("div4",ID_DIV4);
  idmap.put("div5",ID_DIV5);
  idmap.put("sendPersonText",ID_SENDPERSONTEXT);
  idmap.put("div6",ID_DIV6);
  idmap.put("label27",ID_LABEL27);
  idmap.put("textArea",ID_TEXTAREA);
  idmap.put("div7",ID_DIV7);
  idmap.put("label28",ID_LABEL28);
  idmap.put("attpanel1",ID_ATTPANEL1);
  idmap.put("panel22",ID_PANEL22);
  idmap.put("attimage1",ID_ATTIMAGE1);
  idmap.put("panel23",ID_PANEL23);
  idmap.put("attimage2",ID_ATTIMAGE2);
  idmap.put("panel21",ID_PANEL21);
  idmap.put("attimage3",ID_ATTIMAGE3);
  idmap.put("attpanel2",ID_ATTPANEL2);
  idmap.put("panel24",ID_PANEL24);
  idmap.put("attimage4",ID_ATTIMAGE4);
  idmap.put("panel25",ID_PANEL25);
  idmap.put("attimage5",ID_ATTIMAGE5);
  idmap.put("panel26",ID_PANEL26);
  idmap.put("attimage6",ID_ATTIMAGE6);
  idmap.put("attpanel3",ID_ATTPANEL3);
  idmap.put("panel27",ID_PANEL27);
  idmap.put("attimage7",ID_ATTIMAGE7);
  idmap.put("panel28",ID_PANEL28);
  idmap.put("attimage8",ID_ATTIMAGE8);
  idmap.put("panel29",ID_PANEL29);
  idmap.put("attimage9",ID_ATTIMAGE9);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_button0",ID_WIDGET0_BUTTON0);
  idmap.put("widget0_button1",ID_WIDGET0_BUTTON1);
  idmap.put("widget0_button2",ID_WIDGET0_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - action:viewpage0_onload
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionViewpage0_onload(viewPage0,args);

}

	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"halign","LEFT"
,"width","fill"
,"title","新隐患"
,"height","44.0"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"background","#2d5aa7"
,"font-family","default"
,"valign","center"
);
backbutton0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BACKBUTTON0
,"halign","center"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44"
,"font-size","20"
,"onclick","action:backbutton0_onclick"
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
,"background-image","back.png"
);
backbutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionBackbutton0_onclick(backbutton0,args);

}
});
navigatorbar0.addView(backbutton0);
space0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACE0
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(space0);
commit = (UMButton)ThirdControl.createControl(new UMButton(context),ID_COMMIT
,"halign","center"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44.0"
,"font-size","17"
,"value","提交"
,"onclick","action:commit_onclick"
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
);
commit.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionCommit_onclick(commit,args);

}
});
navigatorbar0.addView(commit);

return navigatorbar0;
}
public View getDivpanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL0
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
projectLable = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PROJECTLABLE
,"content","项目名称"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","64.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel0.addView(projectLable);
space1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACE1
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel0.addView(space1);
projText = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PROJTEXT
,"content","名称"
,"bindfield","proj_no"
,"halign","right"
,"height","fill"
,"widthwrap","32.0"
,"color","#a6a6a6"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder projText_binder = new UMTextBinder((IUMContextAccessor)context);
projText_binder.setBindInfo(new BindInfo("proj_no"));
projText_binder.setControl(projText);
binderGroup.addBinderToGroup(ID_PROJTEXT, projText_binder);
divpanel0.addView(projText);
rowflag0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ROWFLAG0
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
);
divpanel0.addView(rowflag0);

return divpanel0;
}
public View getDivpanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL1
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:divpanel1_onclick"
,"valign","center"
);
divpanel1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDivpanel1_onclick(divpanel1,args);

}
});
areaLable = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_AREALABLE
,"content","工作区"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","48.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel1.addView(areaLable);
space2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACE2
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel1.addView(space2);
areaText = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_AREATEXT
,"content","选择"
,"bindfield","ope_area_no"
,"halign","right"
,"height","fill"
,"widthwrap","32.0"
,"color","#a6a6a6"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder areaText_binder = new UMTextBinder((IUMContextAccessor)context);
areaText_binder.setBindInfo(new BindInfo("ope_area_no"));
areaText_binder.setControl(areaText);
binderGroup.addBinderToGroup(ID_AREATEXT, areaText_binder);
divpanel1.addView(areaText);
sp2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SP2
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
divpanel1.addView(sp2);
rowflag1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ROWFLAG1
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
divpanel1.addView(rowflag1);

return divpanel1;
}
public View getDivpanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL2
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:divpanel2_onclick"
,"valign","center"
);
divpanel2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDivpanel2_onclick(divpanel2,args);

}
});
unitLable = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_UNITLABLE
,"content","责任单位"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","64.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel2.addView(unitLable);
space3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACE3
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel2.addView(space3);
unitText = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_UNITTEXT
,"content","选择"
,"bindfield","respon_unit_desc"
,"halign","right"
,"height","fill"
,"widthwrap","32.0"
,"color","#a6a6a6"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder unitText_binder = new UMTextBinder((IUMContextAccessor)context);
unitText_binder.setBindInfo(new BindInfo("respon_unit_desc"));
unitText_binder.setControl(unitText);
binderGroup.addBinderToGroup(ID_UNITTEXT, unitText_binder);
divpanel2.addView(unitText);
sp3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SP3
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
divpanel2.addView(sp3);
rowflag3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ROWFLAG3
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
divpanel2.addView(rowflag3);

return divpanel2;
}
public View getDivpanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL3
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:divpanel3_onclick"
,"valign","center"
);
divpanel3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDivpanel3_onclick(divpanel3,args);

}
});
unitpersonLable = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_UNITPERSONLABLE
,"content","责任人"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","48.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel3.addView(unitpersonLable);
space4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACE4
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel3.addView(space4);
officeText = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_OFFICETEXT
,"content","选择"
,"bindfield","duty_officer_name"
,"halign","right"
,"height","fill"
,"widthwrap","32.0"
,"color","#a6a6a6"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder officeText_binder = new UMTextBinder((IUMContextAccessor)context);
officeText_binder.setBindInfo(new BindInfo("duty_officer_name"));
officeText_binder.setControl(officeText);
binderGroup.addBinderToGroup(ID_OFFICETEXT, officeText_binder);
divpanel3.addView(officeText);
sp4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SP4
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
divpanel3.addView(sp4);
rowflag4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ROWFLAG4
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
divpanel3.addView(rowflag4);

return divpanel3;
}
public View getDiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DIV1
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","180"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","24"
,"margin-top","24"
,"valign","TOP"
);
View divpanel0 = (View) getDivpanel0View((UMActivity)context,binderGroup,configure);
div1.addView(divpanel0);
brpanel0 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL0
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel0);
View divpanel1 = (View) getDivpanel1View((UMActivity)context,binderGroup,configure);
div1.addView(divpanel1);
brpanel2 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL2
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel2);
View divpanel2 = (View) getDivpanel2View((UMActivity)context,binderGroup,configure);
div1.addView(divpanel2);
brpanel3 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL3
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel3);
View divpanel3 = (View) getDivpanel3View((UMActivity)context,binderGroup,configure);
div1.addView(divpanel3);
panel13 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL13
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(panel13);

return div1;
}
public View getDivpanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL4
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:divpanel4_onclick"
,"valign","center"
);
divpanel4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDivpanel4_onclick(divpanel4,args);

}
});
label21 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL21
,"content","分类"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","32.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel4.addView(label21);
label22 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL22
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel4.addView(label22);
label23 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL23
,"content","细化"
,"bindfield","yh_sub_type_describe"
,"halign","right"
,"height","fill"
,"widthwrap","32.0"
,"color","#a6a6a6"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder label23_binder = new UMTextBinder((IUMContextAccessor)context);
label23_binder.setBindInfo(new BindInfo("yh_sub_type_describe"));
label23_binder.setControl(label23);
binderGroup.addBinderToGroup(ID_LABEL23, label23_binder);
divpanel4.addView(label23);
label24 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL24
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
divpanel4.addView(label24);
image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE5
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
divpanel4.addView(image5);

return divpanel4;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"bindfield","safe_yh_level"
,"halign","LEFT"
,"height","44"
,"layout","hbox"
,"width","88"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup0_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup0_binder.setBindInfo(new BindInfo("safe_yh_level"));
togglebuttongroup0_binder.setControl(togglebuttongroup0);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP0, togglebuttongroup0_binder);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"background-image-off","ordinary_normal.png"
,"width","44.0"
,"textoff","一般"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","ordinary_selected.png"
,"height","42.0"
,"color","#b2b2b2"
,"layout-type","hbox"
,"font-size","15"
,"value","NORMAL"
,"font-family","default"
,"texton","一般"
,"valign","center"
,"checked","true"
);
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"background-image-off","major_normal.png"
,"width","44.0"
,"textoff","重大"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","major_selected.png"
,"height","42.0"
,"color","#b2b2b2"
,"layout-type","hbox"
,"font-size","15"
,"value","GRAVE"
,"font-family","default"
,"texton","重大"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton1);

return togglebuttongroup0;
}
public View getDivpanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL5
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label25 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL25
,"content","等级"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","32.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel5.addView(label25);
label26 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL26
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel5.addView(label26);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
divpanel5.addView(togglebuttongroup0);

return divpanel5;
}
public View getDivpanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL6
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label29 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL29
,"content","整改截止时间"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","96.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
divpanel6.addView(label29);
label30 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL30
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
divpanel6.addView(label30);
dateinput0 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT0
,"bindfield","rectification_period"
,"padding-left","4"
,"halign","LEFT"
,"placeholder","2015-04-22"
,"width","110"
,"format","yyyy-MM-dd"
,"height","44"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"background","#ffffff"
,"value","2015-04-23"
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("rectification_period"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
divpanel6.addView(dateinput0);

return divpanel6;
}
public View getPanel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel15 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL15
,"halign","center"
,"height","30"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
day1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_DAY1
,"halign","center"
,"width","70"
,"font-pressed-color","#ffffff"
,"pressed-color","#c96a66"
,"height","30"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"background","#FF7777"
,"value","1天"
,"onclick","action:day1_onclick"
,"font-family","default"
,"valign","center"
);
day1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDay1_onclick(day1,args);

}
});
panel15.addView(day1);

return panel15;
}
public View getPanel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel16 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL16
,"halign","center"
,"height","30"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
day3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_DAY3
,"halign","center"
,"width","70"
,"font-pressed-color","#ffffff"
,"pressed-color","#d29b61"
,"height","30"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"background","#feb568"
,"value","3天"
,"onclick","action:day3_onclick"
,"font-family","default"
,"valign","center"
);
day3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDay3_onclick(day3,args);

}
});
panel16.addView(day3);

return panel16;
}
public View getPanel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel17 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL17
,"halign","center"
,"height","30"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
day5 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_DAY5
,"halign","center"
,"width","70"
,"font-pressed-color","#ffffff"
,"pressed-color","#d2b765"
,"height","30"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"background","#fedb6e"
,"value","7天"
,"onclick","action:day5_onclick"
,"font-family","default"
,"valign","center"
);
day5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDay5_onclick(day5,args);

}
});
panel17.addView(day5);

return panel17;
}
public View getDivpanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
divpanel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIVPANEL7
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View panel15 = (View) getPanel15View((UMActivity)context,binderGroup,configure);
divpanel7.addView(panel15);
View panel16 = (View) getPanel16View((UMActivity)context,binderGroup,configure);
divpanel7.addView(panel16);
View panel17 = (View) getPanel17View((UMActivity)context,binderGroup,configure);
divpanel7.addView(panel17);

return divpanel7;
}
public View getDiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DIV2
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","180"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
View divpanel4 = (View) getDivpanel4View((UMActivity)context,binderGroup,configure);
div2.addView(divpanel4);
brpanel5 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL5
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel5);
View divpanel5 = (View) getDivpanel5View((UMActivity)context,binderGroup,configure);
div2.addView(divpanel5);
brpanel6 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL6
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel6);
View divpanel6 = (View) getDivpanel6View((UMActivity)context,binderGroup,configure);
div2.addView(divpanel6);
brpanel7 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL7
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel7);
View divpanel7 = (View) getDivpanel7View((UMActivity)context,binderGroup,configure);
div2.addView(divpanel7);
brpanel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_BRPANEL8
,"halign","CENTER"
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
,"valign","top"
);
div2.addView(brpanel8);

return div2;
}
public View getDiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIV3
,"padding-left","15"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:div3_onclick"
,"margin-top","24"
,"valign","center"
);
div3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionDiv3_onclick(div3,args);

}
});
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"content","抄送人"
,"margin-right","24"
,"halign","left"
,"height","fill"
,"widthwrap","48.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
div3.addView(label17);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
div3.addView(label18);
addPersonButton = (UMButton)ThirdControl.createControl(new UMButton(context),ID_ADDPERSONBUTTON
,"halign","center"
,"pressed-image","btn_add_touch.png"
,"width","44"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:addpersonbutton_onclick"
,"font-family","default"
,"valign","center"
,"background-image","btn_add.png"
);
addPersonButton.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAddpersonbutton_onclick(addPersonButton,args);

}
});
div3.addView(addPersonButton);

return div3;
}
public View getDiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div5 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_DIV5
,"height","80"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
sendPersonText = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SENDPERSONTEXT
,"bindfield","sendperson"
,"halign","center"
,"width","fill"
,"margin-bottom","4"
,"type","multiline"
,"content","（抄送人）"
,"margin-right","15"
,"height","100"
,"color","#333333"
,"layout-type","relative"
,"background","#ffffff"
,"font-size","15"
,"margin-left","15"
,"font-family","default"
,"left","0.0"
,"margin-top","4"
,"valign","center"
,"top","0.0"
);
UMTextBinder sendPersonText_binder = new UMTextBinder((IUMContextAccessor)context);
sendPersonText_binder.setBindInfo(new BindInfo("sendperson"));
sendPersonText_binder.setControl(sendPersonText);
binderGroup.addBinderToGroup(ID_SENDPERSONTEXT, sendPersonText_binder);
div5.addView(sendPersonText);

return div5;
}
public View getDiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIV6
,"padding-right","15"
,"padding-left","15"
,"padding-top","24"
,"halign","LEFT"
,"height","wrap"
,"heightwrap","45.0"
,"layout-type","linear"
,"width","fill"
,"valign","bottom"
,"padding-bottom","5"
);
label27 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL27
,"content","隐患描述"
,"halign","center"
,"height","wrap"
,"widthwrap","64.0"
,"color","#595757"
,"heightwrap","22.0"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
div6.addView(label27);

return div6;
}
public View getDiv7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DIV7
,"padding-right","15"
,"padding-left","15"
,"padding-top","24"
,"halign","LEFT"
,"height","wrap"
,"heightwrap","45.0"
,"layout-type","linear"
,"width","fill"
,"valign","bottom"
,"padding-bottom","5"
);
label28 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL28
,"content","上传取证"
,"halign","center"
,"height","wrap"
,"widthwrap","64.0"
,"color","#595757"
,"heightwrap","22.0"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
div7.addView(label28);

return div7;
}
public View getPanel22View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel22 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL22
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE1
,"height","80"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage1_onclick"
,"scaletype","fitcenter"
,"src","addimg_normal.png"
);
attimage1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage1_onclick(attimage1,args);

}
});
panel22.addView(attimage1);

return panel22;
}
public View getPanel23View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel23 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL23
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE2
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage2_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage2_onclick(attimage2,args);

}
});
panel23.addView(attimage2);

return panel23;
}
public View getPanel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel21 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL21
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE3
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage3_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage3_onclick(attimage3,args);

}
});
panel21.addView(attimage3);

return panel21;
}
public View getAttpanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
attpanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ATTPANEL1
,"padding-left","15"
,"padding-right","15"
,"halign","LEFT"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","15"
,"valign","center"
);
View panel22 = (View) getPanel22View((UMActivity)context,binderGroup,configure);
attpanel1.addView(panel22);
View panel23 = (View) getPanel23View((UMActivity)context,binderGroup,configure);
attpanel1.addView(panel23);
View panel21 = (View) getPanel21View((UMActivity)context,binderGroup,configure);
attpanel1.addView(panel21);

return attpanel1;
}
public View getPanel24View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel24 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL24
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE4
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage4_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage4_onclick(attimage4,args);

}
});
panel24.addView(attimage4);

return panel24;
}
public View getPanel25View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel25 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL25
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE5
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage5_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage5_onclick(attimage5,args);

}
});
panel25.addView(attimage5);

return panel25;
}
public View getPanel26View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel26 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL26
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage6 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE6
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage6_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage6.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage6_onclick(attimage6,args);

}
});
panel26.addView(attimage6);

return panel26;
}
public View getAttpanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
attpanel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ATTPANEL2
,"padding-right","15"
,"padding-left","15"
,"halign","LEFT"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","15"
,"display","none"
,"valign","center"
);
View panel24 = (View) getPanel24View((UMActivity)context,binderGroup,configure);
attpanel2.addView(panel24);
View panel25 = (View) getPanel25View((UMActivity)context,binderGroup,configure);
attpanel2.addView(panel25);
View panel26 = (View) getPanel26View((UMActivity)context,binderGroup,configure);
attpanel2.addView(panel26);

return attpanel2;
}
public View getPanel27View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel27 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL27
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage7 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE7
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage7_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage7.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage7_onclick(attimage7,args);

}
});
panel27.addView(attimage7);

return panel27;
}
public View getPanel28View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel28 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL28
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage8 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE8
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage8_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage8.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage8_onclick(attimage8,args);

}
});
panel28.addView(attimage8);

return panel28;
}
public View getPanel29View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel29 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL29
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","TOP"
);
attimage9 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTIMAGE9
,"height","80"
,"visible","false"
,"layout-type","linear"
,"width","80"
,"onclick","action:attimage9_onclick"
,"scaletype","fitcenter"
,"src",""
);
attimage9.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionAttimage9_onclick(attimage9,args);

}
});
panel29.addView(attimage9);

return panel29;
}
public View getAttpanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
attpanel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ATTPANEL3
,"padding-right","15"
,"padding-left","15"
,"halign","LEFT"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","10"
,"display","none"
,"valign","center"
);
View panel27 = (View) getPanel27View((UMActivity)context,binderGroup,configure);
attpanel3.addView(panel27);
View panel28 = (View) getPanel28View((UMActivity)context,binderGroup,configure);
attpanel3.addView(panel28);
View panel29 = (View) getPanel29View((UMActivity)context,binderGroup,configure);
attpanel3.addView(panel29);

return attpanel3;
}
public View getTotalView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
total = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_TOTAL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"valign","TOP"
);
View div1 = (View) getDiv1View((UMActivity)context,binderGroup,configure);
total.addView(div1);
View div2 = (View) getDiv2View((UMActivity)context,binderGroup,configure);
total.addView(div2);
View div3 = (View) getDiv3View((UMActivity)context,binderGroup,configure);
total.addView(div3);
div4 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_DIV4
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
total.addView(div4);
View div5 = (View) getDiv5View((UMActivity)context,binderGroup,configure);
total.addView(div5);
View div6 = (View) getDiv6View((UMActivity)context,binderGroup,configure);
total.addView(div6);
textArea = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA
,"bindfield","hazard_desc"
,"padding-right","4"
,"padding-left","4"
,"padding-top","14"
,"halign","LEFT"
,"placeholder","（非必填）"
,"width","fill"
,"padding-bottom","14"
,"height","100"
,"color","#333333"
,"font-size","15"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
UMTextBinder textArea_binder = new UMTextBinder((IUMContextAccessor)context);
textArea_binder.setBindInfo(new BindInfo("hazard_desc"));
textArea_binder.setControl(textArea);
binderGroup.addBinderToGroup(ID_TEXTAREA, textArea_binder);
total.addView(textArea);
View div7 = (View) getDiv7View((UMActivity)context,binderGroup,configure);
total.addView(div7);
View attpanel1 = (View) getAttpanel1View((UMActivity)context,binderGroup,configure);
total.addView(attpanel1);
View attpanel2 = (View) getAttpanel2View((UMActivity)context,binderGroup,configure);
total.addView(attpanel2);
View attpanel3 = (View) getAttpanel3View((UMActivity)context,binderGroup,configure);
total.addView(attpanel3);

return total;
}
public View getScrollview_totalView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_total = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_TOTAL
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
);
View total = (View) getTotalView((UMActivity)context,binderGroup,configure);
Scrollview_total.addView(total);

return Scrollview_total;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"padding-right","20"
,"padding-left","20"
,"halign","center"
,"height","165"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
widget0_button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON0
,"border-bottom-width","1"
,"halign","center"
,"border-radius","10"
,"width","fill"
,"margin-bottom","5"
,"font-pressed-color","#f2adb2"
,"border-bottom-color","#f1f1f1"
,"border-top-width","1"
,"border-left-color","#f1f1f1"
,"border-top-color","#f1f1f1"
,"height","44"
,"color","#595757"
,"border-right-color","#f1f1f1"
,"layout-type","linear"
,"font-size","15"
,"border-right-width","1"
,"value","拍照"
,"onclick","action:button0_onclick"
,"font-family","default"
,"margin-top","5"
,"valign","center"
,"border-left-width","1"
);
widget0_button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionButton0_onclick(widget0_button0,args);

}
});
widget0.addView(widget0_button0);
widget0_button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON1
,"border-bottom-width","1"
,"halign","center"
,"border-radius","10"
,"width","fill"
,"margin-bottom","5"
,"font-pressed-color","#f2adb2"
,"border-bottom-color","#f1f1f1"
,"border-top-width","1"
,"border-left-color","#f1f1f1"
,"border-top-color","#f1f1f1"
,"height","44"
,"color","#595757"
,"border-right-color","#f1f1f1"
,"layout-type","linear"
,"font-size","15"
,"border-right-width","1"
,"value","相册"
,"onclick","action:button1_onclick"
,"font-family","default"
,"margin-top","5"
,"valign","center"
,"border-left-width","1"
);
widget0_button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionButton1_onclick(widget0_button1,args);

}
});
widget0.addView(widget0_button1);
widget0_button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON2
,"border-bottom-width","1"
,"halign","center"
,"border-radius","10"
,"width","fill"
,"margin-bottom","5"
,"font-pressed-color","#f2adb2"
,"border-bottom-color","#f1f1f1"
,"border-top-width","1"
,"border-left-color","#f1f1f1"
,"border-top-color","#f1f1f1"
,"height","44"
,"color","#595757"
,"border-right-color","#f1f1f1"
,"layout-type","linear"
,"font-size","15"
,"border-right-width","1"
,"value","文件"
,"onclick","action:button2_onclick"
,"font-family","default"
,"margin-top","5"
,"valign","center"
,"border-left-width","1"
);
widget0_button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionButton2_onclick(widget0_button2,args);

}
});
widget0.addView(widget0_button2);

return widget0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","action:viewpage0_onload"
,"layout-type","vbox"
,"background","#f7f8f8"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View Scrollview_total = (View) getScrollview_totalView((UMActivity)context,binderGroup,configure);
viewPage0.addView(Scrollview_total);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(widget0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
NewTrouble = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_NEWTROUBLE
,"halign","center"
,"height","1200"
,"width","fill"
,"layout","vbox"
,"controller","NewTroubleController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
NewTrouble.addView(viewPage0);

return (UMWindow)NewTrouble;
}

	
	public void actionDivpanel3_onclick(View control, UMEventArgs args) {
    String actionid = "divpanel3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "person()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openCamera()",UMActivity.getViewId(control),args);
}
public void actionAttimage8_onclick(View control, UMEventArgs args) {
    String actionid = "attimage8_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionDivpanel2_onclick(View control, UMEventArgs args) {
    String actionid = "divpanel2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "org()",UMActivity.getViewId(control),args);
}
public void actionDay1_onclick(View control, UMEventArgs args) {
    String actionid = "day1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addDay()",UMActivity.getViewId(control),args);
}
public void actionButton1_onclick(View control, UMEventArgs args) {
    String actionid = "button1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openPhoto()",UMActivity.getViewId(control),args);
}
public void actionAddpersonbutton_onclick(View control, UMEventArgs args) {
    String actionid = "addpersonbutton_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "sendPerson()",UMActivity.getViewId(control),args);
}
public void actionViewpage0_onload(View control, UMEventArgs args) {
    String actionid = "viewpage0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load()",UMActivity.getViewId(control),args);
}
public void actionDivpanel4_onclick(View control, UMEventArgs args) {
    String actionid = "divpanel4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "type()",UMActivity.getViewId(control),args);
}
public void actionAttimage3_onclick(View control, UMEventArgs args) {
    String actionid = "attimage3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage4_onclick(View control, UMEventArgs args) {
    String actionid = "attimage4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionDay3_onclick(View control, UMEventArgs args) {
    String actionid = "day3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addDay()",UMActivity.getViewId(control),args);
}
public void actionAttimage2_onclick(View control, UMEventArgs args) {
    String actionid = "attimage2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage7_onclick(View control, UMEventArgs args) {
    String actionid = "attimage7_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage6_onclick(View control, UMEventArgs args) {
    String actionid = "attimage6_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionCommit_onclick(View control, UMEventArgs args) {
    String actionid = "commit_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "commit()",UMActivity.getViewId(control),args);
}
public void actionBackbutton0_onclick(View control, UMEventArgs args) {
    String actionid = "backbutton0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onback()",UMActivity.getViewId(control),args);
}
public void actionAttimage1_onclick(View control, UMEventArgs args) {
    String actionid = "attimage1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionDiv3_onclick(View control, UMEventArgs args) {
    String actionid = "div3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "sendPerson()",UMActivity.getViewId(control),args);
}
public void actionButton2_onclick(View control, UMEventArgs args) {
    String actionid = "button2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openFile()",UMActivity.getViewId(control),args);
}
public void actionAttimage9_onclick(View control, UMEventArgs args) {
    String actionid = "attimage9_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage5_onclick(View control, UMEventArgs args) {
    String actionid = "attimage5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "clickPic()",UMActivity.getViewId(control),args);
}
public void actionDivpanel1_onclick(View control, UMEventArgs args) {
    String actionid = "divpanel1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "area()",UMActivity.getViewId(control),args);
}
public void actionDay5_onclick(View control, UMEventArgs args) {
    String actionid = "day5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addDay()",UMActivity.getViewId(control),args);
}


}
