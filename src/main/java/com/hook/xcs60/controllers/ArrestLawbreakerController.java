package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestLawbreakerRepository;
import com.hook.xcs60.dto.arrest.law.breaker.ArrestLawbreakergetByConRequest;
import com.hook.xcs60.model.ArrestLawbreaker;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestLawbreakerController {
	
	@Autowired
	ArrestLawbreakerRepository arrestLawbreakerRepository;
	
//	@RequestMapping("/ArrestLawbreakergetByCon")
//	public Object ArrestLawbreakergetByCon(@RequestBody ArrestLawbreakergetByConRequest request) {
//		try {
//		 return ResponseBuilder.Success((List<ArrestLawbreaker>) arrestLawbreakerRepository.findAll());
//		}catch (Exception e) {
//			return ResponseBuilder.Error(e.getMessage());
//		}
//
//	}
}
