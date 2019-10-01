package com.sampath.restproject.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.sampath.restproject.model.Message;

import com.sampath.restproject.DB.DatabaseClass;

public class MessageService {

	private Map<Integer, Message> messages = DatabaseClass.getMessages();

	public MessageService(){
		messages.put(1, new Message(1,"REST","Sampath")); 
		messages.put(2, new Message(2,"REST","Koushik"));
	}
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesWithYear(int year){
		List<Message> list=new ArrayList<>();
		Calendar cal=Calendar.getInstance();
		for(Message message:messages.values()){
			if(message.getDateCreated()!=null)
			cal.setTime(message.getDateCreated());
			if(cal.get(Calendar.YEAR)==year){
				list.add(message);
			}
		}
		return list;
	}

	public Message getMessage(int id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size());
		message.setDateCreated(new Date());
		messages.put(message.getId()+1	, message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(int id) {
		return messages.remove(id);
	}
}
