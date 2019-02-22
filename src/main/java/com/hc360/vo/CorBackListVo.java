package com.hc360.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Auther: Administrator
 * @Date: 2019/2/21 13:56
 * @Description:黑名单
 */
public class CorBackListVo implements Serializable {

    private long id;
    private long providerid;
    private Timestamp pubdate;
    private Timestamp modifydate;
    private String states;
    private String isfreeze;
    private String whoinput;
    private String flag;
    private String issuccess;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProviderid() {
        return providerid;
    }

    public void setProviderid(long providerid) {
        this.providerid = providerid;
    }

    public Timestamp getPubdate() {
        return pubdate;
    }

    public void setPubdate(Timestamp pubdate) {
        this.pubdate = pubdate;
    }

    public Timestamp getModifydate() {
        return modifydate;
    }

    public void setModifydate(Timestamp modifydate) {
        this.modifydate = modifydate;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getIsfreeze() {
        return isfreeze;
    }

    public void setIsfreeze(String isfreeze) {
        this.isfreeze = isfreeze;
    }

    public String getWhoinput() {
        return whoinput;
    }

    public void setWhoinput(String whoinput) {
        this.whoinput = whoinput;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(String issuccess) {
        this.issuccess = issuccess;
    }
}
