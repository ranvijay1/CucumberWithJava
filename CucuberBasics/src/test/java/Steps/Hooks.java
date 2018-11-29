package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class Hooks  extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void intializeTest() {

        base.driver = this.initializeDriver("firefox");
        base.driver.manage().window().maximize();
        base.driver.manage().deleteAllCookies();
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {

       base.driver.quit();
    }

    public WebDriver initializeDriver(String typeOfInstance) {
        if(typeOfInstance.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranvijay_singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
            base.driver = new ChromeDriver();
        } else if(typeOfInstance.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ranvijay_singh\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
            base.driver = new FirefoxDriver();
        } else if(typeOfInstance.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\ranvijay_singh\\Downloads\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
            base.driver = new InternetExplorerDriver();
        }
        return base.driver;
    }

}
