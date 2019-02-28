package com.hc360.vo;

import java.io.Serializable;

/**
 *	分类（SUPERMARKET_CAT）持久类
 */
public class SupermarketCat implements Serializable {

    /**自增主键*/
    private long id;
    /**超市分类id*/
    private String supcatid;
    /**超市分类名称*/
    private String supcatname;
    /**品类id*/
    private long catid;
    /**null*/
    private long sortvalue;
    /**null*/
    private String webname;
    /**分类名称首字母*/
    private String pinyin;
    /**状态位-默认0
     0：有效 1：无效*/
    private String state;
    /**分类是否在类目中显示0：不显示 1：显示，默认是0*/
    private String show;
//    /**录入人*/
//    private String publishman;
//    /**录入时间*/
//    private Timestamp publishtime;
//    /**修改人*/
//    private String updateman;
//    /**修改时间*/
//    private Timestamp updatetime;
//    /**删除人*/
//    private String deleteman;
//    /**删除时间*/
//    private Timestamp deletetime;

    private String catType;

    /**
     * 取得id
     * @return id
     */
    public long getId () {
        return id;
    }
    /**
     * 设置id
     * @param id 待设置id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 取得supcatid
     * @return supcatid
     */
    public String getSupcatid () {
        return supcatid;
    }
    /**
     * 设置supcatid
     * @param supcatid 待设置supcatid
     */
    public void setSupcatid(String supcatid) {
        this.supcatid = supcatid;
    }

    /**
     * 取得supcatname
     * @return supcatname
     */
    public String getSupcatname () {
        return supcatname;
    }
    /**
     * 设置supcatname
     * @param supcatname 待设置supcatname
     */
    public void setSupcatname(String supcatname) {
        this.supcatname = supcatname;
    }

    /**
     * 取得catid
     * @return catid
     */
    public long getCatid () {
        return catid;
    }
    /**
     * 设置catid
     * @param catid 待设置catid
     */
    public void setCatid(long catid) {
        this.catid = catid;
    }

    /**
     * 取得sortvalue
     * @return sortvalue
     */
    public long getSortvalue () {
        return sortvalue;
    }
    /**
     * 设置sortvalue
     * @param sortvalue 待设置sortvalue
     */
    public void setSortvalue(long sortvalue) {
        this.sortvalue = sortvalue;
    }

    /**
     * 取得webname
     * @return webname
     */
    public String getWebname () {
        return webname;
    }
    /**
     * 设置webname
     * @param webname 待设置webname
     */
    public void setWebname(String webname) {
        this.webname = webname;
    }

    /**
     * 取得pinyin
     * @return pinyin
     */
    public String getPinyin () {
        return pinyin;
    }
    /**
     * 设置pinyin
     * @param pinyin 待设置pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * 取得state
     * @return state
     */
    public String getState () {
        return state;
    }
    /**
     * 设置state
     * @param state 待设置state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 取得show
     * @return show
     */
    public String getShow () {
        return show;
    }
    /**
     * 设置show
     * @param show 待设置show
     */
    public void setShow(String show) {
        this.show = show;
    }

//    /**
//     * 取得publishman
//     * @return publishman
//     */
//    public String getPublishman () {
//        return publishman;
//    }
//    /**
//     * 设置publishman
//     * @param publishman 待设置publishman
//     */
//    public void setPublishman(String publishman) {
//        this.publishman = publishman;
//    }
//
//    /**
//     * 取得publishtime
//     * @return publishtime
//     */
//    public Timestamp getPublishtime () {
//        return publishtime;
//    }
//    /**
//     * 设置publishtime
//     * @param publishtime 待设置publishtime
//     */
//    public void setPublishtime(Timestamp publishtime) {
//        this.publishtime = publishtime;
//    }
//
//    /**
//     * 取得updateman
//     * @return updateman
//     */
//    public String getUpdateman () {
//        return updateman;
//    }
//    /**
//     * 设置updateman
//     * @param updateman 待设置updateman
//     */
//    public void setUpdateman(String updateman) {
//        this.updateman = updateman;
//    }
//
//    /**
//     * 取得updatetime
//     * @return updatetime
//     */
//    public Timestamp getUpdatetime () {
//        return updatetime;
//    }
//    /**
//     * 设置updatetime
//     * @param updatetime 待设置updatetime
//     */
//    public void setUpdatetime(Timestamp updatetime) {
//        this.updatetime = updatetime;
//    }
//
//    /**
//     * 取得deleteman
//     * @return deleteman
//     */
//    public String getDeleteman () {
//        return deleteman;
//    }
//    /**
//     * 设置deleteman
//     * @param deleteman 待设置deleteman
//     */
//    public void setDeleteman(String deleteman) {
//        this.deleteman = deleteman;
//    }
//
//    /**
//     * 取得deletetime
//     * @return deletetime
//     */
//    public Timestamp getDeletetime () {
//        return deletetime;
//    }
//    /**
//     * 设置deletetime
//     * @param deletetime 待设置deletetime
//     */
//    public void setDeletetime(Timestamp deletetime) {
//        this.deletetime = deletetime;
//    }


    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}