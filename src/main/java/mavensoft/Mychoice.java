package mavensoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mychoice {
	public static 	WebDriver driver;
	@BeforeTest
	public void init()   {
		System.setProperty("webdriver.chrome.driver","E:\\LIveTec Narendra\\Browsers\\chromedriver.exe");
		 driver=new ChromeDriver();
		

			driver.get("https://www.mychoicesmyplan.org/");

		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	
	@Test
	public void login() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tophead\"]/div/div/div/div[2]/a")).click();
		//Thread.sleep(3000);

		driver.findElement(By.id("erf_username")).sendKeys("pradeep.p@mavensoft.com");
	//	Thread.sleep(3000);
		driver.findElement(By.id("erf_password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"post-1945\"]/div/div/div[2]/div/div[1]/form[1]/div[7]/div/button")).click();
	}

	
	

	@Test
	public void logout() {
	driver.findElement(By.xpath("//*[@id=\"tophead\"]/div/div/div/div[2]/div/a")).click();

		
	}

	@AfterTest
	public void quit() {
	
	driver.close();
	
	}
}

