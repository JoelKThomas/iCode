package com.icode.automate.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.stereotype.Service;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Service
public class SeleniumAutomationService {

    public void automate() {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            // Open the target URL
            driver.get("https://www.instahyre.com/candidate/opportunities/?matching=true");
            // Wait for the page to load and display elements
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Wait for the login form to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))); // Wait until the email field is visible
            // Fill in email and password fields
            WebElement emailField = driver.findElement(By.id("email")); // Using the ID for the email field
            WebElement passwordField = driver.findElement(By.id("password")); // Using the ID for the password field
            emailField.sendKeys("joelkthomas11@gmail.com");
            passwordField.sendKeys("wYTE7ZzL2peM227");
            // Click on the login button
            WebElement loginButton = driver.findElement(By.cssSelector("button.btn.btn-lg.btn-wide.btn-success")); // Adjust the selector for the login button
            Thread.sleep(1000);
            loginButton.click();
            // Wait for the page to load after login
            Thread.sleep(5000); // Wait for 5 seconds after clicking login
            // Loop to find and click the "View" button and then either "Apply" button
            while (true) {
                try {
                    // Check for the first type of "Apply" button (with ng-if condition)
                    WebElement applyButton1 = null;
                    try {
                        applyButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//div[@class='apply ng-scope' and @ng-if=\"opp.interview_status === OFFER_STATUSES['PENDING'] ||" +
                                        " (opp.interview_status === OFFER_STATUSES['DECLINED'] " +
                                        "&& opp.is_active)\"]/button[contains(text(),'Apply')]")));
                        applyButton1.click();
                        // Wait for a moment after clicking apply
                        // Thread.sleep(30);
                    } catch (Exception e) {
                        System.out.println("First Apply button not found.");
                    }
                    // Check for the second type of "Apply" button (bulk apply)
                    WebElement applyButton2 = null;
                    try {
                        applyButton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//button[@class='btn btn-lg btn-success' and @ng-click='applyBulk()']")));
                        applyButton2.click();
                        // Wait for a moment after clicking apply
                       // Thread.sleep(10);
                    } catch (Exception e) {
                        System.out.println("Second Apply button (bulk) not found.");
                    }
                    // Check for the "View" button
                    WebElement viewButton = null;
                    try {
                        viewButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View')]")));
                        viewButton.click();
                        // Wait for the popup to load
                        //Thread.sleep(50); // Adjust if needed
                    } catch (Exception e) {
                        System.out.println("View button not found or clicked.");
                    }
                    // Exit condition if neither button was found
                    if (viewButton == null && applyButton1 == null && applyButton2 == null) {
                        System.out.println("No more opportunities to apply for or an error occurred.");
                        break; // Exit the loop if there are no more opportunities or an error occurs
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                    break; // Exit the loop if an error occurs
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
