package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *�־���LicenseCategoryItems
 *@author Created By b2btool 
 */
public class LicenseCategoryItems implements Serializable {

	/**����ID*/
	    private long id;
    	/**�����ID*/
	    private String licatid;
    	/**�ռ�����ID*/
	    private String supcatid;
    	/**����ʱ��*/
	    private Timestamp pubdate;
    	/**������*/
	    private String operator;
    	/**(�����ֶ�)*/
	    private String status;
    
   /**
    * ȡ��id
    * @return id
    */
   public long getId () {
       return id;
   }
   /**
    * ����id
    * @param id ������id
    */
   public void setId(long id) {
       this.id = id;
   }
   
   /**
    * ȡ��licatid
    * @return licatid
    */
   public String getLicatid () {
       return licatid;
   }
   /**
    * ����licatid
    * @param licatid ������licatid
    */
   public void setLicatid(String licatid) {
       this.licatid = licatid;
   }
   
   /**
    * ȡ��supcatid
    * @return supcatid
    */
   public String getSupcatid () {
       return supcatid;
   }
   /**
    * ����supcatid
    * @param supcatid ������supcatid
    */
   public void setSupcatid(String supcatid) {
       this.supcatid = supcatid;
   }
   
   /**
    * ȡ��pubdate
    * @return pubdate
    */
   public Timestamp getPubdate () {
       return pubdate;
   }
   /**
    * ����pubdate
    * @param pubdate ������pubdate
    */
   public void setPubdate(Timestamp pubdate) {
       this.pubdate = pubdate;
   }
   
   /**
    * ȡ��operator
    * @return operator
    */
   public String getOperator () {
       return operator;
   }
   /**
    * ����operator
    * @param operator ������operator
    */
   public void setOperator(String operator) {
       this.operator = operator;
   }
   
   /**
    * ȡ��status
    * @return status
    */
   public String getStatus () {
       return status;
   }
   /**
    * ����status
    * @param status ������status
    */
   public void setStatus(String status) {
       this.status = status;
   }
   

}