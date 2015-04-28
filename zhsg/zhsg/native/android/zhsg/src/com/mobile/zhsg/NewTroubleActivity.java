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
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected UMScrollView Scrollview_total = null;
protected XVerticalLayout total = null;
protected XVerticalLayout div1 = null;
protected XHorizontalLayout panel0 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMImage image0 = null;
protected XRelativeLayout brpanel0 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label9 = null;
protected UMLabel label10 = null;
protected UMLabel label11 = null;
protected UMLabel label12 = null;
protected UMImage image2 = null;
protected XRelativeLayout brpanel2 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label13 = null;
protected UMLabel label14 = null;
protected UMLabel label15 = null;
protected UMLabel label16 = null;
protected UMImage image3 = null;
protected XRelativeLayout brpanel3 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label31 = null;
protected UMLabel label32 = null;
protected UMLabel label33 = null;
protected UMLabel label34 = null;
protected UMImage image6 = null;
protected XRelativeLayout panel13 = null;
protected XVerticalLayout div2 = null;
protected XRelativeLayout brpanel4 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label21 = null;
protected UMLabel label22 = null;
protected UMLabel label23 = null;
protected UMLabel label24 = null;
protected UMImage image5 = null;
protected XRelativeLayout brpanel5 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label25 = null;
protected UMLabel label26 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected XRelativeLayout brpanel6 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label29 = null;
protected UMLabel label30 = null;
protected UMDateEdit dateinput0 = null;
protected XRelativeLayout brpanel7 = null;
protected XHorizontalLayout panel8 = null;
protected XVerticalLayout panel15 = null;
protected UMButton day1 = null;
protected XVerticalLayout panel16 = null;
protected UMButton day3 = null;
protected XVerticalLayout panel17 = null;
protected UMButton day5 = null;
protected XRelativeLayout brpanel8 = null;
protected XRelativeLayout panel14 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label17 = null;
protected UMLabel label18 = null;
protected UMButton button2 = null;
protected XRelativeLayout panel1 = null;
protected XRelativeLayout panel18 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label27 = null;
protected UMTextArea textarea0 = null;
protected XHorizontalLayout panel10 = null;
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

	
	protected final static int ID_NEWTROUBLE = 1212984730;
