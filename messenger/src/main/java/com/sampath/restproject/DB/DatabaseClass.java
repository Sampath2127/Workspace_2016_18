package com.sampath.restproject.DB;

import java.util.HashMap;
import java.util.Map;

import org.sampath.restproject.model.Message;

import com.sampath.restproject.model.Profile;

public class DatabaseClass {

	private static Map<Integer, Message> messages=new HashMap<>();
	private static Map<String, Profile> profiles=new HashMap<>();
	
 
	public static Map<Integer, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles 	;
	}
	
}
