package com.learntech.sync.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class PresenceEvents {
	
	private final SimpUserRegistry registry;
	
	public PresenceEvents(SimpUserRegistry registry) {
        this.registry = registry;
    }
	
	@EventListener
    public void onConnect(SessionConnectEvent e) {
        System.out.println("On connect event received. UserId: "+e.getUser().getName());
        System.out.println("Total user after connect="+registry.getUserCount());
    }

    @EventListener
    public void onDisconnect(SessionDisconnectEvent e) {
    	System.out.println("On disconnect event received. UserId: "+e.getUser().getName());
    	System.out.println("Total user after disconnect="+registry.getUserCount());
    }
}
