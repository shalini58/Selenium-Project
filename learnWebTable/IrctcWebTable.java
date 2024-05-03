package learnWebTable;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("MAS", Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.clear();
		to.sendKeys("CBE", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		
		 int col = driver.findElements(By.
		 xpath("//div[@id='divTrainsList']/table[contains(@class,'DataTable ')]/tbody/tr[2]/td"
		 )).size(); 
		 int row = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[contains(@class,'DataTable ')]/tbody/tr/td[1]"
		  )).size();
		 
		 List<WebElement> ele = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[contains(@class,'DataTable ')]/tbody/tr/td[2]"));
		 List<String> nameAdd = new ArrayList<String>();
		 
			/*
			 * for (int i = 2; i <= row; i++) { //for (int j = 1; j < row; j++) {
			 * 
			 * String text = driver .findElement(By.
			 * xpath("//div[@id='divTrainsList']/table[contains(@class,'DataTable ')]/tbody/tr["
			 * +i+"]/td[2]")) .getText(); nameAdd.add(text); System.out.println(text); }
			 */
		for (WebElement trains : ele) {
			String text = trains.getText();
			nameAdd.add(text);
		}
		 
		 Set<String>  webEle  = new HashSet<String>(nameAdd);
		 System.out.println(nameAdd.size());
		 System.out.println(webEle.size());
		 if(nameAdd.size() == webEle.size()) {
			 System.out.println("No duplicates");
		 }
		 else {
			 System.out.println("Duplicates");
		 }
//		}

	}

}
