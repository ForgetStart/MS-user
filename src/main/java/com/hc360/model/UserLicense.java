package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *�־���UserLicense
 *@author Created By b2btool 
 */
public class UserLicense implements Serializable {

	/**����ID*/
	    private long id;
    	/**����ID*/
	    private String licatid;
    	/**�̻�ID*/
	    private long providerid;
    	/**��Ȩ״̬(0��ʾ����Ȩ��1��ʾ����Ȩ��2��ʾ�ܾ���Ȩ)*/
	    private String checked;
    	/**��������*/
	    private String refreason;
    	/**����ʱ��*/
	    private Timestamp pubdate;
    	/**�޸�ʱ��*/
	    private Timestamp modifydate;
    	/**��Ȩʱ��*/
	    private Timestamp checkdate;
    	/**����ʱ��*/
	    private Timestamp refcheckdate;
    	/**������*/
	    private String operator;
    	/**״̬��0��ʾ���ã�1��ʾ��ɾ����*/
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
    * ȡ��providerid
    * @return providerid
    */
   public long getProviderid () {
       return providerid;
   }
   /**
    * ����providerid
    * @param providerid ������providerid
    */
   public void setProviderid(long providerid) {
       this.providerid = providerid;
   }
   
   /**
    * ȡ��checked
    * @return checked
    */
   public String getChecked () {
       return checked;
   }
   /**
    * ����checked
    * @param checked ������checked
    */
   public void setChecked(String checked) {
       this.checked = checked;
   }
   
   /**
    * ȡ��refreason
    * @return refreason
    */
   public String getRefreason () {
       return refreason;
   }
   /**
    * ����refreason
    * @param refreason ������refreason
    */
   public void setRefreason(String refreason) {
       this.refreason = refreason;
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
    * ȡ��modifydate
    * @return modifydate
    */
   public Timestamp getModifydate () {
       return modifydate;
   }
   /**
    * ����modifydate
    * @param modifydate ������modifydate
    */
   public void setModifydate(Timestamp modifydate) {
       this.modifydate = modifydate;
   }
   
   /**
    * ȡ��checkdate
    * @return checkdate
    */
   public Timestamp getCheckdate () {
       return checkdate;
   }
   /**
    * ����checkdate
    * @param checkdate ������checkdate
    */
   public void setCheckdate(Timestamp checkdate) {
       this.checkdate = checkdate;
   }
   
   /**
    * ȡ��refcheckdate
    * @return refcheckdate
    */
   public Timestamp getRefcheckdate () {
       return refcheckdate;
   }
   /**
    * ����refcheckdate
    * @param refcheckdate ������refcheckdate
    */
   public void setRefcheckdate(Timestamp refcheckdate) {
       this.refcheckdate = refcheckdate;
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