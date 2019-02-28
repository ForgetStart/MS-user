package com.hc360.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *持久类FirstoperateLog
 *@author Created By b2btool 
 */

public class FirstoperateLog implements Serializable {

	/**id*/
    private long id;
	/**operate*/
    private long operate;
	/**pubdate*/
    private Timestamp pubdate;
	/**providerid*/
    private long providerid;

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
    * 取得operate
    * @return operate
    */
   public long getOperate () {
       return operate;
   }
   /**
    * 设置operate
    * @param operate 待设置operate
    */
   public void setOperate(long operate) {
       this.operate = operate;
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
   

}