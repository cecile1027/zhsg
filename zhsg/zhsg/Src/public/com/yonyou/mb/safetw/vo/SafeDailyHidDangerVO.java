package com.yonyou.mb.safetw.vo;

import java.util.Date;

public class SafeDailyHidDangerVO extends BaseVo{
	/**
	 * 安全隐患排查VO
	 * author liuyj
	 * SafeDailyHidDangerVO
	 */
	private static final long serialVersionUID = 1L;
	private String proj_no;   //项目编码
	private String daily_hid_no; //日常检查隐患编号
	private String telephone;  //联系电话
	private String rectification_period; //整改期限
	private String hazard_desc;   //隐患描述
	private Date draft_date;   //编制日期
	private Date rectificate_draft_date;  //整改编制日期
	private String rectificate_result;    //整改结果
	private String close_opinion;   //关闭意见
	private Date close_date;    //关闭日期
	private String safe_yh_level;  //隐患等级
	private String ope_area_no;  //作业区
	private String ope_area_desc; // 区域描述
	private String respon_unit; //责任单位
	private String respon_unit_desc; // 组织名称
	private String duty_officer; //责任人
	private String duty_officer_name; // 责任人姓名
	private String draft_unit; //编制单位
	private String draft_dept; //编制部门
	private String drafter;   //编制人
	private String rectificate_drafter; //整改结果编制人
	private String close_person;  //关闭人
	private String yh_type;    //隐患分类
	private String yh_type_describe; // 隐患分类名称
	private String yh_sub_type; //隐患细类
	private String yh_sub_type_describe; // 隐患分类名称  
	private Date rowversion;  
	private String rowstate;  //状态

	public SafeDailyHidDangerVO() {

	}
	
	@Override
	public String getPKFieldName() {
		return "ID";
	}
	@Override
	public String getPrimaryKey() {
		return this.daily_hid_no;
	}
	@Override
	public String getTableName() {
		return "SAFE_DAILY_HID_DANGER_UM";
	}        
	@Override
	public void setPrimaryKey(String daily_hid_no) {
		this.daily_hid_no = daily_hid_no;
	}

	public String getProj_no() {
		return proj_no;
	}

	public void setProj_no(String proj_no) {
		this.proj_no = proj_no;
	}

	public String getDaily_hid_no() {
		return daily_hid_no;
	}

	public void setDaily_hid_no(String daily_hid_no) {
		this.daily_hid_no = daily_hid_no;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRectification_period() {
		return rectification_period;
	}

	public void setRectification_period(String rectification_period) {
		this.rectification_period = rectification_period;
	}

	public String getHazard_desc() {
		return hazard_desc;
	}

	public void setHazard_desc(String hazard_desc) {
		this.hazard_desc = hazard_desc;
	}

	public Date getDraft_date() {
		return draft_date;
	}

	public void setDraft_date(Date draft_date) {
		this.draft_date = draft_date;
	}

	public Date getRectificate_draft_date() {
		return rectificate_draft_date;
	}

	public void setRectificate_draft_date(Date rectificate_draft_date) {
		this.rectificate_draft_date = rectificate_draft_date;
	}

	public String getRectificate_result() {
		return rectificate_result;
	}

	public void setRectificate_result(String rectificate_result) {
		this.rectificate_result = rectificate_result;
	}

	public String getClose_opinion() {
		return close_opinion;
	}

	public void setClose_opinion(String close_opinion) {
		this.close_opinion = close_opinion;
	}

	public Date getClose_date() {
		return close_date;
	}

	public void setClose_date(Date close_date) {
		this.close_date = close_date;
	}

	public String getSafe_yh_level() {
		return safe_yh_level;
	}

	public void setSafe_yh_level(String safe_yh_level) {
		this.safe_yh_level = safe_yh_level;
	}

	public String getOpe_area_no() {
		return ope_area_no;
	}

	public void setOpe_area_no(String ope_area_no) {
		this.ope_area_no = ope_area_no;
	}

	public String getOpe_area_desc() {
		return ope_area_desc;
	}

	public void setOpe_area_desc(String ope_area_desc) {
		this.ope_area_desc = ope_area_desc;
	}

	public String getRespon_unit() {
		return respon_unit;
	}

	public void setRespon_unit(String respon_unit) {
		this.respon_unit = respon_unit;
	}

	public String getRespon_unit_desc() {
		return respon_unit_desc;
	}

	public void setRespon_unit_desc(String respon_unit_desc) {
		this.respon_unit_desc = respon_unit_desc;
	}

	public String getDuty_officer() {
		return duty_officer;
	}

	public void setDuty_officer(String duty_officer) {
		this.duty_officer = duty_officer;
	}

	public String getDuty_officer_name() {
		return duty_officer_name;
	}

	public void setDuty_officer_name(String duty_officer_name) {
		this.duty_officer_name = duty_officer_name;
	}

	public String getDraft_unit() {
		return draft_unit;
	}

	public void setDraft_unit(String draft_unit) {
		this.draft_unit = draft_unit;
	}

	public String getDraft_dept() {
		return draft_dept;
	}

	public void setDraft_dept(String draft_dept) {
		this.draft_dept = draft_dept;
	}

	public String getDrafter() {
		return drafter;
	}

	public void setDrafter(String drafter) {
		this.drafter = drafter;
	}

	public String getRectificate_drafter() {
		return rectificate_drafter;
	}

	public void setRectificate_drafter(String rectificate_drafter) {
		this.rectificate_drafter = rectificate_drafter;
	}

	public String getClose_person() {
		return close_person;
	}

	public void setClose_person(String close_person) {
		this.close_person = close_person;
	}

	public String getYh_type() {
		return yh_type;
	}

	public void setYh_type(String yh_type) {
		this.yh_type = yh_type;
	}

	public String getYh_type_describe() {
		return yh_type_describe;
	}

	public void setYh_type_describe(String yh_type_describe) {
		this.yh_type_describe = yh_type_describe;
	}

	public String getYh_sub_type() {
		return yh_sub_type;
	}

	public void setYh_sub_type(String yh_sub_type) {
		this.yh_sub_type = yh_sub_type;
	}

	public String getYh_sub_type_describe() {
		return yh_sub_type_describe;
	}

	public void setYh_sub_type_describe(String yh_sub_type_describe) {
		this.yh_sub_type_describe = yh_sub_type_describe;
	}

	public Date getRowversion() {
		return rowversion;
	}

	public void setRowversion(Date rowversion) {
		this.rowversion = rowversion;
	}

	public String getRowstate() {
		return rowstate;
	}

	public void setRowstate(String rowstate) {
		this.rowstate = rowstate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
