package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.SearchSteps;

public abstract class BaseTest {

  private static WebDriver driver;
  SearchSteps steps;

  public static WebDriver getDriver() {
    return driver;
  }

  @BeforeClass
  public void setUp() {

/*    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    File file = new File("src/test/resources/chromedriver-win64/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
    driver = new ChromeDriver(options);*/
    driver = DriverFactory.getDriver(PropertyReader.getBrowser());
    driver.navigate().to(PropertyReader.getBaseUrl());

    steps = new SearchSteps();

    System.out.println(driver.getTitle());
  }

  @AfterSuite
  public void tearDown() {
    driver.quit();
  }

  @AfterTest
  public void goToBegin() {
    driver.navigate().to("https://www.google.com");
  }

  @DataProvider(name = "data")
  public Object[][] dataProviderMethod() {
    return new Object[][]{{"selenium"}, {"bbb"}};
  }


}
