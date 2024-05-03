package learnTestNg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadA1  extends BaseClass{
	
	@BeforeClass
	public void putData() {
		fileName = "createLead";
	}

	
	@Test(dataProvider = "Fetch Data")
	public  void runCreateLead(String cName, String fName, String lName) {
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();

		Assert.assertEquals(driver.findElement(By.id("viewLead_firstName_sp")).getText(), fName);
		

	}
	
//	@DataProvider(name="Fetch Data")
//	public String[][] setData() throws IOException {
//		/*
//		 * String[][] data = new String[2][3];
//		 * 
//		 * data[0][0] = "TestLeaf"; data[0][1] = "Shalini"; data[0][2] = "R";
//		 * 
//		 * data[1][0] = "TestLeaf"; data[1][1] = "Sathya"; data[1][2] = "P";
//		 */		
//		
//		String[][] data = ReadExcel.readData();
//		return data;
		
		
		
	//}

}
