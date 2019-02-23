package com.hc360.dao.base;

import com.hc360.vo.OnCorTable;
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

    public String findLeaveWordCount(RecvnotesParam recvparam){
       return new SQL(){
            {
                StringBuilder sql = new StringBuilder();
                sql.append("SELECT count(a.id) from BusNote a where a.recvproviderid = #{provinceid}");
                sql.append(" and a.states='0' and (a.recvdel='0' or a.recvdel is null) AND a.isgarbage=0");
                sql.append(" and ((a.lstate= '0' and a.notekind='0') or (a.lstate='3' and a.notekind='1'))");
                sql.append(" and (a.sendproviderid = #{anymoussender} or exists");
                sql.append(" (select 'x' from OnCorTable c where c.id=a.sendproviderid and c.states='0'))");

                // 相关信息类型
                if (StringUtils.isNotBlank(recvparam.getInfotype())) {
                    sql.append( " and a.infotype =#{infotype} " );
                }
                // 只查询非系统留言
                if ( recvparam.isNotSysnote() ) {
                    sql.append( " and ( a.notetype =0 or a.notetype =1 ) " );
                }
            }
        }.toString();
    }
}
