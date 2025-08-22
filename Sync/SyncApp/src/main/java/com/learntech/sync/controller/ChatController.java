package com.learntech.sync.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.learntech.sync.model.Message;

@Controller
public class ChatController {
	
	@MessageMapping("/sendMessage") // client sends message here
    @SendTo("/topic/messages")      // server broadcasts here
    public Message send(Message message) {
		System.out.println("Message received...");
        return message;
    }
}
