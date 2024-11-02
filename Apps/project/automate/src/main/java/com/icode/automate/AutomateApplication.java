package com.icode.automate;

import com.icode.automate.service.SeleniumAutomationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class AutomateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutomateApplication.class, args);

		// Get the Selenium automation service bean and run the automation
		SeleniumAutomationService automationService = context.getBean(SeleniumAutomationService.class);
		automationService.automate();
	}
}
