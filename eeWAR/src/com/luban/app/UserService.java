package com.luban.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Autowired
	IndexService indexService;
	public UserService() {
		System.out.println("constructor for user");
	}
	
	public void getService(){
		System.out.println(indexService);
	}

}
