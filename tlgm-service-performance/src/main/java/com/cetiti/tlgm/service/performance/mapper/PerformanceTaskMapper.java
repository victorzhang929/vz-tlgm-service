package com.cetiti.tlgm.service.performance.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.cetiti.tlgm.service.performance.model.GridMemberPerformance;
import com.cetiti.tlgm.service.performance.model.quota.BasePerformance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 绩效任务数据访问接口
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-06-27 15:33:39
 */
@Repository
public interface PerformanceTaskMapper {

    /**
     * 查询当月专职网格员的绩效基本信息
     * @return
     * @throws Exception
     */
    List<GridMemberPerformance> listGridMemberPerformance() throws Exception;

    /**
     * 插入当月专职网格员信息入绩效表，无绩效信息，表设计中绩效字段默认值0
     * @param gridMemberPerformance 专职网格员绩效基本信息
     * @throws Exception
     */
    void insertWithoutPerformance(GridMemberPerformance gridMemberPerformance) throws Exception;

    /**
     * 计算专职网格员模块当月新增、修改、审核数量
     * @param userId 专职网格员id
     * @param moduleType 模块名称
     * @return
     * @throws Exception
     */
    BasePerformance countPerformance(@Param("userId") BigDecimal userId,
                                     @Param("moduleType") int moduleType) throws Exception;

    /**
     * 列出当月绩效表专职网格员id
     * @return
     * @throws Exception
     */
    List<BigDecimal> listCurrentMonthUserId() throws Exception;

    /**
     * 根据userIds批量删除
     * @param userIds 待删除userIds集合
     * @throws Exception
     */
    void batchDeleteUserIds(@Param("userIds") List<BigDecimal> userIds) throws Exception;

    /**
     * 插入或者更新
     * @param gridMemberPerformance 绩效
     * @throws Exception
     */
    void saveOrUpdate(GridMemberPerformance gridMemberPerformance) throws Exception;
}
