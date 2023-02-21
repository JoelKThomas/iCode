package com.icode.shadow.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebsiteController {

    @GetMapping("/clickButton")
    public String clickButton() throws InterruptedException {
        // set the path to the chromedriver executable

        String url = "";

        String email = "";
        String password = "";

        int i=0;

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chromedriver/chromedriver.exe");

        // create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // navigate to the website
        driver.get(url);

        // find the email input field and enter the email id
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);

        // find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        // find the submit button and click it
        WebElement submitButton = driver.findElement(By.id("login-form"));
        submitButton.click();

        Thread.sleep(5000);

        // find the button element by its id
        WebElement viewbutton = driver.findElement(By.xpath("(//*[contains(text(),\"View\")])[1]"));

        // click the button
        viewbutton.click();

        Thread.sleep(2000);

        while(i < 700) {
            try {
                Thread.sleep(1000);
                List<WebElement> applyButtonElements = driver.findElements(By.xpath("//button[contains(text(),'Apply')]"));
                applyButtonElements.get(0).click();
                i++;
            } catch (Exception e){
                Thread.sleep(1000);
                List<WebElement> applyButtonElements = driver.findElements(By.xpath("//button[contains(text(),'Apply')]"));
                applyButtonElements.get(0).click();
                i++;
            }
        }





        // get the page title after the button click
        String pageTitle = driver.getTitle();

        // close the browser
        driver.quit();

        return "Button clicked on " + url + ". New page title: " + pageTitle;
    }
}
