import common.BaseSetUp
import org.junit.Assert
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Created by C07HJAXNDJD0 on 4/12/16.
 */
class SidebarTest extends BaseSetUp {

    WebDriverWait wait = new WebDriverWait(firefoxBrowser.driver, 5)

    @Test
    void sidebarTest(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('nav[class="sidebar medium-4 large-2 columns"]')))
        log.info("Check NBIR Logo is displayed in Sidebar Navigation")
        homeSection.sidebarModule.nbirLogo.isDisplayed()
        waitFor(3000)
        log.info("Check Avoid the BITE button is displayed in Sidebar Navigation")
        Assert.assertEquals("AVOID THE BITE", homeSection.sidebarModule.avoidTheBiteBtn.text())
        waitFor(3000)
        log.info("Check NBIR Tour button is displayed in Sidebar Navigation")
        Assert.assertEquals("NO BITE IS RIGHT TOUR", homeSection.sidebarModule.nbirTourBtn.text())
        waitFor(3000)
        log.info("Check Tick Prevention button is displayed in Sidebar Navigation")
        Assert.assertEquals("TICK PREVENTION", homeSection.sidebarModule.tickPreventionBtn.text())
        waitFor(3000)
        log.info("Check Flea Prevention button is displayed in Sidebar Navigation")
        Assert.assertEquals("FLEA PREVENTION", homeSection.sidebarModule.fleaPrevention.text())
        waitFor(3000)
        log.info("Check Talk With Your Vet button is displayed in Sidebar Navigation")
        Assert.assertEquals("TALK WITH YOUR VET", homeSection.sidebarModule.talkWithYourVet.text())
        waitFor(3000)
        log.info("Check Twitter button is displayed in Sidebar Navigation")
        Assert.assertEquals("#NOBITEISRIGHT", homeSection.sidebarModule.twitterFeed.text())
        waitFor(3000)
        log.info("Check Contact Us button is displayed in Sidebar Navigation")
        Assert.assertEquals("CONTACT US", homeSection.sidebarModule.contactUs.text())
        waitFor(3000)
        log.info("Check Language Preference button is displayed in Sidebar Navigation")
        Assert.assertEquals("FRANÇAIS", homeSection.sidebarModule.languagePreference.text())

    }

}
