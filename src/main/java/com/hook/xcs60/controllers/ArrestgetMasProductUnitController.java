package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasProductUnitRepository;
import com.hook.xcs60.model.MasProductunit;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasProductUnitController {
	@Autowired
	MasProductUnitRepository repository;
	
	@RequestMapping("/ArrestgetMasProductUnitgetAll")
	public Object ArrestgetMasProductUnitgetAll() {
		try {
			return ResponseBuilder.Success((List<MasProductunit>) repository.ArrestgetMasProductUnitgetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
