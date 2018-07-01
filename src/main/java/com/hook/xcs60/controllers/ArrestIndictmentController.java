package com.hook.xcs60.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestIndictmentRepository;
import com.hook.xcs60.model.OpsArrestIndictment;
import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60.dto.ArrestIndicment.*;

@RestController
public class ArrestIndictmentController {

	@Autowired
	ArrestIndictmentRepository arrestIndictmentRepository;

	@RequestMapping("/ArrestIndicmentgetByCon")
	public Object ArrestIndicmentgetByCon(@RequestBody ArrestIndicmentgetByConRequest arrestIndicmentgetByConRequest) {
		try {
			Optional<OpsArrestIndictment> oData = arrestIndictmentRepository
					.findById(arrestIndicmentgetByConRequest.getIndicmentID());
			if (oData.isPresent()) {
				return ResponseBuilder.Success(oData);
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestIndicmentinsAll")
	public Object ArrestIndicmentinsAll(@RequestBody OpsArrestIndictment arrestIndictment) {
		try {
			arrestIndictment.setIsActive((short) 1);
			arrestIndictmentRepository.save(arrestIndictment);
			return ResponseBuilder.Success();

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	@RequestMapping("/ArrestIndicmentupdByCon")
	public Object ArrestIndicmentupdByCon(@RequestBody OpsArrestIndictment arrestIndictment) {
		try {
			Optional<OpsArrestIndictment> oData = arrestIndictmentRepository
					.findById(arrestIndictment.getIndictmentID());
			if (oData.isPresent()) {
				arrestIndictmentRepository.save(oData.get());
				return ResponseBuilder.Success();
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	@RequestMapping("/ArrestIndicmentupdDelete")
	public Object ArrestIndicmentupdDelete(@RequestBody ArrestIndicmentgetByConRequest arrestIndicmentgetByConRequest) {
		try {
			Optional<OpsArrestIndictment> oData = arrestIndictmentRepository
					.findById(arrestIndicmentgetByConRequest.getIndicmentID());
			if (oData.isPresent()) {
				OpsArrestIndictment sData = oData.get();
				sData.setIsActive((short) 0);
				arrestIndictmentRepository.save(sData);
				return ResponseBuilder.Success();
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
