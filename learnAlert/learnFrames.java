package learnAlert;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnFrames {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//h5[contains(text(), 'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(ele);
		
		driver.switchTo().frame("frame2");
		
//		WebElement ele = driver.findElement(By.xpath("//iframe"));
//		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
	}

}
