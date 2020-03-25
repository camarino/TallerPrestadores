package test;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import Pages.FormularioInvitacionPage;
import Pages.InicioPage;
import Pages.LoginPage;
import Pages.TurnosPage;

public class Prueba extends Base{
	
  @Test
  public void login() throws InterruptedException {
	  assertEquals(driver.getCurrentUrl(),"https://tsegundaopinion.osde.com.ar/prestadores/signin");
	  LoginPage login = new LoginPage(driver, wait);
	  login.login("cmarino@sms-latam.com","Smotest1!");
	  Thread.sleep(4000);
  }
  
  @Test (dependsOnMethods = {"login"})
  public void inicio () throws InterruptedException {
	  InicioPage inicio = new InicioPage(driver, wait);
	  inicio.verificarBtn();
	  
	  Thread.sleep(3000);
  }
  
  @Test (dependsOnMethods = {"inicio"})
  	public void turnos() throws InterruptedException {
	  TurnosPage turnos = new TurnosPage(driver, wait);
	  turnos.ingresarAlFormulario();
	  Thread.sleep(2000);
  }
  
  @Test (dependsOnMethods = {"turnos"})
  
  public void formulario() throws InterruptedException {
	  FormularioInvitacionPage formulario = new FormularioInvitacionPage(driver, wait);
	  formulario.CargarFormulario();
	  Thread.sleep(2000);
  }
}