protected final static int ID_VIEWPAGE0 = 294655033;
protected final static int ID_NAVIGATORBAR0 = 1290760713;
protected final static int ID_BUTTON0 = 328775248;
protected final static int ID_LABEL0 = 1142687662;
protected final static int ID_BUTTON1 = 472110707;
protected final static int ID_SCROLLVIEW_TOTAL = 1253761623;
protected final static int ID_TOTAL = 1446937985;
protected final static int ID_DIV1 = 1829233016;
protected final static int ID_PANEL0 = 1393589620;
protected final static int ID_LABEL2 = 915691956;
protected final static int ID_LABEL3 = 1443082991;
protected final static int ID_LABEL4 = 2032218556;
protected final static int ID_LABEL5 = 1801112788;
protected final static int ID_IMAGE0 = 1924746795;
protected final static int ID_BRPANEL0 = 1613232907;
protected final static int ID_PANEL2 = 1385213272;
protected final static int ID_LABEL9 = 1977208329;
protected final static int ID_LABEL10 = 368543259;
protected final static int ID_LABEL11 = 1769051159;
protected final static int ID_LABEL12 = 1545977802;
protected final static int ID_IMAGE2 = 240139858;
protected final static int ID_BRPANEL2 = 596640841;
protected final static int ID_PANEL3 = 1282288257;
protected final static int ID_LABEL13 = 1475157906;
protected final static int ID_LABEL14 = 448501570;
protected final static int ID_LABEL15 = 927812336;
protected final static int ID_LABEL16 = 1405780990;
protected final static int ID_IMAGE3 = 1700281133;
protected final static int ID_BRPANEL3 = 1502851743;
protected final static int ID_PANEL12 = 333279931;
protected final static int ID_LABEL31 = 1618756248;
protected final static int ID_LABEL32 = 1394139479;
protected final static int ID_LABEL33 = 661316183;
protected final static int ID_LABEL34 = 2108316963;
protected final static int ID_IMAGE6 = 735469597;
protected final static int ID_PANEL13 = 424429735;
protected final static int ID_DIV2 = 2043340266;
protected final static int ID_BRPANEL4 = 396467178;
protected final static int ID_PANEL5 = 1600634314;
protected final static int ID_LABEL21 = 345291387;
protected final static int ID_LABEL22 = 1089793118;
protected final static int ID_LABEL23 = 480172660;
protected final static int ID_LABEL24 = 295410755;
protected final static int ID_IMAGE5 = 1916063099;
protected final static int ID_BRPANEL5 = 390426132;
protected final static int ID_PANEL6 = 774653966;
protected final static int ID_LABEL25 = 1848061989;
protected final static int ID_LABEL26 = 1852558414;
protected final static int ID_TOGGLEBUTTONGROUP0 = 2061074265;
protected final static int ID_TOGGLEBUTTON0 = 657856233;
protected final static int ID_TOGGLEBUTTON1 = 934175087;
protected final static int ID_BRPANEL6 = 516405434;
protected final static int ID_PANEL7 = 1986374369;
protected final static int ID_LABEL29 = 2145822997;
protected final static int ID_LABEL30 = 143153461;
protected final static int ID_DATEINPUT0 = 1312518676;
protected final static int ID_BRPANEL7 = 58210117;
protected final static int ID_PANEL8 = 319986266;
protected final static int ID_PANEL15 = 1909781154;
protected final static int ID_DAY1 = 1555889457;
protected final static int ID_PANEL16 = 1122610369;
protected final static int ID_DAY3 = 363271514;
protected final static int ID_PANEL17 = 2040495297;
protected final static int ID_DAY5 = 273420971;
protected final static int ID_BRPANEL8 = 1524390118;
protected final static int ID_PANEL14 = 620514792;
protected final static int ID_PANEL4 = 62826526;
protected final static int ID_LABEL17 = 818494071;
protected final static int ID_LABEL18 = 1305125220;
protected final static int ID_BUTTON2 = 2024684329;
protected final static int ID_PANEL1 = 702398607;
protected final static int ID_PANEL18 = 195675394;
protected final static int ID_LABEL1 = 895914930;
protected final static int ID_PANEL9 = 789148831;
protected final static int ID_LABEL27 = 1603147495;
protected final static int ID_TEXTAREA0 = 897554090;
protected final static int ID_PANEL10 = 2043403133;
protected final static int ID_LABEL28 = 1160993043;
protected final static int ID_ATTPANEL1 = 1526790493;
protected final static int ID_PANEL22 = 1585880644;
protected final static int ID_ATTIMAGE1 = 1109051933;
protected final static int ID_PANEL23 = 79049050;
protected final static int ID_ATTIMAGE2 = 1254666375;
protected final static int ID_PANEL21 = 566416141;
protected final static int ID_ATTIMAGE3 = 1459720986;
protected final static int ID_ATTPANEL2 = 623209640;
protected final static int ID_PANEL24 = 1235853228;
protected final static int ID_ATTIMAGE4 = 413212839;
protected final static int ID_PANEL25 = 645326865;
protected final static int ID_ATTIMAGE5 = 403133309;
protected final static int ID_PANEL26 = 170127749;
protected final static int ID_ATTIMAGE6 = 965168544;
protected final static int ID_ATTPANEL3 = 878201566;
protected final static int ID_PANEL27 = 384382256;
protected final static int ID_ATTIMAGE7 = 264614408;
protected final static int ID_PANEL28 = 1858473241;
protected final static int ID_ATTIMAGE8 = 363895553;
protected final static int ID_PANEL29 = 1149049059;
protected final static int ID_ATTIMAGE9 = 747922517;
protected final static int ID_WIDGET0 = 441283493;
protected final static int ID_WIDGET0_BUTTON0 = 1294650188;
protected final static int ID_WIDGET0_BUTTON1 = 163966274;
protected final static int ID_WIDGET0_BUTTON2 = 1950199665;

	
	
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
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("Scrollview_total",ID_SCROLLVIEW_TOTAL);
  idmap.put("total",ID_TOTAL);
  idmap.put("div1",ID_DIV1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("brpanel0",ID_BRPANEL0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("label12",ID_LABEL12);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("brpanel2",ID_BRPANEL2);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label14",ID_LABEL14);
  idmap.put("label15",ID_LABEL15);
  idmap.put("label16",ID_LABEL16);
  idmap.put("image3",ID_IMAGE3);
  idmap.put("brpanel3",ID_BRPANEL3);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label31",ID_LABEL31);
  idmap.put("label32",ID_LABEL32);
  idmap.put("label33",ID_LABEL33);
  idmap.put("label34",ID_LABEL34);
  idmap.put("image6",ID_IMAGE6);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("div2",ID_DIV2);
  idmap.put("brpanel4",ID_BRPANEL4);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label21",ID_LABEL21);
  idmap.put("label22",ID_LABEL22);
  idmap.put("label23",ID_LABEL23);
  idmap.put("label24",ID_LABEL24);
  idmap.put("image5",ID_IMAGE5);
  idmap.put("brpanel5",ID_BRPANEL5);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label25",ID_LABEL25);
  idmap.put("label26",ID_LABEL26);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("brpanel6",ID_BRPANEL6);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label29",ID_LABEL29);
  idmap.put("label30",ID_LABEL30);
  idmap.put("dateinput0",ID_DATEINPUT0);
  idmap.put("brpanel7",ID_BRPANEL7);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("panel15",ID_PANEL15);
  idmap.put("day1",ID_DAY1);
  idmap.put("panel16",ID_PANEL16);
  idmap.put("day3",ID_DAY3);
  idmap.put("panel17",ID_PANEL17);
  idmap.put("day5",ID_DAY5);
  idmap.put("brpanel8",ID_BRPANEL8);
  idmap.put("panel14",ID_PANEL14);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label18",ID_LABEL18);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel18",ID_PANEL18);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label27",ID_LABEL27);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("panel10",ID_PANEL10);
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
,"title","新隐患"
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
,"halign","center"
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
,"layout-type","linear"
,"width","0"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44.0"
,"font-size","17"
,"value","提交"
,"onclick","action:button1_onclick"
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionButton1_onclick(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
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
panel0.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
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
panel0.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
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
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("proj_no"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel0.addView(label4);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
panel0.addView(label5);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src",""
);
panel0.addView(image0);

return panel0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel2_onclick"
,"valign","center"
);
panel2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionPanel2_onclick(panel2,args);

}
});
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
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
panel2.addView(label9);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
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
panel2.addView(label10);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"content","选择"
,"bindfield","ope_area_desc"
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
UMTextBinder label11_binder = new UMTextBinder((IUMContextAccessor)context);
label11_binder.setBindInfo(new BindInfo("ope_area_desc"));
label11_binder.setControl(label11);
binderGroup.addBinderToGroup(ID_LABEL11, label11_binder);
panel2.addView(label11);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
panel2.addView(label12);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
panel2.addView(image2);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel3_onclick"
,"valign","center"
);
panel3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionPanel3_onclick(panel3,args);

}
});
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
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
panel3.addView(label13);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
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
panel3.addView(label14);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"content","选择"
,"bindfield","org_desc"
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
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("org_desc"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
panel3.addView(label15);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"onclick",""
,"font-family","default"
,"valign","center"
);
panel3.addView(label16);
image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE3
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
panel3.addView(image3);

