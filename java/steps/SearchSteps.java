package steps;

import pages.SearchPage;

public class SearchSteps {

  private SearchPage searchPage = new SearchPage();

  public SearchResultSteps searchByKeyword(String keyword) {
    searchPage.fillTheSearchField(keyword);
    searchPage.presEnter();
    return new SearchResultSteps();
  }

}
