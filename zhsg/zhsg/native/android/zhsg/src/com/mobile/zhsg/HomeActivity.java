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

public abstract class HomeActivity extends UMWindowActivity {

	protected UMWindow Home = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected UMSearchControl search0 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout panel3 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected UMToggleButton togglebutton3 = null;
protected XVerticalLayout panel4 = null;
protected UMViewFlipper flipperdefine0 = null;
protected XVerticalLayout listpanel0 = null;
protected UMListViewBase widget0 = null;
protected XVerticalLayout widget0_panel0 = null;
protected XVerticalLayout widget0_panel1 = null;
protected XHorizontalLayout widget0_panel3 = null;
protected UMLabel widget0_label0 = null;
protected UMLabel widget0_label1 = null;
protected UMLabel widget0_label2 = null;
protected UMLabel widget0_label3 = null;
protected XHorizontalLayout widget0_panel4 = null;
protected UMLabel widget0_label4 = null;
protected XVerticalLayout widget0_panel5 = null;
protected UMLabel widget0_label5 = null;
protected XHorizontalLayout widget0_panel2 = null;
protected XVerticalLayout listpanel1 = null;
protected UMListViewBase widget1 = null;
protected XVerticalLayout widget1_panel0 = null;
protected XVerticalLayout widget1_panel1 = null;
protected XHorizontalLayout widget1_panel3 = null;
protected UMLabel widget1_label0 = null;
protected UMLabel widget1_label1 = null;
protected UMLabel widget1_label2 = null;
protected UMLabel widget1_label3 = null;
protected XHorizontalLayout widget1_panel4 = null;
protected UMLabel widget1_label4 = null;
protected XVerticalLayout widget1_panel5 = null;
protected UMLabel widget1_label5 = null;
protected XHorizontalLayout widget1_panel2 = null;
protected XVerticalLayout listpanel2 = null;
protected UMListViewBase widget2 = null;
protected XVerticalLayout widget2_panel0 = null;
protected XVerticalLayout widget2_panel1 = null;
protected XHorizontalLayout widget2_panel3 = null;
protected UMLabel widget2_label0 = null;
protected UMLabel widget2_label1 = null;
protected UMLabel widget2_label2 = null;
protected UMLabel widget2_label3 = null;
protected XHorizontalLayout widget2_panel4 = null;
protected UMLabel widget2_label4 = null;
protected XVerticalLayout widget2_panel5 = null;
protected UMLabel widget2_label5 = null;
protected XHorizontalLayout widget2_panel2 = null;
protected XVerticalLayout listpanel3 = null;
protected UMListViewBase widget3 = null;
protected XVerticalLayout widget3_panel0 = null;
protected XVerticalLayout widget3_panel1 = null;
protected XHorizontalLayout widget3_panel3 = null;
protected UMLabel widget3_label0 = null;
protected UMLabel widget3_label1 = null;
protected UMLabel widget3_label2 = null;
protected UMLabel widget3_label3 = null;
protected XHorizontalLayout widget3_panel4 = null;
protected UMLabel widget3_label4 = null;
protected XVerticalLayout widget3_panel5 = null;
protected UMLabel widget3_label5 = null;
protected XHorizontalLayout widget3_panel2 = null;
protected XVerticalLayout panel1 = null;
protected UMXTabBar tabbar0 = null;
protected UMXTabBarItem tabbaritem0 = null;
protected UMXTabBarItem tabbaritem1 = null;
protected UMXTabBarItem tabbaritem2 = null;
protected XRelativeLayout panel2 = null;

	
	protected final static int ID_HOME = 1060113883;
protected final static int ID_VIEWPAGE0 = 826789677;
protected final static int ID_NAVIGATORBAR0 = 1515306146;
protected final static int ID_BUTTON0 = 591795466;
protected final static int ID_LABEL0 = 519807526;
protected final static int ID_BUTTON1 = 342980946;
protected final static int ID_SEARCH0 = 2072004330;
protected final static int ID_PANEL0 = 1859445133;
protected final static int ID_PANEL3 = 609510843;
protected final static int ID_TOGGLEBUTTONGROUP0 = 874639340;
protected final static int ID_TOGGLEBUTTON0 = 228903691;
protected final static int ID_TOGGLEBUTTON1 = 1114666297;
protected final static int ID_TOGGLEBUTTON2 = 466982267;
protected final static int ID_TOGGLEBUTTON3 = 352637076;
protected final static int ID_PANEL4 = 447643774;
protected final static int ID_FLIPPERDEFINE0 = 878329237;
protected final static int ID_LISTPANEL0 = 2009966041;
protected final static int ID_WIDGET0 = 934301805;
protected final static int ID_WIDGET0_PANEL0 = 860626688;
protected final static int ID_WIDGET0_PANEL1 = 412835502;
protected final static int ID_WIDGET0_PANEL3 = 1957882228;
protected final static int ID_WIDGET0_LABEL0 = 296778224;
protected final static int ID_WIDGET0_LABEL1 = 955712821;
protected final static int ID_WIDGET0_LABEL2 = 710098149;
protected final static int ID_WIDGET0_LABEL3 = 1481277970;
protected final static int ID_WIDGET0_PANEL4 = 795592113;
protected final static int ID_WIDGET0_LABEL4 = 192253649;
protected final static int ID_WIDGET0_PANEL5 = 1726859421;
protected final static int ID_WIDGET0_LABEL5 = 1193439339;
protected final static int ID_WIDGET0_PANEL2 = 1516494459;
protected final static int ID_LISTPANEL1 = 1380717130;
protected final static int ID_WIDGET1 = 603848714;
protected final static int ID_WIDGET1_PANEL0 = 1300197008;
protected final static int ID_WIDGET1_PANEL1 = 1601084570;
protected final static int ID_WIDGET1_PANEL3 = 539738565;
protected final static int ID_WIDGET1_LABEL0 = 624166129;
protected final static int ID_WIDGET1_LABEL1 = 1013511490;
protected final static int ID_WIDGET1_LABEL2 = 1964310152;
protected final static int ID_WIDGET1_LABEL3 = 1079902681;
protected final static int ID_WIDGET1_PANEL4 = 1496521018;
protected final static int ID_WIDGET1_LABEL4 = 56031288;
protected final static int ID_WIDGET1_PANEL5 = 97936974;
protected final static int ID_WIDGET1_LABEL5 = 1033721769;
protected final static int ID_WIDGET1_PANEL2 = 1490580486;
protected final static int ID_LISTPANEL2 = 205210906;
protected final static int ID_WIDGET2 = 862974853;
protected final static int ID_WIDGET2_PANEL0 = 1223784960;
protected final static int ID_WIDGET2_PANEL1 = 259118087;
protected final static int ID_WIDGET2_PANEL3 = 1613325731;
protected final static int ID_WIDGET2_LABEL0 = 1637344133;
protected final static int ID_WIDGET2_LABEL1 = 2078073537;
protected final static int ID_WIDGET2_LABEL2 = 1494901515;
protected final static int ID_WIDGET2_LABEL3 = 1860435097;
protected final static int ID_WIDGET2_PANEL4 = 1469311866;
protected final static int ID_WIDGET2_LABEL4 = 1170684544;
protected final static int ID_WIDGET2_PANEL5 = 389451590;
protected final static int ID_WIDGET2_LABEL5 = 131097519;
protected final static int ID_WIDGET2_PANEL2 = 1047206649;
protected final static int ID_LISTPANEL3 = 607355313;
protected final static int ID_WIDGET3 = 873085759;
protected final static int ID_WIDGET3_PANEL0 = 1201768468;
protected final static int ID_WIDGET3_PANEL1 = 245158612;
protected final static int ID_WIDGET3_PANEL3 = 1220554049;
protected final static int ID_WIDGET3_LABEL0 = 1678291307;
protected final static int ID_WIDGET3_LABEL1 = 1652911902;
protected final static int ID_WIDGET3_LABEL2 = 1326682151;
protected final static int ID_WIDGET3_LABEL3 = 358359459;
protected final static int ID_WIDGET3_PANEL4 = 469687717;
protected final static int ID_WIDGET3_LABEL4 = 142827810;
protected final static int ID_WIDGET3_PANEL5 = 789301271;
protected final static int ID_WIDGET3_LABEL5 = 222496460;
protected final static int ID_WIDGET3_PANEL2 = 1764959053;
protected final static int ID_PANEL1 = 744359074;
protected final static int ID_TABBAR0 = 1874864071;
protected final static int ID_TABBARITEM0 = 1408868717;
protected final static int ID_TABBARITEM1 = 1447464571;
protected final static int ID_TABBARITEM2 = 1371515652;
protected final static int ID_PANEL2 = 652293581;

	
	
