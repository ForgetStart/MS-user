package com.hc360.vo;

/**
 * 是否支持在线交易页面显示类
 * 
 * @project ms-common
 * @author hk
 * @version 1.0
 * @date 2019-2-21
 */
public class BusinSupporttradeInfo {
	//是否支持在线交易
	Boolean supportTradeFlag;
	//支持在线交易是否可用
	Boolean supportTradeDisableFlag;
	//提示信息标识
	String supportTradeInfoTag;
	//行业名称
	String areaName;
	public String getSupportTradeInfoTag() {
		return supportTradeInfoTag;
	}
	public void setSupportTradeInfoTag(String supportTradeInfoTag) {
		this.supportTradeInfoTag = supportTradeInfoTag;
	}
	public Boolean getSupportTradeFlag() {
		return supportTradeFlag;
	}
	public void setSupportTradeFlag(Boolean supportTradeFlag) {
		this.supportTradeFlag = supportTradeFlag;
	}
	public Boolean getSupportTradeDisableFlag() {
		return supportTradeDisableFlag;
	}
	public void setSupportTradeDisableFlag(Boolean supportTradeDisableFlag) {
		this.supportTradeDisableFlag = supportTradeDisableFlag;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
