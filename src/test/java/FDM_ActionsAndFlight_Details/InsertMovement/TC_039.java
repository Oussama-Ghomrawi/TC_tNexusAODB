package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Test;


//1.Click on Arr/dep tab
//2.Click on Movement icon on top left corner of FDM screen and select insert movement
//3.click on Service  Drop down list of arr/dep
//4.Select any service

public class TC_039 extends Setup {
    @Test
    public void TC_039(){
        FDMPage fdmPage = homePage.clickFDMLink();
        fdmPage.clickFDMMenu();
        fdmPage.clickInsert();
        fdmPage.clickService();
        fdmPage.selectFirstOptionService();
    }
}
