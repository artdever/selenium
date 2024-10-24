package tests;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverFactory {

  private static final String DRIVER_PATH = "src/test/resources/";
  private static WebDriver driver;

  public static WebDriver getDriver(Browser browser) {
    File file;
    switch (browser) {
      case CHROME:
        file = new File(DRIVER_PATH + "chromedriver-win64/chromedriver.exe");
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver(optionsChrome);
        break;
      case EDGE:
        file = new File(DRIVER_PATH + "msedge/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        EdgeOptions optionsEdge = new EdgeOptions();
        optionsEdge.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(optionsEdge);
    }
    driver.manage().window().maximize();
    return driver;
  }

}