	@Override
	public String getControllerName() {
		return "HomeController";
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
		  idmap.put("Home",ID_HOME);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("search0",ID_SEARCH0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("togglebutton3",ID_TOGGLEBUTTON3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("flipperdefine0",ID_FLIPPERDEFINE0);
  idmap.put("listpanel0",ID_LISTPANEL0);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_panel0",ID_WIDGET0_PANEL0);
  idmap.put("widget0_panel1",ID_WIDGET0_PANEL1);
  idmap.put("widget0_panel3",ID_WIDGET0_PANEL3);
  idmap.put("widget0_label0",ID_WIDGET0_LABEL0);
  idmap.put("widget0_label1",ID_WIDGET0_LABEL1);
  idmap.put("widget0_label2",ID_WIDGET0_LABEL2);
  idmap.put("widget0_label3",ID_WIDGET0_LABEL3);
  idmap.put("widget0_panel4",ID_WIDGET0_PANEL4);
  idmap.put("widget0_label4",ID_WIDGET0_LABEL4);
  idmap.put("widget0_panel5",ID_WIDGET0_PANEL5);
  idmap.put("widget0_label5",ID_WIDGET0_LABEL5);
  idmap.put("widget0_panel2",ID_WIDGET0_PANEL2);
  idmap.put("listpanel1",ID_LISTPANEL1);
  idmap.put("widget1",ID_WIDGET1);
  idmap.put("widget1_panel0",ID_WIDGET1_PANEL0);
  idmap.put("widget1_panel1",ID_WIDGET1_PANEL1);
  idmap.put("widget1_panel3",ID_WIDGET1_PANEL3);
  idmap.put("widget1_label0",ID_WIDGET1_LABEL0);
  idmap.put("widget1_label1",ID_WIDGET1_LABEL1);
  idmap.put("widget1_label2",ID_WIDGET1_LABEL2);
  idmap.put("widget1_label3",ID_WIDGET1_LABEL3);
  idmap.put("widget1_panel4",ID_WIDGET1_PANEL4);
  idmap.put("widget1_label4",ID_WIDGET1_LABEL4);
  idmap.put("widget1_panel5",ID_WIDGET1_PANEL5);
  idmap.put("widget1_label5",ID_WIDGET1_LABEL5);
  idmap.put("widget1_panel2",ID_WIDGET1_PANEL2);
  idmap.put("listpanel2",ID_LISTPANEL2);
  idmap.put("widget2",ID_WIDGET2);
  idmap.put("widget2_panel0",ID_WIDGET2_PANEL0);
  idmap.put("widget2_panel1",ID_WIDGET2_PANEL1);
  idmap.put("widget2_panel3",ID_WIDGET2_PANEL3);
  idmap.put("widget2_label0",ID_WIDGET2_LABEL0);
  idmap.put("widget2_label1",ID_WIDGET2_LABEL1);
  idmap.put("widget2_label2",ID_WIDGET2_LABEL2);
  idmap.put("widget2_label3",ID_WIDGET2_LABEL3);
  idmap.put("widget2_panel4",ID_WIDGET2_PANEL4);
  idmap.put("widget2_label4",ID_WIDGET2_LABEL4);
  idmap.put("widget2_panel5",ID_WIDGET2_PANEL5);
  idmap.put("widget2_label5",ID_WIDGET2_LABEL5);
  idmap.put("widget2_panel2",ID_WIDGET2_PANEL2);
  idmap.put("listpanel3",ID_LISTPANEL3);
  idmap.put("widget3",ID_WIDGET3);
  idmap.put("widget3_panel0",ID_WIDGET3_PANEL0);
  idmap.put("widget3_panel1",ID_WIDGET3_PANEL1);
  idmap.put("widget3_panel3",ID_WIDGET3_PANEL3);
  idmap.put("widget3_label0",ID_WIDGET3_LABEL0);
  idmap.put("widget3_label1",ID_WIDGET3_LABEL1);
  idmap.put("widget3_label2",ID_WIDGET3_LABEL2);
  idmap.put("widget3_label3",ID_WIDGET3_LABEL3);
  idmap.put("widget3_panel4",ID_WIDGET3_PANEL4);
  idmap.put("widget3_label4",ID_WIDGET3_LABEL4);
  idmap.put("widget3_panel5",ID_WIDGET3_PANEL5);
  idmap.put("widget3_label5",ID_WIDGET3_LABEL5);
  idmap.put("widget3_panel2",ID_WIDGET3_PANEL2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("tabbar0",ID_TABBAR0);
  idmap.put("tabbaritem0",ID_TABBARITEM0);
  idmap.put("tabbaritem1",ID_TABBARITEM1);
  idmap.put("tabbaritem2",ID_TABBARITEM2);
  idmap.put("panel2",ID_PANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //flipperdefine0 - action:flipperdefine0_onload
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionFlipperdefine0_onload(flipperdefine0,args);

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
,"title","安全巡查"
,"height","44.0"
,"color","#ffffff"
,"width","fill"
,"layout-type","linear"
,"font-size","17"
,"background","#2d5aa7"
,"font-family","default"
,"valign","center"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","left"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44"
,"font-size","20"
,"onclick","action:button0_onclick"
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
,"background-image","back.png"
);
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionButton0_onclick(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
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
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"widthwrap","36.0"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","wrap"
,"font-size","17"
,"value","消息"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
);
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"height","44"
,"layout","hbox"
,"width","fill"
,"valign","center"
,"onchange","action:togglebuttongroup0_onchange"
);
togglebuttongroup0.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    args.put(parent);
    actionTogglebuttongroup0_onchange(togglebuttongroup0,args);

}
});
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"width","80.0"
,"textoff","所有"
,"font-pressed-color","#595757"
,"type","button"
,"background-image-on","button_selected.png"
,"height","42.0"
,"color","#595757"
,"layout-type","hbox"
,"font-size","15"
,"value","0"
,"font-family","default"
,"texton","所有"
,"valign","center"
,"checked","true"
);
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"width","80.0"
,"textoff","待验证"
,"font-pressed-color","#595757"
,"type","button"
,"background-image-on","button_selected.png"
,"height","42.0"
,"color","#595757"
,"layout-type","hbox"
,"font-size","15"
,"value","1"
,"font-family","default"
,"texton","待验证"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton1);
togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON2
,"halign","center"
,"width","80.0"
,"textoff","被退回"
,"font-pressed-color","#595757"
,"type","button"
,"background-image-on","button_selected.png"
,"height","42.0"
,"color","#595757"
,"layout-type","hbox"
,"font-size","15"
,"value","2"
,"font-family","default"
,"texton","被退回"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton2);
togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON3
,"halign","center"
,"width","80.0"
,"textoff","整改中"
,"font-pressed-color","#595757"
,"type","button"
,"background-image-on","button_selected.png"
,"height","42.0"
,"color","#595757"
,"layout-type","hbox"
,"font-size","15"
,"value","3"
,"font-family","default"
,"texton","整改中"
,"valign","center"
);
togglebuttongroup0.addView(togglebutton3);

