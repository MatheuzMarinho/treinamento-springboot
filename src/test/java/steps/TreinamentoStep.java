package steps;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TreinamentoStep {
	
	private WebDriver driver;
	
	@Dado("^que estou na pagina de cadastro$")
	public void queEstouNaPaginaDeCadastro() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();
		driver.get("http://localhost:4200/formulario");
		Thread.sleep(5000);  // Let the user actually see something!
	}

	@Quando("^preencher o formulario$")
	public void preencherOFormulario() throws Throwable {
		WebElement searchBox = driver.findElement(By.id("nome"));
		searchBox.sendKeys("Teste Automatizado 3");
	}

	@Entao("^poderei cadastrar um novo tipo de cadastro$")
	public void podereiCadastrarUmNovoTipoDeCadastro() throws Throwable {
		WebElement searchBox = driver.findElement(By.xpath("/html/body/app-root/app-formulario/form/button"));
		searchBox.click();
		Thread.sleep(2000); 
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); 
		Assert.assertEquals("Cliente Cadastro com Sucesso!",alert.getText());
	}
	
	@Test
	public void testGoogleSearch() throws InterruptedException {
	  //http://chromedriver.chromium.org/downloads
	  System.setProperty("webdriver.chrome.driver", "chromedriver");

	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com/xhtml");
	  Thread.sleep(5000);  // Let the user actually see something!
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("ChromeDriver");
	  searchBox.submit();
	  Thread.sleep(5000);  // Let the user actually see something!
	  driver.quit();
	}
}
