package trianglecalc;


import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(Lifecycle.PER_CLASS)

public class TriangleTestGrid {
WebDriver driver;
String baseURL, nodeURL;

	@BeforeAll
	public void setUp() {
		baseURL = "https://www.calculator.net/triangle-calculator.html";
nodeURL = "http://localhost:4444/";
		
	}


	@AfterAll
	public void tearDown() {
	 driver.quit();
	}
	
	@Test
	public void test1() throws Throwable {
		@SuppressWarnings("deprecation")
		Long id = Thread.currentThread().getId();
		System.out.println("Firefox"+id);
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL),cap);
	driver.get(baseURL);
	 driver.manage().window().setSize(new Dimension(1536, 824));
	 driver.findElement(By.cssSelector(".clearbtn")).click();
	 driver.findElement(By.name("vx")).click();
	 driver.findElement(By.name("vx")).sendKeys("3");
	 driver.findElement(By.name("vy")).click();
	 driver.findElement(By.name("vy")).sendKeys("3");
	 driver.findElement(By.name("vz")).click();
	 driver.findElement(By.name("vz")).sendKeys("3");
	 driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	 Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),"Equilateral Triangle");



		
}
	@Test
	public void test2() throws Throwable {
		@SuppressWarnings("deprecation")
		Long id = Thread.currentThread().getId();
		System.out.println("Chrome"+id);
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL(nodeURL),cap);
		driver.get(baseURL);
		 driver.manage().window().setSize(new Dimension(1536, 824));
		 driver.findElement(By.cssSelector(".clearbtn")).click();
		 driver.findElement(By.name("vx")).click();
		 driver.findElement(By.name("vx")).sendKeys("3");
		 driver.findElement(By.name("vy")).click();
		 driver.findElement(By.name("vy")).sendKeys("3");
		 driver.findElement(By.name("vz")).click();
		 driver.findElement(By.name("vz")).sendKeys("3");
		 driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		 Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),"Equilateral Triangle");


	
	}
}