return togglebuttongroup0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL3
,"halign","center"
,"height","45"
,"layout-type","linear"
,"width","fill"
);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
panel3.addView(togglebuttongroup0);
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
);
panel3.addView(panel4);

return panel3;
}
public View getWidget0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_PANEL3
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","10"
,"valign","center"
);
widget0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL0
,"content","一般"
,"bindfield","safe_yh_level"
,"margin-right","6"
,"halign","center"
,"height","30"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","13"
,"width","44"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_label0_binder.setBindInfo(new BindInfo("safe_yh_level"));
widget0_label0_binder.setControl(widget0_label0);
binderGroup.addBinderToGroup(ID_WIDGET0_LABEL0, widget0_label0_binder);
widget0_panel3.addView(widget0_label0);
widget0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL1
,"content","工作区"
,"bindfield","ope_area_desc"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_label1_binder.setBindInfo(new BindInfo("ope_area_desc"));
widget0_label1_binder.setControl(widget0_label1);
binderGroup.addBinderToGroup(ID_WIDGET0_LABEL1, widget0_label1_binder);
widget0_panel3.addView(widget0_label1);
widget0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL2
,"content","label"
,"margin-right","4"
,"halign","center"
,"height","10"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","10"
,"font-family","default"
,"valign","center"
);
widget0_panel3.addView(widget0_label2);
widget0_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL3
,"bindfield","rowstate"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","整改中"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget0_label3_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_label3_binder.setBindInfo(new BindInfo("rowstate"));
widget0_label3_binder.setControl(widget0_label3);
binderGroup.addBinderToGroup(ID_WIDGET0_LABEL3, widget0_label3_binder);
widget0_panel3.addView(widget0_label3);

