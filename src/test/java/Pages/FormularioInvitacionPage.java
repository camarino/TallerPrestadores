package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormularioInvitacionPage {

	public WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath = "//*[@id='main']/div/div/div/div/div[2]/div/div[2]")
	WebElement formulario;
	
	@FindBy (name = "valorIdentificacion")
	WebElement numSocio;
	
	@FindBy (id = "apellido")
	WebElement apellidoSocio;
	
	@FindBy (id = "nombre")
	WebElement nombreSocio;
	
	@FindBy ( id ="fechaNacimiento")
	WebElement fechaNacimiento;
	
	@FindBy (id = "apellidoSolicitante")
	WebElement apellidoMedico;
	
	@FindBy ( id = "nombreSolicitante")
	WebElement nombreMedico;
	
	@FindBy (id="tipoMatricula")
	WebElement tipomatricula;
	
	@FindBy (id="nroMatricula")
	WebElement nroMatricula;
	
	@FindBy (id="email")
	WebElement mailSocio;
	
	@FindBy (id ="phone")
	WebElement celSocio;
	
	@FindBy (id = "especialidad")
	WebElement especialidad;
	
	@FindBy ( id="profesional")
	WebElement profesional;
	
	@FindBy (name = "detalle")
	WebElement motivoConsulta;
	
		@FindBy (xpath = "//*[@id='enviarInvitacionForm']/div/footer/div/div/div/div[2]/button")
	WebElement btnEnviarFormulario;
	
	public FormularioInvitacionPage (WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	public void CargarFormulario() {
		numSocio.sendKeys("34234242456");
		apellidoSocio.sendKeys("Pastorella");
		nombreSocio.sendKeys("Santiago");
		fechaNacimiento.click();
		fechaNacimiento.sendKeys("15052000");
		apellidoMedico.sendKeys("Marino");
		nombreMedico.sendKeys("Cin");
		Select stipo = new Select(tipomatricula);
		stipo.selectByVisibleText("MP - Córdoba");
		nroMatricula.sendKeys("5675654535");
		mailSocio.sendKeys("cinthya.marino@gmail.com");
		celSocio.sendKeys("1160379932");
		Select sEspecialidad = new Select (especialidad);
		sEspecialidad.selectByVisibleText("Cirugía General");
		Select sProfesional = new Select (profesional);
		sProfesional.selectByVisibleText("Smotest Cuatro");
		motivoConsulta.sendKeys("consulta para una cirugía general");
		btnEnviarFormulario.click();
	}
	
}
	

	

	


	
