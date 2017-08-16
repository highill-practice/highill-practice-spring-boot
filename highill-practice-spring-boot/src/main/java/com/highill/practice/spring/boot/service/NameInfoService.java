package com.highill.practice.spring.boot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.highill.practice.spring.boot.response.NameInfoResponse;

@Service
public class NameInfoService {
	
	static final Logger log = LoggerFactory.getLogger(NameInfoService.class);

	public NameInfoResponse nameInfo(long requestId, String name, String info) {
		log.info("-----nameInfo requestId:{} name:{} info:{} ", requestId, name, info);
		NameInfoResponse nameInfoResponse = new NameInfoResponse();
		nameInfoResponse.setRequestId(requestId);
		if (name == null || name.trim().isEmpty()) {
			nameInfoResponse.setName("");
		} else {
			nameInfoResponse.setName(name.trim());
		}

		if (info == null || info.trim().isEmpty()) {
			nameInfoResponse.setInfo("");
		} else {
			nameInfoResponse.setInfo(info.trim());
		}

		nameInfoResponse.setMessage("Welcome " + nameInfoResponse.getName() + ", your information is " + nameInfoResponse.getInfo());

		log.info("-----nameInfoResponse requestId:{} name:{} info:{} response:{} ", requestId, name, info, nameInfoResponse);
		return nameInfoResponse;
	}

}
