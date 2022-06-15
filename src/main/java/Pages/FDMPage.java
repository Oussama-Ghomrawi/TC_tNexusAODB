package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FDMPage {
  WebDriver webDriver;
  private final By adepTab = By.cssSelector("div[row-index=\"1\"]");
  private final By movementIcon =
      By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.grid_extended_btn");
  private final By insert =
      By.cssSelector("ul.MuiList-root.Grid_extended_menu.MuiList-padding li:nth-child(1)");

  private final By header = By.cssSelector("button.sc-fEOsli.jnFcnU > span:nth-child(2)");
  private final By saveBtn = By.cssSelector("div.sc-ckMVTt.hcWITW  span.labelClass");
  private final By closeBtn =
      By.cssSelector("header.fdm__module_box .dialogBox__header__close:nth-child(1)");
  private final By arrival = By.cssSelector(".sc-gSAPjG.hdOgUf.formOpsView > span");
  private final By departure = By.cssSelector(".sc-gSAPjG.gWIWJb.formOpsView > span");
  private final By logo =
      By.cssSelector(
          ".MuiGrid-root.DepartureGridRight.MuiGrid-container.MuiGrid-grid-xs-9 .sc-dIouRR");

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
    return webDriver.findElement(arrival).getText();
  }

  public String getDepartureText() {
    return webDriver.findElement(departure).getText();
  }

  public boolean checkLogo() {
    return webDriver.findElement(logo).isDisplayed();
  }
}
