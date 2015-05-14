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

public abstract class RectificatedTroubleActivity extends UMWindowActivity {

	protected UMWindow RectificatedTrouble = null;
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
protected XHorizontalLayout panel2 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected UMLabel label7 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label10 = null;
protected UMLabel label11 = null;
protected UMLabel period = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label13 = null;
protected UMLabel label14 = null;
protected UMButton button1 = null;
protected UMLabel label15 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout panel6 = null;
protected UMGallery aftergallery = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout panel8 = null;
protected UMGallery beforegallery = null;
protected XVerticalLayout panel11 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label8 = null;
protected UMTextArea textarea0 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label19 = null;
protected UMLabel label22 = null;
protected UMImage image0 = null;
protected XVerticalLayout panel17 = null;
protected UMButton button4 = null;

	
	protected final static int ID_RECTIFICATEDTROUBLE = 348627280;
protected final static int ID_SCROLLVIEW_VIEWPAGE0 = 1275428319;
protected final static int ID_VIEWPAGE0 = 1348429884;
protected final static int ID_NAVIGATORBAR0 = 2113267412;
protected final static int ID_BUTTON0 = 1119572653;
protected final static int ID_LABEL0 = 449499230;
protected final static int ID_MORE = 1628547050;
protected final static int ID_PANEL0 = 1404187171;
protected final static int ID_PANEL1 = 275069474;
protected final static int ID_LABEL1 = 823184760;
protected final static int ID_LABEL2 = 897365192;
protected final static int ID_LABEL3 = 1650312793;
protected final static int ID_LABEL4 = 930665324;
protected final static int ID_PANEL2 = 1979187556;
protected final static int ID_LABEL5 = 1846014954;
protected final static int ID_LABEL6 = 815730442;
protected final static int ID_LABEL7 = 677749714;
protected final static int ID_PANEL3 = 740953363;
protected final static int ID_LABEL10 = 1858089294;
protected final static int ID_LABEL11 = 869417683;
protected final static int ID_PERIOD = 1407818975;
protected final static int ID_PANEL4 = 1828956074;
protected final static int ID_LABEL13 = 1271934584;
protected final static int ID_LABEL14 = 1500295464;
protected final static int ID_BUTTON1 = 509846670;
protected final static int ID_LABEL15 = 1248088620;
protected final static int ID_PANEL5 = 1881643482;
protected final static int ID_LABEL16 = 689405160;
protected final static int ID_PANEL6 = 783027041;
protected final static int ID_AFTERGALLERY = 115668036;
protected final static int ID_PANEL7 = 497792466;
protected final static int ID_LABEL17 = 371662218;
protected final static int ID_PANEL8 = 202730404;
protected final static int ID_BEFOREGALLERY = 317072206;
protected final static int ID_PANEL11 = 692341944;
protected final static int ID_PANEL12 = 232556474;
protected final static int ID_LABEL8 = 1693068245;
protected final static int ID_TEXTAREA0 = 552858339;
protected final static int ID_PANEL9 = 888450696;
protected final static int ID_LABEL19 = 1663134384;
protected final static int ID_LABEL22 = 1140260837;
protected final static int ID_IMAGE0 = 270208736;
protected final static int ID_PANEL17 = 546992974;
protected final static int ID_BUTTON4 = 2114788237;

	
	
