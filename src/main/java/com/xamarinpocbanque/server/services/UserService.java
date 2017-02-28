package com.xamarinpocbanque.server.services;

import com.xamarinpocbanque.server.entity.User;

public interface UserService {
	User findByLoginAndPassword (Long login, Long passWord);
}
