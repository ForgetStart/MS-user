package com.hc360.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *持久类CorAuthenState
 *@author Created By b2btool 
 */
public class CorAuthenState implements Serializable {

	/**主键id*/
	    private long id;
    	/**用户id*/
	    private long userid;
    	/**会员id*/
	    private long providerid;
    	/**用户名*/
	    private String username;
    	/**个人资料id*/
	    private long personalid = 0L;
    	/**企业资料id*/
	    private long companyid = 0L;
    	/**审核id*/
	    private long checkid;
    	/**银行账号id*/
	    private long bankid = 0L; 
    	/**用户类型0：免费个人，1免费企业个体工商户，2：免费企业公司，3：收费个人，4： 收收费企业个体工商户，5：收费企业公司*/
	    private String type;
    	/**认证状态1:会员资料提交，2：银行资料提交，3：打款认证通过 11：银行资料提交 12 打款认证通过 13 资料已经提交*/
	    private String authenstate;
    	/**慧付宝状态0:未提交到慧付宝，1：推送给慧付宝，2：打款成功，3：打款失败*/
	    private String hfbstate;
    	/**审核状态0:未审核，1：审核通过，2:拒审*/
	    private String checkedstate;
    	/**公司名称/用户*/
	    private String name;
    	/**认证来源1:申请认证，2：提现，3:余额付款*/
	    private String sourcetype;
    	/**打款金额*/
	    private BigDecimal money = new BigDecimal(0);
    	/**金额验证次数*/
	    private long verifycount;
    	/**申请打款次数*/
	    private long applycount;
    	/**打款失败编码*/
	    private String hfbfailcode;
    	/**打款失败原因*/
	    private String hfbfailcause;
    	/**慧付报流水号*/
	    private String serialnumber;
    	/**慧付宝申请唯一id*/
	    private String applyuniqueid;
    	/**360天到期时间*/
	    private Timestamp endtime;
    	/**创建时间*/
	    private Timestamp createtime;
    	/**修改时间*/
	    private Timestamp updatetime;
    	/**HFB打款完成时间*/
	    private Timestamp hfbtime;
    	/**是否发短信*/
	    private long issend;
    
