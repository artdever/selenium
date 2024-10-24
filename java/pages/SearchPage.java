package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

  //  private By searchFieldBy = By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@class='gNO89b']");
  @FindBy(css = "textarea#APjFqb.gLFyf")
  private WebElement searchFieldBy;

  public SearchPage() {
    super();
  }

  public void fillTheSearchField(String keyword) {
//    WebElement searchField = driver.findElement(searchFieldBy);
//    searchField.sendKeys(keyword);
    searchFieldBy.click();
    searchFieldBy.sendKeys(keyword);
  }

  public void presEnter() {
//    WebElement searchField = driver.findElement(searchFieldBy);
//    searchField.sendKeys(Keys.RETURN);
    searchFieldBy.sendKeys(Keys.RETURN);
  }
}
