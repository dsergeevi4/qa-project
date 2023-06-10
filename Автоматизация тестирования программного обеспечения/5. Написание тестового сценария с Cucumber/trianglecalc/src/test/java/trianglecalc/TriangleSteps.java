package trianglecalc;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TriangleSteps {

WebDriver driver;	
@Given("^I use Triangle Calculator$")
public void i_launch() throws Exception {
driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
driver.navigate().to("https://www.calculator.net/triangle-calculator.html");
}

@When("^I clear all default parameter from calculator$")
public void Clear_Default_Values() {
driver.findElement(By.name("va")).clear();
driver.findElement(By.name("vb")).clear();
driver.findElement(By.name("vc")).clear();
driver.findElement(By.name("vx")).clear();
driver.findElement(By.name("vy")).clear();
driver.findElement(By.name("vz")).clear();
 }

@And("^I set value \"6\" for side \"A\"$")
public void Set_Value_6_for_Side_A() {
	driver.findElement(By.name("vx")).sendKeys("6");
}
@And("^I set value \"6\" for side \"B\"$")
public void Set_Value_6_for_Side_B() {
	driver.findElement(By.name("vy")).sendKeys("6");
}
@And("^I set value \"3\" for side \"C\"$")
public void Set_Value_3_for_Side_C() {
	driver.findElement(By.name("vz")).sendKeys("3");
}
@And("^I click \"Calculate\" button$")
public void Click_Calculate_Button() {
	driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
}

@Then("^the calculated result is \"Acute Isosceles Triangle\"$")
public void i_veryfy() throws Exception {
	Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),"Acute Isosceles Triangle");
	driver.quit();
}
	
}
