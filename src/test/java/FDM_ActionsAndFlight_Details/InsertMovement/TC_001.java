package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TC_001 extends Setup {
    @Test
        public void TC_001(){
        FDMPage fdmPage = homePage.clickFDMLink();
assertTrue(fdmPage.checkFDMMenu());
    }

}
