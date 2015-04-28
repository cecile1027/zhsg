package com.yonyou.uap.nc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.jdbc.framework.processor.BeanListProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import bsh.This;

import com.yonyou.mb.searchperson.vo.PersonVO;

public class SearchPersonSV {
	private static final Log logger = LogFactory.getLog(SearchPersonSV.class);


	public List<Map<String, String>> searchPersondetail(String id) {
		// TODO Auto-generated method stub
		Map<String, String> resultMap = new HashMap<String, String>();
		if (id != null && id.length() > 0) {
			try {
				resultMap.put("flag", "0");
				resultMap.put("des", "");
				BaseDAO dao = new BaseDAO();
				PersonVO personVO = (PersonVO) dao.retrieveByPK(PersonVO.class,id);
				if (personVO != null) {
					resultMap.put("personname", personVO.getPersonname()); // 姓名
					resultMap.put("ltd", personVO.getLtd());// 公司
					resultMap.put("deptname", personVO.getDeptname());// 部门
					resultMap.put("mobilephone", personVO.getMobilephone());// 移动电话
					resultMap.put("telephone", personVO.getTelephone()); // 办公电话
					resultMap.put("mailbox", personVO.getMailbox());// 电子邮件
					resultMap.put("officeno", personVO.getOfficeno()); // 工位号
					resultMap.put("workinfo", personVO.getWorkinfo()); // 业务内容
					resultMap.put("picurl", personVO.getPicurl());// 头像url
					resultMap.put("qq", personVO.getQq()); // QQ号
				} else {
					resultMap.put("flag", "2");
					resultMap.put("des", "未找到人员");
				}
			} catch (DAOException e) {
				resultMap.put("flag", "1");
				resultMap.put("des", "查询失败!");
				logger.error("调用人员查询服务失败" + e.getMessage());
			}
			List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
			resultList.add(resultMap);
			return resultList;
		} else {
			try {
				id = "1";
				resultMap.put("flag", "0");
				resultMap.put("des", "");
				BaseDAO dao = new BaseDAO();
				PersonVO personVO = (PersonVO) dao.retrieveByPK(PersonVO.class,id);
				if (personVO != null) {
					resultMap.put("personname", personVO.getPersonname()); // 姓名
					resultMap.put("ltd", personVO.getLtd());// 公司
					resultMap.put("deptname", personVO.getDeptname());// 部门
					resultMap.put("mobilephone", personVO.getMobilephone());// 移动电话
					resultMap.put("telephone", personVO.getTelephone()); // 办公电话
					resultMap.put("mailbox", personVO.getMailbox());// 电子邮件
					resultMap.put("officeno", personVO.getOfficeno()); // 工位号
					resultMap.put("workinfo", personVO.getWorkinfo()); // 业务内容
					resultMap.put("picurl", personVO.getPicurl());// 头像url
					resultMap.put("qq", personVO.getQq()); // QQ号
				} else {
					resultMap.put("flag", "2");
					resultMap.put("des", "未找到人员");
				}
			} catch (DAOException e) {
				resultMap.put("flag", "1");
				resultMap.put("des", "查询失败!");
				logger.error("调用人员查询服务失败" + e.getMessage());
			}
			List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
			resultList.add(resultMap);
			return resultList;
		}
	}


	public List<Map<String, Object>> searchPersonlist(String keytype,
			String keyvalue) {
		

		keytype = keytype.trim().toLowerCase();
		keyvalue = keyvalue.trim();
		ArrayList<Map<String, String>> dataMapList = new ArrayList<Map<String, String>>();
		String tableName = "UMP_PARKPERSON";
		
//		logger.error("keytype：" + keytype);
//		logger.error("keyvalue：" + keyvalue);

		String strwhere = "";
		if (keytype.equalsIgnoreCase("全搜索")) {
			strwhere = " deptname like '%" + keyvalue + "%'";
			strwhere += " or personname like '%" + keyvalue + "%'";
			strwhere += " or officeno like '%" + keyvalue + "%'";
			strwhere += " or telephone like '%" + keyvalue + "%'";
			strwhere += " or mailbox like '%" + keyvalue + "%'";
		} else if (keytype.equalsIgnoreCase("部门")) {
			strwhere = " deptname like '%" + keyvalue + "%'";
		} else if (keytype.equalsIgnoreCase("姓名")) {
			strwhere = " personname like '%" + keyvalue + "%'";
		} else if (keytype.equalsIgnoreCase("工位")) {
			strwhere = " officeno like '%" + keyvalue + "%'";
		} else if (keytype.equalsIgnoreCase("办公电话")) {
			strwhere = " telephone like '%" + keyvalue + "%'";
		} else if (keytype.equalsIgnoreCase("邮箱")) {
			strwhere = " mailbox like '%" + keyvalue + "%'";
		} else{
			strwhere =" 1=0 ";
		}

		String sqlConditionStr = "select * from " + tableName + " where "
				+ strwhere ;

//		logger.error("sqlConditionStr:" + sqlConditionStr);
		

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			resultMap.put("flag", "0");
			resultMap.put("des", "");
			
			resultMap.put("searchtype", keytype);
			resultMap.put("persons", new ArrayList<Map<String, String>>());
			
			BaseDAO dao = new BaseDAO();
			List<PersonVO> personVOs = (List<PersonVO>) dao.executeQuery( sqlConditionStr, new BeanListProcessor(PersonVO.class));
			if (personVOs != null && personVOs.size() > 0) {
				for (PersonVO personVO : personVOs) {
					if (personVO != null) {
						Map<String, String> dataMap = new HashMap<String, String>();

						dataMap.put("id", personVO.getPkid()); // id
						dataMap.put("personname", personVO.getPersonname()); // 姓名
						dataMap.put("deptname", personVO.getDeptname());// 部门
						dataMap.put("telephone", personVO.getTelephone()); // 办公电话
						dataMap.put("mailbox", personVO.getMailbox());// 电子邮件
						dataMap.put("officeno", personVO.getOfficeno()); // 工位号
						dataMap.put("picurl", personVO.getPicurl());// 头像url
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

}