return widget0_panel3;
}
public View getWidget0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_PANEL4
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","4"
,"valign","center"
);
widget0_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL4
,"content","隐患描述"
,"halign","center"
,"height","wrap"
,"widthwrap","56.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget0_panel4.addView(widget0_label4);

return widget0_panel4;
}
public View getWidget0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_PANEL5
,"halign","center"
,"height","40"
,"layout-type","linear"
,"width","fill"
);
widget0_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_LABEL5
,"bindfield","hazard_desc"
,"halign","center"
,"height","fill"
,"color","#595757"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
,"type","multiline"
);
UMTextBinder widget0_label5_binder = new UMTextBinder((IUMContextAccessor)context);
widget0_label5_binder.setBindInfo(new BindInfo("hazard_desc"));
widget0_label5_binder.setControl(widget0_label5);
binderGroup.addBinderToGroup(ID_WIDGET0_LABEL5, widget0_label5_binder);
widget0_panel5.addView(widget0_label5);

return widget0_panel5;
}
public View getWidget0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
View widget0_panel3 = (View) getWidget0_panel3View((UMActivity)context,binderGroup,configure);
widget0_panel1.addView(widget0_panel3);
View widget0_panel4 = (View) getWidget0_panel4View((UMActivity)context,binderGroup,configure);
widget0_panel1.addView(widget0_panel4);
View widget0_panel5 = (View) getWidget0_panel5View((UMActivity)context,binderGroup,configure);
widget0_panel1.addView(widget0_panel5);

return widget0_panel1;
}
public View getWidget0_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_PANEL0
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","105"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
View widget0_panel1 = (View) getWidget0_panel1View((UMActivity)context,binderGroup,configure);
widget0_panel0.addView(widget0_panel1);
widget0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_PANEL2
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
,"valign","center"
);
widget0_panel0.addView(widget0_panel2);

