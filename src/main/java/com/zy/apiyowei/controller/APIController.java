package com.zy.apiyowei.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zy.apiyowei.service.APIService;

import javassist.expr.NewArray;

@RestController
public class APIController {

	@Autowired
	APIService aPIService;
	
	@RequestMapping("/ya/*")
	public Object processAPI(HttpServletRequest request){
		System.out.println(request.getParameterMap().keySet());
		
		
		System.out.println(request.getMethod());
		
		return "";
	}
	
	@PostMapping(value="/add", consumes = "application/json")
	public Object addAPI(HttpServletRequest request,String method,String requestParam,String responseParam){
		
		
		return aPIService.processAPI(request,method,requestParam,responseParam);
	}
	
	@DeleteMapping(value="/delete" )
	public Object deleteAPI(@RequestParam("id") Integer id) {
		return aPIService.deleteAPI(id);
	}
	
	@PutMapping(value="/edit")
	public Object editAPI(@RequestParam("id") Integer id) {
		return aPIService.editAPI(id);
	}
		

}
