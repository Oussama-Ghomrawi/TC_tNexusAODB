package Pages;

import Elements.FDMElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

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

  public void clickFDMMenu(){
    webDriver.findElement(FDMMenu).click();
  }

  public boolean checkFDMMenu(){
    return webDriver.findElement(FDMMenu).isDisplayed();
  }
  public void insertSuffix(){
    webDriver.findElement(arr_FlightNumberSuffix).sendKeys("11");
  }
  public boolean checkSuffixAlert(){
    return webDriver.findElement(suffixAlert).isDisplayed();
  }
  public void clickService() {
    webDriver.findElement(arr_Service).click();
  }
  public void selectFirstOptionService(){
    webDriver.findElement(arr_ServiceFirstOption).click();
  }
  public void doubleClickGrid(){
    Actions act = new Actions(webDriver);
    WebElement element = webDriver.findElement(gridFDM);
    act.doubleClick(element).perform();
  }
}
