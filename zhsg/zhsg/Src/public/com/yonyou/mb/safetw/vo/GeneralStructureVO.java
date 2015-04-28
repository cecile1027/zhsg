package com.yonyou.mb.safetw.vo;

import java.util.Date;

public class GeneralStructureVO {
	/**
	 * 子项VO
	 * @author lyj
	 */
	private static final long serialVersionUID = 1L;
	private String projNo;
	private String structureNo; // 子项编码
	private String structureDesc; // 子项名称
	private String translateDesc; // 子项英文秒速
	private String note; // 备注
	private Date rowversion; //
	private String facility; // 设备

	public GeneralStructureVO() {

	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}

	public String getStructureNo() {
		return structureNo;
	}

	public void setStructureNo(String structureNo) {
		this.structureNo = structureNo;
	}

	public String getStructureDesc() {
		return structureDesc;
	}

	public void setStructureDesc(String structureDesc) {
		this.structureDesc = structureDesc;
	}

	public String getTranslateDesc() {
		return translateDesc;
	}

	public void setTranslateDesc(String translateDesc) {
		this.translateDesc = translateDesc;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getRowversion() {
		return rowversion;
	}

	public void setRowversion(Date rowversion) {
		this.rowversion = rowversion;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
