package cloudlab.entity;

import java.util.Date;

import javax.xml.crypto.Data;

public class Area {
	
	private Integer areaId;
	private String areaName;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	
	
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Area( String areaName, Integer priority, Date createTime, Date lastEditTime) {
		super();
		this.areaName = areaName;
		this.priority = priority;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date date) {
		this.lastEditTime = date;
	}
	
	

}
