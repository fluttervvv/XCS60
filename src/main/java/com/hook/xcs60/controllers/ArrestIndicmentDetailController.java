package com.hook.xcs60.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestIndicmentDetailRepository;
import com.hook.xcs60.dto.ArrestIndicment.ArrestIndicmentgetByConRequest;
import com.hook.xcs60.dto.ArrestIndicmentDetail.ArrestIndicmentDetailgetByConRequest;
import com.hook.xcs60.model.OpsArrestIndicmentDetail;
import com.hook.xcs60.model.OpsArrestIndictment;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestIndicmentDetailController {

	@Autowired
	ArrestIndicmentDetailRepository arrestIndicmentDetailRepository;

	@RequestMapping("/ArrestIndicmentDetailgetByCon")
	public Object ArrestIndicmentDetailgetByCon(
			@RequestBody ArrestIndicmentDetailgetByConRequest arrestIndicmentDetailgetByConRequest) {
		try {
			Optional<OpsArrestIndicmentDetail> oData = arrestIndicmentDetailRepository
					.findById(arrestIndicmentDetailgetByConRequest.getIndicmentDetailID());
			if (oData.isPresent()) {
				return ResponseBuilder.Success(oData);
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestIndicmentDetailinsAll")
	public Object ArrestIndicmentDetailinsAll(@RequestBody OpsArrestIndicmentDetail arrestIndicmentDetail) {
		try {
			arrestIndicmentDetail.setIndictmentDetailID(null);
			arrestIndicmentDetail.setIsActive((short) 1);
			arrestIndicmentDetailRepository.save(arrestIndicmentDetail);
			return ResponseBuilder.Success();

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestIndicmentDetailupdByCon")
	public Object ArrestIndicmentDetailupdByCon(@RequestBody OpsArrestIndicmentDetail arrestIndicmentDetail) {
		try {
			if (arrestIndicmentDetailRepository.existsById(arrestIndicmentDetail.getIndictmentDetailID())) {
				arrestIndicmentDetailRepository.save(arrestIndicmentDetail);
				return ResponseBuilder.Success();
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestIndicmentDetailupdDelete")
	public Object ArrestIndicmentDetailupdDelete(
			@RequestBody ArrestIndicmentDetailgetByConRequest arrestIndicmentDetailgetByConRequest) {
		try {
			Optional<OpsArrestIndicmentDetail> oData = arrestIndicmentDetailRepository
					.findById(arrestIndicmentDetailgetByConRequest.getIndicmentDetailID());
			if (oData.isPresent()) {
				OpsArrestIndicmentDetail sData = oData.get();
				sData.setIsActive((short) 0);
				arrestIndicmentDetailRepository.save(sData);
				return ResponseBuilder.Success();
			}

			return ResponseBuilder.Error("Not Foud Data");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
