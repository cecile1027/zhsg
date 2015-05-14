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

public abstract class BackTroubleActivity extends UMWindowActivity {

	protected UMWindow BackTrouble = null;
protected UMScrollView Scrollview_viewPage0 = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton more = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label13 = null;
protected UMLabel label14 = null;
protected UMButton button1 = null;
protected UMLabel label15 = null;
protected XVerticalLayout panel11 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label8 = null;
protected UMTextArea textarea0 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label19 = null;
protected UMLabel label22 = null;
protected UMButton button2 = null;
protected XVerticalLayout panel2 = null;
protected UMLabel label5 = null;

	
	protected final static int ID_BACKTROUBLE = 101266582;
protected final static int ID_SCROLLVIEW_VIEWPAGE0 = 1019711428;
protected final static int ID_VIEWPAGE0 = 822524126;
protected final static int ID_NAVIGATORBAR0 = 466883223;
protected final static int ID_BUTTON0 = 1561682169;
protected final static int ID_LABEL0 = 344973796;
protected final static int ID_MORE = 5011955;
protected final static int ID_PANEL0 = 940334010;
protected final static int ID_PANEL1 = 1999238295;
protected final static int ID_LABEL1 = 926209161;
protected final static int ID_LABEL2 = 738138277;
protected final static int ID_LABEL3 = 167365356;
protected final static int ID_LABEL4 = 821704731;
protected final static int ID_PANEL4 = 2094081793;
protected final static int ID_LABEL13 = 29221407;
protected final static int ID_LABEL14 = 1412354391;
protected final static int ID_BUTTON1 = 491236464;
protected final static int ID_LABEL15 = 2080144626;
protected final static int ID_PANEL11 = 483230002;
protected final static int ID_PANEL12 = 783032301;
protected final static int ID_LABEL8 = 485719807;
protected final static int ID_TEXTAREA0 = 1986393945;
protected final static int ID_PANEL9 = 370634813;
protected final static int ID_LABEL19 = 405596157;
protected final static int ID_LABEL22 = 510332558;
protected final static int ID_BUTTON2 = 1417694402;
protected final static int ID_PANEL2 = 453373745;
protected final static int ID_LABEL5 = 574870616;

	
	
	@Override
	public String getControllerName() {
		return "BackTroubleController";
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
		  idmap.put("BackTrouble",ID_BACKTROUBLE);
  idmap.put("Scrollview_viewPage0",ID_SCROLLVIEW_VIEWPAGE0);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("more",ID_MORE);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label14",ID_LABEL14);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label15",ID_LABEL15);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label8",ID_LABEL8);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label19",ID_LABEL19);
  idmap.put("label22",ID_LABEL22);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label5",ID_LABEL5);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - action:viewpage0_onload
    UMEventArgs args = new UMEventArgs(BackTroubleActivity.this);
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
,"title","隐患详情"
,"height","44.0"
,"color","#ffffff"
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
    UMEventArgs args = new UMEventArgs(BackTroubleActivity.this);
    actionButton0_onclick(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"margin-right","50"
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
more = (UMButton)ThirdControl.createControl(new UMButton(context),ID_MORE
,"halign","center"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44"
,"font-size","17"
,"value","提交"
,"onclick","action:more_onclick"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
);
more.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(BackTroubleActivity.this);
    actionMore_onclick(more,args);

}
});
navigatorbar0.addView(more);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"halign","LEFT"
,"height","30"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","safe_yh_level_name"
,"halign","center"
,"width","44"
,"content","一般"
,"margin-right","6"
,"height","30"
,"color","#ffffff"
,"background","#1680fa"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("safe_yh_level_name"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel1.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","ope_area_no"
,"halign","left"
,"weight","1"
,"width","0"
,"content","工作区"
,"height","wrap"
,"color","#595757"
,"heightwrap","22.0"
,"font-size","15"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("ope_area_no"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel1.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"margin-right","4"
,"halign","center"
,"height","10"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","10"
,"font-family","default"
,"valign","center"
,"background-image","created.png"
);
panel1.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","已创建"
,"bindfield","rowstate_name"
,"halign","center"
,"height","20"
,"widthwrap","42.0"
,"color","#595757"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("rowstate_name"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel1.addView(label4);

return panel1;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"halign","LEFT"
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-top","14"
,"valign","center"
);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
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
panel4.addView(label13);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"halign","center"
,"height","20"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel4.addView(label14);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"widthwrap","28.0"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"height","wrap"
,"color","#1680fa"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"value","展开"
,"font-family","default"
,"valign","center"
);
panel4.addView(button1);

