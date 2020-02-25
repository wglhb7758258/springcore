package com.luban.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {
	
	@Autowired
	UserService userService;
	public IndexService() {
		System.out.println("constructor for index");
	}
	
	public void getService(){
		System.out.println(userService);
	}

}
