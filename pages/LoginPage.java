package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private WebDriver browser;

    public LoginPage(WebDriver browser) {

        this.browser = browser;
    }

    public LoginPage informUser (String user) {
        browser.findElement(By.id("inputUsuarioLogin")).click();
        browser.findElement(By.id("inputUsuarioLogin")).sendKeys(user);

        return this;
    }

    public LoginPage informPassword (String password) {
        browser.findElement(By.id("inputSenhaLogin")).click();
        browser.findElement(By.id("inputSenhaLogin")).sendKeys(password);

        return this;
    }

    public ProductsPage submitLogin() {
        browser.findElement(By.id("botaoLogin")).click();

        return new ProductsPage(browser);
    }


}