package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasStaffRepository;
import com.hook.xcs60.dao.MasSubdistricRepository;
import com.hook.xcs60.model.MasSubdistrict;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasSubdistricController {
	@Autowired
	MasSubdistricRepository repository;
	
	@RequestMapping("/ArrestgetMasSubdistricgetAll")
	public Object ArrestgetMasSubdistricgetAll() {
		try {
			return ResponseBuilder.Success((List<MasSubdistrict>) repository.ArrestgetMasSubdistricgetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
}
