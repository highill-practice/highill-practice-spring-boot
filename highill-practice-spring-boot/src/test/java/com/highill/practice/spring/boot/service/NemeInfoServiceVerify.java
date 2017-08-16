package com.highill.practice.spring.boot.service;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.highill.practice.spring.boot.response.NameInfoResponse;
import com.highill.practice.spring.boot.tool.RequestIdTool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NemeInfoServiceVerify {

	@Autowired
	private NameInfoService nameInfoService;

	@Test
	public void nameInfo() {
		long requestId = RequestIdTool.requestId();
		String name = "MyName";
		String info = "Good";

		NameInfoResponse nameInfoResponse = nameInfoService.nameInfo(requestId, name, info);
		TestCase.assertNotNull(nameInfoResponse);
		TestCase.assertEquals(name, nameInfoResponse.getName());
		TestCase.assertEquals(info, nameInfoResponse.getInfo());
	}

}
