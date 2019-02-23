package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类Tmppic
 *@author Created By b2btool 
 */

public class Tmppic implements Serializable {

	/**id*/
    private long id;
	/**picname*/
    private String picname;
	/**pubdate*/
    private Timestamp pubdate;
	/**infotype*/
    private String infotype;
	/**picindex*/
    private long picindex;
	/**filenotes*/
    private String filenotes;
	/**originid*/
    private long originid;
	/**originfilename*/
    private String originfilename;
	/**sessionid*/
    private long sessionid;
	/**states*/
    private long states;
	/**宽度*/
    private long width;
	/**高度*/
    private long height;
	/**picid*/
    private Long picid;

    public Long getPicid() {
		return picid;
	}
	public void setPicid(Long picid) {
		this.picid = picid;
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
    * 取得picname
    * @return picname
    */
   public String getPicname () {
       return picname;
   }
   /**
    * 设置picname
    * @param picname 待设置picname
    */
   public void setPicname(String picname) {
       this.picname = picname;
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
    * 取得picindex
    * @return picindex
    */
   public long getPicindex () {
       return picindex;
   }
   /**
    * 设置picindex
    * @param picindex 待设置picindex
    */
   public void setPicindex(long picindex) {
       this.picindex = picindex;
   }
   
   /**
    * 取得filenotes
    * @return filenotes
    */
   public String getFilenotes () {
       return filenotes;
   }
   /**
    * 设置filenotes
    * @param filenotes 待设置filenotes
    */
   public void setFilenotes(String filenotes) {
       this.filenotes = filenotes;
   }
   
   /**
    * 取得originid
    * @return originid
    */
   public long getOriginid () {
       return originid;
   }
   /**
    * 设置originid
    * @param originid 待设置originid
    */
   public void setOriginid(long originid) {
       this.originid = originid;
   }
   
   /**
    * 取得originfilename
    * @return originfilename
    */
   public String getOriginfilename () {
       return originfilename;
   }
   /**
    * 设置originfilename
    * @param originfilename 待设置originfilename
    */
   public void setOriginfilename(String originfilename) {
       this.originfilename = originfilename;
   }
   
   /**
    * 取得sessionid
    * @return sessionid
    */
   public long getSessionid () {
       return sessionid;
   }
   /**
    * 设置sessionid
    * @param sessionid 待设置sessionid
    */
   public void setSessionid(long sessionid) {
       this.sessionid = sessionid;
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
public long getHeight() {
	return height;
}
public void setHeight(long height) {
	this.height = height;
}
public long getWidth() {
	return width;
}
public void setWidth(long width) {
	this.width = width;
}
   

}