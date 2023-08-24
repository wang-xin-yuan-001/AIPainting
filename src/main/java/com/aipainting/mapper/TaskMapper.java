package com.aipainting.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import com.aipainting.entity.Task;

/**
 * 任务表;(TASK)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@Mapper
public interface TaskMapper{
    /**
     * 通过ID查询单条数据
     *
     * @param taskId 主键
     * @return 实例对象
     */
    Task queryById(Integer taskId);
    /**
     * 分页查询指定行数据
     *
     * @param task 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Task> queryAllByLimit(Task task, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param task 查询条件
     * @return 总行数
     */
    long count(Task task);
    /**
     * 新增数据
     *
     * @param task 实例对象
     * @return 影响行数
     */
    int insert(Task task);
    /**
     * 批量新增数据
     *
     * @param entities List<Task> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Task> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<Task> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Task> entities);
    /**
     * 更新数据
     *
     * @param task 实例对象
     * @return 影响行数
     */
    int update(Task task);
    /**
     * 通过主键删除数据
     *
     * @param taskId 主键
     * @return 影响行数
     */
    int deleteById(Integer taskId);
}