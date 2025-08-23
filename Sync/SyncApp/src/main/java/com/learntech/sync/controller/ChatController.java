package com.learntech.sync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.learntech.sync.model.Message;
import com.learntech.sync.service.IMessageHandlerService;

@Controller
public class ChatController {
	
	@Autowired
	private IMessageHandlerService messgeHandlerService;
	
	@MessageMapping("/sendMessage") // client sends message here
    // @SendTo("/topic/messages")      // server broadcasts here
    public Message send(Message message) {
		System.out.println("Message received...");
		this.messgeHandlerService.handleMessage(message);
        return message;
    }
}
