package com.hc360.dao.base;

import com.hc360.vo.OnCorTable;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Auther: Administrator
 * @Date: 2019/2/23 10:25
 * @Description:
 */
public class UserBaseMessageProvider {

    public String SelectUserWithParam(OnCorTable onCorTable){

        return new SQL(){
            {
                StringBuilder sql = new StringBuilder();

                sql.append("select oct.providerid,oct.name,oct.address,oct.contacter,oct.telephone,oct.mp,oct.username,");
                sql.append("oct.checked,oct.states,oct.memtypeid,oct.areaid,oct.userid,oct.unchecked,oct.freeshop ");
                sql.append(" from on_cor_table oct where 1 = 1");

                if (onCorTable.getUserid() != 0){
                    sql.append(" and oct.userid = #{userid}");
                }

                if(onCorTable.getProvinceid() != 0){
                    sql.append(" and oct.providerid = #{provinceid}");
                }

                if(StringUtils.isNotBlank(onCorTable.getChecked())){
                    sql.append(" and oct.checked = #{checked}");
                }

                if(StringUtils.isNotBlank(onCorTable.getStates())){
                    sql.append(" and oct.states = #{states}");
                }

                if(StringUtils.isNotBlank(onCorTable.getUnchecked())){
                    sql.append(" and oct.unchecked = #{unchecked}");
                }
            }
        }.toString();
    }
}
