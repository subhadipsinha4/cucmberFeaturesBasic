package stepDefinations;
//import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePageStepDefination {
    //PDPPage pdppage=new PDPPage();
//    public String productTitle="";
//    WebDriver driver;
//    @Given("^Open Browser$")
//    public void openBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\unbxd\\IdeaProjects\\BDDwithCucumber\\Driver\\chromedriver.exe");
//        driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.miniaturemarket.com/");
//    }
//
//    @When( "^Display the homepage$" )
//    public void displaytheHomepage()
//    {
//        String pageTitle=driver.getCurrentUrl();
//        Assert.assertEquals(pageTitle, "https://www.miniaturemarket.com/");
//    }
//
//    @Then( "^check the page title$" )
//    public void checkPageTitle()
//    {
//        String pageTitle=driver.findElement( By.xpath("//a[@title='Miniature Market']") ).getAttribute( "title" );
//        Assert.assertEquals( pageTitle,"Miniature Market");
//    }
//    @Then( "^check on product$" )
//    public void check_on_product()
//    {
//        productTitle=driver.findElement( By.xpath( "//h3[@class='product-name']" ) ).getText();
//        driver.findElement( By.xpath( "//h3[@class='product-name']" ) ).click();
//    }
//    @Then( "^check product title on PDP$" )
//    public void check_product_title_on_PDP(){
//        String productTitlePDP=driver.findElement( By.xpath( "//li[@class='product current']//span" ) ).getText();
//        Assert.assertEquals( productTitlePDP,productTitle );
//    }
//
//    @And( "^Close Browser$" )
//    public void Close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }



}
