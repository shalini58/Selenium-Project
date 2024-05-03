package learnWindowHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.qsy7.file.api.service.FileUtil;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snap/irctc.png");
		FileUtils.copyFile(screenshotAs, file);
	}

}
