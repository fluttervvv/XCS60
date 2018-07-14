package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasLawGroupSectionRepository;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.MasLawGroupSection;
import com.hook.xcs60.model.OpsNotice;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestMasLawGroupSectionController {
	
	@Autowired
	MasLawGroupSectionRepository repository;
	
	@RequestMapping("/ArrestMasLawGroupSectiongetByKeyword")
	public Object ArrestMasLawGroupSectongetByKeyword(@RequestBody KeywordRequest request) {
		try {
			return ResponseBuilder.Success((List<MasLawGroupSection>) repository.ArrestMasLawGroupSectongetByKeyword(request.getTextsearch()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
