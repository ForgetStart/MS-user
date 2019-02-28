package com.hc360.controller;

import com.hc360.b2b.B2BConstants;
import com.hc360.b2b.exception.MmtException;
import com.hc360.b2b.exception.Msg;
import com.hc360.b2b.exception.MsgCode;
import com.hc360.b2b.util.DateUtils;
import com.hc360.common.ReturnCode;
import com.hc360.common.constants.BusinConstants;
import com.hc360.common.constants.SubscibeConstants;
import com.hc360.model.FirstoperateLog;
import com.hc360.model.SubscribTable;
import com.hc360.model.Tmppic;
import com.hc360.service.BusinSubscribeService;
import com.hc360.service.TemppicsService;
import com.hc360.vo.SubscribeParamVO;
import com.hc360.vo.SubscribeResultVO;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scala.annotation.target.param;

import java.util.List;

/**
 * 商机邮件订阅服务服务类
 * @author hk
 * @date 2019-02-27
 */
@RestController
@RequestMapping("/v1/subscribe")
public class BusinSubscribeController {
	
	protected static final Logger logger = LoggerFactory.getLogger("BusinSubscribeController");

    @Autowired
    BusinSubscribeService businSubscribeService;

    /**
     * 邮件订阅
     * @author hk
     * @date 2019-02-28
     * @return
     * @throws Exception
     */
    @RequestMapping("/savesubscribtable")
    public BaseResult<SubscribeResultVO> saveSubscribTable(@RequestBody SubscribeParamVO param) throws Exception {

        BaseResult<SubscribeResultVO> result = new BaseResult<SubscribeResultVO>();

        if(param == null || param.getProviderid()<=0 || StringUtils.isBlank(param.getKeyword()) || StringUtils.isBlank(param.getL3supcatid())
            || StringUtils.isBlank(param.getSupcatid()) || StringUtils.isBlank(param.getSorttag())){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {

            /**
             * 规则:
             * 1.还要判断当达到该用户可订阅商机关键字个数是否达到上限
             * 2.如订阅的“产品关键字”“产品分类”重复，此订阅数据不入库，也不需做特殊提示。
             */
            String ismail = BusinConstants.BUSIN_ISMAIL_UNORDER;

            if (param.getKeyword().getBytes().length > 30) {
                ismail = BusinConstants.BUSIN_ISMAIL_ORDER;
            }

            if (param.getKeyword().indexOf(" ") > -1 || param.getKeyword().indexOf("；") > -1 || param.getKeyword().indexOf("、") > -1 || param.getKeyword().indexOf("，") > -1) {
                ismail = BusinConstants.BUSIN_ISMAIL_ORDER;
            }

            //订阅关键词个数统计
            int count = businSubscribeService.getSubKewordCount(param.getProviderid());
            if ((String.valueOf(param.getMemtypeid())).compareTo(B2BConstants.MEMBER_MMT_TRYOUT) >= 0) {
                if (count == SubscibeConstants.CHARGE_MEMBER_KEYWORD) {
                    ismail = BusinConstants.BUSIN_ISMAIL_ORDER;
                }
            } else {
                if (count == SubscibeConstants.NOT_CHARGE_MEMBER_KEYWORD) {
                    ismail = BusinConstants.BUSIN_ISMAIL_ORDER;
                }
            }

            String infotype,subscribsupcat;
            if(BusinConstants.BUSIN_SUPPLY_SORTTAG.equals(param.getSorttag())){
                infotype="1";
                subscribsupcat=param.getL3supcatid();
            }else{
                infotype="0";
                subscribsupcat=param.getSupcatid();
            }

            //对订阅信息进行排重
            String ret=businSubscribeService.isRepeatKeyWord(param.getProviderid(), param.getKeyword(), subscribsupcat, 0, infotype);
            if (ret!=null && !"".equals(ret)){
                ismail = BusinConstants.BUSIN_ISMAIL_ORDER;
            }

            if(BusinConstants.BUSIN_ISMAIL_UNORDER.equals(ismail)){//判断这个关键字是否已经被订阅，如果已经被订阅则不再订阅
                SubscribTable subtable = new SubscribTable();
                subtable.setKeyword(param.getKeyword());

                subtable.setInfotype(infotype);//订阅求购
                subtable.setSupcatid(subscribsupcat);//订阅关键词优化 2009.5.20 修改成一级分类
                subtable.setValidatetime(7);//7天

                //是否选择按地区筛选,地区不限
                subtable.setZone("0");
                subtable.setProvinceid(0);
                subtable.setCityid(0);

                subtable.setChecked(SubscibeConstants.SUBSCIBE_UNCHECKED);
                subtable.setProviderid(param.getProviderid());
                subtable.setIssend(SubscibeConstants.EMAIL_UNSEND);

                subtable.setSubtype(SubscibeConstants.SUB_KEYWORD_SUBTYPE);
                subtable.setPubdate(DateUtils.getSysTimestamp());

                subtable.setIsrepeat(SubscibeConstants.SUBSCIBE_REPEAT);

                //调用订阅方法, 2009-11-13
                businSubscribeService.saveSubscribTable(param,subtable);

                SubscribeResultVO resultData = new SubscribeResultVO();
                resultData.setSubscribid(subtable.getId());
                resultData.setMailsubscription(ismail);
                result.setData(resultData);
            }

            result.setErrcode(ReturnCode.OK.getErrcode());
            result.setErrmsg(ReturnCode.OK.getErrmsg());
        } catch (Exception e) {
            logger.error("保存邮件订阅服务异常！",e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


}
