package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类UserLicense
 *@author Created By b2btool 
 */
public class UserLicense implements Serializable {

	/**主键ID*/
	    private long id;
    	/**分类ID*/
	    private String licatid;
    	/**商户ID*/
	    private long providerid;
    	/**授权状态(0表示待授权，1表示已授权，2表示拒绝授权)*/
	    private String checked;
    	/**拒审理由*/
	    private String refreason;
    	/**发布时间*/
	    private Timestamp pubdate;
    	/**修改时间*/
	    private Timestamp modifydate;
    	/**授权时间*/
	    private Timestamp checkdate;
    	/**拒审时间*/
	    private Timestamp refcheckdate;
    	/**操作人*/
	    private String operator;
    	/**状态（0表示可用，1表示已删除）*/
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
    * 取得refreason
    * @return refreason
    */
   public String getRefreason () {
       return refreason;
   }
   /**
    * 设置refreason
    * @param refreason 待设置refreason
    */
   public void setRefreason(String refreason) {
       this.refreason = refreason;
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
   
   /**
    * 取得checkdate
    * @return checkdate
    */
   public Timestamp getCheckdate () {
       return checkdate;
   }
   /**
    * 设置checkdate
    * @param checkdate 待设置checkdate
    */
   public void setCheckdate(Timestamp checkdate) {
       this.checkdate = checkdate;
   }
   
   /**
    * 取得refcheckdate
    * @return refcheckdate
    */
   public Timestamp getRefcheckdate () {
       return refcheckdate;
   }
   /**
    * 设置refcheckdate
    * @param refcheckdate 待设置refcheckdate
    */
   public void setRefcheckdate(Timestamp refcheckdate) {
       this.refcheckdate = refcheckdate;
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