package com.hook.xcs60.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestProductRepository;
import com.hook.xcs60.dto.ArrestProduct.ArrestProductinsAllRequest;
import com.hook.xcs60.model.OpsArrestProduct;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestProductController {

	@Autowired
	ArrestProductRepository arrestProductRepository;

	@RequestMapping("/ArrestProductgetByCon")
	public Object ArrestProductgetByCon(@RequestBody ArrestProductinsAllRequest arrestProductinsAllRequest) {

		try {
			Optional<OpsArrestProduct> oData = arrestProductRepository
					.findById(arrestProductinsAllRequest.getProductId());
			if (oData.isPresent()) {
				return ResponseBuilder.Success(oData);
			}
			return ResponseBuilder.Error("Not Found");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestProductinsAll")
	public Object ArrestProductinsAll(@RequestBody OpsArrestProduct arrestProduct) {
		try {
			arrestProduct.setProductID(null);
			arrestProduct.setIsActive((short) 1);
			arrestProductRepository.save(arrestProduct);

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

		return ResponseBuilder.Success();

	}

	@RequestMapping("/ArrestProductupdByCon")
	public Object ArrestProductupdByCon(@RequestBody OpsArrestProduct arrestProduct) {
		try {
			if (!arrestProductRepository.existsById(arrestProduct.getProductID())) {
				return ResponseBuilder.Error("NotFound ProductID " + arrestProduct.getProductID());
			}
			arrestProductRepository.save(arrestProduct);
			return ResponseBuilder.Success();

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestProductupdDelete")
	public Object ArrestProductupdDelete(@RequestBody ArrestProductinsAllRequest arrestProductinsAllRequest) {
		try {
			Optional<OpsArrestProduct> oData = arrestProductRepository
					.findById(arrestProductinsAllRequest.getProductId());
			if (oData.isPresent()) {
				OpsArrestProduct sData = oData.get();
				sData.setIsActive((short) 0);
				arrestProductRepository.save(sData);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound ProductID " + arrestProductinsAllRequest.getProductId());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

}
