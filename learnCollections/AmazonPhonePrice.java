package learnCollections;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhonePrice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
		
		
		List<WebElement> leastPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
 		for (WebElement least : leastPrice) {
			String text = least.getText().replace(",", "");
			System.out.println(text);
			//System.out.println(text);
			int price = Integer.parseInt(text);
			priceList.add(price);
			
		}
 		
 		Collections.sort(priceList);
		System.out.println("Least Price:"+priceList.get(0));
		//Collections.sort(leastPrice);
		
		

	}

}
