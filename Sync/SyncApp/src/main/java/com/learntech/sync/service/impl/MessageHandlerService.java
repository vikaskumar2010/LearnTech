package com.learntech.sync.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learntech.sync.model.Message;
import com.learntech.sync.model.entities.UserChat;
import com.learntech.sync.repo.UserChatRepository;
import com.learntech.sync.service.IMessageHandlerService;

@Service
public class MessageHandlerService implements IMessageHandlerService 
{
	@Autowired
	private UserChatRepository userChatRepo;
	
	@Override
	public void handleMessage(Message message) {
		switch (message.getAction()) {
		case CreateChat:
			this.handleCreateChat(message);
			break;
		case SendMessage:
			this.handleSendMessageAction(message);
			break;
		default:
			System.out.println("Not implemented. Action="+message.getAction());
			break;
		}
	}
	
	private void handleCreateChat(Message message) {
		String chatId = UUID.randomUUID().toString();
		
		// add current user
		message.getChatParticipants().add(message.getSenderUserId());
		
		List<UserChat> userChatEntities = message.getChatParticipants().stream().map(u -> new UserChat(chatId, u)).collect(Collectors.toList());
		userChatRepo.saveAll(userChatEntities);
		
	}

	private void handleSendMessageAction(Message message) {
		
	}

}
