package mavensoft;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Airnujini {
	
public static 	WebDriver driver;
	@BeforeTest
	public void init()   {
		System.setProperty("webdriver.chrome.driver","E:\\LIveTec Narendra\\Browsers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
			driver.get("http://183.82.100.162:215/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    //  driver.findElement(By.xpath("//*[@id=\"homepopup\"]/div/div/div/a/img")).click();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	      
	}

	
	@Test
	public void login() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("00100776922");;
		Thread.sleep(3000);
		driver.findElement(By.id("txtpassword")).sendKeys("Abcd@123");;
	 	driver.findElement(By.id("Login")).click();
	

	}

	


	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div[3]/div/span/a")).click();
		
	}

	@AfterTest
	public void quit() {
	
	driver.close();
	
	}
}

