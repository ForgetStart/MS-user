package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类LicenseCategoryItems
 *@author Created By b2btool 
 */
public class LicenseCategoryItems implements Serializable {

	/**主键ID*/
	    private long id;
    	/**分类的ID*/
	    private String licatid;
    	/**终极分类ID*/
	    private String supcatid;
    	/**发布时间*/
	    private Timestamp pubdate;
    	/**操作人*/
	    private String operator;
    	/**(保留字段)*/
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
    * 取得licatid
    * @return licatid
    */
   public String getLicatid () {
       return licatid;
   }
   /**
    * 设置licatid
    * @param licatid 待设置licatid
    */
   public void setLicatid(String licatid) {
       this.licatid = licatid;
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
    * 取得operator
    * @return operator
    */
   public String getOperator () {
       return operator;
   }
   /**
    * 设置operator
    * @param operator 待设置operator
    */
   public void setOperator(String operator) {
       this.operator = operator;
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