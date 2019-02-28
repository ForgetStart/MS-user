package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类SubscribTable
 *@author Created By b2btool 
 */

public class SubscribTable implements Serializable {

	/**id*/
    private long id;
	/**l3supcatid*/
    private String supcatid;
	/**keyword*/
    private String keyword;
	/**clsid*/
    private String clsid;
	/**infotype*/
    private String infotype;
	/**zone*/
    private String zone;
	/**pubdate*/
    private Timestamp pubdate;
	/**checked*/
    private String checked;
	/**checkedate*/
    private Timestamp checkedate;
	/**trade*/
    private String trade;
	/**provinceid*/
    private long provinceid;
	/**cityid*/
    private long cityid;
	/**providerid*/
    private long providerid;
	/**subtype*/
    private long subtype;
	/**issend*/
    private long issend;
	/**isrepeat*/
    private long isrepeat;
	/**updatetime*/
    private Timestamp updatetime;
	/**states*/
    private long states;
	/**deldate*/
    private Timestamp deldate;
    /**validatetime*/
    private long validatetime;

    public long getValidatetime() {
		return validatetime;
	}
	public void setValidatetime(long validatetime) {
		this.validatetime = validatetime;
	}
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
    * 取得keyword
    * @return keyword
    */
   public String getKeyword () {
       return keyword;
   }
   /**
    * 设置keyword
    * @param keyword 待设置keyword
    */
   public void setKeyword(String keyword) {
       this.keyword = keyword;
   }
   
   /**
    * 取得clsid
    * @return clsid
    */
   public String getClsid () {
       return clsid;
   }
   /**
    * 设置clsid
    * @param clsid 待设置clsid
    */
   public void setClsid(String clsid) {
       this.clsid = clsid;
   }
   
   /**
    * 取得infotype
    * @return infotype
    */
   public String getInfotype () {
       return infotype;
   }
   /**
    * 设置infotype
    * @param infotype 待设置infotype
    */
   public void setInfotype(String infotype) {
       this.infotype = infotype;
   }
   
   /**
    * 取得zone
    * @return zone
    */
   public String getZone () {
       return zone;
   }
   /**
    * 设置zone
    * @param zone 待设置zone
    */
   public void setZone(String zone) {
       this.zone = zone;
   }
   
   /**
    * 取得pubdate
    * @return pubdate
    */
   public Timestamp getPubdate () {
       return pubdate;
   }
   /**
    * 设置pubdate
    * @param pubdate 待设置pubdate
    */
   public void setPubdate(Timestamp pubdate) {
       this.pubdate = pubdate;
   }
   
   /**
    * 取得checked
    * @return checked
    */
   public String getChecked () {
       return checked;
   }
   /**
    * 设置checked
    * @param checked 待设置checked
    */
   public void setChecked(String checked) {
       this.checked = checked;
   }
   
   /**
    * 取得checkedate
    * @return checkedate
    */
   public Timestamp getCheckedate () {
       return checkedate;
   }
   /**
    * 设置checkedate
    * @param checkedate 待设置checkedate
    */
   public void setCheckedate(Timestamp checkedate) {
       this.checkedate = checkedate;
   }
   
   /**
    * 取得trade
    * @return trade
    */
   public String getTrade () {
       return trade;
   }
   /**
    * 设置trade
    * @param trade 待设置trade
    */
   public void setTrade(String trade) {
       this.trade = trade;
   }
   
   /**
    * 取得provinceid
    * @return provinceid
    */
   public long getProvinceid () {
       return provinceid;
   }
   /**
    * 设置provinceid
    * @param provinceid 待设置provinceid
    */
   public void setProvinceid(long provinceid) {
       this.provinceid = provinceid;
   }
   
   /**
    * 取得cityid
    * @return cityid
    */
   public long getCityid () {
       return cityid;
   }
   /**
    * 设置cityid
    * @param cityid 待设置cityid
    */
   public void setCityid(long cityid) {
       this.cityid = cityid;
   }
   
   /**
    * 取得providerid
    * @return providerid
    */
   public long getProviderid () {
       return providerid;
   }
   /**
    * 设置providerid
    * @param providerid 待设置providerid
    */
   public void setProviderid(long providerid) {
       this.providerid = providerid;
   }
   
   /**
    * 取得subtype
    * @return subtype
    */
   public long getSubtype () {
       return subtype;
   }
   /**
    * 设置subtype
    * @param subtype 待设置subtype
    */
   public void setSubtype(long subtype) {
       this.subtype = subtype;
   }
   
   /**
    * 取得issend
    * @return issend
    */
   public long getIssend () {
       return issend;
   }
   /**
    * 设置issend
    * @param issend 待设置issend
    */
   public void setIssend(long issend) {
       this.issend = issend;
   }
   
   /**
    * 取得isrepeat
    * @return isrepeat
    */
   public long getIsrepeat () {
       return isrepeat;
   }
   /**
    * 设置isrepeat
    * @param isrepeat 待设置isrepeat
    */
   public void setIsrepeat(long isrepeat) {
       this.isrepeat = isrepeat;
   }
   
   /**
    * 取得updatetime
    * @return updatetime
    */
   public Timestamp getUpdatetime () {
       return updatetime;
   }
   /**
    * 设置updatetime
    * @param updatetime 待设置updatetime
    */
   public void setUpdatetime(Timestamp updatetime) {
       this.updatetime = updatetime;
   }
   
   /**
    * 取得states
    * @return states
    */
   public long getStates () {
       return states;
   }
   /**
    * 设置states
    * @param states 待设置states
    */
   public void setStates(long states) {
       this.states = states;
   }
   
   /**
    * 取得deldate
    * @return deldate
    */
   public Timestamp getDeldate () {
       return deldate;
   }
   /**
    * 设置deldate
    * @param deldate 待设置deldate
    */
   public void setDeldate(Timestamp deldate) {
       this.deldate = deldate;
   }
   

}