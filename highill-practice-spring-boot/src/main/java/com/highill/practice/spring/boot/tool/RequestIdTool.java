package com.highill.practice.spring.boot.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestIdTool {
	
	static final Logger log = LoggerFactory.getLogger(RequestIdTool.class);
	
	public static long requestId() {
		long requestId = 0;
		try {
			Date currentDate = new Date();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			String currentTimeString = simpleFormat.format(currentDate);
			requestId = Long.valueOf(currentTimeString).longValue();
		} catch (Exception e) {
			log.error("-----requestId exception:{} ", e);
		}
		return requestId;
	}

}