return panel3;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel12_onclick"
,"valign","center"
);
panel12.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionPanel12_onclick(panel12,args);

}
});
label31 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL31
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
panel12.addView(label31);
label32 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL32
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
panel12.addView(label32);
label33 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL33
,"content","选择"
,"bindfield","name"
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
UMTextBinder label33_binder = new UMTextBinder((IUMContextAccessor)context);
label33_binder.setBindInfo(new BindInfo("name"));
label33_binder.setControl(label33);
binderGroup.addBinderToGroup(ID_LABEL33, label33_binder);
panel12.addView(label33);
label34 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL34
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","12"
,"font-family","default"
,"valign","center"
);
panel12.addView(label34);
image6 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE6
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
panel12.addView(image6);

return panel12;
}
public View getDiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DIV1
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","180"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","24"
,"margin-top","24"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
div1.addView(panel0);
brpanel0 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL0
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
div1.addView(panel2);
brpanel2 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL2
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
div1.addView(panel3);
brpanel3 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL3
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(brpanel3);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
div1.addView(panel12);
panel13 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL13
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div1.addView(panel13);

return div1;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel5_onclick"
,"valign","center"
);
panel5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionPanel5_onclick(panel5,args);

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
panel5.addView(label21);
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
panel5.addView(label22);
label23 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL23
,"content","细化"
,"bindfield","type_describe"
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
label23_binder.setBindInfo(new BindInfo("type_describe"));
label23_binder.setControl(label23);
binderGroup.addBinderToGroup(ID_LABEL23, label23_binder);
panel5.addView(label23);
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
panel5.addView(label24);
image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE5
,"height","44"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","row_indicator.png"
);
panel5.addView(image5);

