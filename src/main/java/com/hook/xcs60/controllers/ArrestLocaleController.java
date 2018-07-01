package com.hook.xcs60.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestLocaleRepository;
import com.hook.xcs60.dto.ArrestLocalegetByConRequest;
import com.hook.xcs60.model.OpsArrestLocale;
import com.hook.xcs60.utils.ResponseBuilder;


@RestController
public class ArrestLocaleController {

	@Autowired
	ArrestLocaleRepository arrestLocaleRepository;
	
	
	 
	 @RequestMapping("/ArrestLocalegetByCon")
	 public Object ArrestgetByKeyword(@RequestBody ArrestLocalegetByConRequest arrestLocalegetByConRequest) {
		 try {
			 return ResponseBuilder.Success((List<OpsArrestLocale>) arrestLocaleRepository
					 				.findByLocaleId(arrestLocalegetByConRequest.getLocaleID()));
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 @RequestMapping("/ArrestLocaleinsAll")
	 public Object ArrestLocaleinsAll(@RequestBody OpsArrestLocale arrestLocale) {
		 try {
			 arrestLocale.setIsActive((short) 1);
			 arrestLocaleRepository.save(arrestLocale);
			 return ResponseBuilder.Success();
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 
	 @RequestMapping("/ArrestLocaleupdByCon")
	 public Object ArrestLocaleupdByCon(@RequestBody OpsArrestLocale arrestLocale) {
		 try {
			 Optional<OpsArrestLocale> oData =  arrestLocaleRepository.findById(arrestLocale.getLocaleID());
			 if(oData.isPresent()) {
				 arrestLocaleRepository.save(arrestLocale);
				 return ResponseBuilder.Success();
			 }
			 return ResponseBuilder.Error("Not Found Locale ID " + arrestLocale.getLocaleID());
			 
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 
	 @RequestMapping("/ArrestLocaleupdDelete")
	 public Object ArrestLocaleupdDelete(@RequestBody ArrestLocalegetByConRequest arrestLocalegetByConRequest) {
		 try {
			 Optional<OpsArrestLocale> oData =  arrestLocaleRepository.findById(arrestLocalegetByConRequest.getLocaleID());
			 if(oData.isPresent()) {
				 OpsArrestLocale sData = oData.get() ;
				 sData.setIsActive((short) 0);
				 arrestLocaleRepository.save(sData);
				 return ResponseBuilder.Success();
			 }
			 return ResponseBuilder.Error("Not Found Locale ID " + arrestLocalegetByConRequest.getLocaleID());
			 
		 }catch (Exception e) {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
