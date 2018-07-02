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
import com.hook.xcs60.model.OpsArrest;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestController {

	
	@Autowired
	ArrestRepository arrestRepository ;
	
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		 
		 OpsArrest aArrest = new OpsArrest(); 
		 
		 aArrest.setArrestCode("11111111111111234563");
		 aArrest.setArrestDate(new Date());
		 aArrest.setArrestTime(new Date());
		 aArrest.setArrestStation("--");
		 aArrest.setArrestDesc("dddd");
		 aArrest.setOccurrenceDate(new Date());
//		 aArrest.setHaveCulprit(false);
//		 aArrest.setIsActive(false);
		 
		 arrestRepository.save(aArrest);
		 
		 
		 
	        return "HelloWorld";
	    }
	 
	 @RequestMapping("/ArrestgetByKeyword")
	 public Object ArrestgetByKeyword(@RequestBody KeywordRequest keywordRequest) {
		 try {
			 return ResponseBuilder.Success((List<OpsArrest>) arrestRepository.findByKeyword(keywordRequest.getTextsearch()));
		 }catch(Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
		 
	 }
	 

	 
	 
	
}
