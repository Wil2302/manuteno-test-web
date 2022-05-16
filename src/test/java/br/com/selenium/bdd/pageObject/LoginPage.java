package br.com.selenium.bdd.pageObject;


import org.openqa.selenium.support.FindBy;

import br.com.selenium.utils.UserProfileUtils;
import org.junit.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	
	@FindBy(id = "email")
	private WebElementFacade campoEmail;
	
	@FindBy(id = "password") 
	private WebElementFacade campoSenha;
	
	@FindBy(xpath = "//button[contains(text(),'Entrar')]")
	private WebElementFacade btnEntrar;

	@FindBy(xpath = "//h2[contains(text(),'Aqui você pode gerenciar, adicionar ou excluir os Participantes.')]")
	private WebElementFacade txtTitulo;
	
	
	
	
	public void preencherUsuario(String valor) {
		campoEmail.sendKeys(valor);
	}
	
	public void preencherSenha(String userName) {
		campoSenha.sendKeys(UserProfileUtils.getPassword(userName));
	}

	public void clicarBotao(String nomeBotao) {
		clickOn(btnEntrar);
	}
	
	public void validarLoginComSucesso() {
		Assert.assertTrue(txtTitulo.isDisplayed());
	}
	

}
