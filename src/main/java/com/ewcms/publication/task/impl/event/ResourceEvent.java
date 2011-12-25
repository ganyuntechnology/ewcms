/**
 * Copyright (c)2010-2011 Enterprise Website Content Management System(EWCMS), All rights reserved.
 * EWCMS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * http://www.ewcms.com
 */

package com.ewcms.publication.task.impl.event;

import org.springframework.util.Assert;

import com.ewcms.content.resource.model.Resource;
import com.ewcms.publication.service.ResourcePublishServiceable;
import com.ewcms.publication.task.Taskable;

/**
 * 发布资源事件
 * 
 * @author wangwei
 */
public class ResourceEvent extends CompleteEvent {

    private final Resource resource;
    private final ResourcePublishServiceable service;
    
    public ResourceEvent(Taskable task,Resource resource,ResourcePublishServiceable service){
        super(task);
        Assert.notNull(resource,"resource is null");
        Assert.notNull(service,"resource publish service is null");
        this.resource = resource;
        this.service = service;
    }
    
    @Override
    protected void successAfter(String uri){
        service.publishResource(resource.getId());
    }
}
