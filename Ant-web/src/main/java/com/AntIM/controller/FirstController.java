package com.AntIM.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/first")
public class FirstController {

	private final static Logger LOGGER = LoggerFactory.getLogger(FirstController.class);

	 @RequestMapping(value = "/test", method = RequestMethod.GET)
	public void test() {
		 LOGGER.info("info");
		 LOGGER.debug("debug");
		 LOGGER.warn("warn");
		 LOGGER.error("error");
		 System.out.println("GG");
	}

}
