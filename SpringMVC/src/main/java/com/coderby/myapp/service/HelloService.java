package com.coderby.myapp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hi  " + name;
	}

	@Override
	public String bye(String name) {
		// TODO Auto-generated method stub
		return "bye  " + name;
	}

}
