package com.hook.xcs60.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestRepository;
import com.hook.xcs60.dto.BaseApiResponse;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.Arrest;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class HomeController {

	
	@Autowired
	ArrestRepository arrestRepository ;
	
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		 
		 Arrest aArrest = new Arrest(); 
		 
		 aArrest.setArrestCode("11111111111111234563");
		 aArrest.setArrestDate(new Date());
		 aArrest.setArrestTime(new Date());
		 aArrest.setArrestStation("--");
		 aArrest.setArrestDesc("dddd");
		 aArrest.setOccurrenceDate(new Date());
		 aArrest.setHaveCulprit(false);
		 aArrest.setIsActive(false);
		 
		 arrestRepository.save(aArrest);
		 
		 
		 
	        return "HelloWorld";
	    }
	 
	 @RequestMapping("/ArrestgetByKeyword")
	 public Object ArrestgetByKeyword(@RequestBody KeywordRequest keywordRequest) {
		 if(1==2) {
			 return ResponseBuilder.Success((List<Arrest>) arrestRepository.findByKeyword(keywordRequest.getTextsearch()));
		 }else {
			 return ResponseBuilder.Error("invalid xxxxx");
		 }
	 }
	 

	 
	 
	
}
