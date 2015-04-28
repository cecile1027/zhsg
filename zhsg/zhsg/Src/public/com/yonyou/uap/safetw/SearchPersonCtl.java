package com.yonyou.uap.safetw;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yonyou.uap.um.context.util.UmContextUtil;
import com.yonyou.uap.um.controller.AbstractUMController;
import com.yonyou.uap.um.gateway.service.GatewayServiceFactory;
import com.yonyou.uap.um.gateway.service.IGatewayService;

public class SearchPersonCtl extends AbstractUMController {
	
	@Override
	public String load(String arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(String arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 查询人员，显示列表
	 * 参数：<params>keytype:string|keyvalue:string</params>
	 * keytype：枚举:全部all;部门deptname;姓名personname;工位officeno;办公电话 telephone;电子邮件mailbox;
	 * @param args
	 * @return
	 * @throws Exception
	 */
	public String searchPersonlist(String args) throws Exception {
		String resultStr = "";
		JSONObject jsonObj = new JSONObject(args);
		Map map = UmContextUtil.transJsonToMap(jsonObj);
		String keytype = jsonObj.getString("keytype");
		String keyvalue = jsonObj.getString("keyvalue");
		
		SearchPersonSV searchPersonSV=new 	SearchPersonSV();
		searchPersonSV.searchPersonlist(keytype, keyvalue);
		
		List<Map<String, Object>> retList = searchPersonSV.searchPersonlist(keytype, keyvalue);
		
		Map retMap = retList.get(0);
		
		
		resultStr = ControllerUtil.transMapToJson(retMap).toString();
		
		//resultStr = UmContextUtil.transMapToJson(retMap).toString();
		
		
		return resultStr;
	}
	
	/**
	 * 查询人员详情
	 * 参数：<params>id:string</params>
	 * @param args
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String searchPersondetail(String args) throws Exception {
		String resultStr = "";
		JSONObject jsonObj = new JSONObject(args);
		Map map = UmContextUtil.transJsonToMap(jsonObj);
		String id = jsonObj.getString("id");


		SearchPersonSV searchPersonSV=new 	SearchPersonSV();
		
		List<Map<String, String>> retList = searchPersonSV.searchPersondetail(id);
		
		Map retMap = retList.get(0);
		
		
		resultStr = ControllerUtil.transMapToJson(retMap).toString();
		return resultStr;
	}


}
