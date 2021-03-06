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

public abstract class OrgRefActivity extends UMWindowActivity {

	protected UMWindow OrgRef = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button1 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected UMSearchControl search0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel2 = null;

	
	protected final static int ID_ORGREF = 1105837393;
protected final static int ID_VIEWPAGE0 = 822521819;
protected final static int ID_NAVIGATORBAR0 = 335170436;
protected final static int ID_BUTTON1 = 1688991608;
protected final static int ID_LABEL0 = 1397310643;
protected final static int ID_BUTTON0 = 61377841;
protected final static int ID_SEARCH0 = 1389508103;
protected final static int ID_LISTVIEWDEFINE0 = 1853774272;
protected final static int ID_PANEL0 = 1074573596;
protected final static int ID_PANEL1 = 492425304;
protected final static int ID_LABEL1 = 175148591;
protected final static int ID_LABEL2 = 1085129754;
protected final static int ID_PANEL2 = 1454819309;

	
	
	@Override
	public String getControllerName() {
		return "OrgRefController";
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
		  idmap.put("OrgRef",ID_ORGREF);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("search0",ID_SEARCH0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel2",ID_PANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(OrgRefActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

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
,"title","责任单位"
,"height","44.0"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"background","#2d5aa7"
,"font-family","default"
,"valign","center"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","44"
,"color","#00a1ea"
,"layout-type","linear"
,"width","44"
,"font-size","17"
,"onclick","action:button1_onclick"
,"font-family","default"
,"font-pressed-color","#459dfe"
,"valign","center"
,"background-image","back.png"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(OrgRefActivity.this);
    actionButton1_onclick(button1,args);

}
});
navigatorbar0.addView(button1);
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
,"background-image","more.png"
);
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(OrgRefActivity.this);
    actionButton0_onclick(button0,args);

}
});
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-right","15"
,"padding-left","15"
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","respon_unit"
,"halign","left"
,"widthwrap","32.0"
,"width","wrap"
,"content","编码"
,"margin-right","20"
,"height","wrap"
,"color","#595757"
,"heightwrap","22.0"
,"font-size","15"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("respon_unit"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel1.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","respon_unit_desc"
,"halign","left"
,"weight","1"
,"width","0"
,"content","名称"
,"height","wrap"
,"color","#595757"
,"heightwrap","22.0"
,"font-size","15"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("respon_unit_desc"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel1.addView(label2);

return panel1;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","45"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"halign","LEFT"
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
,"valign","center"
);
panel0.addView(panel2);

return panel0;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","list"
,"halign","center"
,"weight","1"
,"height","0"
,"onload","action:listviewdefine0_onload"
,"layout","vbox"
,"width","fill"
,"onitemclick","action:listviewdefine0_onitemclick"
,"valign","TOP"
);
UMListBinder listviewdefine0_binder = new UMListBinder((IUMContextAccessor)context);
listviewdefine0_binder.setBindInfo(new BindInfo("list"));
listviewdefine0_binder.setControl(listviewdefine0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0, listviewdefine0_binder);
listviewdefine0.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(OrgRefActivity.this);
    args.put(parent);
    actionListviewdefine0_onitemclick(listviewdefine0,args);

}
});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
return panel0;
}});

return listviewdefine0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#f7f8f8"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
search0 = (UMSearchControl)ThirdControl.createControl(new UMSearchControl(context),ID_SEARCH0
,"placeholder","搜索"
,"localstorage","true"
,"font","default"
,"width","fill"
,"height","44"
,"search-btn-icon","search_left.png"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"search-del-icon","search_right.png"
,"onsearch","action:search0_onsearch"
,"background-image","search_bg"
);
search0.setEvent("onsearch", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(OrgRefActivity.this);
    args.put(parent);
    actionSearch0_onsearch(search0,args);

}
});
viewPage0.addView(search0);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listviewdefine0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
OrgRef = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ORGREF
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
,"controller","OrgRefController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
OrgRef.addView(viewPage0);

return (UMWindow)OrgRef;
}

	
	public void actionSearch0_onsearch(View control, UMEventArgs args) {
    String actionid = "search0_onsearch";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "search()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "more()",UMActivity.getViewId(control),args);
}
public void actionButton1_onclick(View control, UMEventArgs args) {
    String actionid = "button1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "back()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadList()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onitemclick(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onitemclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "itemClick()",UMActivity.getViewId(control),args);
}


}
