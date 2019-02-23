package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *�־���LicenseCategory
 *@author Created By b2btool 
 */
public class LicenseCategory implements Serializable {

	/**����ID*/
	    private long id;
    	/**������*/
	    private String catname;
    	/**����˵��*/
	    private String catdesc;
    	/**����Э��URL*/
	    private String protocol;
    	/**������*/
	    private String operator;
    	/**����ʱ��*/
	    private Timestamp pubdate;
    	/**���������(0��ʾ���ϴ�֤�飬1��ʾ��ǩ��Э��)*/
	    private String cattype;
    	/**�������ֶΣ�*/
	    private String status;
	    //�����ĸ����������� 2016.9.5 zwr
  		//��Ȩǰ�Ƿ�֧�����߽���  
  		private String besuponline;
  		
  		//��Ȩǰ�Ƿ�����˹����
  		private String becheck;
  		
  		//��Ȩ���Ƿ�֧�����߽���  
  		private String afsuponline;
  		
  		//��Ȩ���Ƿ�����˹����
  		private String afcheck;
    
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
    * ȡ��catname
    * @return catname
    */
   public String getCatname () {
       return catname;
   }
   /**
    * ����catname
    * @param catname ������catname
    */
   public void setCatname(String catname) {
       this.catname = catname;
   }
   
   /**
    * ȡ��catdesc
    * @return catdesc
    */
   public String getCatdesc () {
       return catdesc;
   }
   /**
    * ����catdesc
    * @param catdesc ������catdesc
    */
   public void setCatdesc(String catdesc) {
       this.catdesc = catdesc;
   }
   
   /**
    * ȡ��protocol
    * @return protocol
    */
   public String getProtocol () {
       return protocol;
   }
   /**
    * ����protocol
    * @param protocol ������protocol
    */
   public void setProtocol(String protocol) {
       this.protocol = protocol;
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
    * ȡ��cattype
    * @return cattype
    */
   public String getCattype () {
       return cattype;
   }
   /**
    * ����cattype
    * @param cattype ������cattype
    */
   public void setCattype(String cattype) {
       this.cattype = cattype;
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
	public String getBesuponline() {
		return besuponline;
	}
	public void setBesuponline(String besuponline) {
		this.besuponline = besuponline;
	}
	public String getBecheck() {
		return becheck;
	}
	public void setBecheck(String becheck) {
		this.becheck = becheck;
	}
	public String getAfsuponline() {
		return afsuponline;
	}
	public void setAfsuponline(String afsuponline) {
		this.afsuponline = afsuponline;
	}
	public String getAfcheck() {
		return afcheck;
	}
	public void setAfcheck(String afcheck) {
		this.afcheck = afcheck;
	}
	   

}