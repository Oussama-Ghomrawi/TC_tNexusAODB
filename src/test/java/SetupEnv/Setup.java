package SetupEnv;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Setup {

  private WebDriver webDriver;
  protected HomePage homePage;
  protected LoginPage loginPage;

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
    webDriver = new ChromeDriver();
    webDriver.manage().window().maximize();
    openLoginPage();
    loginPage = new LoginPage(webDriver);
  }

  @BeforeEach
  public void TestLogin() {
    loginPage.enterUsername("qauser");
    loginPage.enterPassword("QAuser@123");
    loginPage.enterClient("DXB");
    loginPage.clickLogin();
    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    homePage = new HomePage(webDriver);
  }

  public void openLoginPage() {
    webDriver.get("http://192.168.1.20:31080/login");
  }
}
