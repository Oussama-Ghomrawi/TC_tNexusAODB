package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TC_028 extends Setup {
  @Test
  public void TC_028() {
    FDMPage fdmPage = homePage.clickFDMLink();
    fdmPage.clickFDMTabs();
    fdmPage.clickFDM_Arr_Tab();
    fdmPage.clickMovementIcon();
    fdmPage.clickInsert();
    fdmPage.click_Arr_ADEP();
    fdmPage.clickFirst_Arr_ADEP();
    fdmPage.click_Arr_Category();
    fdmPage.clickFirst_Arr_Category();
    fdmPage.click_Ac_Type();
    fdmPage.clickFirst_Ac_Type();
    fdmPage.clickSave();
    fdmPage.clickYes();
    assertEquals(
        fdmPage.getErrorMsgText(), "Please fill Call Sign or Flight Number for the arrival");
  }
}
