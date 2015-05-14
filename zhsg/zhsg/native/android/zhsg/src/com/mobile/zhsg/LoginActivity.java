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

public abstract class LoginActivity extends UMWindowActivity {

	protected UMWindow Login = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout panel1 = null;
protected UMTextbox textbox0 = null;
protected XHorizontalLayout panel3 = null;
protected XHorizontalLayout panel2 = null;
protected UMPassword pwinput = null;
protected UMTextbox textinput = null;
protected UMButton showButton = null;

	
	protected final static int ID_LOGIN = 1982090877;
protected final static int ID_VIEWPAGE0 = 201914140;
protected final static int ID_NAVIGATORBAR0 = 1588845567;
protected final static int ID_LABEL0 = 922647250;
protected final static int ID_BUTTON0 = 2088028882;
protected final static int ID_PANEL0 = 1469654165;
protected final static int ID_PANEL1 = 359351178;
protected final static int ID_TEXTBOX0 = 1052712540;
protected final static int ID_PANEL3 = 1171847009;
protected final static int ID_PANEL2 = 2074360710;
protected final static int ID_PWINPUT = 215905667;
protected final static int ID_TEXTINPUT = 1630068953;
protected final static int ID_SHOWBUTTON = 967338346;

	
	
	@Override
	public String getControllerName() {
		return "LoginController";
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
		  idmap.put("Login",ID_LOGIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("pwinput",ID_PWINPUT);
  idmap.put("textinput",ID_TEXTINPUT);
  idmap.put("showButton",ID_SHOWBUTTON);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - action:viewpage0_onload
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
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
,"title","安全巡检"
,"height","44.0"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"background","#2d5aa7"
,"font-family","default"
,"valign","center"
);
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
,"halign","center"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"width","44"
,"font-size","16"
,"value","登陆"
,"onclick","action:button0_onclick"
,"font-family","default"
,"font-pressed-color","#00a1ea"
,"valign","center"
);
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
    actionButton0_onclick(button0,args);

}
});
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","45"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
,"valign","TOP"
);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"bindfield","username"
,"padding-left","15"
,"padding-right","15"
,"halign","LEFT"
,"placeholder","用户名"
,"width","fill"
,"maxlength","256"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","15"
,"font-family","default"
);
UMTextBinder textbox0_binder = new UMTextBinder((IUMContextAccessor)context);
textbox0_binder.setBindInfo(new BindInfo("username"));
textbox0_binder.setControl(textbox0);
binderGroup.addBinderToGroup(ID_TEXTBOX0, textbox0_binder);
panel1.addView(textbox0);
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"halign","LEFT"
,"height","1"
,"layout-type","linear"
,"width","fill"
,"background","#d8d8d8"
,"valign","center"
);
panel1.addView(panel3);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"halign","LEFT"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
pwinput = (UMPassword)ThirdControl.createControl(new UMPassword(context),ID_PWINPUT
,"bindfield","password"
,"padding-left","15"
,"padding-right","8"
,"halign","LEFT"
,"weight","1"
,"placeholder","密码"
,"width","0"
,"onchange","action:pwinput_onchange"
,"maxlength","256"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"background","#ffffff"
,"font-family","default"
);
UMTextBinder pwinput_binder = new UMTextBinder((IUMContextAccessor)context);
pwinput_binder.setBindInfo(new BindInfo("password"));
pwinput_binder.setControl(pwinput);
binderGroup.addBinderToGroup(ID_PWINPUT, pwinput_binder);
pwinput.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
    args.put(parent);
    actionPwinput_onchange(pwinput,args);

}
});
panel2.addView(pwinput);
textinput = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTINPUT
,"padding-right","8"
,"padding-left","15"
,"halign","LEFT"
,"weight","1"
,"placeholder","文本输入框"
,"width","0"
,"display","none"
,"onchange","action:textinput_onchange"
,"maxlength","256"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","15"
,"font-family","default"
);
textinput.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
    args.put(parent);
    actionTextinput_onchange(textinput,args);

}
});
panel2.addView(textinput);
showButton = (UMButton)ThirdControl.createControl(new UMButton(context),ID_SHOWBUTTON
,"halign","center"
,"width","44.0"
,"font-pressed-color","#459dfe"
,"margin-right","8"
,"height","44"
,"color","#00a1ea"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:showbutton_onclick"
,"font-family","default"
,"valign","center"
,"background-image","pw_show.png"
);
showButton.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
    actionShowbutton_onclick(showButton,args);

}
});
panel2.addView(showButton);

return panel2;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","90"
,"layout-type","linear"
,"width","fill"
,"margin-top","24"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","action:viewpage0_onload"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
,"background-image","bg.png"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Login = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_LOGIN
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
,"controller","LoginController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Login.addView(viewPage0);

return (UMWindow)Login;
}

	
	public void actionPwinput_onchange(View control, UMEventArgs args) {
    String actionid = "pwinput_onchange";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "passwordChange()",UMActivity.getViewId(control),args);
}
public void actionShowbutton_onclick(View control, UMEventArgs args) {
    String actionid = "showbutton_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "showPassword()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "login()",UMActivity.getViewId(control),args);
}
public void actionTextinput_onchange(View control, UMEventArgs args) {
    String actionid = "textinput_onchange";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "passwordChange()",UMActivity.getViewId(control),args);
}
public void actionViewpage0_onload(View control, UMEventArgs args) {
    String actionid = "viewpage0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load()",UMActivity.getViewId(control),args);
}


}
