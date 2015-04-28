package com.yonyou.mb.safetw.vo;

import java.util.Date;

public class PersonInfoVO  {
	/**
	 * 责任人VO
	 * @author lyj
	 */
	private static final long serialVersionUID = 1L;
	private String personId; // 责任人编码
	private String name; // 责任人姓名

	public PersonInfoVO() {

	}



	public String getPersonId() {
		return personId;
	}



	public void setPersonId(String personId) {
		this.personId = personId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
