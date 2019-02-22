package com.hc360.dao;

import com.hc360.vo.CorBackListVo;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.CorTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 18:00
 * @Description: corp库信息查询
 */
@Mapper
public interface UserInfoMapper {

    @Select("select * from on_cor_table oct where oct.providerid = #{providerId} and oct.states = '0'")
    OnCorTable findOnCorTableByProviderId(@Param("providerId") Long providerId) throws Exception;

    @Select("select * from cor_table oct where oct.providerid = #{providerId} and oct.CHECKED = 1")
    CorTable findCorTableByProviderId(@Param("providerId") Long providerId) throws Exception;

    @Select("select * from cor_backlist cb where cb.providerid = #{providerId} and cb.states = #{states}")
    List<CorBackListVo> findCorBack(@Param("providerId") Long providerId, @Param("states") String states) throws Exception;

    @Select("select count(1) from Cor_District cd where cd.providerid = #{providerId}")
    int isDistrictByProviderid(@Param("providerId") Long providerId) throws Exception;

    @Select("select count(1) from cor_simple_reg csr where csr.userid = #{userId} and csr.states = '0'")
    int isSimpleUserByProviderId(@Param("userId") Long userId) throws Exception;
}
