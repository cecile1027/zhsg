package com.yonyou.mb.safetw.vo;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class BaseVo extends SuperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3900685677930821236L;
	private UFDateTime ts;
	
	public BaseVo(){
		
	}

	public UFDateTime getTs() {
		return ts;
	}

	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	@Override
	public String getPKFieldName() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getParentPKFieldName() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getTableName() {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
