package com.cetiti.tlgm.service.performance.mapper;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 三级网格数据访问接口
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-06-27 15:33:24
 */
@Repository
public interface GridCommunityTownshipMapper {

    /**
     * 根据id查出名称
     * @param id
     * @return
     * @throws SQLException
     */
    @Select("SELECT NAME FROM grid_info where id = #{id}")
    String getNameById(BigDecimal id) throws SQLException;
}
