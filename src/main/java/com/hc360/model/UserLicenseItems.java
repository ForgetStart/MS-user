package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *�־���UserLicenseItems
 *@author Created By b2btool 
 */
public class UserLicenseItems implements Serializable {

	/**����ID*/
	    private long id;
    	/**�̻���֤�����ID*/
	    private String userliid;
    	/**֤������*/
	    private String licensename;
    	/**ͼƬ����*/
	    private String picpath;
    	/**����ʱ��*/
	    private Timestamp pubdate;
    	/**��Ч��*/
	    private Timestamp enddate;
    	/**״̬��0��ʾ������1��ʾ��ɾ����*/
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
    * ȡ��userliid
    * @return userliid
    */
   public String getUserliid () {
       return userliid;
   }
   /**
    * ����userliid
    * @param userliid ������userliid
    */
   public void setUserliid(String userliid) {
       this.userliid = userliid;
   }
   
   /**
    * ȡ��licensename
    * @return licensename
    */
   public String getLicensename () {
       return licensename;
   }
   /**
    * ����licensename
    * @param licensename ������licensename
    */
   public void setLicensename(String licensename) {
       this.licensename = licensename;
   }
   
   /**
    * ȡ��picpath
    * @return picpath
    */
   public String getPicpath () {
       return picpath;
   }
   /**
    * ����picpath
    * @param picpath ������picpath
    */
   public void setPicpath(String picpath) {
       this.picpath = picpath;
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
    * ȡ��enddate
    * @return enddate
    */
   public Timestamp getEnddate () {
       return enddate;
   }
   /**
    * ����enddate
    * @param enddate ������enddate
    */
   public void setEnddate(Timestamp enddate) {
       this.enddate = enddate;
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