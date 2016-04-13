package common
import geb.Browser
import org.junit.After
import org.junit.Before
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.safari.SafariDriver
import page.HomeSection

/**
 * Created by C07HJAXNDJD0 on 4/11/16.
 */
class BaseSetUp {
    def firefoxBrowser = new Browser(driver: new FirefoxDriver())
    protected final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    protected def HomeSection homeSection = new HomeSection()

    @Before
    void openURL() {
        firefoxBrowser.clearCookies()
        firefoxBrowser.go("https://www.nobiteisright.com/")
        firefoxBrowser.driver.manage().window().maximize()
        homeSection = firefoxBrowser.page(HomeSection)
    }

    @After
    void closeBrowser(){
        waitFor(5)
        firefoxBrowser.close()
    }

    public void waitFor(long timeout){
        long multipliedTimedOut = timeout*1000;
        try {
            Thread.sleep(multipliedTimedOut);
        } catch (InterruptedException e) {
            log.error("Time out limit exceeded.");
            e.printStackTrace();
        }
    }

}
