package com.hc360.common.util;

import com.hc360.b2b.netWorker.UrlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/25 20:37
 * @Description:
 */
public class SearchkeyWordUtil {
    public static List<String> getAllowScreenKeyword(long providerId) throws Exception {
        String[] allowWordList = null;
        List<String> result = null;
        String allowWords = null;
            String urlString = "http://detail.b2b.hc360.com/detail/turbine/action/ajax.WhiteListAjaxAction?providerid=" + providerId;
            new UrlSession();
            allowWords = UrlSession.getHtmlCode(urlString);
            allowWords = new String(allowWords.getBytes("ISO-8859-1"), "GBK");

        if (allowWords != null && !"".equals(allowWords)) {
            result = new ArrayList<String>();
            allowWordList = allowWords.split(",");
            if (allowWordList != null && allowWordList.length > 0) {
                for(int i = 0; i < allowWordList.length; ++i) {
                    result.add(allowWordList[i]);
                }
            }
        }

        return result;
    }
}
