package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Test;


//1. Navigate to FDM module.
//2. Select and double click on an arrival /departure flight from arrival/departure flight grid.
//        3.Verify VIA field
//        4.Click on VIA field

public class TC_177 extends Setup {
    @Test
    public void TC_177(){
        FDMPage fdmPage = homePage.clickFDMLink();
        fdmPage.doubleClickGrid();
    }

}
