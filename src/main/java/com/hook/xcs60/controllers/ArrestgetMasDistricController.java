package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestgetMasOfficeRepository;
import com.hook.xcs60.dao.MasDistricRepository;
import com.hook.xcs60.model.MasDistrict;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasDistricController {
	@Autowired
	MasDistricRepository repository;
	
	@RequestMapping("/ArrestgetMasDistricgetAll")
	public Object ArrestgetMasDistricgetAll() {
		try {
			return ResponseBuilder.Success((List<MasDistrict>) repository.ArrestgetMasDistricgetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
