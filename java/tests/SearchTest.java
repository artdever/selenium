package tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

/*  @Test
  public void checkGoogleAppsButton(){
    WebElement googleAppsButton = driver.findElement(By.xpath("//a[@class='gb_d']"));
    System.out.println("aabb== " + googleAppsButton.getAttribute("href"));
//    assertEquals("https://www.google.am/intl/hy/about/products?tab=wh", gb.getAttribute("href").toString(), "chexav");
    assertThat(googleAppsButton.getAttribute("href").toString()).as("").isEqualToIgnoringCase("https://www.google.am/intl/hy/about/products");
    googleAppsButton.click();
    System.out.println("cccc== " + googleAppsButton.getText());
  }

  @Test
  public void checkGoogleSearchButton(){
    WebElement searchButton = driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@class='gNO89b']"));
//    assertTrue(poisk.isDisplayed(),"anjataca");
    assertThat(searchButton.isDisplayed()).as("Search button disabled: ").isTrue();
    searchButton.click();
  }

  @Test(dataProvider = "data")
  public void openGoogleComIncChromeTest(String testData) {

    WebElement googleSearchTextArea = driver.findElement(By.cssSelector("textarea#APjFqb.gLFyf"));
    googleSearchTextArea.click();
    googleSearchTextArea.sendKeys(testData);
    googleSearchTextArea.sendKeys(Keys.RETURN);*/

  @Test
  public void searchByKeywordSeleniumHaveToFindSeleniumhqOrgInTop() {
    steps.searchByKeyword("Selenium")
        .verifyThatTopValueIsCorrect("https://www.selenium.dev/");
  }

//    googleSearch.sendKeys("Artur");
//    driver.findElement(By)
//    driver.get("https://www.list.am");
//    System.out.println(driver.getTitle());
//
//    driver.navigate().to("https://youtube.com");
//    driver.navigate().refresh();
//    System.out.println(driver.getTitle());

}

//}
