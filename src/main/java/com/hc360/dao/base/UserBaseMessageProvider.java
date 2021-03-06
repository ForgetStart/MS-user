package com.hc360.dao.base;

import com.hc360.vo.CityVo;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.ProvinceVo;
import com.hc360.vo.RecvnotesParam;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Auther: Administrator
 * @Date: 2019/2/23 10:25
 * @Description:
 */
public class UserBaseMessageProvider {

    public String SelectUserWithParam(OnCorTable onCorTable) {

        StringBuilder sql = new StringBuilder();

        sql.append("select oct.providerid as id,oct.name,oct.address,oct.contacter,oct.telephone,oct.mp,oct.username,");
        sql.append("oct.checked,oct.states,oct.memtypeid,oct.areaid,oct.userid,oct.unchecked,oct.freeshop,oct.identity");
        sql.append(",oct.degrade");
        sql.append(" from on_cor_table oct where 1 = 1");

        if (onCorTable.getUserid() != 0) {
            sql.append(" and oct.userid = " + onCorTable.getUserid());
        }

        if (onCorTable.getProvinceid() != 0) {
            sql.append(" and oct.providerid = " + onCorTable.getProvinceid());
        }

        if (StringUtils.isNotBlank(onCorTable.getChecked())) {
            sql.append(" and oct.checked = " + onCorTable.getChecked());
        }

        if (StringUtils.isNotBlank(onCorTable.getStates())) {
            sql.append(" and oct.states = " + onCorTable.getStates());
        }

        if (StringUtils.isNotBlank(onCorTable.getUnchecked())) {
            sql.append(" and oct.unchecked = " + onCorTable.getUnchecked());
        }

        return sql.toString();
    }

    public String findLeaveWordCount(RecvnotesParam recvparam) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT count(a.noteid) from bus_note a where a.recvproviderid =" + recvparam.getProvinceid());
        sql.append(" and a.states='0' and (a.recvdel='0' or a.recvdel is null) AND a.isgarbage=0");
        sql.append(" and ((a.lstate= '0' and a.note_kind='0') or (a.lstate='3' and a.note_kind='1'))");
        sql.append(" and (a.sendproviderid ="+recvparam.getAnymoussender() +" or exists");
        sql.append(" (select 'x' from on_cor_table c where c.providerid=a.sendproviderid and c.states='0'))");

        // 相关信息类型
        if (StringUtils.isNotBlank(recvparam.getInfotype())) {
            sql.append(" and a.infotype = " + recvparam.getInfotype());
        }
        // 只查询非系统留言
        if (recvparam.isNotSysnote()) {
            sql.append(" and ( a.notetype =0 or a.notetype =1 ) ");
        }

        return sql.toString();
    }


    public String findCity(CityVo cityVo) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c.*,c.province_id as provinceId FROM CITY c where 1 = 1");

        if (cityVo.getId() != null) {
            sql.append("and c.id = " + cityVo.getId());
        }

        if (StringUtils.isNotBlank(cityVo.getCityCode())) {
            sql.append("and c.citycode = " + cityVo.getCityCode());
        }

        return sql.toString();
    }

    public String findProvince(ProvinceVo provinceVo) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT p.*,p.country_id as countryId FROM PROVINCE p where 1 = 1");

        if (provinceVo.getId() != null) {
            sql.append("and p.id = " + provinceVo.getId());
        }

        if (null != provinceVo.getCountryId()) {
            sql.append("and p.country_id = " + provinceVo.getCountryId());
        }

        return sql.toString();
    }
}
