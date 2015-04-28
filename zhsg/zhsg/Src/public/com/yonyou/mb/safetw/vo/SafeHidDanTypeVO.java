package com.yonyou.mb.safetw.vo;


public class SafeHidDanTypeVO {
	/**
	 * 隐患分类VO  
	 * @author lyj    
	 */
	private static final long serialVersionUID = 1L;
	private String projNo;   //项目编码
	private String typeCode; // 隐患分类编码
	private String typeDescribe; // 隐患分类名称
	private String parentCode; // 父项编码
	private String scope; // 父项编码	
	private String remark; // 父项编码	       

	public SafeHidDanTypeVO() {  

	}

	public String getProjNo() {      
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
    

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeDescribe() {
		return typeDescribe;
	}

	public void setTypeDescribe(String typeDescribe) {
		this.typeDescribe = typeDescribe;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	                  
      	      
}
