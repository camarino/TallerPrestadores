package Pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

public class InicioPage {

	public WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath= "//*[@id='navbar']/ul/li[1]/a")
	WebElement nombreUsuario;
	
	@FindBy (xpath = "//*[@id='navbar']/ul/li[2]/a")
	WebElement btnCambiarPass;
	@FindBy (xpath = "//*[@id='main']/div/div/div[2]/div/div/div[1]/div/div/div/button")
	WebElement btnInterconsulta;
		
	@FindBy (id = "btSalir")
	WebElement btnSalir;
	
	public  InicioPage (WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void verificarBtn() throws InterruptedException {
		
		assertEquals(nombreUsuario.getText(),"Bienvenido, Usuario Test01");
		assertTrue(btnCambiarPass.isDisplayed());
		assertTrue(btnInterconsulta.isDisplayed());
		assertTrue(btnSalir.isDisplayed());
		
	}
	
	
}
