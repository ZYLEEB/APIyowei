package com.zy.apiyowei.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class APIService {

	public Object processAPI(HttpServletRequest request,String method,String requestParam,String responseParam) {

		String realMethod = request.getMethod();
		String URI = request.getRequestURI();

		URI = URI.contains("?") ? URI.substring(URI.indexOf("/ya/") + 3, URI.indexOf("?"))
				: URI.substring(URI.indexOf("/ya/") + 3);
		
		System.out.println(method);
		System.out.println(URI);

		return "";
	}

	public Object deleteAPI(Integer id) {

		return "";
	}

	public Object editAPI(Integer id) {

		return "";
	}
}
