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

public abstract class TroubleDetailActivity extends UMWindowActivity {

	protected UMWindow TroubleDetail = null;
protected UMScrollView Scrollview_viewPage0 = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
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
protected UMLabel label12 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label13 = null;
protected UMLabel label14 = null;
protected UMButton button1 = null;
protected UMLabel label15 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label16 = null;
protected XRelativeLayout panel6 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout panel8 = null;
protected XHorizontalLayout afterPrevious = null;
protected UMButton button3 = null;
protected XHorizontalLayout panel10 = null;
protected XVerticalLayout panel13 = null;
protected UMImage afterImage1 = null;
protected XVerticalLayout panel14 = null;
protected UMImage afterImage2 = null;
protected XVerticalLayout panel15 = null;
protected UMImage afterImage3 = null;
protected XVerticalLayout panel16 = null;
protected UMImage afterImage4 = null;
protected XHorizontalLayout afterNext = null;
protected UMButton button2 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label19 = null;
protected UMLabel label22 = null;
protected UMImage image0 = null;

	
	protected final static int ID_TROUBLEDETAIL = 1693782310;
protected final static int ID_SCROLLVIEW_VIEWPAGE0 = 2030640449;
protected final static int ID_VIEWPAGE0 = 1298034031;
protected final static int ID_NAVIGATORBAR0 = 1713884180;
protected final static int ID_BUTTON0 = 837119336;
protected final static int ID_LABEL0 = 52207419;
protected final static int ID_PANEL0 = 1093218784;
protected final static int ID_PANEL1 = 449758952;
protected final static int ID_LABEL1 = 735272163;
protected final static int ID_LABEL2 = 1183659292;
protected final static int ID_LABEL3 = 1929626181;
protected final static int ID_LABEL4 = 728821124;
protected final static int ID_PANEL2 = 1613470565;
protected final static int ID_LABEL5 = 714650650;
protected final static int ID_LABEL6 = 1270583236;
protected final static int ID_LABEL7 = 2112994129;
protected final static int ID_PANEL3 = 475033954;
protected final static int ID_LABEL10 = 311595708;
protected final static int ID_LABEL11 = 410593262;
protected final static int ID_LABEL12 = 1188705555;
protected final static int ID_PANEL4 = 1875874315;
protected final static int ID_LABEL13 = 859573618;
protected final static int ID_LABEL14 = 800434207;
protected final static int ID_BUTTON1 = 1125907443;
protected final static int ID_LABEL15 = 2044291831;
protected final static int ID_PANEL5 = 1387931112;
protected final static int ID_LABEL16 = 1837131818;
protected final static int ID_PANEL6 = 537262871;
protected final static int ID_PANEL7 = 81531717;
protected final static int ID_LABEL17 = 1146936042;
protected final static int ID_PANEL8 = 1213659894;
protected final static int ID_AFTERPREVIOUS = 1881473315;
protected final static int ID_BUTTON3 = 106541855;
protected final static int ID_PANEL10 = 28486166;
protected final static int ID_PANEL13 = 522667484;
protected final static int ID_AFTERIMAGE1 = 38295746;
protected final static int ID_PANEL14 = 970566262;
protected final static int ID_AFTERIMAGE2 = 1141951240;
protected final static int ID_PANEL15 = 1978291968;
protected final static int ID_AFTERIMAGE3 = 177078265;
protected final static int ID_PANEL16 = 381805004;
protected final static int ID_AFTERIMAGE4 = 929891072;
protected final static int ID_AFTERNEXT = 521798274;
protected final static int ID_BUTTON2 = 2104747936;
protected final static int ID_PANEL9 = 1730900944;
protected final static int ID_LABEL19 = 1509201655;
protected final static int ID_LABEL22 = 1234217926;
protected final static int ID_IMAGE0 = 129612896;

	
	
	@Override
	public String getControllerName() {
		return "TroubleDetailController";
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
		  idmap.put("TroubleDetail",ID_TROUBLEDETAIL);
  idmap.put("Scrollview_viewPage0",ID_SCROLLVIEW_VIEWPAGE0);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
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
  idmap.put("label12",ID_LABEL12);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label14",ID_LABEL14);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label15",ID_LABEL15);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label16",ID_LABEL16);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label17",ID_LABEL17);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("afterPrevious",ID_AFTERPREVIOUS);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("afterImage1",ID_AFTERIMAGE1);
  idmap.put("panel14",ID_PANEL14);
  idmap.put("afterImage2",ID_AFTERIMAGE2);
  idmap.put("panel15",ID_PANEL15);
  idmap.put("afterImage3",ID_AFTERIMAGE3);
  idmap.put("panel16",ID_PANEL16);
  idmap.put("afterImage4",ID_AFTERIMAGE4);
  idmap.put("afterNext",ID_AFTERNEXT);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label19",ID_LABEL19);
  idmap.put("label22",ID_LABEL22);
  idmap.put("image0",ID_IMAGE0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
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
,"title","隐患详情"
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
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
,"background-image","back.png"
);
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

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"height","30"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","safe_yh_level"
,"halign","center"
,"width","44"
,"content","一般"
,"margin-right","6"
,"height","30"
,"color","#ffffff"
,"font-size","13"
,"background","#1680fa"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("safe_yh_level"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel1.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","ope_area_desc"
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
label2_binder.setBindInfo(new BindInfo("ope_area_desc"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel1.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
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
,"background-image","ing.png"
);
panel1.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","已创建"
,"bindfield","rowstate"
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
label4_binder.setBindInfo(new BindInfo("rowstate"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel1.addView(label4);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"height","wrap"
,"heightwrap","20.0"
,"layout-type","linear"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","org_desc"
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
label5_binder.setBindInfo(new BindInfo("org_desc"));
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
,"bindfield","name"
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
label7_binder.setBindInfo(new BindInfo("name"));
label7_binder.setControl(label7);
binderGroup.addBinderToGroup(ID_LABEL7, label7_binder);
panel2.addView(label7);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"height","wrap"
,"heightwrap","20.0"
,"layout-type","linear"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"bindfield","type_describe"
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
label10_binder.setBindInfo(new BindInfo("type_describe"));
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
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
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
UMTextBinder label12_binder = new UMTextBinder((IUMContextAccessor)context);
label12_binder.setBindInfo(new BindInfo("rectification_period"));
label12_binder.setControl(label12);
binderGroup.addBinderToGroup(ID_LABEL12, label12_binder);
panel3.addView(label12);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
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
,"height","200"
,"width","fill"
,"background","#ffffff"
,"layout-type","linear"
,"margin-bottom","24"
,"margin-top","24"
,"padding-bottom","6"
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
,"halign","center"
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
,"valign","center"
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
,"height","20"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"padding-bottom","5"
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
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
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
public View getAfterPreviousView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
afterPrevious = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_AFTERPREVIOUS
,"height","fill"
,"layout-type","linear"
,"width","12"
,"onclick","action:afterprevious_onclick"
,"valign","center"
);
afterPrevious.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(TroubleDetailActivity.this);
    actionAfterprevious_onclick(afterPrevious,args);

}
});
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"margin-right","6"
,"halign","center"
,"height","44"
,"color","#00a1ea"
,"layout-type","linear"
,"width","8"
,"font-size","17"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
,"background-image","row_left.png"
);
afterPrevious.addView(button3);

