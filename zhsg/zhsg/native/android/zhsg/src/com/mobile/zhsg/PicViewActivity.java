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

public abstract class PicViewActivity extends UMWindowActivity {

	protected UMWindow PicView = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel1 = null;
protected UMImageFlipper imageflipper0 = null;
protected UMImageFlipperItem imageflipper0_0 = null;
protected UMImageFlipperItem imageflipper0_1 = null;
protected UMImageFlipperItem imageflipper0_2 = null;

	
	protected final static int ID_PICVIEW = 1735738798;
protected final static int ID_VIEWPAGE0 = 552210707;
protected final static int ID_NAVIGATORBAR0 = 314019346;
protected final static int ID_BUTTON0 = 613575113;
protected final static int ID_PANEL0 = 185840583;
protected final static int ID_LABEL0 = 843751826;
protected final static int ID_BUTTON1 = 1632425839;
protected final static int ID_PANEL1 = 1579539564;
protected final static int ID_IMAGEFLIPPER0 = 2106685614;
protected final static int ID_IMAGEFLIPPER0_0 = 1140152908;
protected final static int ID_IMAGEFLIPPER0_1 = 860168373;
protected final static int ID_IMAGEFLIPPER0_2 = 1757970288;

	
	
	@Override
	public String getControllerName() {
		return "PicViewController";
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
		  idmap.put("PicView",ID_PICVIEW);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("imageflipper0",ID_IMAGEFLIPPER0);
  idmap.put("imageflipper0_0",ID_IMAGEFLIPPER0_0);
  idmap.put("imageflipper0_1",ID_IMAGEFLIPPER0_1);
  idmap.put("imageflipper0_2",ID_IMAGEFLIPPER0_2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //imageflipper0 - action:imageflipper0_onload
    UMEventArgs args = new UMEventArgs(PicViewActivity.this);
    actionImageflipper0_onload(imageflipper0,args);

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
	
	
	
	public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","CENTER"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","2/2"
,"halign","center"
,"height","wrap"
,"widthwrap","23.0"
,"color","#ffffff"
,"heightwrap","25.0"
,"layout-type","linear"
,"font-size","17"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel0.addView(label0);

return panel0;
}
public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","0"
,"padding-right","0"
,"halign","LEFT"
,"height","44.0"
,"color","#ffffff"
,"width","fill"
,"font-size","17"
,"background","#2d5aa7"
,"layout-type","linear"
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
    UMEventArgs args = new UMEventArgs(PicViewActivity.this);
    actionButton0_onclick(button0,args);

}
});
navigatorbar0.addView(button0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
navigatorbar0.addView(panel0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","delete_pressed.png"
,"width","44.0"
,"font-pressed-color","#459dfe"
,"height","44"
,"color","#ffffff"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:button1_onclick"
,"font-family","default"
,"valign","center"
,"background-image","delete.png"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(PicViewActivity.this);
    actionButton1_onclick(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getImageflipper0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
imageflipper0 = (UMImageFlipper)ThirdControl.createControl(new UMImageFlipper(context),ID_IMAGEFLIPPER0
,"bindfield","images"
,"descheight","0"
,"interval","2000"
,"flipperbtnvisible","false"
,"width","fill"
,"isloop","true"
,"autoflip","false"
,"titleheight","0"
,"height","fill"
,"onload","action:imageflipper0_onload"
,"onnextflipper","action:imageflipper0_onnextflipper"
,"layout-type","linear"
,"onpreviousflipper","action:imageflipper0_onpreviousflipper"
,"scaletype","fitcenter"
);
UMImageFlipperBinder imageflipper0_binder = new UMImageFlipperBinder((IUMContextAccessor)context);
imageflipper0_binder.setBindInfo(new BindInfo("images"));
imageflipper0_binder.setControl(imageflipper0);
binderGroup.addBinderToGroup(ID_IMAGEFLIPPER0, imageflipper0_binder);
imageflipper0.setEvent("onnextflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(PicViewActivity.this);
    args.put(parent);
    actionImageflipper0_onnextflipper(imageflipper0,args);

}
});
imageflipper0.setEvent("onpreviousflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(PicViewActivity.this);
    args.put(parent);
    actionImageflipper0_onpreviousflipper(imageflipper0,args);

}
});
imageflipper0_0 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_0
,"title","标题"
,"description",""
,"layout-type","linear"
,"src",""
);
imageflipper0.addView(imageflipper0_0);
imageflipper0_1 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_1
,"title","标题"
,"description",""
,"layout-type","linear"
,"src",""
);
imageflipper0.addView(imageflipper0_1);
imageflipper0_2 = (UMImageFlipperItem)ThirdControl.createControl(new UMImageFlipperItem(context),ID_IMAGEFLIPPER0_2
,"title","标题"
,"description",""
,"layout-type","linear"
,"src",""
);
imageflipper0.addView(imageflipper0_2);

return imageflipper0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#f7f8f8"
,"width","fill"
,"valign","CENTER"
);
View imageflipper0 = (View) getImageflipper0View((UMActivity)context,binderGroup,configure);
panel1.addView(imageflipper0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#F5F5F5"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
PicView = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PICVIEW
,"halign","center"
,"height","fill"
,"width","fill"
,"layout","vbox"
,"controller","PicViewController"
,"valign","TOP"
,"namespace","com.mobile.zhsg"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
PicView.addView(viewPage0);

return (UMWindow)PicView;
}

	
	public void actionImageflipper0_onnextflipper(View control, UMEventArgs args) {
    String actionid = "imageflipper0_onnextflipper";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "next()",UMActivity.getViewId(control),args);
}
public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "back()",UMActivity.getViewId(control),args);
}
public void actionImageflipper0_onpreviousflipper(View control, UMEventArgs args) {
    String actionid = "imageflipper0_onpreviousflipper";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "previous()",UMActivity.getViewId(control),args);
}
public void actionButton1_onclick(View control, UMEventArgs args) {
    String actionid = "button1_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "delPic()",UMActivity.getViewId(control),args);
}
public void actionImageflipper0_onload(View control, UMEventArgs args) {
    String actionid = "imageflipper0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadPic()",UMActivity.getViewId(control),args);
}


}
