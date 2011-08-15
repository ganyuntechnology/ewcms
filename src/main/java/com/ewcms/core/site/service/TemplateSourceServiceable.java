/**
 * 
 */
package com.ewcms.core.site.service;

import java.util.List;

import com.ewcms.core.site.model.TemplateSource;
import com.ewcms.publication.service.TemplateSourcePublishServiceable;

/**
 * @author 周冬初
 *
 */
public interface TemplateSourceServiceable extends TemplateSourcePublishServiceable {
	public Integer addTemplateSource(TemplateSource vo);
	
	public Integer updTemplateSource(TemplateSource vo);
	
	public void delTemplateSource(Integer id);
	
	/**
	 * 获取跟模板资源集
	 * 
	 */ 	
	public List<TemplateSource> getTemplaeSourceTreeList(Boolean channelEnable);
	
	/**
	 * 获取模板资源子资源集
	 * 
	 */ 	
	public List<TemplateSource> getTemplaeSourceTreeList(Integer parentId,Boolean channelEnable);
	

	/**
	 * 获取站点专栏资源根目录
	 * 
	 */    
    public TemplateSource channelSRCRoot();
    
    public TemplateSource channelTemplateSource(String srcName);
}