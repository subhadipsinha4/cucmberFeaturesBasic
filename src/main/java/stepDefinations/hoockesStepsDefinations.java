package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hoockesStepsDefinations implements dataVariable {
    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty(CHROME_KEY,CHROME_VALUE);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Given( "^Display the homepage$" )
    public void displaytheHomepage()
    {
        String pageTitle=driver.getCurrentUrl();
        Assert.assertEquals(pageTitle, url);
    }
    @When("check the page title")
    public void check_the_page_title() {
        String pageTitle=driver.findElement( By.xpath(homePageTitle) ).getAttribute( "title" );
        Assert.assertEquals( pageTitle,"Miniature Market");
    }

    @When("check the search box")
    public void check_the_search_box() {
        boolean result=driver.findElement( By.xpath( searchBox ) ).isDisplayed();
        Assert.assertTrue( result);
    }


    @After
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