return panel4;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-right","15"
,"padding-left","15"
,"padding-top","6"
,"halign","center"
,"width","fill"
,"margin-bottom","24"
,"padding-bottom","6"
,"height","wrap"
,"heightwrap","140.0"
,"layout-type","linear"
,"background","#ffffff"
,"margin-top","24"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel0.addView(panel4);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"bindfield","hazard_desc"
,"halign","left"
,"width","fill"
,"type","multiline"
,"content","隐患描述"
,"height","wrap"
,"color","#595757"
,"heightwrap","20.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"margin-top","4"
,"valign","top"
);
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("hazard_desc"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
panel0.addView(label15);

return panel0;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"margin-right","15"
,"halign","LEFT"
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-left","15"
,"margin-bottom","3"
,"valign","center"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"content","退回原由"
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
panel12.addView(label8);

return panel12;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","center"
,"height","wrap"
,"heightwrap","120.0"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
,"valign","TOP"
);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel11.addView(panel12);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"bindfield","approve_desc"
,"padding-right","15"
,"padding-left","15"
,"halign","LEFT"
,"placeholder","（意见）"
,"width","fill"
,"height","80"
,"color","#333333"
,"font-size","15"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
UMTextBinder textarea0_binder = new UMTextBinder((IUMContextAccessor)context);
textarea0_binder.setBindInfo(new BindInfo("approve_desc"));
textarea0_binder.setControl(textarea0);
binderGroup.addBinderToGroup(ID_TEXTAREA0, textarea0_binder);
panel11.addView(textarea0);

return panel11;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","15"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
,"content","抄送人"
,"bindfield","sendperson"
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
UMTextBinder label19_binder = new UMTextBinder((IUMContextAccessor)context);
label19_binder.setBindInfo(new BindInfo("sendperson"));
label19_binder.setControl(label19);
binderGroup.addBinderToGroup(ID_LABEL19, label19_binder);
panel9.addView(label19);
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
panel9.addView(label22);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"height","44"
,"color","#e50011"
,"pressed-image","btn_add_touch"
,"layout-type","linear"
,"width","44"
,"font-size","17"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
,"background-image","btn_add"
);
panel9.addView(button2);

return panel9;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","80"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"opacity","15"
,"margin-top","5"
,"valign","TOP"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","left"
,"height","wrap"
,"color","#595757"
,"heightwrap","132.0"
,"layout-type","linear"
,"font-size","15"
,"width","fill"
,"font-family","default"
,"valign","top"
,"type","multiline"
);
panel2.addView(label5);

return panel2;
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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel11);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel9);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);

return viewPage0;
}
public View getScrollview_viewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_viewPage0 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_VIEWPAGE0
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"hscrollenabled","disabled"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Scrollview_viewPage0.addView(viewPage0);

return Scrollview_viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
BackTrouble = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_BACKTROUBLE
,"halign","center"
,"height","900"
,"layout","vbox"
,"width","fill"
,"controller","BackTroubleController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View Scrollview_viewPage0 = (View) getScrollview_viewPage0View((UMActivity)context,binderGroup,configure);
BackTrouble.addView(Scrollview_viewPage0);

return (UMWindow)BackTrouble;
}

	
	public void actionMore_onclick(View control, UMEventArgs args) {
    String actionid = "more_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "commit()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "back()",UMActivity.getViewId(control),args);
}
public void actionViewpage0_onload(View control, UMEventArgs args) {
    String actionid = "viewpage0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load()",UMActivity.getViewId(control),args);
}


}
