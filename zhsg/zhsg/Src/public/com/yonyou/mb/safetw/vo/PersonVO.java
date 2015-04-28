package com.yonyou.mb.safetw.vo;


public class PersonVO extends BaseVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pkid;
	private String personname; //姓名
	private String ltd; //公司
	private String deptname; // 部门
	private String mobilephone; //移动电话
	private String telephone; //办公电话
	private String mailbox; //电子邮件
	private String officeno; //工位号
	private String workinfo; //业务内容
	private String picurl; //头像url
	private String qq; //QQ号
	
public PersonVO(){
		
	}
	
	public PersonVO(String pkid){
		this.pkid = pkid;
	}
	
	@Override
	public String getPKFieldName() {
		return "ID";
	}
	@Override
	public String getPrimaryKey() {
		return this.pkid;
	}
	@Override
	public String getTableName() {
		return "SAFE_DAILY_HID_DANGER_UM";
	}
	@Override
	public void setPrimaryKey(String pkid) {
		this.pkid = pkid;
	}

	public String getPkid() {
		return pkid;
	}

	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	
	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getLtd() {
		return ltd;
	}

	public void setLtd(String ltd) {
		this.ltd = ltd;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getOfficeno() {
		return officeno;
	}

	public void setOfficeno(String officeno) {
		this.officeno = officeno;
	}

	public String getWorkinfo() {
		return workinfo;
	}

	public void setWorkinfo(String workinfo) {
		this.workinfo = workinfo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	
	
}
