package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类CorSubscribeConf
 *@author Created By b2btool 
 */

public class CorSubscribeConf implements Serializable {

	/**id*/
    private long id;
	/**issend*/
    private long issend;
	/**ismail*/
    private long ismail;
	/**frequency*/
    private long frequency;
	/**senddate*/
    private Timestamp senddate;
	/**remaildate*/
    private Timestamp remaildate;
	/**pubdate*/
    private Timestamp pubdate;
	/**modifydate*/
    private Timestamp modifydate;
    /**enddate*/
    private Timestamp enddate;
    /**canceldate*/
    private Timestamp canceldate;

    public Timestamp getCanceldate() {
		return canceldate;
	}
	public void setCanceldate(Timestamp canceldate) {
		this.canceldate = canceldate;
	}
	public Timestamp getEnddate() {
		return enddate;
	}
	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
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
    * 取得ismail
    * @return ismail
    */
   public long getIsmail () {
       return ismail;
   }
   /**
    * 设置ismail
    * @param ismail 待设置ismail
    */
   public void setIsmail(long ismail) {
       this.ismail = ismail;
   }
   
   /**
    * 取得frequency
    * @return frequency
    */
   public long getFrequency () {
       return frequency;
   }
   /**
    * 设置frequency
    * @param frequency 待设置frequency
    */
   public void setFrequency(long frequency) {
       this.frequency = frequency;
   }
   
   /**
    * 取得senddate
    * @return senddate
    */
   public Timestamp getSenddate () {
       return senddate;
   }
   /**
    * 设置senddate
    * @param senddate 待设置senddate
    */
   public void setSenddate(Timestamp senddate) {
       this.senddate = senddate;
   }
   
   /**
    * 取得remaildate
    * @return remaildate
    */
   public Timestamp getRemaildate () {
       return remaildate;
   }
   /**
    * 设置remaildate
    * @param remaildate 待设置remaildate
    */
   public void setRemaildate(Timestamp remaildate) {
       this.remaildate = remaildate;
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
    * 取得modifydate
    * @return modifydate
    */
   public Timestamp getModifydate () {
       return modifydate;
   }
   /**
    * 设置modifydate
    * @param modifydate 待设置modifydate
    */
   public void setModifydate(Timestamp modifydate) {
       this.modifydate = modifydate;
   }
   

}