package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/3/8 15:55
 * @Description:
 */
public class SupportTradeParamVO implements Serializable {

    private String supercatid;

    private Long providerid;

    private long memtypeid;

    private String degrade;

    private String areaid;

    /**
     * 是否支持在线交易  1 支持  0 不支持
     */
    private String isSupportTrade;


    public String getSupercatid() {
        return supercatid;
    }

    public void setSupercatid(String supercatid) {
        this.supercatid = supercatid;
    }

    public Long getProviderid() {
        return providerid;
    }

    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }

    public long getMemtypeid() {
        return memtypeid;
    }

    public void setMemtypeid(long memtypeid) {
        this.memtypeid = memtypeid;
    }

    public String getDegrade() {
        return degrade;
    }

    public void setDegrade(String degrade) {
        this.degrade = degrade;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getIsSupportTrade() {
        return isSupportTrade;
    }

    public void setIsSupportTrade(String isSupportTrade) {
        this.isSupportTrade = isSupportTrade;
    }
}
