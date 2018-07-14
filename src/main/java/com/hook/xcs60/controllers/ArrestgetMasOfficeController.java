package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestgetMasOfficeRepository;
import com.hook.xcs60.model.MasOffice;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasOfficeController {
	
	@Autowired
	ArrestgetMasOfficeRepository repository;
	
	@RequestMapping("/ArrestgetMasOfficegetAll")
	public Object ArrestgetMasOfficegetAll() {
		try {
			return ResponseBuilder.Success((List<MasOffice>) repository.ArrestgetMasOfficegetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
}