return panel5;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"height","44"
,"layout","hbox"
,"width","88"
,"valign","center"
);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"bindfield","safe_yh_level"
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
,"value","0"
,"font-family","default"
,"texton","一般"
,"valign","center"
,"checked","true"
);
UMToggleButtonBinder togglebutton0_binder = new UMToggleButtonBinder((IUMContextAccessor)context);
togglebutton0_binder.setBindInfo(new BindInfo("safe_yh_level"));
togglebutton0_binder.setControl(togglebutton0);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTON0, togglebutton0_binder);
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"bindfield","safe_yh_level"
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
,"value","1"
,"font-family","default"
,"texton","重大"
,"valign","center"
);
UMToggleButtonBinder togglebutton1_binder = new UMToggleButtonBinder((IUMContextAccessor)context);
togglebutton1_binder.setBindInfo(new BindInfo("safe_yh_level"));
togglebutton1_binder.setControl(togglebutton1);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTON1, togglebutton1_binder);
togglebuttongroup0.addView(togglebutton1);

return togglebuttongroup0;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
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
panel6.addView(label25);
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
panel6.addView(label26);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
panel6.addView(togglebuttongroup0);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
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
panel7.addView(label29);
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
panel7.addView(label30);
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
,"background","#ffffff"
,"font-size","15"
,"value","2015-04-22"
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("rectification_period"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
panel7.addView(dateinput0);

return panel7;
}
public View getPanel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel15 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL15
,"halign","center"
,"height","30"
,"weight","1"
,"layout-type","linear"
,"width","0"
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
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View panel15 = (View) getPanel15View((UMActivity)context,binderGroup,configure);
panel8.addView(panel15);
View panel16 = (View) getPanel16View((UMActivity)context,binderGroup,configure);
panel8.addView(panel16);
View panel17 = (View) getPanel17View((UMActivity)context,binderGroup,configure);
panel8.addView(panel17);

return panel8;
}
public View getDiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
div2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DIV2
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","180"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
brpanel4 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL4
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
div2.addView(panel5);
brpanel5 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL5
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
div2.addView(panel6);
brpanel6 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL6
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
div2.addView(panel7);
brpanel7 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL7
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel7);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
div2.addView(panel8);
brpanel8 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_BRPANEL8
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
div2.addView(brpanel8);
panel14 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL14
,"height","60.0"
,"layout-type","linear"
,"width","120.0"
);
div2.addView(panel14);

