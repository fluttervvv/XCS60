package com.hook.xcs60.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestProductDetailRepository;
import com.hook.xcs60.dto.ArrestProductDetail.ArrestProductDetailgetByConRequest;
import com.hook.xcs60.model.OpsArrestProductDetail;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestProductDetailController {

	@Autowired
	ArrestProductDetailRepository arrestProductDetailRepository;

	@RequestMapping("/ArrestProductDetailgetByCon")
	public Object ArrestProductDetailgetByCon(
			@RequestBody ArrestProductDetailgetByConRequest arrestProductDetailgetByConRequest) {
		try {
			List<Long> ids = new ArrayList<Long>();
			ids.add(arrestProductDetailgetByConRequest.getProductDetailId());
			return ResponseBuilder
					.Success((List<OpsArrestProductDetail>) arrestProductDetailRepository.findAllById(ids));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestProductDetailinsAll")
	public Object ArrestProductDetailinsAll(@RequestBody OpsArrestProductDetail arrestProductDetail) {
		try {
		
			arrestProductDetail.setIsActive((short) 1);
			arrestProductDetailRepository.save(arrestProductDetail);
			return ResponseBuilder.Success();

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestProductDetailupdByCon")
	public Object ArrestProductDetailupdByCon(@RequestBody OpsArrestProductDetail arrestProductDetail) {
		try {
			if (!arrestProductDetailRepository.existsById(arrestProductDetail.getProductDetailID())) {
				return ResponseBuilder.Error("NotFound ProductID " + arrestProductDetail.getProductDetailID());
			}
			arrestProductDetailRepository.save(arrestProductDetail);
			return ResponseBuilder.Success();

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestProductDetailupdDelete")
	public Object ArrestProductDetailupdDelete(
			@RequestBody ArrestProductDetailgetByConRequest arrestProductDetailgetByConRequest) {
		try {
			Optional<OpsArrestProductDetail> oData = arrestProductDetailRepository
					.findById(arrestProductDetailgetByConRequest.getProductDetailId());
			if (oData.isPresent()) {
				OpsArrestProductDetail sData = oData.get();
				sData.setIsActive((short) 0);
				arrestProductDetailRepository.save(sData);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder
					.Error("NotFound ProductID " + arrestProductDetailgetByConRequest.getProductDetailId());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

}
