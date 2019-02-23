package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/2/23 16:25
 * @Description:  主营行业
 */
public class MainArea implements Serializable {
    private long id;
    private String areaname;
    private String areaid;
    private long sortvalue;
    private String webname;
    private String adurl;
    private String pinyinhead;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public long getSortvalue() {
        return sortvalue;
    }

    public void setSortvalue(long sortvalue) {
        this.sortvalue = sortvalue;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl;
    }

    public String getPinyinhead() {
        return pinyinhead;
    }

    public void setPinyinhead(String pinyinhead) {
        this.pinyinhead = pinyinhead;
    }
}
