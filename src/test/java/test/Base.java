package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://tsegundaopinion.osde.com.ar/prestadores/signin");
		System.out.println("Se accedió correctamente a la URL");
		wait = new WebDriverWait(driver, 15);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
