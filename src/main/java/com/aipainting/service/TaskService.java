package com.aipainting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.aipainting.entity.Task;
import com.aipainting.mapper.TaskMapper;
/**
 * 任务表;(TASK)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@Service
public class TaskService{
    @Autowired
    private TaskMapper taskMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param taskId 主键
     * @return 实例对象
     */
    public Task queryById(Integer taskId){
        return taskMapper.queryById(taskId);
    }

    /**
     * 分页查询
     *
     * @param task 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    public Page<Task> paginQuery(Task task, PageRequest pageRequest){
        long total = taskMapper.count(task);
        return new PageImpl<>(taskMapper.queryAllByLimit(task, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param task 实例对象
     * @return 实例对象
     */
    public Task insert(Task task){
        taskMapper.insert(task);
        return task;
    }

    /**
     * 更新数据
     *
     * @param task 实例对象
     * @return 实例对象
     */
    public Task update(Task task){
        taskMapper.update(task);
        return queryById(task.getTaskId());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskId 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer taskId){
        int total = taskMapper.deleteById(taskId);
        return total > 0;
    }
}