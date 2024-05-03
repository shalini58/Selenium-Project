package learnAlert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id ='j_idt88:j_idt104']/span[text()='Show']")).click();
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		 //System.out.println(alert.getText());
		 alert.sendKeys("Test Leaf");
		 System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
