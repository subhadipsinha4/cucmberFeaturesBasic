package stepDefinations;

public interface dataVariable {

    String url="https://www.miniaturemarket.com/";
    String CHROME_KEY="webdriver.chrome.driver";
    String CHROME_VALUE="C:\\Users\\unbxd\\IdeaProjects\\BDDwithCucumber\\Driver\\chromedriver.exe";
    String homePageTitle="//a[@title='Miniature Market']";
    String searchBox="//input[@id='search']";
    String clickSearchIcon="//button[@title='Search']//i[@class='fa fa-search']";
    String producClick="//div[@unbxdparam_sku='WOCC84460-BOX']";
    String productTitleVerification="//li[@class='product current']//span";
}
