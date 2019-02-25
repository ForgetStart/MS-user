package com.hc360.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2019/2/23 18:39
 * @Description: 获取留言信息
 */
public class RecvnotesParam implements Serializable {

    private long provinceid;

    private long anymoussender;

    private String title = "";

    private String lstate = "";

    private String infotype = "";

    // "0"会员留言， "1"非会员留言， "2"系统留言
    private String notetype = "";

    private String datetype = "";

    private long recvproviderid = 0;

    private long sendproviderid = 0;

    private long wordtype = 0;

    private long isgarbage = 0;

    private Date startDate;

    private Date endDate;

    //商机的id
    long infoid ;

    //留言的种类，是问题还是回答,0是问题;
    String notekind;

    private boolean notSysnote;

    // 采购/发布商机 的发布日期范围 '0'当天发布,'1'三天内发布,'2'七天内发布,'3'一个月内发布,'4'三个月内发布,'5'三个月以上发布的商机信息。
    private String buschanceDateScope;

    // 星级 1 一星, 2 二星, 3 三星, 4 四星, 5 五星
    private String star;

    //是否根留言 0 是根 其他不是
    private String snoteid;

    //匹配类型 0: 访问您产品	1：意图向您询价	2：访问同类产品	3：向同类产品询价
    private String matchtype;

    public long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(long provinceid) {
        this.provinceid = provinceid;
    }

    public long getAnymoussender() {
        return anymoussender;
    }

    public void setAnymoussender(long anymoussender) {
        this.anymoussender = anymoussender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLstate() {
        return lstate;
    }

    public void setLstate(String lstate) {
        this.lstate = lstate;
    }

    public String getInfotype() {
        return infotype;
    }

    public void setInfotype(String infotype) {
        this.infotype = infotype;
    }

    public String getNotetype() {
        return notetype;
    }

    public void setNotetype(String notetype) {
        this.notetype = notetype;
    }

    public String getDatetype() {
        return datetype;
    }

    public void setDatetype(String datetype) {
        this.datetype = datetype;
    }

    public long getRecvproviderid() {
        return recvproviderid;
    }

    public void setRecvproviderid(long recvproviderid) {
        this.recvproviderid = recvproviderid;
    }

    public long getSendproviderid() {
        return sendproviderid;
    }

    public void setSendproviderid(long sendproviderid) {
        this.sendproviderid = sendproviderid;
    }

    public long getWordtype() {
        return wordtype;
    }

    public void setWordtype(long wordtype) {
        this.wordtype = wordtype;
    }

    public long getIsgarbage() {
        return isgarbage;
    }

    public void setIsgarbage(long isgarbage) {
        this.isgarbage = isgarbage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getInfoid() {
        return infoid;
    }

    public void setInfoid(long infoid) {
        this.infoid = infoid;
    }

    public String getNotekind() {
        return notekind;
    }

    public void setNotekind(String notekind) {
        this.notekind = notekind;
    }

    public boolean isNotSysnote() {
        return notSysnote;
    }

    public void setNotSysnote(boolean notSysnote) {
        this.notSysnote = notSysnote;
    }

    public String getBuschanceDateScope() {
        return buschanceDateScope;
    }

    public void setBuschanceDateScope(String buschanceDateScope) {
        this.buschanceDateScope = buschanceDateScope;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getSnoteid() {
        return snoteid;
    }

    public void setSnoteid(String snoteid) {
        this.snoteid = snoteid;
    }

    public String getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(String matchtype) {
        this.matchtype = matchtype;
    }
}
