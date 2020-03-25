package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (name="user")
	WebElement usuario;
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy (id="prestadores-signin-btn-login")
	WebElement btnIngresar;
	
	public LoginPage ( WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void ingresarUsuario (String usr) {
		wait.until(ExpectedConditions.visibilityOf(usuario));
		usuario.sendKeys("cmarino@sms-latam.com");
	}
	
	public void ingresarPass (String pas) {
		password.sendKeys("Smotest1!");
	}
	
	public void clicLogin() {
		btnIngresar.click();
	}
	
	public void login (String usr, String pas) {
		ingresarUsuario(usr);
		ingresarPass(pas);
		clicLogin();
	}
}
