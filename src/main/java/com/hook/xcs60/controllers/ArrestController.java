package com.hook.xcs60.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestRepository;
import com.hook.xcs60.dto.ArrestgetByConAdvRequest;
import com.hook.xcs60.dto.ArrestupdDeleteRequest;
import com.hook.xcs60.dto.BaseApiResponse;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.Arrest;
import com.hook.xcs60.model.OpsArrest;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestController {

	@Autowired
	ArrestRepository arrestRepository;

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		OpsArrest aArrest = new OpsArrest();

		aArrest.setArrestCode("11111111111111234563");
		aArrest.setArrestDate(new Date());
		aArrest.setArrestTime(new Date());
		aArrest.setArrestStation("--");
		aArrest.setArrestDesc("dddd");
		aArrest.setOccurrenceDate(new Date());
		// aArrest.setHaveCulprit(false);
		// aArrest.setIsActive(false);

		arrestRepository.save(aArrest);

		return "HelloWorld";
	}

	@RequestMapping("/ArrestgetByKeyword")
	public Object ArrestgetByKeyword(@RequestBody KeywordRequest keywordRequest) {
		try {
			return ResponseBuilder
					.Success((List<OpsArrest>) arrestRepository.findByKeyword(keywordRequest.getTextsearch()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestgetByConAdv")
	public Object ArrestgetByConAdv(@RequestBody ArrestgetByConAdvRequest request) {
		try {
			return ResponseBuilder
					.Success((List<OpsArrest>) arrestRepository.findArrestgetByConAdv(request.getNoticeCode(),
							request.getArrestCode(), request.getOccurrenceDateFrom(), request.getOccurrenceDateTo(),
							request.getStaffName(), request.getOfficeName()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestgetByCon")
	public Object ArrestgetByCon(@RequestBody ArrestupdDeleteRequest arrestupdDeleteRequest) {
		try {
			Optional<OpsArrest> oData = arrestRepository.findById(arrestupdDeleteRequest.getArrestCode());
			if (oData.isPresent()) {
				OpsArrest sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound ArrestCode :" + arrestupdDeleteRequest.getArrestCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestinsAll")
	public Object ArrestinsAll(@RequestBody OpsArrest arrest) {
		try {
			if (!arrestRepository.existsById(arrest.getArrestCode())) {
				arrestRepository.save(arrest);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("duplicate ArrestCode :" + arrest.getArrestCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestupdByCon")
	public Object ArrestupdByCon(@RequestBody OpsArrest arrest) {
		try {
			if (arrestRepository.existsById(arrest.getArrestCode())) {
				arrestRepository.save(arrest);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound ArrestCode :" + arrest.getArrestCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestupdDelete")
	public Object ArrestupdByCon(@RequestBody ArrestupdDeleteRequest arrestupdDeleteRequest) {
		try {

			Optional<OpsArrest> oData = arrestRepository.findById(arrestupdDeleteRequest.getArrestCode());

			if (oData.isPresent()) {
				OpsArrest sData = oData.get();
				sData.setIsActive((short) 0);
				arrestRepository.save(sData);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound ArrestCode :" + arrestupdDeleteRequest.getArrestCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
