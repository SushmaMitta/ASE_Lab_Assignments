package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Reminders;

@Path("/json/reminders")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Reminders getReminderInJSON() {

		Reminders r1 = new Reminders();
		r1.setReminder("Buy Groceries");
		r1.setUser("Sushma");

		return r1;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createReminderInJSON(Reminders r2) {

		String result = "Reminder saved : " + r2;
		return Response.status(201).entity(result).build();
		
	}
	
}