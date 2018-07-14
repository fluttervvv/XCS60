package com.hook.xcs60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.NoticeRepository;
import com.hook.xcs60.dto.ArrestNoticegetByConAdvRequest;
import com.hook.xcs60.dto.KeywordRequest;
import com.hook.xcs60.model.OpsNotice;
import com.hook.xcs60.utils.ResponseBuilder;

@RestController
public class ArrestNoticeController {

	@Autowired
	NoticeRepository noticeRepository;

	@RequestMapping("/ArrestNoticegetByKeyword")
	public Object ArrestNoticegetByKeyword(@RequestBody KeywordRequest keywordRequest) {
		try {
			return ResponseBuilder.Success(
					(List<OpsNotice>) noticeRepository.arrestNoticegetByKeyword(keywordRequest.getTextsearch()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/ArrestNoticegetByConAdv")
	public Object ArrestNoticegetByConAdv(@RequestBody ArrestNoticegetByConAdvRequest request) {
		try {
			return ResponseBuilder.Success((List<OpsNotice>) noticeRepository.arrestgetByConAdv(request.getNoticeCode(),
					request.getNoticeDateFrom(), request.getNoticeDateTo(), request.getStaffName(),
					request.getOfficeName()));
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}

	}

}
