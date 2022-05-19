package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver browser;

    public ProductsPage(WebDriver browser) {

        this.browser = browser;
    }

    public ProductsPage accessElectronicsSession() {
        browser.findElement(By.id("eletronicosMenuSuperior")).click();

        return this;
    }

    public ProductsPage filterBySmartphones() {
        browser.findElement(By.cssSelector("input[value='Celular & Smartphone']")).click();

        return this;
    }

    public String message() {
        return browser.findElement(By.cssSelector("#listingCount")).getText();
    }

}