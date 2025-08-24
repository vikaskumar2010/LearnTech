package com.learntech.sync.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.learntech.sync.model.Message;
import com.learntech.sync.service.IMessageHandlerService;

@Controller
public class ChatController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatController.class);
	
	@Autowired
	private IMessageHandlerService messgeHandlerService;
	
	@MessageMapping("/sendMessage") // client sends message here
    // @SendTo("/topic/messages")      // server broadcasts here
    public Message send(Message message) {
		
		// Logging test
		logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.warn("This is a warning");
        logger.error("This is an error message");
		
		System.out.println("Message received...");
		this.messgeHandlerService.handleMessage(message);
        return message;
    }
}
