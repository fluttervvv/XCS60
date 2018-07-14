package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasStaffRepository;
import com.hook.xcs60.model.MasStaff;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestgetMasStaffController {
	@Autowired
	MasStaffRepository repository;
	
	@RequestMapping("/ArrestgetMasStaffgetAll")
	public Object ArrestgetMasStaffgetAll() {
		try {
			return ResponseBuilder.Success((List<MasStaff>) repository.ArrestgetMasOfficegetAll((short) 1));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
