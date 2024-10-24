package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public abstract class BasePage {

  WebDriver driver;

  public BasePage() {
    this.driver = BaseTest.getDriver();
    PageFactory.initElements(driver, this);
  }

}
