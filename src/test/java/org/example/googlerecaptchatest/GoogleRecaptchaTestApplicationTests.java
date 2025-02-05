package org.example.googlerecaptchatest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class GoogleRecaptchaTestApplicationTests {


    @Test
    void contextLoads() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--headless=new");

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("http://localhost:8080");

        try {
            org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<>(chromeDriver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(300))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rc-anchor-container")));
            chromeDriver.switchTo().defaultContent();

            List<WebElement> h1 = chromeDriver.findElements(By.tagName("h2"));
            assertThat(h1).extracting(WebElement::getText).contains("Google reCAPTCHA v2 Test");
        } catch (Exception ex) {
            System.out.println(chromeDriver.getPageSource());
            System.out.println("==========================");
            LogEntries logEntries = chromeDriver.manage().logs().get(LogType.BROWSER);
            logEntries.getAll().stream().map(LogEntry::getMessage).forEach(System.out::println);
            fail("Failed to load page", ex);
        }
    }

}
