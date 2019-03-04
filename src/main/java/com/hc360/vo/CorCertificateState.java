package com.hc360.vo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Auther: Administrator
 * @Date: 2019/3/4 15:48
 * @Description:实名认证信息
 */
public class CorCertificateState implements Serializable {
    private long id;
    private long userid;
    private String username;
    private long providerid;
    private long personalid;
    private long companyid;
    private long checkid;
    private String type;
    private String certificatestate;
    private String name;
    private long verifycount;
    private String state;
    private Timestamp createtime;
    private Timestamp updatetime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getProviderid() {
        return providerid;
    }

    public void setProviderid(long providerid) {
        this.providerid = providerid;
    }

    public long getPersonalid() {
        return personalid;
    }

    public void setPersonalid(long personalid) {
        this.personalid = personalid;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }

    public long getCheckid() {
        return checkid;
    }

    public void setCheckid(long checkid) {
        this.checkid = checkid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCertificatestate() {
        return certificatestate;
    }

    public void setCertificatestate(String certificatestate) {
        this.certificatestate = certificatestate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVerifycount() {
        return verifycount;
    }

    public void setVerifycount(long verifycount) {
        this.verifycount = verifycount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }
}
