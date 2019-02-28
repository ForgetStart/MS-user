package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: hk
 * @Date: 2019/2/28 18:39
 * @Description: 邮箱订阅
 */
public class SubscribeResultVO implements Serializable {

    //返回值
    private long subscribid;// 订阅关键字id

    //返回值 商机订阅状态 	 0 未订阅 1 已订阅
    private String mailsubscription;// 邮件订阅


    public long getSubscribid() {
        return subscribid;
    }

    public void setSubscribid(long subscribid) {
        this.subscribid = subscribid;
    }

    public String getMailsubscription() {
        return mailsubscription;
    }

    public void setMailsubscription(String mailsubscription) {
        this.mailsubscription = mailsubscription;
    }
}