return div2;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","action:panel4_onclick"
,"margin-top","24"
,"valign","center"
);
panel4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionPanel4_onclick(panel4,args);

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
panel4.addView(label17);
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
panel4.addView(label18);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","btn_add_touch"
,"width","44"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:button2_onclick"
,"font-family","default"
,"valign","center"
,"background-image","btn_add"
);
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(NewTroubleActivity.this);
    actionButton2_onclick(button2,args);

}
});
panel4.addView(button2);

return panel4;
}
public View getPanel18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel18 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL18
,"height","80"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
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
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("sendperson"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel18.addView(label1);

return panel18;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","15"
,"padding-right","15"
,"padding-top","24"
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
panel9.addView(label27);

return panel9;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"padding-left","15"
,"padding-right","15"
,"padding-top","24"
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
panel10.addView(label28);

return panel10;
}
public View getPanel22View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel22 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL22
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"padding-right","15"
,"padding-left","15"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"padding-left","15"
,"padding-right","15"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
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
,"height","80"
,"layout-type","linear"
,"width","fill"
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
,"height","wrap"
,"layout-type","linear"
,"width","fill"
);
View div1 = (View) getDiv1View((UMActivity)context,binderGroup,configure);
total.addView(div1);
View div2 = (View) getDiv2View((UMActivity)context,binderGroup,configure);
total.addView(div2);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
total.addView(panel4);
panel1 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL1
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
total.addView(panel1);
View panel18 = (View) getPanel18View((UMActivity)context,binderGroup,configure);
total.addView(panel18);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
total.addView(panel9);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"bindfield","hazard_desc"
,"padding-left","4"
,"padding-right","4"
,"padding-top","14"
,"halign","LEFT"
,"placeholder","（非必填）"
,"width","fill"
,"padding-bottom","14"
,"height","100"
,"color","#333333"
,"background","#ffffff"
,"font-size","15"
,"layout-type","linear"
,"font-family","default"
);
UMTextBinder textarea0_binder = new UMTextBinder((IUMContextAccessor)context);
textarea0_binder.setBindInfo(new BindInfo("hazard_desc"));
textarea0_binder.setControl(textarea0);
binderGroup.addBinderToGroup(ID_TEXTAREA0, textarea0_binder);
total.addView(textarea0);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
total.addView(panel10);
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
,"layout-type","vbox"
,"background","#f7f8f8"
,"width","fill"
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
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
NewTrouble.addView(viewPage0);

return (UMWindow)NewTrouble;
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
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
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
public void actionPanel3_onclick(View control, UMEventArgs args) {
    String actionid = "panel3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "org()",UMActivity.getViewId(control),args);
}
public void actionPanel12_onclick(View control, UMEventArgs args) {
    String actionid = "panel12_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "person()",UMActivity.getViewId(control),args);
}
public void actionAttimage3_onclick(View control, UMEventArgs args) {
    String actionid = "attimage3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage4_onclick(View control, UMEventArgs args) {
    String actionid = "attimage4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
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
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage7_onclick(View control, UMEventArgs args) {
    String actionid = "attimage7_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage6_onclick(View control, UMEventArgs args) {
    String actionid = "attimage6_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage1_onclick(View control, UMEventArgs args) {
    String actionid = "attimage1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
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
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionAttimage5_onclick(View control, UMEventArgs args) {
    String actionid = "attimage5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPic()",UMActivity.getViewId(control),args);
}
public void actionPanel2_onclick(View control, UMEventArgs args) {
    String actionid = "panel2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "area()",UMActivity.getViewId(control),args);
}
public void actionPanel4_onclick(View control, UMEventArgs args) {
    String actionid = "panel4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "sendPerson()",UMActivity.getViewId(control),args);
}
public void actionPanel5_onclick(View control, UMEventArgs args) {
    String actionid = "panel5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "type()",UMActivity.getViewId(control),args);
}
public void actionDay5_onclick(View control, UMEventArgs args) {
    String actionid = "day5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addDay()",UMActivity.getViewId(control),args);
}


}