return afterPrevious;
}
public View getPanel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL13
,"halign","center"
,"weight","1"
,"height","60.0"
,"layout-type","linear"
,"width","0"
);
afterImage1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_AFTERIMAGE1
,"height","60"
,"layout-type","linear"
,"width","60"
,"scaletype","fitcenter"
,"src","picture"
);
panel13.addView(afterImage1);

return panel13;
}
public View getPanel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel14 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL14
,"halign","center"
,"weight","1"
,"height","60.0"
,"layout-type","linear"
,"width","0"
);
afterImage2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_AFTERIMAGE2
,"height","60"
,"layout-type","linear"
,"width","60"
,"scaletype","fitcenter"
,"src","picture"
);
panel14.addView(afterImage2);

return panel14;
}
public View getPanel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel15 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL15
,"halign","center"
,"weight","1"
,"height","60.0"
,"layout-type","linear"
,"width","0"
);
afterImage3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_AFTERIMAGE3
,"height","60"
,"layout-type","linear"
,"width","60"
,"scaletype","fitcenter"
,"src","picture"
);
panel15.addView(afterImage3);

return panel15;
}
public View getPanel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel16 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL16
,"halign","center"
,"weight","1"
,"height","60.0"
,"layout-type","linear"
,"width","0"
);
afterImage4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_AFTERIMAGE4
,"height","60"
,"layout-type","linear"
,"width","60"
,"scaletype","fitcenter"
,"src","picture"
);
panel16.addView(afterImage4);

return panel16;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
View panel13 = (View) getPanel13View((UMActivity)context,binderGroup,configure);
panel10.addView(panel13);
View panel14 = (View) getPanel14View((UMActivity)context,binderGroup,configure);
panel10.addView(panel14);
View panel15 = (View) getPanel15View((UMActivity)context,binderGroup,configure);
panel10.addView(panel15);
View panel16 = (View) getPanel16View((UMActivity)context,binderGroup,configure);
panel10.addView(panel16);

return panel10;
}
public View getAfterNextView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
afterNext = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_AFTERNEXT
,"height","fill"
,"layout-type","linear"
,"width","12"
,"onclick","action:afternext_onclick"
,"valign","center"
);
afterNext.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(TroubleDetailActivity.this);
    actionAfternext_onclick(afterNext,args);

}
});
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"height","44"
,"color","#00a1ea"
,"layout-type","linear"
,"width","8"
,"font-size","17"
,"margin-left","6"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
,"background-image","row_indicator.png"
);
afterNext.addView(button2);

return afterNext;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"padding-left","15"
,"padding-right","15"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
,"valign","center"
);
View afterPrevious = (View) getAfterPreviousView((UMActivity)context,binderGroup,configure);
panel8.addView(afterPrevious);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
panel8.addView(panel10);
View afterNext = (View) getAfterNextView((UMActivity)context,binderGroup,configure);
panel8.addView(afterNext);

return panel8;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-right","15"
,"padding-left","15"
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
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","wrap"
,"layout-type","vbox"
,"background","#f7f8f8"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel5);
panel6 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL6
,"height","80"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","24"
);
viewPage0.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel7);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel8);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel9);

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
TroubleDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TROUBLEDETAIL
,"halign","center"
,"height","700"
,"layout","vbox"
,"width","fill"
,"controller","TroubleDetailController"
,"namespace","com.mobile.zhsg"
);
View Scrollview_viewPage0 = (View) getScrollview_viewPage0View((UMActivity)context,binderGroup,configure);
TroubleDetail.addView(Scrollview_viewPage0);

return (UMWindow)TroubleDetail;
}

	
	public void actionAfterprevious_onclick(View control, UMEventArgs args) {
    String actionid = "afterprevious_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "previous()",UMActivity.getViewId(control),args);
}
public void actionAfternext_onclick(View control, UMEventArgs args) {
    String actionid = "afternext_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "next()",UMActivity.getViewId(control),args);
}


}
