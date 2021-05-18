//package stepDefinations;
//
//import gherkin.lexer.Th;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class taggingStepsDefinations implements dataVariable {
//
//    WebDriver driver;
//    @Given( "^Open Browser$" )
//    public void openBrowser()
//    {
//        System.setProperty(CHROME_KEY,CHROME_VALUE);
//        driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(url);
//    }
//    @When( "^Display the homepage$" )
//    public void displaytheHomepage()
//    {
//        String pageTitle=driver.getCurrentUrl();
//        Assert.assertEquals(pageTitle, url);
//    }
//
//    @Then("check the page title")
//    public void check_the_page_title() {
//        String pageTitle=driver.findElement( By.xpath(homePageTitle) ).getAttribute( "title" );
//        Assert.assertEquals( pageTitle,"Miniature Market");
//    }
//
//    @When("check the search box")
//    public void check_the_search_box() {
//        boolean result=driver.findElement( By.xpath( searchBox ) ).isDisplayed();
//        Assert.assertTrue( result);
//    }
//
//    @When("Enter query in Search box")
//    public void enter_query_in_search_box() {
//        driver.findElement( By.xpath( searchBox ) ).sendKeys( "card"  );
//    }
//    @Then("Click on search icon")
//    public void click_on_search_icon() {
//        driver.findElement( By.xpath( clickSearchIcon ) ).click();
//    }
//    @Then("Click any product")
//    public void click_any_product() throws InterruptedException {
//        Thread.sleep( 3000 );
//        driver.findElement( By.xpath( producClick ) ).click();
//    }
//    @Then("varify the PDP")
//    public void varify_the_pdp() {
//        boolean result=driver.findElement( By.xpath( productTitleVerification ) ).isDisplayed();
//        Assert.assertTrue( result );
//    }
//    @And( "^Close Browser$" )
//    public void close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }
//
//}
