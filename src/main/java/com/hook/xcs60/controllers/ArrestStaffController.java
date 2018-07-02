package com.hook.xcs60.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestStaffRepository;
import com.hook.xcs60.dto.arrest.staff.ArrestStaffgetByConRequest;
import com.hook.xcs60.model.OpsArrestStaff;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestStaffController {

	@Autowired
	ArrestStaffRepository arrestStaffRepository;

	@RequestMapping("/ArrestStaffgetByCon")
	public Object ArrestStaffgetByCon(@RequestBody ArrestStaffgetByConRequest request) {
		try {
			Optional<OpsArrestStaff> oData = arrestStaffRepository.findById(request.getStaffID());
			if (oData.isPresent()) {
				return ResponseBuilder.Success(oData);
			}
			return ResponseBuilder.Error("Not Found ArrestStaffId : " + request.getStaffID());
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

	@RequestMapping("/ArrestStaffinsAll")
	public Object ArrestStaffinsAll(@RequestBody OpsArrestStaff request) {
		try {
			request.setStaffID(null);
			request.setIsActive((short) 1);
			arrestStaffRepository.save(request);
			return ResponseBuilder.Success();
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestStaffupdByCon")
	public Object ArrestStaffupdByCon(@RequestBody OpsArrestStaff request) {
		try {
			if (request != null && request.getStaffID() != null) {
				List<OpsArrestStaff> opsArrestStaffList = arrestStaffRepository.findByStaffID(request.getStaffID());
				if (opsArrestStaffList != null && opsArrestStaffList.size() > 0) {
					request.setIsActive(opsArrestStaffList.get(0).getIsActive());
					arrestStaffRepository.save(request);
					return ResponseBuilder.Success();
				}
			}

			return ResponseBuilder.Error("");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestStaffupdDelete")
	public Object ArrestStaffupdDelete(@RequestBody ArrestStaffgetByConRequest request) {
		try {
			if (request != null && request.getStaffID() != null) {

				Optional<OpsArrestStaff> oData = arrestStaffRepository.findById(request.getStaffID());
				if (oData.isPresent()) {
					OpsArrestStaff arrestStaff = oData.get();
					arrestStaff.setIsActive((short) 0);
					arrestStaffRepository.save(arrestStaff);
					return ResponseBuilder.Success();
				}
			}

			return ResponseBuilder.Error("");
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
