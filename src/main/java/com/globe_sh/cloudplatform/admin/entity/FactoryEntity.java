package com.globe_sh.cloudplatform.admin.entity;

import java.io.Serializable;

public class FactoryEntity implements Serializable {

	private static final long serialVersionUID = 3558195671797896609L;

	private int id;
	private String factory_code;
	private String create_time;
	private String factory_name;
	private String factory_description;

	public FactoryEntity() {
	}
	
	public FactoryEntity(int id, String factoryCode, String createTime, String factoryName, String factoryDescription) {
		this.id = id;
		this.factory_code = factoryCode;
		this.create_time = createTime;
		this.factory_name = factoryName;
		this.factory_description = factoryDescription;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFactoryCode() {
		return factory_code;
	}
	public void setFactoryCode(String factoryCode) {
		this.factory_code = factoryCode;
	}
	public String getCreateTime() {
		return create_time;
	}
	public void setCreateTime(String createTime) {
		this.create_time = createTime;
	}
	public String getFactoryName() {
		return factory_name;
	}
	public void setFactoryName(String factoryName) {
		this.factory_name = factoryName;
	}
	public String getFactoryDescription() {
		return factory_description;
	}
	public void setFactoryDescription(String factoryDescription) {
		this.factory_description = factoryDescription;
	}
}
