package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类LicenseCategory
 *@author Created By b2btool 
 */
public class LicenseCategory implements Serializable {

	/**主键ID*/
	    private long id;
    	/**分类名*/
	    private String catname;
    	/**分类说明*/
	    private String catdesc;
    	/**分类协议URL*/
	    private String protocol;
    	/**操作人*/
	    private String operator;
    	/**发布时间*/
	    private Timestamp pubdate;
    	/**分类的类型(0表示需上传证书，1表示需签署协议)*/
	    private String cattype;
    	/**（保留字段）*/
	    private String status;
	    //以下四个变量新增于 2016.9.5 zwr
  		//授权前是否支持在线交易  
  		private String besuponline;
  		
  		//授权前是否必须人工审核
  		private String becheck;
  		
  		//授权后是否支持在线交易  
  		private String afsuponline;
  		
  		//授权后是否必须人工审核
  		private String afcheck;
    
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
    * 取得catname
    * @return catname
    */
   public String getCatname () {
       return catname;
   }
   /**
    * 设置catname
    * @param catname 待设置catname
    */
   public void setCatname(String catname) {
       this.catname = catname;
   }
   
   /**
    * 取得catdesc
    * @return catdesc
    */
   public String getCatdesc () {
       return catdesc;
   }
   /**
    * 设置catdesc
    * @param catdesc 待设置catdesc
    */
   public void setCatdesc(String catdesc) {
       this.catdesc = catdesc;
   }
   
   /**
    * 取得protocol
    * @return protocol
    */
   public String getProtocol () {
       return protocol;
   }
   /**
    * 设置protocol
    * @param protocol 待设置protocol
    */
   public void setProtocol(String protocol) {
       this.protocol = protocol;
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
    * 取得cattype
    * @return cattype
    */
   public String getCattype () {
       return cattype;
   }
   /**
    * 设置cattype
    * @param cattype 待设置cattype
    */
   public void setCattype(String cattype) {
       this.cattype = cattype;
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