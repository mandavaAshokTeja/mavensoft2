package mavensoft;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SudhakarPipes {
	

	
	
public static 	WebDriver driver;
	@BeforeTest
	public void init()   {
		System.setProperty("webdriver.chrome.driver","E:\\LIveTec Narendra\\Browsers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://crm.sudhakarind.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	
	@Test
	public void login() throws Throwable {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"ctl00_lblloginstatus\"]/a\")).click();
//		Thread.sleep(3000);
//		
		driver.findElement(By.id("email")).sendKeys("9849203828");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/section/form/div/div[3]/input")).click();
	}

	


	@Test
	public void logout() {
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/nav/ul/li[1]/a/p")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/nav/ul/li[1]/ul/li[2]/a")).click();
		
	}

	@AfterTest
	public void quit() throws Throwable {
	
		//Thread.sleep(3000);
	driver.close();
	
	}
}

