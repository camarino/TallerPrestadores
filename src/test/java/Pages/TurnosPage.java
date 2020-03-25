package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TurnosPage {

	WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath = "//*[@id='main']/div/div/div[2]/div/div/div[1]/div/div/div/button")
	WebElement btnInterconsulta;
	@FindBy (xpath = "//*[@id='main']/div/div/div/div/div[1]/button")
	WebElement btnEnviar;
	
	public TurnosPage (WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicInterconsulta() {
		wait.until(ExpectedConditions.elementToBeClickable(btnInterconsulta));
		btnInterconsulta.click();
	}
	
	public void clicEnviar () {
		wait.until(ExpectedConditions.visibilityOf(btnEnviar));
		btnEnviar.click();
	}
	
	public void ingresarAlFormulario() {
		clicInterconsulta();
		clicEnviar();
	}
	
}
