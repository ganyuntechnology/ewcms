/**
 * 
 */
package com.ewcms.core.site.model;

/**
 * @author 周冬初
 *
 */
public enum UploadType {
    LOCAL("本地"),SFTP("sftp"),FTP("ftp"),SMB("windows共享");
	private String description;
	
	private UploadType(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
}
