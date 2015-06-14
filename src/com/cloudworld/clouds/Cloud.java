package com.cloudworld.clouds;


import java.util.ArrayList;
import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.cloudworld.itemtypes.CloudItemType;
import com.cloudworld.itemtypes.CloudType;

@Path("/clouds")
public class Cloud {
	
	CloudType clouds;
	
	@Path("/listAll")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public CloudType listAll(){
		this.getClouds();
		return clouds;
	}
	
	@Path("/{cloudId}")
	@GET
	@Produces("application/xml")
	public String getCloud(@PathParam("cloudId") int cloudId){
		String str ="<customer><name>"+cloudId+"</name></customer>";
		return str;
	}
	
	
	
	@Path("/addCloud")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response addCloud(CloudItemType cloudItem){
		if(clouds == null){
			clouds = new CloudType();
		}
		clouds.getClouds().add(cloudItem);
		return Response.status(Status.OK).entity(clouds).build();
	}
	
	private void getClouds(){
		clouds = new CloudType();
		clouds.getClouds().add(createDefaultCloud());
		
	}
	
	private CloudItemType createDefaultCloud(){
		CloudItemType cloudItem = new CloudItemType();
		cloudItem.setCloudId(1);
		cloudItem.setCloudType("PRIVATE");
		cloudItem.setCreatedOn(Calendar.getInstance());
		cloudItem.setName("Biswa Cloud");
		return cloudItem;
	}
}
