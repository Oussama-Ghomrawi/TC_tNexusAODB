package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver webDriver;

  public HomePage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public FDMPage clickFDMLink() {
    clickLink("fdm");
    return new FDMPage(webDriver);
  }

  private void clickLink(String linkText) {
    webDriver.findElement(By.cssSelector("a[href=\"/" + linkText + "\"] > div")).click();
  }
}