return widget0_panel0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_WIDGET0
,"bindfield","list"
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
);
UMListBinder widget0_binder = new UMListBinder((IUMContextAccessor)context);
widget0_binder.setBindInfo(new BindInfo("list"));
widget0_binder.setControl(widget0);
binderGroup.addBinderToGroup(ID_WIDGET0, widget0_binder);
widget0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View widget0_panel0 = (View) getWidget0_panel0View((UMActivity)context,binderGroup,configure);
return widget0_panel0;
}});

return widget0;
}
public View getListpanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listpanel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTPANEL0
,"halign","center"
,"title","页面1"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
listpanel0.addView(widget0);

return listpanel0;
}
public View getWidget1_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_PANEL3
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","10"
,"valign","center"
);
widget1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL0
,"content","一般"
,"bindfield","safe_yh_level"
,"margin-right","6"
,"halign","center"
,"height","30"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","13"
,"width","44"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
widget1_label0_binder.setBindInfo(new BindInfo("safe_yh_level"));
widget1_label0_binder.setControl(widget1_label0);
binderGroup.addBinderToGroup(ID_WIDGET1_LABEL0, widget1_label0_binder);
widget1_panel3.addView(widget1_label0);
widget1_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL1
,"content","工作区"
,"bindfield","ope_area_desc"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget1_label1_binder = new UMTextBinder((IUMContextAccessor)context);
widget1_label1_binder.setBindInfo(new BindInfo("ope_area_desc"));
widget1_label1_binder.setControl(widget1_label1);
binderGroup.addBinderToGroup(ID_WIDGET1_LABEL1, widget1_label1_binder);
widget1_panel3.addView(widget1_label1);
widget1_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL2
,"content","label"
,"margin-right","4"
,"halign","center"
,"height","10"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","10"
,"font-family","default"
,"valign","center"
);
widget1_panel3.addView(widget1_label2);
widget1_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL3
,"bindfield","rowstate"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","整改中"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget1_label3_binder = new UMTextBinder((IUMContextAccessor)context);
widget1_label3_binder.setBindInfo(new BindInfo("rowstate"));
widget1_label3_binder.setControl(widget1_label3);
binderGroup.addBinderToGroup(ID_WIDGET1_LABEL3, widget1_label3_binder);
widget1_panel3.addView(widget1_label3);

return widget1_panel3;
}
public View getWidget1_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_PANEL4
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","4"
,"valign","center"
);
widget1_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL4
,"content","隐患描述"
,"halign","center"
,"height","wrap"
,"widthwrap","56.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget1_panel4.addView(widget1_label4);

return widget1_panel4;
}
public View getWidget1_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_PANEL5
,"halign","center"
,"height","40"
,"layout-type","linear"
,"width","fill"
);
widget1_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET1_LABEL5
,"bindfield","hazard_desc"
,"halign","center"
,"height","fill"
,"color","#595757"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
,"type","multiline"
);
UMTextBinder widget1_label5_binder = new UMTextBinder((IUMContextAccessor)context);
widget1_label5_binder.setBindInfo(new BindInfo("hazard_desc"));
widget1_label5_binder.setControl(widget1_label5);
binderGroup.addBinderToGroup(ID_WIDGET1_LABEL5, widget1_label5_binder);
widget1_panel5.addView(widget1_label5);

return widget1_panel5;
}
public View getWidget1_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
View widget1_panel3 = (View) getWidget1_panel3View((UMActivity)context,binderGroup,configure);
widget1_panel1.addView(widget1_panel3);
View widget1_panel4 = (View) getWidget1_panel4View((UMActivity)context,binderGroup,configure);
widget1_panel1.addView(widget1_panel4);
View widget1_panel5 = (View) getWidget1_panel5View((UMActivity)context,binderGroup,configure);
widget1_panel1.addView(widget1_panel5);

return widget1_panel1;
}
public View getWidget1_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_PANEL0
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","105"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
View widget1_panel1 = (View) getWidget1_panel1View((UMActivity)context,binderGroup,configure);
widget1_panel0.addView(widget1_panel1);
widget1_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_PANEL2
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
,"valign","center"
);
widget1_panel0.addView(widget1_panel2);

return widget1_panel0;
}
public View getWidget1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_WIDGET1
,"bindfield","list"
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
);
UMListBinder widget1_binder = new UMListBinder((IUMContextAccessor)context);
widget1_binder.setBindInfo(new BindInfo("list"));
widget1_binder.setControl(widget1);
binderGroup.addBinderToGroup(ID_WIDGET1, widget1_binder);
widget1.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View widget1_panel0 = (View) getWidget1_panel0View((UMActivity)context,binderGroup,configure);
return widget1_panel0;
}});

return widget1;
}
public View getListpanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listpanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTPANEL1
,"halign","center"
,"title","页面2"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
);
View widget1 = (View) getWidget1View((UMActivity)context,binderGroup,configure);
listpanel1.addView(widget1);

