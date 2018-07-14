package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasProvinceRepository;
import com.hook.xcs60.model.MasProvince;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasProvinceController {
	@Autowired
	MasProvinceRepository repository;
	
	@RequestMapping("/ArrestgetMasProvincegetAll")
	public Object ArrestgetMasProvincegetAll() {
		try {
			return ResponseBuilder.Success((List<MasProvince>) repository.ArrestgetMasProvincegetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
