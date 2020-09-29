package com.bcg.Tests;
import java.util.regex.Pattern;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import com.bcg.locators.Locators;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstExampleTest {
	  WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowjanya\\eclipse-workspace\\BCG\\Inputfiles\\chromedriver.exe");
	  
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
	   // driver = new FirefoxDriver();
	    baseUrl = "https://www.google.com/";
	   
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://compare.openelectricitymarket.sg/#/home");
	    driver.findElement(By.linkText("Get Started!")).click();
	   // Thread.sleep(5000);
	    waitExplicitly(driver,  Locators.GetStartted);
	    driver.findElement(Locators.GetStartted).click();
	    waitExplicitly(driver,By.id("select_4"));
	    driver.findElement(By.id("select_4")).click();
	    waitExplicitly(driver,By.id("select_option_9"));
	    driver.findElement(By.id("select_option_9")).click();
	    waitExplicitly(driver,By.id("monthlyConsumption"));
	    driver.findElement(By.id("monthlyConsumption")).click();
	    driver.findElement(By.id("monthlyConsumption")).clear();
	    driver.findElement(By.id("monthlyConsumption")).sendKeys("320");
	    waitExplicitly(driver,By.linkText("Next arrow_forward"));
	    driver.findElement(By.linkText("Next arrow_forward")).click();
	    waitExplicitly(driver,By.linkText("Next arrow_forward"));
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Next arrow_forward")).click();
	    waitExplicitly(driver,By.id("select_34"));
	    Thread.sleep(5000);
	    driver.findElement(By.id("select_34")).click();
	    waitExplicitly(driver,By.xpath("//md-option[@id='select_option_79']/div"));
	    driver.findElement(By.xpath("//md-option[@id='select_option_79']/div")).click();
	    waitExplicitly(driver,By.xpath("//md-option[@id='select_option_92']/div"));
	    driver.findElement(By.xpath("//md-option[@id='select_option_92']/div")).click();
	    waitExplicitly(driver,By.xpath("//md-backdrop"));
	    driver.findElement(By.xpath("//md-backdrop")).click();
	    waitExplicitly(driver,By.xpath("//div[@id='priceCompare-offersList']/div[3]/div"));
	    driver.findElement(By.xpath("//div[@id='priceCompare-offersList']/div[3]/div")).click();
	    waitExplicitly(driver,By.xpath("(//button[@type='button'])[15]"));
	    driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
	    waitExplicitly(driver,By.xpath("//div[@id='priceCompare-offersList']/div[3]/div/div[3]/div/div/div/button/i[2]"));
	    driver.findElement(By.xpath("//div[@id='priceCompare-offersList']/div[3]/div/div[3]/div/div/div/button/i[2]")).click();
	    waitExplicitly(driver,By.xpath("//div[@id='priceCompare-offersList']/div[3]/div/div[4]/div/div/div/div"));
	    driver.findElement(By.xpath("//div[@id='priceCompare-offersList']/div[3]/div/div[4]/div/div/div/div")).click();
	    Thread.sleep(5000);
	    System.out.println(driver.findElement(By.xpath("//div[@id='priceCompare-offersList']/div[4]/div/div[2]/div/div[2]/div/div/p/strong")).getText());
	    Assert.assertEquals("Union Power Pte Ltd", driver.findElement(By.xpath("//div[@id='priceCompare-offersList']/div[4]/div/div[2]/div/div[2]/div/div/p/strong")).getText());
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    //driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	  private void waitExplicitly(WebDriver driver, By by) {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
}
}
