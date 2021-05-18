package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class searchUsingDataTableStepDefination {

//    WebDriver driver;
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
//
//    @Then( "^Enter search query and check number of result$" )
//    public void Enter_search_query_and_check_number_of_result(DataTable cradentials)
//    {
//        //this code only for single search query//
//        //With out data table header//
//        List<String>data1=cradentials.asList(String.class);
//        for(int i=0;i<data1.size();i++) {
//            String query=data1.get(i);
//            driver.findElement( By.xpath( "//input[@id='search']" ) ).sendKeys(query+Keys.ENTER);
//        }
//    }
//
//
//    @Then( "^Close Browser$" )
//    public void close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }
}