	    public Timestamp getHfbtime() {
			return hfbtime;
		}
		public void setHfbtime(Timestamp hfbtime) {
			this.hfbtime = hfbtime;
		}
		public long getIssend() {
			return issend;
		}
		public void setIssend(long issend) {
			this.issend = issend;
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
    * 取得userid
    * @return userid
    */
   public long getUserid () {
       return userid;
   }
   /**
    * 设置userid
    * @param userid 待设置userid
    */
   public void setUserid(long userid) {
       this.userid = userid;
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
    * 取得username
    * @return username
    */
   public String getUsername () {
       return username;
   }
   /**
    * 设置username
    * @param username 待设置username
    */
   public void setUsername(String username) {
       this.username = username;
   }
   
   /**
    * 取得personalid
    * @return personalid
    */
   public long getPersonalid () {
       return personalid;
   }
   /**
    * 设置personalid
    * @param personalid 待设置personalid
    */
   public void setPersonalid(long personalid) {
       this.personalid = personalid;
   }
   
   /**
    * 取得companyid
    * @return companyid
    */
   public long getCompanyid () {
       return companyid;
   }
   /**
    * 设置companyid
    * @param companyid 待设置companyid
    */
   public void setCompanyid(long companyid) {
       this.companyid = companyid;
   }
   
   /**
    * 取得checkid
    * @return checkid
    */
   public long getCheckid () {
       return checkid;
   }
   /**
    * 设置checkid
    * @param checkid 待设置checkid
    */
   public void setCheckid(long checkid) {
       this.checkid = checkid;
   }
   
   /**
    * 取得bankid
    * @return bankid
    */
   public long getBankid () {
       return bankid;
   }
   /**
    * 设置bankid
    * @param bankid 待设置bankid
    */
   public void setBankid(long bankid) {
       this.bankid = bankid;
   }
   
   /**
    * 取得type
    * @return type
    */
   public String getType () {
       return type;
   }
   /**
    * 设置type
    * @param type 待设置type
    */
   public void setType(String type) {
       this.type = type;
   }
   
   /**
    * 取得authenstate
    * @return authenstate
    */
   public String getAuthenstate () {
       return authenstate;
   }
   /**
    * 设置authenstate
    * @param authenstate 待设置authenstate
    */
   public void setAuthenstate(String authenstate) {
       this.authenstate = authenstate;
   }
   
   /**
    * 取得hfbstate
    * @return hfbstate
    */
   public String getHfbstate () {
       return hfbstate;
   }
   /**
    * 设置hfbstate
    * @param hfbstate 待设置hfbstate
    */
   public void setHfbstate(String hfbstate) {
       this.hfbstate = hfbstate;
   }
   
   /**
    * 取得checkedstate
    * @return checkedstate
    */
   public String getCheckedstate () {
       return checkedstate;
   }
   /**
    * 设置checkedstate
    * @param checkedstate 待设置checkedstate
    */
   public void setCheckedstate(String checkedstate) {
       this.checkedstate = checkedstate;
   }
   
   /**
    * 取得name
    * @return name
    */
   public String getName () {
       return name;
   }
   /**
    * 设置name
    * @param name 待设置name
    */
   public void setName(String name) {
       this.name = name;
   }
   
   /**
    * 取得sourcetype
    * @return sourcetype
    */
   public String getSourcetype () {
       return sourcetype;
   }
   /**
    * 设置sourcetype
    * @param sourcetype 待设置sourcetype
    */
   public void setSourcetype(String sourcetype) {
       this.sourcetype = sourcetype;
   }
   
   /**
    * 取得money
    * @return money
    */
   public BigDecimal getMoney () {
       return money;
   }
   /**
    * 设置money
    * @param money 待设置money
    */
   public void setMoney(BigDecimal money) {
       this.money = money;
   }
   
   /**
    * 取得verifycount
    * @return verifycount
    */
   public long getVerifycount () {
       return verifycount;
   }
   /**
    * 设置verifycount
    * @param verifycount 待设置verifycount
    */
   public void setVerifycount(long verifycount) {
       this.verifycount = verifycount;
   }
   
   /**
    * 取得applycount
    * @return applycount
    */
   public long getApplycount () {
       return applycount;
   }
   /**
    * 设置applycount
    * @param applycount 待设置applycount
    */
   public void setApplycount(long applycount) {
       this.applycount = applycount;
   }
   
   /**
    * 取得hfbfailcode
    * @return hfbfailcode
    */
   public String getHfbfailcode () {
       return hfbfailcode;
   }
   /**
    * 设置hfbfailcode
    * @param hfbfailcode 待设置hfbfailcode
    */
   public void setHfbfailcode(String hfbfailcode) {
       this.hfbfailcode = hfbfailcode;
   }
   
   /**
    * 取得hfbfailcause
    * @return hfbfailcause
    */
   public String getHfbfailcause () {
       return hfbfailcause;
   }
   /**
    * 设置hfbfailcause
    * @param hfbfailcause 待设置hfbfailcause
    */
   public void setHfbfailcause(String hfbfailcause) {
       this.hfbfailcause = hfbfailcause;
   }
   
   /**
    * 取得serialnumber
    * @return serialnumber
    */
   public String getSerialnumber () {
       return serialnumber;
   }
   /**
    * 设置serialnumber
    * @param serialnumber 待设置serialnumber
    */
   public void setSerialnumber(String serialnumber) {
       this.serialnumber = serialnumber;
   }
   
   /**
    * 取得applyuniqueid
    * @return applyuniqueid
    */
   public String getApplyuniqueid () {
       return applyuniqueid;
   }
   /**
    * 设置applyuniqueid
    * @param applyuniqueid 待设置applyuniqueid
    */
   public void setApplyuniqueid(String applyuniqueid) {
       this.applyuniqueid = applyuniqueid;
   }
   
   /**
    * 取得endtime
    * @return endtime
    */
   public Timestamp getEndtime () {
       return endtime;
   }
   /**
    * 设置endtime
    * @param endtime 待设置endtime
    */
   public void setEndtime(Timestamp endtime) {
       this.endtime = endtime;
   }
   
   /**
    * 取得createtime
    * @return createtime
    */
   public Timestamp getCreatetime () {
       return createtime;
   }
   /**
    * 设置createtime
    * @param createtime 待设置createtime
    */
   public void setCreatetime(Timestamp createtime) {
       this.createtime = createtime;
   }
   
   /**
    * 取得updatetime
    * @return updatetime
    */
   public Timestamp getUpdatetime () {
       return updatetime;
   }
   /**
    * 设置updatetime
    * @param updatetime 待设置updatetime
    */
   public void setUpdatetime(Timestamp updatetime) {
       this.updatetime = updatetime;
   }
   

}