return listpanel1;
}
public View getWidget2_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET2_PANEL3
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","10"
,"valign","center"
);
widget2_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL0
,"content","一般"
,"bindfield","safe_yh_level"
,"margin-right","6"
,"halign","center"
,"height","30"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","13"
,"width","44"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget2_label0_binder = new UMTextBinder((IUMContextAccessor)context);
widget2_label0_binder.setBindInfo(new BindInfo("safe_yh_level"));
widget2_label0_binder.setControl(widget2_label0);
binderGroup.addBinderToGroup(ID_WIDGET2_LABEL0, widget2_label0_binder);
widget2_panel3.addView(widget2_label0);
widget2_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL1
,"content","工作区"
,"bindfield","ope_area_desc"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget2_label1_binder = new UMTextBinder((IUMContextAccessor)context);
widget2_label1_binder.setBindInfo(new BindInfo("ope_area_desc"));
widget2_label1_binder.setControl(widget2_label1);
binderGroup.addBinderToGroup(ID_WIDGET2_LABEL1, widget2_label1_binder);
widget2_panel3.addView(widget2_label1);
widget2_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL2
,"content","label"
,"margin-right","4"
,"halign","center"
,"height","10"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","10"
,"font-family","default"
,"valign","center"
);
widget2_panel3.addView(widget2_label2);
widget2_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL3
,"bindfield","rowstate"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","整改中"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget2_label3_binder = new UMTextBinder((IUMContextAccessor)context);
widget2_label3_binder.setBindInfo(new BindInfo("rowstate"));
widget2_label3_binder.setControl(widget2_label3);
binderGroup.addBinderToGroup(ID_WIDGET2_LABEL3, widget2_label3_binder);
widget2_panel3.addView(widget2_label3);

return widget2_panel3;
}
public View getWidget2_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET2_PANEL4
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","4"
,"valign","center"
);
widget2_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL4
,"content","隐患描述"
,"halign","center"
,"height","wrap"
,"widthwrap","56.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget2_panel4.addView(widget2_label4);

return widget2_panel4;
}
public View getWidget2_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET2_PANEL5
,"halign","center"
,"height","40"
,"layout-type","linear"
,"width","fill"
);
widget2_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET2_LABEL5
,"bindfield","hazard_desc"
,"halign","center"
,"height","fill"
,"color","#595757"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
,"type","multiline"
);
UMTextBinder widget2_label5_binder = new UMTextBinder((IUMContextAccessor)context);
widget2_label5_binder.setBindInfo(new BindInfo("hazard_desc"));
widget2_label5_binder.setControl(widget2_label5);
binderGroup.addBinderToGroup(ID_WIDGET2_LABEL5, widget2_label5_binder);
widget2_panel5.addView(widget2_label5);

return widget2_panel5;
}
public View getWidget2_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET2_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
View widget2_panel3 = (View) getWidget2_panel3View((UMActivity)context,binderGroup,configure);
widget2_panel1.addView(widget2_panel3);
View widget2_panel4 = (View) getWidget2_panel4View((UMActivity)context,binderGroup,configure);
widget2_panel1.addView(widget2_panel4);
View widget2_panel5 = (View) getWidget2_panel5View((UMActivity)context,binderGroup,configure);
widget2_panel1.addView(widget2_panel5);

return widget2_panel1;
}
public View getWidget2_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2_panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET2_PANEL0
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","105"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
View widget2_panel1 = (View) getWidget2_panel1View((UMActivity)context,binderGroup,configure);
widget2_panel0.addView(widget2_panel1);
widget2_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET2_PANEL2
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
,"valign","center"
);
widget2_panel0.addView(widget2_panel2);

return widget2_panel0;
}
public View getWidget2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget2 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_WIDGET2
,"bindfield","list"
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
);
UMListBinder widget2_binder = new UMListBinder((IUMContextAccessor)context);
widget2_binder.setBindInfo(new BindInfo("list"));
widget2_binder.setControl(widget2);
binderGroup.addBinderToGroup(ID_WIDGET2, widget2_binder);
widget2.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View widget2_panel0 = (View) getWidget2_panel0View((UMActivity)context,binderGroup,configure);
return widget2_panel0;
}});

return widget2;
}
public View getListpanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listpanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTPANEL2
,"halign","center"
,"title","页面3"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
);
View widget2 = (View) getWidget2View((UMActivity)context,binderGroup,configure);
listpanel2.addView(widget2);

