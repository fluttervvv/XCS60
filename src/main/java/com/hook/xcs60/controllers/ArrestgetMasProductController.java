package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasProductRepository;
import com.hook.xcs60.model.MasProduct;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasProductController {
	@Autowired
	MasProductRepository repository;
	
	@RequestMapping("/ArrestgetMasProductgetAll")
	public Object ArrestgetMasProductgetAll() {
		try {
			return ResponseBuilder.Success((List<MasProduct>) repository.ArrestgetMasProductgetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
