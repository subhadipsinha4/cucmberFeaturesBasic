package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchPageStepsDefinations {
//    WebDriver driver;
//
//    @Given( "^Open Browser$" )
//    public void openBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\unbxd\\IdeaProjects\\BDDwithCucumber\\Driver\\chromedriver.exe");
//        driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.miniaturemarket.com/");
//    }
//    @When( "^Display the homepage$" )
//    public void displaytheHomepage()
//    {
//        String pageTitle=driver.getCurrentUrl();
//        Assert.assertEquals(pageTitle, "https://www.miniaturemarket.com/");
//    }
//    @Then( "^Enter search \"(.*)\"$" )
//    public void Enter_search_query(String query)
//    {
//        driver.findElement( By.xpath( "//input[@id='search']" ) ).sendKeys( query + Keys.ENTER);
//        //searchBox.sendKeys( query + Keys.ENTER );
//    }
//    @Then( "^chcek the search page$" )
//    public void chcek_the_search_page()
//    {
//        String resultMessage=driver.findElement( By.xpath( "//a[@id='unbxd-results-top']" ) ).getText();
//        System.out.println(resultMessage);
//    }
//
//    @And( "^Close Browser$" )
//    public void close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }
}
