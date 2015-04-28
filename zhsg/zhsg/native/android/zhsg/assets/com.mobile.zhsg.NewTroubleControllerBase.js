//JavaScript Framework 2.0 Code
Type.registerNamespace('com.mobile.zhsg.NewTroubleControllerBase');
com.mobile.zhsg.NewTroubleControllerBase = function() {
    //Step 1：inherit the base class
    var args = {
        "context" : "",
        "controller" : "NewTroubleController",
        "namespace" : "com.mobile.zhsg"
    };
    com.mobile.zhsg.NewTroubleControllerBase.initializeBase(this,[args]);
}
com.mobile.zhsg.NewTroubleControllerBase.prototype = {
};
com.mobile.zhsg.NewTroubleControllerBase.registerClass('com.mobile.zhsg.NewTroubleControllerBase',UMP.UI.Mvc.ControllerBase);
