//Commit -1 comment 1
//Commit -2 comment 1
//Commit -2 comment 2
package com.cloudworld.itemtypes;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Item")
public class CloudItemType {
	private int cloudId;
	private String name;
	private Calendar createdOn;
	private String cloudType;
	
	@XmlElement(name = "id")
	public int getCloudId() {
		return cloudId;
	}
	public void setCloudId(int cloudId) {
		this.cloudId = cloudId;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public Calendar getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}
	
	@XmlElement
	public String getCloudType() {
		return cloudType;
	}
	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}
}
