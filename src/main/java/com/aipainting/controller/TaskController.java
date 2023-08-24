package com.aipainting.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aipainting.entity.Task;
import com.aipainting.service.TaskService;

/**
 * 任务表;(TASK)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@Api(tags = "任务表对象功能接口")
@RestController
@RequestMapping("/task")
public class TaskController{
    @Autowired
    private TaskService taskService;

    /**
     * 通过ID查询单条数据
     *
     * @param taskId 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{taskid}")
//    @GetMapping("/test")
    public ResponseEntity<Task> queryById(@PathVariable Integer taskid){
//        return taskid;
        System.out.println(taskid);
        return ResponseEntity.ok(taskService.queryById(taskid));
    }

    /**
     * 分页查询
     *
     * @param task 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<Page<Task>> paginQuery(Task task, PageRequest pageRequest){
        return ResponseEntity.ok(taskService.paginQuery(task, pageRequest));
    }

    /**
     * 新增数据
     *
     * @param task 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<Task> add(Task task){
        return ResponseEntity.ok(taskService.insert(task));
    }

    /**
     * 更新数据
     *
     * @param task 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<Task> edit(Task task){
        return ResponseEntity.ok(taskService.update(task));
    }

    /**
     * 通过主键删除数据
     *
     * @param taskId 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer taskId){
        return ResponseEntity.ok(taskService.deleteById(taskId));
    }
}