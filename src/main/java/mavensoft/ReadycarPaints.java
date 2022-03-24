package mavensoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadycarPaints {
	
public static 	WebDriver driver;
	@BeforeTest
	public void init()   {
		System.setProperty("webdriver.chrome.driver","E:\\LIveTec Narendra\\Browsers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://52.172.163.181:9000/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	
	@Test
	public void login() {
		driver.findElement(By.id("login-title-955644")).click();

		driver.findElement(By.id("user_login")).sendKeys("pradeep.p@mavensoft.com");
		driver.findElement(By.id("user_pass")).sendKeys("Reset@123");
		driver.findElement(By.id("wp-submit")).click();
	}

	


	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//*[@id=\"post-12\"]/section/div/div/p[1]/a")).click();
		
	}

	@AfterTest
	public void quit() {
	
	driver.close();
	
	}
}






