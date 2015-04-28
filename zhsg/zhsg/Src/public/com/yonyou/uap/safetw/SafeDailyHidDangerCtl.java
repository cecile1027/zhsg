package com.yonyou.uap.safetw;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yonyou.mb.safetw.vo.SafeDailyHidDangerVO;
import com.yonyou.uap.um.context.util.UmContextUtil;
import com.yonyou.uap.um.controller.AbstractUMController;
import com.yonyou.uap.um.gateway.service.GatewayServiceFactory;
import com.yonyou.uap.um.gateway.service.IGatewayService;

public class SafeDailyHidDangerCtl{
	
	public String load(String arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}  

	public String save(String arg0){
		// TODO Auto-generated method stub
		JSONObject jsonObj = new JSONObject(arg0);  
		String msg = "";
		Object dd = jsonObj.get("params");
		JSONObject obj = new JSONObject(dd.toString());
		String proj_no = obj.getString("proj_no");
		String ope_area_no = obj.getString("ope_area_no");
		String respon_unit = obj.getString("respon_unit");  
		String duty_officer = obj.getString("duty_officer");
		String yh_type = obj.getString("yh_type");
		String yh_sub_type = obj.getString("yh_sub_type");  
		String safe_yh_level = obj.getString("safe_yh_level");
		String rectification_period = obj.getString("rectification_period");
		String hazard_desc = obj.getString("hazard_desc");  
		String drafter = obj.getString("drafter");  
		String rowstate ="Created";
		Date draft_date =new Date();
		Date rowversion =new Date();
		SafeDailyHidDangerVO vo =new SafeDailyHidDangerVO();
		vo.setProj_no(proj_no);
		vo.setDraft_date(draft_date);
		vo.setDrafter(drafter);
		vo.setDuty_officer(duty_officer);
		vo.setHazard_desc(hazard_desc);
		vo.setOpe_area_no(ope_area_no);
		vo.setRespon_unit(respon_unit);
		vo.setRowstate(rowstate);
		vo.setRowversion(rowversion);
		vo.setYh_sub_type(yh_sub_type);
		vo.setYh_sub_type(yh_sub_type);
		SafeDailyHidDangerSV sv =new SafeDailyHidDangerSV();
		try {
			sv.insertSafeDailyHidDanger(vo);
		} catch (DAOException e) {
			// TODO 自动生成的 catch 块
			msg += e.getMessage();
		}
		if (msg == "") {
			msg = "save success!";
		}
		return "{data:\"" + msg + "\"}";
	}
	
	/**
	 * 查询安全隐患，显示列表
	 * 参数：<params>keytype:string|keyvalue:string</params>
	 * @param args
	 * @return
	 * @throws Exception
	 */
	public String searchSafeDailyHidDangerlist(String args) throws Exception {
		String resultStr = "";
		JSONObject jsonObj = new JSONObject(args);
		Map map = UmContextUtil.transJsonToMap(jsonObj);
		String keytype = jsonObj.getString("keytype");
		String keyvalue = jsonObj.getString("keyvalue");
		String userName = jsonObj.getString("username");
		SafeDailyHidDangerSV safeDailyHidDangerSV=new 	SafeDailyHidDangerSV();
		
		List<Map<String, Object>> retList = safeDailyHidDangerSV.searchSafeDailyHidDangerlist(keytype, keyvalue, userName);
		
		Map retMap = retList.get(0);
		
		
		resultStr = ControllerUtil.transMapToJson(retMap).toString();
		
		//resultStr = UmContextUtil.transMapToJson(retMap).toString();
		
		return resultStr;
	}    
	
}
