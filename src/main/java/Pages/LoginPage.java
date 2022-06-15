package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private WebDriver webDriver;
  private By username = By.name("username");
  private By password = By.name("password");
  private By client = By.name("client");
  private By loginBtn = By.cssSelector(".login_form_btn.login_btn");

  public LoginPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void enterUsername(String username) {
    webDriver.findElement(this.username).sendKeys(username);
  }

  public void enterPassword(String password) {
    webDriver.findElement(this.password).sendKeys(password);
  }

  public void enterClient(String client) {
    webDriver.findElement(this.client).sendKeys(client);
  }

  public void clickLogin() {
    webDriver.findElement(this.loginBtn).click();
  }
}
