import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import java.time.Duration;

@DisplayName("Searching for the quantity of Smartphones being sold at Kabum's website")

public class SmartphonesSeeker {

    private WebDriver browser;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");

        this.browser = new ChromeDriver();

        this.browser.manage().window().maximize();

        this.browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        this.browser.get("https://www.kabum.com.br/");

        this.browser.findElement(By.id("linkLoginHeader")).click();

    }

    @Test
    @DisplayName("Automating the search for the quantity of SmartPhones being sold at Kabum's website")
    public void quantityofSmartphonesBeingSold () {
        String showedMessage = new LoginPage(browser)
                .informUser("")
                .informPassword("")
                .submitLogin()
                .accessElectronicsSession()
                .filterBySmartphones()
                .message();

        System.out.println(showedMessage + " are available.");
    }

    @AfterEach
    public void afterEach() {
        browser.quit();

    }
}