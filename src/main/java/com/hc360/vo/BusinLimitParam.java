package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/3/1 16:59
 * @Description:
 */
public class BusinLimitParam implements Serializable {

    private Long providerId;

    /**
     * '0'可用 '1'逻辑删除
     */
    private String state;

    private String supcatid;

    private String showstate;

    /**
     * 0-供应商机  1-求购信息
     */
    private String sorttag;

    /**
     * 服务类信息标识, 1-服务信息
     */
    private String serviceflag;

    private String areaId;

    private long memberType;

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSupcatid() {
        return supcatid;
    }

    public void setSupcatid(String supcatid) {
        this.supcatid = supcatid;
    }

    public String getShowstate() {
        return showstate;
    }

    public void setShowstate(String showstate) {
        this.showstate = showstate;
    }

    public String getSorttag() {
        return sorttag;
    }

    public void setSorttag(String sorttag) {
        this.sorttag = sorttag;
    }

    public String getServiceflag() {
        return serviceflag;
    }

    public void setServiceflag(String serviceflag) {
        this.serviceflag = serviceflag;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public long getMemberType() {
        return memberType;
    }

    public void setMemberType(long memberType) {
        this.memberType = memberType;
    }
}
