package com.highill.practice.spring.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.highill.practice.spring.boot.request.NameInfoRequest;
import com.highill.practice.spring.boot.response.NameInfoResponse;
import com.highill.practice.spring.boot.service.NameInfoService;
import com.highill.practice.spring.boot.tool.RequestIdTool;

@CrossOrigin
@RestController
public class PracticeNameInfoController {

	static final Logger log = LoggerFactory.getLogger(PracticeNameInfoController.class);

	@Autowired
	private NameInfoService nameInfoService;

	@RequestMapping(value = "/practice/normal")
	public NameInfoResponse practiceNormal(
			@RequestParam(name = "name", required = true) String name,
	        @RequestParam(name = "info", required = true) String info, 
	        HttpServletRequest httpRequest) {
		long requestId = RequestIdTool.requestId();
		log.info("-----practiceNormal method:{} requestId:{} name:{} info:{} ", httpRequest.getMethod(), requestId, name, info);
		
		NameInfoResponse nameInfoResponse = nameInfoService.nameInfo(requestId, name, info);

		log.info("-----practiceNormal-response name:{} info:{} response:{} ", name, info, nameInfoResponse);
		return nameInfoResponse;
	}

	@RequestMapping(value = "/practice/json", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public NameInfoResponse practiceJson(
			@RequestParam(name = "name", required = false) String name,
	        @RequestParam(name = "info", required = false) String info, 
	        HttpServletRequest httpRequest) {
		long requestId = RequestIdTool.requestId();
		log.info("-----practiceJson method:{} requestId:{} name:{} info:{} ", httpRequest.getMethod(), requestId, name, info);
		
		NameInfoResponse nameInfoResponse = nameInfoService.nameInfo(requestId, name, info);

		log.info("-----practiceJson-response name:{} info:{} response:{} ", name, info, nameInfoResponse);
		return nameInfoResponse;
	}

	@RequestMapping(value = "/practice/jsonbody", consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public NameInfoResponse practiceJsonBody(
			@RequestBody NameInfoRequest nameInfoRequest, 
			HttpServletRequest httpRequest) {
		NameInfoResponse nameInfoResponse = null;
		long requestId = RequestIdTool.requestId();
		log.info("-----practiceJsonBody method:{} requestId:{} nameInfoRequest:{} ", httpRequest.getMethod(), requestId, nameInfoRequest);

		if (nameInfoRequest == null) {
			nameInfoRequest = new NameInfoRequest();
		}
		nameInfoResponse = nameInfoService.nameInfo(requestId, nameInfoRequest.getName(), nameInfoRequest.getInfo());

		log.info("-----practiceJsonBody-response nameInfoRequest:{} response:{} ", nameInfoRequest, nameInfoResponse);
		return nameInfoResponse;
	}

}
