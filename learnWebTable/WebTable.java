package learnWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr[1]/td")).getText();
//		System.out.println(text);
		
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr[1]/td"));
		int col = column.size();
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr/td[1]"));
		int rw = row.size();
		
		for (int i = 1; i <=rw ; i++) {
			for (int j = 1; j <= col; j++) {
				String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text2);

				
			}
			
		}
		
	}

}