return listpanel2;
}
public View getWidget3_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET3_PANEL3
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","10"
,"valign","center"
);
widget3_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL0
,"content","一般"
,"bindfield","safe_yh_level"
,"margin-right","6"
,"halign","center"
,"height","30"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","13"
,"width","44"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget3_label0_binder = new UMTextBinder((IUMContextAccessor)context);
widget3_label0_binder.setBindInfo(new BindInfo("safe_yh_level"));
widget3_label0_binder.setControl(widget3_label0);
binderGroup.addBinderToGroup(ID_WIDGET3_LABEL0, widget3_label0_binder);
widget3_panel3.addView(widget3_label0);
widget3_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL1
,"content","工作区"
,"bindfield","ope_area_desc"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#595757"
,"layout-type","linear"
,"font-size","15"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget3_label1_binder = new UMTextBinder((IUMContextAccessor)context);
widget3_label1_binder.setBindInfo(new BindInfo("ope_area_desc"));
widget3_label1_binder.setControl(widget3_label1);
binderGroup.addBinderToGroup(ID_WIDGET3_LABEL1, widget3_label1_binder);
widget3_panel3.addView(widget3_label1);
widget3_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL2
,"content","label"
,"margin-right","4"
,"halign","center"
,"height","10"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","10"
,"font-family","default"
,"valign","center"
);
widget3_panel3.addView(widget3_label2);
widget3_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL3
,"bindfield","rowstate"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","整改中"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder widget3_label3_binder = new UMTextBinder((IUMContextAccessor)context);
widget3_label3_binder.setBindInfo(new BindInfo("rowstate"));
widget3_label3_binder.setControl(widget3_label3);
binderGroup.addBinderToGroup(ID_WIDGET3_LABEL3, widget3_label3_binder);
widget3_panel3.addView(widget3_label3);

return widget3_panel3;
}
public View getWidget3_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET3_PANEL4
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","4"
,"valign","center"
);
widget3_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL4
,"content","隐患描述"
,"halign","center"
,"height","wrap"
,"widthwrap","56.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
widget3_panel4.addView(widget3_label4);

return widget3_panel4;
}
public View getWidget3_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET3_PANEL5
,"halign","center"
,"height","40"
,"layout-type","linear"
,"width","fill"
);
widget3_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET3_LABEL5
,"bindfield","hazard_desc"
,"halign","center"
,"height","fill"
,"color","#595757"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
,"type","multiline"
);
UMTextBinder widget3_label5_binder = new UMTextBinder((IUMContextAccessor)context);
widget3_label5_binder.setBindInfo(new BindInfo("hazard_desc"));
widget3_label5_binder.setControl(widget3_label5);
binderGroup.addBinderToGroup(ID_WIDGET3_LABEL5, widget3_label5_binder);
widget3_panel5.addView(widget3_label5);

return widget3_panel5;
}
public View getWidget3_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET3_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
View widget3_panel3 = (View) getWidget3_panel3View((UMActivity)context,binderGroup,configure);
widget3_panel1.addView(widget3_panel3);
View widget3_panel4 = (View) getWidget3_panel4View((UMActivity)context,binderGroup,configure);
widget3_panel1.addView(widget3_panel4);
View widget3_panel5 = (View) getWidget3_panel5View((UMActivity)context,binderGroup,configure);
widget3_panel1.addView(widget3_panel5);

return widget3_panel1;
}
public View getWidget3_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3_panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET3_PANEL0
,"padding-right","15"
,"padding-left","15"
,"halign","center"
,"height","105"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
View widget3_panel1 = (View) getWidget3_panel1View((UMActivity)context,binderGroup,configure);
widget3_panel0.addView(widget3_panel1);
widget3_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET3_PANEL2
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
,"valign","center"
);
widget3_panel0.addView(widget3_panel2);

return widget3_panel0;
}
public View getWidget3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget3 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_WIDGET3
,"bindfield","list"
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
);
UMListBinder widget3_binder = new UMListBinder((IUMContextAccessor)context);
widget3_binder.setBindInfo(new BindInfo("list"));
widget3_binder.setControl(widget3);
binderGroup.addBinderToGroup(ID_WIDGET3, widget3_binder);
widget3.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View widget3_panel0 = (View) getWidget3_panel0View((UMActivity)context,binderGroup,configure);
return widget3_panel0;
}});

return widget3;
}
public View getListpanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listpanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTPANEL3
,"halign","center"
,"title","页面4"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
);
View widget3 = (View) getWidget3View((UMActivity)context,binderGroup,configure);
listpanel3.addView(widget3);

return listpanel3;
}
public View getFlipperdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipperdefine0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPERDEFINE0
,"halign","center"
,"height","360.0"
,"onload","action:flipperdefine0_onload"
,"onnextflipper","action:flipperdefine0_onnextflipper"
,"layout","vbox"
,"width","fill"
,"onpreviousflipper","action:flipperdefine0_onpreviousflipper"
,"viewindex","1"
);
flipperdefine0.setEvent("onnextflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    args.put(parent);
    actionFlipperdefine0_onnextflipper(flipperdefine0,args);

}
});
flipperdefine0.setEvent("onpreviousflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    args.put(parent);
    actionFlipperdefine0_onpreviousflipper(flipperdefine0,args);

}
});
View listpanel0 = (View) getListpanel0View((UMActivity)context,binderGroup,configure);
flipperdefine0.addView(listpanel0);
View listpanel1 = (View) getListpanel1View((UMActivity)context,binderGroup,configure);
flipperdefine0.addView(listpanel1);
View listpanel2 = (View) getListpanel2View((UMActivity)context,binderGroup,configure);
flipperdefine0.addView(listpanel2);
View listpanel3 = (View) getListpanel3View((UMActivity)context,binderGroup,configure);
flipperdefine0.addView(listpanel3);

return flipperdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel0.addView(panel3);
View flipperdefine0 = (View) getFlipperdefine0View((UMActivity)context,binderGroup,configure);
panel0.addView(flipperdefine0);

return panel0;
}
public View getTabbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
tabbar0 = (UMXTabBar)ThirdControl.createControl(new UMXTabBar(context),ID_TABBAR0
,"height","49"
,"background","#f7f7f7"
,"layout","hbox"
,"width","fill"
,"valign","center"
);
tabbaritem0 = (UMXTabBarItem)ThirdControl.createControl(new UMXTabBarItem(context),ID_TABBARITEM0
,"text","隐患列表"
,"weight","1"
,"width","0"
,"icon-width","20"
,"font-pressed-color","#0075c4"
,"tabbaritemtype","icontext"
,"icon-height","20"
,"height","47.0"
,"color","#777777"
,"layout-type","hbox"
,"font-size","9"
,"icon-background-image","list_normal.png"
,"target","com.mobile.zhsg.Home"
,"icon-pressed-image","list_selected.png"
,"font-family","default"
,"checked","true"
,"icon-text-spacing","5"
);
tabbar0.addView(tabbaritem0);
tabbaritem1 = (UMXTabBarItem)ThirdControl.createControl(new UMXTabBarItem(context),ID_TABBARITEM1
,"weight","1"
,"width","0"
,"icon-width","38"
,"font-pressed-color","#00a1ea"
,"tabbaritemtype","icon"
,"icon-height","38"
,"height","47.0"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","add.png"
,"icon-pressed-image","add.png"
,"onclick","action:tabbaritem1_onclick"
,"font-family","default"
,"icon-text-spacing","3"
);
tabbaritem1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionTabbaritem1_onclick(tabbaritem1,args);

}
});
tabbar0.addView(tabbaritem1);
tabbaritem2 = (UMXTabBarItem)ThirdControl.createControl(new UMXTabBarItem(context),ID_TABBARITEM2
,"text","个人中心"
,"weight","1"
,"width","0"
,"icon-width","20"
,"font-pressed-color","#0075c4"
,"tabbaritemtype","icontext"
,"icon-height","20"
,"height","47.0"
,"color","#777777"
,"layout-type","hbox"
,"font-size","9"
,"icon-background-image","me_normal.png"
,"icon-pressed-image","me_selected.png"
,"font-family","default"
,"icon-text-spacing","5"
);
tabbar0.addView(tabbaritem2);

return tabbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","50"
,"layout-type","linear"
,"width","fill"
);
View tabbar0 = (View) getTabbar0View((UMActivity)context,binderGroup,configure);
panel1.addView(tabbar0);
panel2 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL2
,"height","1"
,"layout-type","linear"
,"background","#d8d8d8"
,"width","fill"
);
panel1.addView(panel2);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#f7f8f8"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
search0 = (UMSearchControl)ThirdControl.createControl(new UMSearchControl(context),ID_SEARCH0
,"height","44"
,"search-btn-icon","search_left.png"
,"color","#000000"
,"font","default"
,"localstorage","true"
,"placeholder","搜索"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"search-del-icon","search_right.png"
,"background-image","search_bg"
);
viewPage0.addView(search0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Home = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_HOME
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
,"controller","HomeController"
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Home.addView(viewPage0);

return (UMWindow)Home;
}

	
	public void actionFlipperdefine0_onnextflipper(View control, UMEventArgs args) {
    String actionid = "flipperdefine0_onnextflipper";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "next()",UMActivity.getViewId(control),args);
}
public void actionTabbaritem1_onclick(View control, UMEventArgs args) {
    String actionid = "tabbaritem1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addTrouble()",UMActivity.getViewId(control),args);
}
public void actionTogglebuttongroup0_onchange(View control, UMEventArgs args) {
    String actionid = "togglebuttongroup0_onchange";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toggleChange()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "back()",UMActivity.getViewId(control),args);
}
public void actionFlipperdefine0_onpreviousflipper(View control, UMEventArgs args) {
    String actionid = "flipperdefine0_onpreviousflipper";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "previous()",UMActivity.getViewId(control),args);
}
public void actionFlipperdefine0_onload(View control, UMEventArgs args) {
    String actionid = "flipperdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load()",UMActivity.getViewId(control),args);
}


}
