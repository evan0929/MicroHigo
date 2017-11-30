package com.service.higouser.controller;

import org.springframework.stereotype.Component;

@Component
public class LoginImpl implements Login {

	@Override
	public String UserLogin(String userName, String passWord) {
		return "success";
	}

}
