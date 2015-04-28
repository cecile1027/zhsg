package com.yonyou.mb.safetw.vo;

import java.util.Date;

public class GeneralOrganizationVO {
	/**
	 * 责任单位VO
	 * @author lyj
	 */
	private static final long serialVersionUID = 1L;
	private String orgNo;   //组织编码
	private String orgDesc; // 组织名称
	private String projNo; // 项目编码
	
	public GeneralOrganizationVO() {

	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
    
	
	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