	@Override
	public String getControllerName() {
		return "RectificatedTroubleController";
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
		  idmap.put("RectificatedTrouble",ID_RECTIFICATEDTROUBLE);
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
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label7",ID_LABEL7);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("period",ID_PERIOD);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label14",ID_LABEL14);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label15",ID_LABEL15);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label16",ID_LABEL16);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("aftergallery",ID_AFTERGALLERY);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label17",ID_LABEL17);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("beforegallery",ID_BEFOREGALLERY);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label8",ID_LABEL8);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label19",ID_LABEL19);
  idmap.put("label22",ID_LABEL22);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel17",ID_PANEL17);
  idmap.put("button4",ID_BUTTON4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - action:viewpage0_onload
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    actionViewpage0_onload(viewPage0,args);

}
{ //aftergallery - action:aftergallery_onload
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    actionAftergallery_onload(aftergallery,args);

}
{ //beforegallery - action:beforegallery_onload
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    actionBeforegallery_onload(beforegallery,args);

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
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
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
,"widthwrap","72.0"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#ffffff"
,"font-size","17"
,"layout-type","linear"
,"value","验证关闭"
,"onclick","action:more_onclick"
,"font-family","default"
,"valign","center"
);
more.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
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
,"background-image","rectificated.png"
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
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"halign","LEFT"
,"height","wrap"
,"heightwrap","20.0"
,"layout-type","linear"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","respon_unit_desc"
,"halign","center"
,"widthwrap","56.0"
,"width","wrap"
,"content","责任单位"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label5_binder = new UMTextBinder((IUMContextAccessor)context);
label5_binder.setBindInfo(new BindInfo("respon_unit_desc"));
label5_binder.setControl(label5);
binderGroup.addBinderToGroup(ID_LABEL5, label5_binder);
panel2.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"halign","center"
,"height","wrap"
,"weight","1"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel2.addView(label6);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"bindfield","duty_officer_name"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","责任人"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label7_binder = new UMTextBinder((IUMContextAccessor)context);
label7_binder.setBindInfo(new BindInfo("duty_officer_name"));
label7_binder.setControl(label7);
binderGroup.addBinderToGroup(ID_LABEL7, label7_binder);
panel2.addView(label7);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"halign","LEFT"
,"height","wrap"
,"heightwrap","20.0"
,"layout-type","linear"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"bindfield","yh_sub_type_describe"
,"halign","center"
,"widthwrap","28.0"
,"width","wrap"
,"content","细化"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label10_binder = new UMTextBinder((IUMContextAccessor)context);
label10_binder.setBindInfo(new BindInfo("yh_sub_type_describe"));
label10_binder.setControl(label10);
binderGroup.addBinderToGroup(ID_LABEL10, label10_binder);
panel3.addView(label10);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
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
panel3.addView(label11);
period = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PERIOD
,"bindfield","rectification_period"
,"halign","center"
,"widthwrap","84.0"
,"width","wrap"
,"content","整改截止时间"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder period_binder = new UMTextBinder((IUMContextAccessor)context);
period_binder.setBindInfo(new BindInfo("rectification_period"));
period_binder.setControl(period);
binderGroup.addBinderToGroup(ID_PERIOD, period_binder);
panel3.addView(period);

return panel3;
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
,"padding-left","15"
,"padding-right","15"
,"padding-top","6"
,"halign","center"
,"width","fill"
,"margin-bottom","24"
,"padding-bottom","6"
,"height","wrap"
,"heightwrap","200.0"
,"layout-type","linear"
,"background","#ffffff"
,"margin-top","24"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel0.addView(panel3);
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
,"heightwrap","40.0"
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
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"halign","LEFT"
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"halign","center"
,"widthwrap","70.0"
,"width","wrap"
,"content","整改后取证"
,"height","wrap"
,"color","#595757"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
panel5.addView(label16);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"halign","CENTER"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
,"valign","center"
);
aftergallery = (UMGallery)ThirdControl.createControl(new UMGallery(context),ID_AFTERGALLERY
,"bindfield","afterAtt"
,"height","60"
,"onload","action:aftergallery_onload"
,"itemindex","0"
,"layout-type","linear"
,"width","fill"
,"onitemclick","action:aftergallery_onitemclick"
,"scaletype","fitcenter"
,"spacing","12dp"
,"datasource","[{\"src\":\"add.png\"}, {\"src\":\"addimg_normal.png\"}, {\"src\":\"addimg_pressed.png\"}, {\"src\":\"app.png\"}, {\"src\":\"back.png\"}]"
,"itemwidth","60"
);
aftergallery.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    args.put(parent);
    actionAftergallery_onitemclick(aftergallery,args);

}
});
panel6.addView(aftergallery);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"halign","LEFT"
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-left","15"
,"margin-bottom","3"
,"valign","center"
);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"content","整改前取证"
,"halign","center"
,"height","wrap"
,"widthwrap","70.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel7.addView(label17);

