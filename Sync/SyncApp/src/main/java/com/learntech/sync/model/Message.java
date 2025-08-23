package com.learntech.sync.model;

import java.util.Set;
import java.util.UUID;

public class Message {
	
	// Deprecated
	private String from;
	private String text;
	
	private Action action;
	private UUID messageId;
	private String chatId;
	
	// It should be taken from auth context
	private String senderUserId;
	
	// Except current user
	private Set<String> chatParticipants;
	
	public String getSenderUserId() {
		return senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}
	public Set<String> getChatParticipants() {
		return chatParticipants;
	}
	public void setChatParticipants(Set<String> chatParticipants) {
		this.chatParticipants = chatParticipants;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public String getChatId() {
		return chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getFrom() {
		return from;
	}
	public UUID getMessageId() {
		return messageId;
	}
	public void setMessageId(UUID messageId) {
		this.messageId = messageId;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
