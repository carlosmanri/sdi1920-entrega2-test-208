package test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.utils.SeleniumUtils;

public class PO_View {
	
	protected static int timeout = 3;

	public static int getTimeout() {
		return timeout;
	}

	public static void setTimeout(int timeout) {
		PO_View.timeout = timeout;
	}


	
	/**
	 * Espera por la visibilidad de un texto correspondiente a la propiedad key en el idioma locale en la vista actualmente cargandose en driver..
	 * @param driver: apuntando al navegador abierto actualmente.
	 * @param key: clave del archivo de propiedades.
	 * @param locale: Retorna el �ndice correspondient al idioma. 0 p.SPANISH y 1 p.ENGLISH.
	 * @return Se retornar� la lista de elementos resultantes de la b�squeda.
	 */
	static public List<WebElement> checkKey(WebDriver driver, String text) {
		List<WebElement> elementos = SeleniumUtils.EsperaCargaPagina(driver, "text", text, getTimeout());
		return elementos;
	}
	/**
	 *  Espera por la visibilidad de un elemento/s en la vista actualmente cargandose en driver..
	 * 
	 * @param driver: apuntando al navegador abierto actualmente.
	 * @param type: 
	 * @param text:
	 * @return Se retornar� la lista de elementos resultantes de la b�squeda.
	 */
	static public List<WebElement> checkElement(WebDriver driver, String type, String text) {
		List<WebElement> elementos = SeleniumUtils.EsperaCargaPagina(driver, type, text, getTimeout());
		return elementos;		
	}
}