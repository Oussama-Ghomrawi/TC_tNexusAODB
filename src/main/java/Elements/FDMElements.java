package Elements;

import org.openqa.selenium.By;

public class FDMElements {
  protected final By adepTab = By.cssSelector("div[row-index=\"1\"]");
  protected final By movementIcon =
      By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.grid_extended_btn");
  protected final By insert =
      By.cssSelector("ul.MuiList-root.Grid_extended_menu.MuiList-padding li:nth-child(1)");

  protected final By header = By.cssSelector("button.sc-fEOsli.jnFcnU > span:nth-child(2)");
  protected final By saveBtn = By.cssSelector("div.sc-ckMVTt.hcWITW  span.labelClass");
  protected final By closeBtn =
      By.cssSelector("header.fdm__module_box .dialogBox__header__close:nth-child(1)");
  protected final By arrivalSpan = By.cssSelector(".sc-gSAPjG.hdOgUf.formOpsView > span");
  protected final By departureSpan = By.cssSelector(".sc-gSAPjG.gWIWJb.formOpsView > span");
  protected final By dep_logo =
      By.cssSelector(
          ".MuiGrid-root.DepartureGridRight.MuiGrid-container.MuiGrid-grid-xs-9 .sc-dIouRR");
  protected final By arr_FlightNumber =
      By.cssSelector(
          ".MuiGrid-root.movement__column.MuiGrid-container.MuiGrid-spacing-xs-2.MuiGrid-grid-xs-6:first-of-type .sc-papXJ.kwUXqk");
  protected final By dep_FlightNumber =
      By.cssSelector(
          ".MuiGrid-root.movement__column.MuiGrid-container.MuiGrid-spacing-xs-2.MuiGrid-grid-xs-6:last-of-type .sc-papXJ.kwUXqk");
  protected final By arr_FlightNumberSub =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/div/div[2]/input");
  protected final By dep_FlightNumberSub =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/input");
  protected final By arr_FlightNumberSuffix =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/div/div[3]/input");
  protected final By dep_FlightNumberSuffix =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/input");
  protected final By arr_ADEP =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]/input");
  protected final By dep_ADEP =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[2]/div/div/div[1]/div[2]/input");
  protected final By arr_Category =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[2]/div/div/div[5]/div[2]/input");
  protected final By dep_Category =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[2]/div/div/div[6]/div[2]/input");
  protected final By arr_SIBT =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[2]/div/div/div[6]/div[2]/input");
  protected final By dep_SIBT =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[2]/div/div/div[4]/div[2]/input");
  protected final By ac_type =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div[2]/input");
  protected final By arr_CallSign =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[1]/div[1]/div/div/div[3]/div/div/input");
  protected final By dep_CallSign =
      By.xpath(
          "/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/input");
  protected final By FDMMenu = By.className("si-group-2");
protected final By suffixAlert = By.className("ddbqVy");

protected final By arr_Service = By.xpath("/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/input");
protected final By arr_ServiceFirstOption = By.xpath("/html/body/div[9]/div[3]/div/div/div/form/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div[2]/div/div/div[1]/div[2]");
protected final By gridFDM = By.xpath("/html/body/div[1]/div/div[1]/div[5]/div/section/section/div/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[1]");


}
