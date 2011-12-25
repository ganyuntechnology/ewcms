/**
 * Copyright (c)2010-2011 Enterprise Website Content Management System(EWCMS), All rights reserved.
 * EWCMS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * http://www.ewcms.com
 */

package com.ewcms.publication.task;

import java.util.List;

import com.ewcms.publication.task.impl.process.TaskProcessable;


/**
 * 任务接口
 * 
 * @author wangwei
 */
public interface Taskable {

    /**
     * 得到任务编号
     * 
     * @return
     */
    Object getId();
    
    /**
     * 得到任务描述
     * 
     * @return
     */
    String getDescription();
    
    /**
     * 所属站点编号
     * 
     * @return 站点编号
     */
    Integer getSiteId();
    
    /**
     * 创建任务的用户名
     * 
     * @return 用户名
     */
    String getUsername();

    /**
     * 任务是否在运行
     * 
     * @return true 运行
     */
    boolean isRunning();
    
    /**
     * 完成进度
     * 
     * @return
     */
    int getProgress();
    
    /**
     * 是否完成
     * 
     * @return true 完成
     */
    boolean isCompleted();
    
    /**
     * 依赖任务
     * 
     * @return
     */
    List<Taskable> getDependences();
    
    /**
     * 执行任务得到任务列表
     * 
     * @return
     * @throws TaskException
     */
    public List<TaskProcessable> execute()throws TaskException;
    
    /**
     * 每个任务过程完成后调用方法，如完成进度计算，发布状态设置等。
     */
    public void completeProcess();
    
    /**
     * 关闭任务
     * 
     * @throws TaskException
     */
    public void close()throws TaskException;
}
