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
protected UMTextbox textbox0 = null;
protected XRelativeLayout panel1 = null;
protected XHorizontalLayout panel2 = null;
protected UMPassword textbox1 = null;
protected UMButton showButton = null;

	
	protected final static int ID_LOGIN = 1736799951;
protected final static int ID_VIEWPAGE0 = 591450724;
protected final static int ID_NAVIGATORBAR0 = 485785294;
protected final static int ID_LABEL0 = 1300335996;
protected final static int ID_BUTTON0 = 506795068;
protected final static int ID_PANEL0 = 1583517924;
protected final static int ID_TEXTBOX0 = 2029003568;
protected final static int ID_PANEL1 = 63173799;
protected final static int ID_PANEL2 = 1801807233;
protected final static int ID_TEXTBOX1 = 849908920;
protected final static int ID_SHOWBUTTON = 1172682982;

	
	
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
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("showButton",ID_SHOWBUTTON);

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
,"title","账号"
,"height","44.0"
,"color","#ffffff"
,"width","fill"
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
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
textbox1 = (UMPassword)ThirdControl.createControl(new UMPassword(context),ID_TEXTBOX1
,"bindfield","password"
,"padding-left","15"
,"padding-right","8"
,"halign","LEFT"
,"weight","1"
,"placeholder","密码"
,"width","0"
,"onchange","action:textbox1_onchange"
,"maxlength","256"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"background","#ffffff"
,"font-family","default"
);
UMTextBinder textbox1_binder = new UMTextBinder((IUMContextAccessor)context);
textbox1_binder.setBindInfo(new BindInfo("password"));
textbox1_binder.setControl(textbox1);
binderGroup.addBinderToGroup(ID_TEXTBOX1, textbox1_binder);
textbox1.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(LoginActivity.this);
    args.put(parent);
    actionTextbox1_onchange(textbox1,args);

}
});
panel2.addView(textbox1);
showButton = (UMButton)ThirdControl.createControl(new UMButton(context),ID_SHOWBUTTON
,"halign","center"
,"widthwrap","44.0"
,"visible","false"
,"pressed-image","pw_hidden.png"
,"width","wrap"
,"font-pressed-color","#459dfe"
,"margin-right","8"
,"height","44"
,"color","#00a1ea"
,"layout-type","linear"
,"font-size","17"
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
panel0.addView(textbox0);
panel1 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL1
,"height","1"
,"layout-type","linear"
,"background","#f1f1f1"
,"width","fill"
);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);

return panel0;
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
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Login.addView(viewPage0);

return (UMWindow)Login;
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
public void actionTextbox1_onchange(View control, UMEventArgs args) {
    String actionid = "textbox1_onchange";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "passwordChange()",UMActivity.getViewId(control),args);
}


}
