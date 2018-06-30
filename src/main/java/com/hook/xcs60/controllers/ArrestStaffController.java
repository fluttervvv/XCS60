package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestStaffRepository;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.dto.arrest.staff.ArrestStaffgetByConRequest;
import com.hook.xcs60.model.ArrestLocale;
import com.hook.xcs60.model.ArrestStaff;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestStaffController {
	
	@Autowired
	ArrestStaffRepository arrestStaffRepository;
	
	@RequestMapping("/ArrestStaffgetByCon")
	 public Object ArrestStaffgetByCon(@RequestBody ArrestStaffgetByConRequest request) {
		try {
		 return ResponseBuilder.Success((List<ArrestStaff>) arrestStaffRepository.findAll());
		}catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	 }
}