return panel7;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"halign","LEFT"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
,"valign","center"
);
beforegallery = (UMGallery)ThirdControl.createControl(new UMGallery(context),ID_BEFOREGALLERY
,"bindfield","beforeAtt"
,"height","60"
,"onload","action:beforegallery_onload"
,"itemindex","0"
,"layout-type","linear"
,"width","fill"
,"onitemclick","action:beforegallery_onitemclick"
,"scaletype","fitcenter"
,"spacing","12dp"
,"datasource","[{\"src\":\"add.png\"}, {\"src\":\"addimg_normal.png\"}, {\"src\":\"addimg_pressed.png\"}, {\"src\":\"app.png\"}, {\"src\":\"back.png\"}]"
,"itemwidth","60"
);
beforegallery.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    args.put(parent);
    actionBeforegallery_onitemclick(beforegallery,args);

}
});
panel8.addView(beforegallery);

return panel8;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"margin-right","15"
,"halign","LEFT"
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-left","15"
,"margin-bottom","3"
,"valign","center"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"content","验证关闭意见"
,"halign","center"
,"height","wrap"
,"widthwrap","84.0"
,"color","#595757"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
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
,"height","100"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
,"valign","TOP"
);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel11.addView(panel12);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"bindfield","close_opinion"
,"padding-right","15"
,"padding-left","15"
,"halign","LEFT"
,"placeholder","（意见）"
,"width","fill"
,"height","64"
,"color","#333333"
,"font-size","13"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
UMTextBinder textarea0_binder = new UMTextBinder((IUMContextAccessor)context);
textarea0_binder.setBindInfo(new BindInfo("close_opinion"));
textarea0_binder.setControl(textarea0);
binderGroup.addBinderToGroup(ID_TEXTAREA0, textarea0_binder);
panel11.addView(textarea0);

return panel11;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","15"
,"padding-right","15"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
,"content","审核历史"
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
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
panel9.addView(image0);

return panel9;
}
public View getPanel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel17 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL17
,"halign","center"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel17_onclick"
,"margin-top","24"
,"valign","TOP"
);
panel17.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    actionPanel17_onclick(panel17,args);

}
});
button4 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON4
,"halign","center"
,"widthwrap","32.0"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#ff2d2d"
,"font-size","15"
,"layout-type","linear"
,"value","退回"
,"onclick","action:button4_onclick"
,"font-family","default"
,"valign","center"
);
button4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(RectificatedTroubleActivity.this);
    actionButton4_onclick(button4,args);

}
});
panel17.addView(button4);

return panel17;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","action:viewpage0_onload"
,"layout-type","vbox"
,"width","fill"
,"background","#f7f8f8"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel7);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel8);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel11);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel9);
View panel17 = (View) getPanel17View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel17);

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
RectificatedTrouble = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_RECTIFICATEDTROUBLE
,"halign","center"
,"height","900"
,"width","fill"
,"layout","vbox"
,"controller","RectificatedTroubleController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View Scrollview_viewPage0 = (View) getScrollview_viewPage0View((UMActivity)context,binderGroup,configure);
RectificatedTrouble.addView(Scrollview_viewPage0);

return (UMWindow)RectificatedTrouble;
}

	
	public void actionMore_onclick(View control, UMEventArgs args) {
    String actionid = "more_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "rectificate()",UMActivity.getViewId(control),args);
}
public void actionBeforegallery_onload(View control, UMEventArgs args) {
    String actionid = "beforegallery_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadSmallPic()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "back()",UMActivity.getViewId(control),args);
}
public void actionButton4_onclick(View control, UMEventArgs args) {
    String actionid = "button4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "redo()",UMActivity.getViewId(control),args);
}
public void actionAftergallery_onitemclick(View control, UMEventArgs args) {
    String actionid = "aftergallery_onitemclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openBigPic()",UMActivity.getViewId(control),args);
}
public void actionBeforegallery_onitemclick(View control, UMEventArgs args) {
    String actionid = "beforegallery_onitemclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openBigPic()",UMActivity.getViewId(control),args);
}
public void actionPanel17_onclick(View control, UMEventArgs args) {
    String actionid = "panel17_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "redo()",UMActivity.getViewId(control),args);
}
public void actionAftergallery_onload(View control, UMEventArgs args) {
    String actionid = "aftergallery_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadSmallPic()",UMActivity.getViewId(control),args);
}
public void actionViewpage0_onload(View control, UMEventArgs args) {
    String actionid = "viewpage0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load()",UMActivity.getViewId(control),args);
}


}
