package Pages;

import Elements.FDMElements;
import org.openqa.selenium.WebDriver;

public class FDMPage extends FDMElements {
  WebDriver webDriver;

  public FDMPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void clickADEPTab() {
    webDriver.findElement(adepTab).click();
  }

  public void clickMovementIcon() {
    webDriver.findElement(movementIcon).click();
  }

  public void clickInsert() {
    webDriver.findElement(insert).click();
  }

  public String getHeader() {
    return webDriver.findElement(header).getText();
  }

  public boolean checkSaveBtn() {
    return webDriver.findElement(saveBtn).isDisplayed();
  }

  public boolean checkCloseBtn() {
    return webDriver.findElement(closeBtn).isDisplayed();
  }

  public String getArrivalText() {
    return webDriver.findElement(arrivalSpan).getText();
  }

  public String getDepartureText() {
    return webDriver.findElement(departureSpan).getText();
  }

  public boolean checkLogo() {
    return webDriver.findElement(dep_logo).isDisplayed();
  }
}
