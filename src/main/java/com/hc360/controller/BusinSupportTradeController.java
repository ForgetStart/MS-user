package com.hc360.controller;

import com.hc360.model.*;
import com.hc360.service.BusinSupportTradeService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ���߽�����
 * @author hk
 * @date 2019-02-22
 */
@RestController
@RequestMapping("/v1/trade/businsupporttrade")
public class BusinSupportTradeController {
	
	protected static final Logger logger = LoggerFactory.getLogger("BusinSupportTradeController");

    @Autowired
    BusinSupportTradeService businSupportTradeService;

    /**
     * ��ȡ������Ҫ֤�����
     * @author hk
     * @date 2019-02-22
     * @return
     * @throws Exception
     */
    @RequestMapping("/getlicensecategoryall")
    public List<LicenseCategory> getLicenseCategoryAll() throws Exception {
    	return  businSupportTradeService.getLicenseCategoryAll();
    }


    /**
     * ͨ��֤������ȡ�̻��ķ���
     * @author hk
     * @date 2019-02-22
     * @return
     * @throws Exception
     */
    @RequestMapping("/getlicensecategoryitems/{licatid}")
    public  List<LicenseCategoryItems> getLicenseCategoryItems(@PathVariable("licatid") long licatid) throws Exception {
    	return  businSupportTradeService.getLicenseCategoryItems(licatid);
    }

    /**
     * �����ݿ��ȡ����������Ϣ
     * @author hk
     * @date 2019-02-22
     * @throws Exception
     */
    @RequestMapping("/getlicensecategorydb/{supcatid}")
    public LicenseCategory getLicenseCategoryDB(@PathVariable("supcatid") String supcatid) throws Exception {
        //��corp���ȡ��������
        List<LicenseCategory> lcs=businSupportTradeService.getLicenseCategoryAll();
        if(lcs!=null&&lcs.size()>0) {
            for(LicenseCategory lc:lcs){
                List<LicenseCategoryItems> lcis=businSupportTradeService.getLicenseCategoryItems(lc.getId());
                if(lcis!=null&&lcis.size()>0){
                    for(LicenseCategoryItems lci:lcis){
                        if(supcatid.indexOf(lci.getSupcatid())==0){
                            return lc;
                        }
                    }
                }
            }
            return null;
        }else{
            return null;
        }

    }

    /**
     * ��ȡ�����û�����Ȩ����
     * @author hk
     * @date 2019-02-22
     * @return
     * @throws Exception
     */
    @RequestMapping("/getuserlicenseall")
    public List<UserLicense> getUserLicenseAll() throws Exception {
    	return  businSupportTradeService.getUserLicenseAll();
    }

    /**
     * ��ȡ�û���Ȩ��ϸ
     * @author hk
     * @date 2019-02-22
     * @return
     * @throws Exception
     */
    @RequestMapping("/getuserlicenseitems/{userliid}")
    public List<UserLicenseItems> getUserLicenseItems(@PathVariable("userliid") long userliid) throws Exception {
    	return businSupportTradeService.getUserLicenseItems(userliid);
    }

    /**
     * ��ȡָ���û���Ȩ��Ϣ
     * @throws Exception
     */
    @RequestMapping("/getuserlicensedb/{providerid}/{licatid}")
    public List<UserLicenseItems> getUserLicenseDB(@PathVariable("providerid")long providerid, @PathVariable("licatid")String licatid) throws Exception {
        if(providerid==0l || StringUtils.isBlank(licatid)){
            return null;
        }
        //�����ݿ��ȡ��Ȩ��Ϣ
        List<UserLicense> uls=businSupportTradeService.getUserLicenseAllByProviderid(providerid);
        if(uls!=null&&uls.size()>0) {
            for(UserLicense ul:uls){
                if(licatid.equals(ul.getLicatid())){
                    return businSupportTradeService.getUserLicenseItems(ul.getId());
                }
            }
            return null;
        }else{
            return null;
        }
    }
    /**
     * ��ȡָ���û���Ȩ����״̬
     * @author hk
     * @date 2019-02-22
     * @return
     * @throws Exception
     */
    @RequestMapping("/findcorauthenstatelist/{providerid}")
   	public List<CorAuthenState> findCorAuthenStateList(@PathVariable("providerid") long providerid) throws Exception {
    	return businSupportTradeService.findCorAuthenStateList(providerid);
    }

}
