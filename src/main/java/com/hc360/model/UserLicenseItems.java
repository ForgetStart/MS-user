package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类UserLicenseItems
 *@author Created By b2btool 
 */
public class UserLicenseItems implements Serializable {

	/**主键ID*/
	    private long id;
    	/**商户的证书分类ID*/
	    private String userliid;
    	/**证书名称*/
	    private String licensename;
    	/**图片名称*/
	    private String picpath;
    	/**发布时间*/
	    private Timestamp pubdate;
    	/**有效期*/
	    private Timestamp enddate;
    	/**状态（0表示正常，1表示已删除）*/
	    private String status;
    
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
    * 取得userliid
    * @return userliid
    */
   public String getUserliid () {
       return userliid;
   }
   /**
    * 设置userliid
    * @param userliid 待设置userliid
    */
   public void setUserliid(String userliid) {
       this.userliid = userliid;
   }
   
   /**
    * 取得licensename
    * @return licensename
    */
   public String getLicensename () {
       return licensename;
   }
   /**
    * 设置licensename
    * @param licensename 待设置licensename
    */
   public void setLicensename(String licensename) {
       this.licensename = licensename;
   }
   
   /**
    * 取得picpath
    * @return picpath
    */
   public String getPicpath () {
       return picpath;
   }
   /**
    * 设置picpath
    * @param picpath 待设置picpath
    */
   public void setPicpath(String picpath) {
       this.picpath = picpath;
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
    * 取得enddate
    * @return enddate
    */
   public Timestamp getEnddate () {
       return enddate;
   }
   /**
    * 设置enddate
    * @param enddate 待设置enddate
    */
   public void setEnddate(Timestamp enddate) {
       this.enddate = enddate;
   }
   
   /**
    * 取得status
    * @return status
    */
   public String getStatus () {
       return status;
   }
   /**
    * 设置status
    * @param status 待设置status
    */
   public void setStatus(String status) {
       this.status = status;
   }
   

}