package com.learntech.sync.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learntech.sync.model.entities.UserChat;

public interface UserChatRepository extends JpaRepository<UserChat, Long> {

	List<UserChat> findByChatId(String chatId);
	
	List<UserChat> findByUserId(String userId);
}
