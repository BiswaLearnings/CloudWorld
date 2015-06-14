package com.cloudworld.itemtypes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Clouds")
public class CloudType {

	List<CloudItemType> clouds;
	
	@XmlElement(name = "Item")
	public List<CloudItemType> getClouds() {
		if(clouds==null){
			clouds = new ArrayList<CloudItemType>();
		}
		return clouds;
	}
	
	

	
}
