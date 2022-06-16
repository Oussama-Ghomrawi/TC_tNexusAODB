package FDM_ActionsAndFlight_Details.InsertMovement;

import Pages.FDMPage;
import SetupEnv.Setup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//1.Click on airline dropdown from arr/dep section
//        2. Select any airline from the list
//        3.Give suffix as more than 1 character
//        4.Then give 1 character
// Error should show if more than 1 character is added
public class TC_022 extends Setup {
    @Test
    public void TC_022(){
        FDMPage fdmPage = homePage.clickFDMLink();
        fdmPage.clickFDMMenu();
        fdmPage.clickInsert();
        fdmPage.insertSuffix();
        assertTrue(fdmPage.checkSuffixAlert());
    }
    public void checkAlert(){

    }
}
