package seleniumSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shalini");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		WebElement sleTool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sT = new Select(sleTool);
		
		sT.selectByValue("LEAD_EMPLOYEE");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(text.equals("Shalini")) {
			System.out.println("Name is correct");
		}
		else {
			System.out.println("Name is incorrect");
		}
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
