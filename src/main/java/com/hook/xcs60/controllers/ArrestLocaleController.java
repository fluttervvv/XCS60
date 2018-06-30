package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestLocaleRepository;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.ArrestLocale;
import com.hook.xcs60.utils.ResponseBuilder;


@RestController
public class ArrestLocaleController {

	@Autowired
	ArrestLocaleRepository arrestLocaleRepository;
	
	
	 
	 @RequestMapping("/ArrestLocalegetByCon")
	 public Object ArrestgetByKeyword(@RequestBody KeywordRequest keywordRequest) {
		 try {
			 return ResponseBuilder.Success((List<ArrestLocale>) arrestLocaleRepository.findAll());
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 @RequestMapping("/ArrestStaffinsAll")
	 public Object ArrestStaffinsAll(@RequestBody ArrestLocale arrestLocale) {
		 try {
			 ArrestLocale saved = arrestLocaleRepository.save(arrestLocale);
			 return ResponseBuilder.Success(saved);
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 
	 
	 
	 
	 

}
