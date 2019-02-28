package com.hc360.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: hk
 * @Date: 2019/2/28 18:39
 * @Description: 邮箱订阅
 */
public class SubscribeParamVO implements Serializable {

    /** 会员ID */
    private long providerid;

    /**
     * 商机关键字
     */
    private String keyword;

    /**
     * 商机分类标志 0： 供应产品 1： 采购产品 2： 代理产品 3： 合作产品 4： 招标产品 5： 二手产品 6： 租赁信息
     */
    private String sorttag;

    private String l3supcatid;

    /** 会员类型*/
    private long memtypeid;

    /**
     * 超市分类ID
     */
    private String supcatid;


    public long getProviderid() {
        return providerid;
    }

    public void setProviderid(long providerid) {
        this.providerid = providerid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSorttag() {
        return sorttag;
    }

    public void setSorttag(String sorttag) {
        this.sorttag = sorttag;
    }

    public String getL3supcatid() {
        return l3supcatid;
    }

    public void setL3supcatid(String l3supcatid) {
        this.l3supcatid = l3supcatid;
    }

    public long getMemtypeid() {
        return memtypeid;
    }

    public void setMemtypeid(long memtypeid) {
        this.memtypeid = memtypeid;
    }

    public String getSupcatid() {
        return supcatid;
    }

    public void setSupcatid(String supcatid) {
        this.supcatid = supcatid;
    }
}
