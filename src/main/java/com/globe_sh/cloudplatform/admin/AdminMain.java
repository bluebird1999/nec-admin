package com.globe_sh.cloudplatform.admin;

import org.apache.logging.log4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminMain {

	private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(AdminMain.class);
	
	public static void main(String args[]) {
		SpringApplication.run(AdminMain.class, args);
		
		logger.info("Globe-sh Cloud Platform Restful Service Started...");
	}
}
