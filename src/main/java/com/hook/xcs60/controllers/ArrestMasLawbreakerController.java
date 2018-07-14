package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.MasLawbreakerRepository;
import com.hook.xcs60.dto.ArrestMasLawbreakerRequest;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.MasLawbreaker;
import com.hook.xcs60.model.OpsArrest;
import com.hook.xcs60.utils.DateUtil;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestMasLawbreakerController {
	
	@Autowired
	MasLawbreakerRepository masLawbreakerRepository;
	
	@RequestMapping("/ArrestMasLawbreakergetByKeyword")
	public Object ArrestMasLawbreakergetByKeyword(@RequestBody KeywordRequest request) {
		try {
			return ResponseBuilder.Success((List<MasLawbreaker>) masLawbreakerRepository.ArrestMasLawbreakergetByKeyword(request.getTextsearch()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/ArrestMasLawbreakergetByConAdv")
	public Object ArrestMasLawbreakergetByConAdv(@RequestBody ArrestMasLawbreakerRequest request) {
		try {
			return ResponseBuilder.Success((List<MasLawbreaker>) masLawbreakerRepository.ArrestMasLawbreakergetByConAdv(
							request.getEntityType(),
							request.getLawbreakerType(),
							request.getiDCard(),
							request.getPassportNo(),
							request.getCompanyRegistrationNo(),
							request.getCompanyName(),
							request.getLawbreakerName()
						)
					);
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/ArrestMasLawbreakerinsAll")
	public Object ArrestMasLawbreakerinsAll(@RequestBody MasLawbreaker masLawbreaker) {
		try {
			masLawbreaker.setLawbreakerID(null);
			masLawbreakerRepository.save(masLawbreaker);
			return ResponseBuilder.Success();
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
