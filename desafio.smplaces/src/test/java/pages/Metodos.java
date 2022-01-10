package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	private static WebDriver driver;

	public static WebDriver adriver() {
		return driver;
	}
	
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("-------- erro ao abrir navegedor -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}
	
		    public void clicar(By elemento) {
		try {
		  driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------- erro ao clicar -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("-------- erro ao pausar com Thread.sleep -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}
	
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------- erro ao escrever -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}	
	
	public void submit(By elemento) {
		try {
		    driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.err.println("-------- erro dar enter submit-------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void screenShot(String nome) throws IOException {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + e.getMessage());
		}
	}

    public void validarTitle(String title) {
    	
    	String paginaAtual = adriver().getTitle();
    	assertEquals(title, paginaAtual);
    }

    public void fecharNavegador(String descriPasso) {
    	
    	driver.quit();
    }

}
