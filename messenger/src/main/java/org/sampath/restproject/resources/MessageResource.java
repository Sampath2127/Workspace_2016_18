package org.sampath.restproject.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.sampath.restproject.model.Message;

import com.sampath.restproject.service.MessageService;

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year")int year){
		if(year>0){
			return new MessageService().getAllMessagesWithYear(year);
		}
		return new MessageService().getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")int messageID){
		return new MessageService().getMessage(messageID);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
	return new MessageService().addMessage(message);	
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId")int messageID,Message message){
	message.setId(messageID);
	return new MessageService().updateMessage(message);
}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam("messageId")int messageID){
		return new MessageService().removeMessage(messageID);
	}

}
