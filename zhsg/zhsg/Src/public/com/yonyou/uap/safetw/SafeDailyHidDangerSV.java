package com.yonyou.uap.safetw;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.oscar.jdbcx.optional.BaseDataSource;
import com.yonyou.mb.safetw.vo.SafeDailyHidDangerVO;

import bsh.This;

  
public class SafeDailyHidDangerSV {
	private static final Log logger = LogFactory.getLog(SafeDailyHidDangerSV.class);

	public List<Map<String, Object>> searchSafeDailyHidDangerlist(String keytype,
			String keyvalue,String userName) {
		
		keytype = keytype.trim().toLowerCase();
		keyvalue = keyvalue.trim();
		ArrayList<Map<String, Object>> dataMapList = new ArrayList<Map<String, Object>>();
		String tableName = "SAFE_DAILY_HID_DANGER_UM";
		     
//		logger.error("keytype：" + keytype);    
//		logger.error("keyvalue：" + keyvalue);

		String strwhere = "";     
		if (keytype.equalsIgnoreCase("searchCreated")) {    
			strwhere = " safe_yh_level like '%" + keyvalue + "%'";
			strwhere += " or  ope_area_desc like '%" + keyvalue + "%'"; 
			strwhere += " or hazard_desc like '%" + keyvalue + "%'";
			strwhere += " and rowstate = 'Created' AND " ;
		} else if (keytype.equalsIgnoreCase("searchIssued")) {
			strwhere = " safe_yh_level like '%" + keyvalue + "%'";
			strwhere += " or  ope_area_desc like '%" + keyvalue + "%'"; 
			strwhere += " or hazard_desc like '%" + keyvalue + "%'";
			strwhere += " and rowstate = 'Issued' AND ";
		} else if (keytype.equalsIgnoreCase("searchRectificated")) {
			strwhere = " safe_yh_level like '%" + keyvalue + "%'";
			strwhere += " or  ope_area_desc like '%" + keyvalue + "%'"; 
			strwhere += " or hazard_desc like '%" + keyvalue + "%'";
			strwhere += " and rowstate = 'Rectificated' AND ";
		} else if (keytype.equalsIgnoreCase("searchClosed")) {
			strwhere = " safe_yh_level like '%" + keyvalue + "%'";
			strwhere += " or  ope_area_desc like '%" + keyvalue + "%'"; 
			strwhere += " or hazard_desc like '%" + keyvalue + "%'";
			strwhere += " and rowstate = 'Closed' AND ";  
		} else if (keytype.equalsIgnoreCase("Created")) {
			strwhere += "rowstate = 'Created' AND ";  
		} else if (keytype.equalsIgnoreCase("Issued")) {
			strwhere += "rowstate = 'Created' AND ";   
		}  else if (keytype.equalsIgnoreCase("Rectificated")) {
			strwhere += "rowstate = 'Rectificated' AND ";  
		} else if (keytype.equalsIgnoreCase("Closed")) {
			strwhere += "rowstate = 'Closed' AND ";   
		} else if (keytype.equalsIgnoreCase("All")) {
			strwhere += " ";
		} else{
			strwhere =" 1=0 ";
		}    

		String sqlConditionStr = "select * from " + tableName + " where "
				+ strwhere + "( drafter = '"+userName+"' OR duty_officer = '"+userName+"')";  

//		logger.error("sqlConditionStr:" + sqlConditionStr);
		

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			resultMap.put("flag", "0");
			resultMap.put("des", "");
			
			resultMap.put("searchtype", keytype);
			resultMap.put("persons", new ArrayList<Map<String, String>>());
			
     		BaseDAO dao = new BaseDAO();
			List<SafeDailyHidDangerVO> safeDailyHidDangerVOs = (List<SafeDailyHidDangerVO>) dao.executeQuery( sqlConditionStr, new BeanListProcessor(SafeDailyHidDangerVO.class));
//     		List<SafeDailyHidDangerVO> safeDailyHidDangerVOs =new ArrayList<SafeDailyHidDangerVO>();
//     		SafeDailyHidDangerVO vo =new SafeDailyHidDangerVO();
//     		dao.executeQuery(sqlConditionStr, new ResultSetProcessor() {
//				@Override
//				public Object handleResultSet(ResultSet rs) throws SQLException {
//					// TODO 自动生成的方法存根
//					while (rs.next()) {  
//						vo.setProj_no(rs.getString(columnIndex))
//					}    
//				}
//			});	
			if (safeDailyHidDangerVOs != null && safeDailyHidDangerVOs.size() > 0) {
				for (SafeDailyHidDangerVO safeDailyHidDangerVO : safeDailyHidDangerVOs) {
					if (safeDailyHidDangerVO != null) {
						Map<String, Object> dataMap = new HashMap<String, Object>();

						dataMap.put("proj_no", safeDailyHidDangerVO.getProj_no()); // id
						dataMap.put("daily_hid_no", safeDailyHidDangerVO.getDaily_hid_no()); // 姓名
						dataMap.put("telephone", safeDailyHidDangerVO.getTelephone());// 部门
						dataMap.put("rectification_period", safeDailyHidDangerVO.getRectification_period()); // 办公电话
						dataMap.put("hazard_desc", safeDailyHidDangerVO.getHazard_desc());// 电子邮件
						dataMap.put("draft_date", safeDailyHidDangerVO.getDraft_date()); // 工位号
						dataMap.put("rectificate_draft_date", safeDailyHidDangerVO.getRectificate_draft_date());// 头像url
						dataMap.put("rectificate_result", safeDailyHidDangerVO.getRectificate_result()); // id
						dataMap.put("close_opinion", safeDailyHidDangerVO.getClose_opinion()); // 姓名
						dataMap.put("close_date", safeDailyHidDangerVO.getClose_date());// 部门
						dataMap.put("safe_yh_level", safeDailyHidDangerVO.getSafe_yh_level()); // 办公电话
						dataMap.put("ope_area_no", safeDailyHidDangerVO.getOpe_area_desc());// 电子邮件
						dataMap.put("ope_area_desc", safeDailyHidDangerVO.getOpe_area_desc()); // 工位号
						dataMap.put("respon_unit", safeDailyHidDangerVO.getRespon_unit());// 头像url
						dataMap.put("respon_unit_desc", safeDailyHidDangerVO.getRespon_unit_desc());// 电子邮件
						dataMap.put("duty_officer", safeDailyHidDangerVO.getDuty_officer()); // 工位号
						dataMap.put("duty_officer_name", safeDailyHidDangerVO.getDuty_officer_name());// 头像url
						dataMap.put("rectificate_result", safeDailyHidDangerVO.getRectificate_result()); // id
						dataMap.put("draft_unit", safeDailyHidDangerVO.getDraft_unit()); // 姓名
						dataMap.put("draft_dept", safeDailyHidDangerVO.getDraft_dept());// 部门
						dataMap.put("drafter", safeDailyHidDangerVO.getDrafter()); // 办公电话
						dataMap.put("rectificate_drafter", safeDailyHidDangerVO.getRectificate_drafter());// 电子邮件
						dataMap.put("close_person", safeDailyHidDangerVO.getClose_person()); // 工位号
						dataMap.put("yh_type", safeDailyHidDangerVO.getYh_type());// 头像url
						dataMap.put("yh_type_describe", safeDailyHidDangerVO.getYh_type_describe());// 电子邮件
						dataMap.put("yh_sub_type", safeDailyHidDangerVO.getYh_sub_type()); // 工位号
						dataMap.put("yh_sub_type_describe", safeDailyHidDangerVO.getYh_sub_type_describe());// 头像url
						dataMap.put("rowversion", safeDailyHidDangerVO.getRowversion()); // id
						dataMap.put("rowstate", safeDailyHidDangerVO.getRowstate()); // 姓名

						dataMapList.add(dataMap);
					}
				}
				resultMap.put("persons", dataMapList);
	
			}
		} catch (DAOException e) {
			resultMap.put("flag", "1");
			resultMap.put("des", "查询失败!");
			logger.error("调用人员查询服务失败" + e.getMessage());
		}
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		resultList.add(resultMap);
		return resultList;
	}

	public void insertSafeDailyHidDanger(SafeDailyHidDangerVO vo) throws DAOException {
		BaseDAO dao = new BaseDAO();
		String tableName = "SAFE_DAILY_HID_DANGER_TAB";
		String strwhere = "";    
		if(vo.getProj_no()!=null && vo.getDaily_hid_no()!=null && vo.getRowversion()!=null){
			strwhere = " (proj_no, daily_hid_no, telephone, rectification_period,hazard_desc,draft_date,rectificate_draft_date,rectificate_result,close_opinion,close_date,safe_yh_level,ope_area_no,respon_unit,duty_officer,draft_unit,draft_dept,drafter,rectificate_drafter,close_person,yh_type,yh_sub_type,rowversion,rowstate) ";
			strwhere += " VALUES ";
			strwhere +=" ('"+vo.getProj_no()+"','"+vo.getDaily_hid_no()+"','"+vo.getTelephone()+"','"+vo.getRectification_period()+"','"+vo.getHazard_desc()+"','"+vo.getDraft_date()+"','"+vo.getRectificate_draft_date()+"','"+vo.getRectificate_result()+"','"+vo.getClose_opinion()+"','"+vo.getClose_date()+"','"+vo.getSafe_yh_level()+"','"+vo.getOpe_area_no()+"','"+vo.getRespon_unit()+"','"+vo.getDuty_officer()+"','"+vo.getDraft_unit()+"','"+vo.getDraft_dept()+"','"+vo.getDrafter()+"','"+vo.getRectificate_drafter()+"','"+vo.getClose_person()+"','"+vo.getYh_type()+"','"+vo.getYh_sub_type()+"','"+vo.getRowversion()+"','"+vo.getRowstate()+"') ";
		}
		String sqlInsertStr ="insert into " + tableName + strwhere;
		dao.executeUpdate(sqlInsertStr);
	}
}
