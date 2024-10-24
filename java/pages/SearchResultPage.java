package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

  //  private By searchResultURLsBy = By.xpath("");
  @FindBy(xpath = "//div[@class=\"yuRUbf\"]/div/span/a")
  private WebElement searchResultURLs;

  public SearchResultPage() {
    super();
  }

  public void assertThatExpectedValueIsOnSearchTop(String expectedValue) {
//    List<WebElement> searchResultURLs = driver.findElements(searchResultURLsBy);

    assertEquals(searchResultURLs.getAttribute("href"), expectedValue,
        expectedValue + " is not the first result!");
  }
}
