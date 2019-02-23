package com.hc360.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *�־���CorAuthenState
 *@author Created By b2btool 
 */
public class CorAuthenState implements Serializable {

	/**����id*/
	    private long id;
    	/**�û�id*/
	    private long userid;
    	/**��Աid*/
	    private long providerid;
    	/**�û���*/
	    private String username;
    	/**��������id*/
	    private long personalid = 0L;
    	/**��ҵ����id*/
	    private long companyid = 0L;
    	/**���id*/
	    private long checkid;
    	/**�����˺�id*/
	    private long bankid = 0L; 
    	/**�û�����0����Ѹ��ˣ�1�����ҵ���幤�̻���2�������ҵ��˾��3���շѸ��ˣ�4�� ���շ���ҵ���幤�̻���5���շ���ҵ��˾*/
	    private String type;
    	/**��֤״̬1:��Ա�����ύ��2�����������ύ��3�������֤ͨ�� 11�����������ύ 12 �����֤ͨ�� 13 �����Ѿ��ύ*/
	    private String authenstate;
    	/**�۸���״̬0:δ�ύ���۸�����1�����͸��۸�����2�����ɹ���3�����ʧ��*/
	    private String hfbstate;
    	/**���״̬0:δ��ˣ�1�����ͨ����2:����*/
	    private String checkedstate;
    	/**��˾����/�û�*/
	    private String name;
    	/**��֤��Դ1:������֤��2�����֣�3:����*/
	    private String sourcetype;
    	/**�����*/
	    private BigDecimal money = new BigDecimal(0);
    	/**�����֤����*/
	    private long verifycount;
    	/**���������*/
	    private long applycount;
    	/**���ʧ�ܱ���*/
	    private String hfbfailcode;
    	/**���ʧ��ԭ��*/
	    private String hfbfailcause;
    	/**�۸�����ˮ��*/
	    private String serialnumber;
    	/**�۸�������Ψһid*/
	    private String applyuniqueid;
    	/**360�쵽��ʱ��*/
	    private Timestamp endtime;
    	/**����ʱ��*/
	    private Timestamp createtime;
    	/**�޸�ʱ��*/
	    private Timestamp updatetime;
    	/**HFB������ʱ��*/
	    private Timestamp hfbtime;
    	/**�Ƿ񷢶���*/
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
    * ȡ��userid
    * @return userid
    */
   public long getUserid () {
       return userid;
   }
   /**
    * ����userid
    * @param userid ������userid
    */
   public void setUserid(long userid) {
       this.userid = userid;
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
    * ȡ��username
    * @return username
    */
   public String getUsername () {
       return username;
   }
   /**
    * ����username
    * @param username ������username
    */
   public void setUsername(String username) {
       this.username = username;
   }
   
   /**
    * ȡ��personalid
    * @return personalid
    */
   public long getPersonalid () {
       return personalid;
   }
   /**
    * ����personalid
    * @param personalid ������personalid
    */
   public void setPersonalid(long personalid) {
       this.personalid = personalid;
   }
   
   /**
    * ȡ��companyid
    * @return companyid
    */
   public long getCompanyid () {
       return companyid;
   }
   /**
    * ����companyid
    * @param companyid ������companyid
    */
   public void setCompanyid(long companyid) {
       this.companyid = companyid;
   }
   
   /**
    * ȡ��checkid
    * @return checkid
    */
   public long getCheckid () {
       return checkid;
   }
   /**
    * ����checkid
    * @param checkid ������checkid
    */
   public void setCheckid(long checkid) {
       this.checkid = checkid;
   }
   
   /**
    * ȡ��bankid
    * @return bankid
    */
   public long getBankid () {
       return bankid;
   }
   /**
    * ����bankid
    * @param bankid ������bankid
    */
   public void setBankid(long bankid) {
       this.bankid = bankid;
   }
   
   /**
    * ȡ��type
    * @return type
    */
   public String getType () {
       return type;
   }
   /**
    * ����type
    * @param type ������type
    */
   public void setType(String type) {
       this.type = type;
   }
   
   /**
    * ȡ��authenstate
    * @return authenstate
    */
   public String getAuthenstate () {
       return authenstate;
   }
   /**
    * ����authenstate
    * @param authenstate ������authenstate
    */
   public void setAuthenstate(String authenstate) {
       this.authenstate = authenstate;
   }
   
   /**
    * ȡ��hfbstate
    * @return hfbstate
    */
   public String getHfbstate () {
       return hfbstate;
   }
   /**
    * ����hfbstate
    * @param hfbstate ������hfbstate
    */
   public void setHfbstate(String hfbstate) {
       this.hfbstate = hfbstate;
   }
   
   /**
    * ȡ��checkedstate
    * @return checkedstate
    */
   public String getCheckedstate () {
       return checkedstate;
   }
   /**
    * ����checkedstate
    * @param checkedstate ������checkedstate
    */
   public void setCheckedstate(String checkedstate) {
       this.checkedstate = checkedstate;
   }
   
   /**
    * ȡ��name
    * @return name
    */
   public String getName () {
       return name;
   }
   /**
    * ����name
    * @param name ������name
    */
   public void setName(String name) {
       this.name = name;
   }
   
   /**
    * ȡ��sourcetype
    * @return sourcetype
    */
   public String getSourcetype () {
       return sourcetype;
   }
   /**
    * ����sourcetype
    * @param sourcetype ������sourcetype
    */
   public void setSourcetype(String sourcetype) {
       this.sourcetype = sourcetype;
   }
   
   /**
    * ȡ��money
    * @return money
    */
   public BigDecimal getMoney () {
       return money;
   }
   /**
    * ����money
    * @param money ������money
    */
   public void setMoney(BigDecimal money) {
       this.money = money;
   }
   
   /**
    * ȡ��verifycount
    * @return verifycount
    */
   public long getVerifycount () {
       return verifycount;
   }
   /**
    * ����verifycount
    * @param verifycount ������verifycount
    */
   public void setVerifycount(long verifycount) {
       this.verifycount = verifycount;
   }
   
   /**
    * ȡ��applycount
    * @return applycount
    */
   public long getApplycount () {
       return applycount;
   }
   /**
    * ����applycount
    * @param applycount ������applycount
    */
   public void setApplycount(long applycount) {
       this.applycount = applycount;
   }
   
   /**
    * ȡ��hfbfailcode
    * @return hfbfailcode
    */
   public String getHfbfailcode () {
       return hfbfailcode;
   }
   /**
    * ����hfbfailcode
    * @param hfbfailcode ������hfbfailcode
    */
   public void setHfbfailcode(String hfbfailcode) {
       this.hfbfailcode = hfbfailcode;
   }
   
   /**
    * ȡ��hfbfailcause
    * @return hfbfailcause
    */
   public String getHfbfailcause () {
       return hfbfailcause;
   }
   /**
    * ����hfbfailcause
    * @param hfbfailcause ������hfbfailcause
    */
   public void setHfbfailcause(String hfbfailcause) {
       this.hfbfailcause = hfbfailcause;
   }
   
   /**
    * ȡ��serialnumber
    * @return serialnumber
    */
   public String getSerialnumber () {
       return serialnumber;
   }
   /**
    * ����serialnumber
    * @param serialnumber ������serialnumber
    */
   public void setSerialnumber(String serialnumber) {
       this.serialnumber = serialnumber;
   }
   
   /**
    * ȡ��applyuniqueid
    * @return applyuniqueid
    */
   public String getApplyuniqueid () {
       return applyuniqueid;
   }
   /**
    * ����applyuniqueid
    * @param applyuniqueid ������applyuniqueid
    */
   public void setApplyuniqueid(String applyuniqueid) {
       this.applyuniqueid = applyuniqueid;
   }
   
   /**
    * ȡ��endtime
    * @return endtime
    */
   public Timestamp getEndtime () {
       return endtime;
   }
   /**
    * ����endtime
    * @param endtime ������endtime
    */
   public void setEndtime(Timestamp endtime) {
       this.endtime = endtime;
   }
   
   /**
    * ȡ��createtime
    * @return createtime
    */
   public Timestamp getCreatetime () {
       return createtime;
   }
   /**
    * ����createtime
    * @param createtime ������createtime
    */
   public void setCreatetime(Timestamp createtime) {
       this.createtime = createtime;
   }
   
   /**
    * ȡ��updatetime
    * @return updatetime
    */
   public Timestamp getUpdatetime () {
       return updatetime;
   }
   /**
    * ����updatetime
    * @param updatetime ������updatetime
    */
   public void setUpdatetime(Timestamp updatetime) {
       this.updatetime = updatetime;
   }
   

}