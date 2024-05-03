package learnCollections;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnDropDowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
		
		Select opt = new Select(eleTool);
	
		opt.selectByIndex(3);
		
		List<WebElement> options = opt.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement op = options.get(i);
			String text = op.getText();
			System.out.println(text);
			
		}
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
		
	}

}
