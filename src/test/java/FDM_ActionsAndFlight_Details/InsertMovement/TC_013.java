package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TC_013 extends Setup {
  @Test
  public void TC_013() {
    FDMPage fdmPage = homePage.clickFDMLink();
    fdmPage.clickADEPTab();
    fdmPage.clickMovementIcon();
    fdmPage.clickInsert();
    assertEquals(fdmPage.getHeader(), "INSERT MOVEMENT");
    assertTrue(fdmPage.checkSaveBtn());
    assertTrue(fdmPage.checkCloseBtn());
    assertEquals(fdmPage.getArrivalText(),"Arrival *");
    assertEquals(fdmPage.getDepartureText(),"Departure *");
    assertTrue(fdmPage.checkLogo());
  }
}
