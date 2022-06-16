package Pages;

import Elements.FDMElements;
import io.netty.util.Timeout;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FDMPage extends FDMElements {
  WebDriver webDriver;
  JavascriptExecutor js;

  public FDMPage(WebDriver webDriver) {
    this.webDriver = webDriver;
    this.js = (JavascriptExecutor) webDriver;
  }

  public void clickFDMTabs() {
    webDriver.findElement(fdmTabs).click();
  }

  public void clickFDM_Dep_Tab() {
    js.executeScript("arguments[0].click()", webDriver.findElement(fdm_dep_Tab));
  }

  public void clickFDM_Turn_Tab() {
    js.executeScript("arguments[0].click()", webDriver.findElement(fdm_turn_Tab));
  }

  public void clickFDM_Aircraft_Tab() {
    js.executeScript("arguments[0].click()", webDriver.findElement(fdm_aircraft_Tab));
  }

  public void clickFDM_AdditionalFlights_Tab() {
    js.executeScript("arguments[0].click()", webDriver.findElement(fdm_additionalFlights_Tab));
  }

  public void clickFDM_Arr_Tab() {
    js.executeScript("arguments[0].click()", webDriver.findElement(fdm_arr_Tab));
  }

  public void clickMovementIcon() {
    webDriver.findElement(movementIcon).click();
  }

  public void clickInsert() {
    webDriver.findElement(insert).click();
  }

  public void click_Arr_ADEP() {
    webDriver.findElement(arr_ADEP).click();
  }

  public void clickFirst_Arr_ADEP() {
    webDriver.findElement(first_arr_ADEP).click();
  }

  public void click_Arr_Category() {
    webDriver.findElement(arr_Category).click();
  }

  public void clickFirst_Arr_Category() {
    webDriver.findElement(first_arr_Category).click();
  }

  public void click_Ac_Type() {
    webDriver.findElement(ac_type).click();
  }

  public void clickFirst_Ac_Type() {
    webDriver.findElement(first_ac_type).click();
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

  public void clickSave() {
    webDriver.findElement(saveBtn).click();
  }

  public void clickYes() {
    webDriver.findElement(yesBtn).click();
  }

  public String getErrorMsgText() {
    return webDriver.findElement(errorMsg).getText();
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
