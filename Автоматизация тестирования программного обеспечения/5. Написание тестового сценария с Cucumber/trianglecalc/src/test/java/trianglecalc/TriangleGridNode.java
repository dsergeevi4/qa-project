package trianglecalc;

import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
@TestInstance(Lifecycle.PER_CLASS)
@Execution(ExecutionMode.CONCURRENT)
public class TriangleGridNode {

	RemoteWebDriver driver;
	String baseURL, nodeURL;

		@BeforeAll
		public void setUp() {
			baseURL = "https://www.calculator.net/triangle-calculator.html";
	nodeURL = "http://localhost:4444/wd/hub";
			
		}


		@AfterEach
		public void tearDown() {
		 driver.close();
		}
	
		@Test
		 public void test1() throws Throwable {
		 System.out.println("Executing on FireFox");
		 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		 DesiredCapabilities capability=new DesiredCapabilities();

		 capability.setBrowserName("firefox");
		 capability.setPlatform(Platform.WIN10);
		 FirefoxOptions options = new FirefoxOptions();
		 capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

		 driver=new RemoteWebDriver(new URL(nodeURL),capability);

		 driver.get(baseURL);

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
		 System.out.println("Executing on Chrome");
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 DesiredCapabilities capability=new DesiredCapabilities();

		 capability.setBrowserName("chrome");
		 capability.setPlatform(Platform.WIN10);
ChromeOptions options = new ChromeOptions();
capability.setCapability(ChromeOptions.CAPABILITY, options);

		 driver=new RemoteWebDriver(new URL(nodeURL),capability);

		 driver.get(baseURL);


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
