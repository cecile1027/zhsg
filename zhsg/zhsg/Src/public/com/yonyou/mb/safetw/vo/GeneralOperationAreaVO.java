package com.yonyou.mb.safetw.vo;

import java.util.Date;

public class GeneralOperationAreaVO {
	/**
	 * 作业区域Vo
	 * @author lyj
	 */
	private static final long serialVersionUID = 1L;
	private String projNo;
	private String opeAreaNo; // 区域编码
	private String structureNo; // 子项编码
	private String opeAreaDesc; // 区域描述
	private Date rowversion; //

	public GeneralOperationAreaVO() {

	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}

	public String getOpeAreaNo() {
		return opeAreaNo;
	}

	public void setOpeAreaNo(String opeAreaNo) {
		this.opeAreaNo = opeAreaNo;
	}

	public String getOpeAreaDesc() {
		return opeAreaDesc;
	}

	public void setOpeAreaDesc(String opeAreaDesc) {
		this.opeAreaDesc = opeAreaDesc;
	}

	public String getStructureNo() {
		return structureNo;
	}

	public void setStructureNo(String structureNo) {
		this.structureNo = structureNo;
	}
	public Date getRowversion() {
		return rowversion;
	}

	public void setRowversion(Date rowversion) {
		this.rowversion = rowversion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
