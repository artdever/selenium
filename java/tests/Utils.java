package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

  public boolean isElementDisplayed(WebDriver driver, By by, int timeoutSeconds)
      throws InterruptedException {
    List<WebElement> elements = driver.findElements(by);
    for (int i = 0; i < timeoutSeconds && elements.size() == 0; i++) {
      Thread.sleep(1000);
      elements = driver.findElements(by);
    }
    return elements.size() > 0;
  }

}
