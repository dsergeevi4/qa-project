package trianglecalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class MathSteps {

	WebDriver driver;	
	@Given("^I use the calculater$")
	public void i_launch() throws Exception {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver.navigate().to("https://www.calculator.net/math-calculator.html.");
	}
	
	@When("^I enter \"1\" into the calculator$")
	public void i_open() throws Exception {
		driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(1)")).click();
}
	
	@And("^I add \"200\"$")
	public void add_200() throws Exception {
		driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)")).click();
		driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	}
	
	@And("^I subtract \"200\"$")
	public void subtract_200() throws Exception {
		driver.findElement(By.cssSelector("div:nth-child(2) > .sciop:nth-child(4)")).click();
		driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	}
	
	@And("^I divide by \"555\"$")
	public void divide_555() throws Exception {
		driver.findElement(By.cssSelector("div:nth-child(4) > .sciop:nth-child(4)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	
	@And("^I multiply by \"555\"$")
	public void multiply_555() throws Exception {
		driver.findElement(By.cssSelector("div:nth-child(3) > .sciop:nth-child(4)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	
	@Then("^the calculated result is \"1\"$")
	public void i_veryfy() throws Exception {
		assertEquals(driver.findElement(By.id("sciOutPut")).getText()," 1");
		driver.quit();
	}
	
}
