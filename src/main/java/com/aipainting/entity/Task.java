package com.aipainting.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 任务表;undefined
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@ApiModel(value = "任务表",description = "undefined")
public class Task implements Serializable,Cloneable{
    /** 任务ID */
    @ApiModelProperty(name = "任务ID",notes = "")
    private Integer taskId ;
    /** 乐观锁 */
    @ApiModelProperty(name = "乐观锁",notes = "")
    private Integer revision ;
    /** 创建人 */
    @ApiModelProperty(name = "创建人",notes = "")
    private String createdBy ;
    /** 创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "")
    private Date createdTime ;
    /** 更新人 */
    @ApiModelProperty(name = "更新人",notes = "")
    private String updatedBy ;
    /** 更新时间 */
    @ApiModelProperty(name = "更新时间",notes = "")
    private Date updatedTime ;
    /** 模型ID，外键 */
    @ApiModelProperty(name = "模型ID，外键",notes = "")
    private String modelId ;
    /** 用户ID */
    @ApiModelProperty(name = "用户ID",notes = "")
    private String userId ;
    /** 风格ID */
    @ApiModelProperty(name = "风格ID",notes = "")
    private String styleId ;
    /** 采样风格ID */
    @ApiModelProperty(name = "采样风格ID",notes = "")
    private String samplingMethodId ;
    /** vaeID */
    @ApiModelProperty(name = "vaeID",notes = "")
    private String vaeId ;
    /** 提示词 */
    @ApiModelProperty(name = "提示词",notes = "")
    private String prompt ;
    /** 状态 */
    @ApiModelProperty(name = "状态",notes = "")
    private String status ;
    /** 结果ID */
    @ApiModelProperty(name = "结果ID",notes = "")
    private String resultId ;
    /** 其他参数 */
    @ApiModelProperty(name = "其他参数",notes = "")
    private String otherprompt ;

    /** 任务ID */
    public Integer getTaskId(){
        return this.taskId;
    }
    /** 任务ID */
    public void setTaskId(Integer taskId){
        this.taskId=taskId;
    }
    /** 乐观锁 */
    public Integer getRevision(){
        return this.revision;
    }
    /** 乐观锁 */
    public void setRevision(Integer revision){
        this.revision=revision;
    }
    /** 创建人 */
    public String getCreatedBy(){
        return this.createdBy;
    }
    /** 创建人 */
    public void setCreatedBy(String createdBy){
        this.createdBy=createdBy;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime=createdTime;
    }
    /** 更新人 */
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    /** 更新人 */
    public void setUpdatedBy(String updatedBy){
        this.updatedBy=updatedBy;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime=updatedTime;
    }
    /** 模型ID，外键 */
    public String getModelId(){
        return this.modelId;
    }
    /** 模型ID，外键 */
    public void setModelId(String modelId){
        this.modelId=modelId;
    }
    /** 用户ID */
    public String getUserId(){
        return this.userId;
    }
    /** 用户ID */
    public void setUserId(String userId){
        this.userId=userId;
    }
    /** 风格ID */
    public String getStyleId(){
        return this.styleId;
    }
    /** 风格ID */
    public void setStyleId(String styleId){
        this.styleId=styleId;
    }
    /** 采样风格ID */
    public String getSamplingMethodId(){
        return this.samplingMethodId;
    }
    /** 采样风格ID */
    public void setSamplingMethodId(String samplingMethodId){
        this.samplingMethodId=samplingMethodId;
    }
    /** vaeID */
    public String getVaeId(){
        return this.vaeId;
    }
    /** vaeID */
    public void setVaeId(String vaeId){
        this.vaeId=vaeId;
    }
    /** 提示词 */
    public String getPrompt(){
        return this.prompt;
    }
    /** 提示词 */
    public void setPrompt(String prompt){
        this.prompt=prompt;
    }
    /** 状态 */
    public String getStatus(){
        return this.status;
    }
    /** 状态 */
    public void setStatus(String status){
        this.status=status;
    }
    /** 结果ID */
    public String getResultId(){
        return this.resultId;
    }
    /** 结果ID */
    public void setResultId(String resultId){
        this.resultId=resultId;
    }
    /** 其他参数 */
    public String getOtherprompt(){
        return this.otherprompt;
    }
    /** 其他参数 */
    public void setOtherprompt(String otherprompt){
        this.otherprompt=otherprompt;
    }
}