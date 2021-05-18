//package stepDefinations;
//
//import io.cucumber.datatable.DataTable;
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
//import java.util.List;
//import java.util.Map;
//
//public class loginAndSearchStepsDefination {
//    WebDriver driver;
//    @Given( "^Open browser$" )
//    public void openBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\unbxd\\IdeaProjects\\BDDwithCucumber\\Driver\\chromedriver.exe");
//        driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.miniaturemarket.com/");
//    }
//    @When( "^Go to home page click on login$" )
//    public void Go_to_home_page_click_on_login()
//    {
//        String pageTitle=driver.getCurrentUrl();
//        Assert.assertEquals(pageTitle, "https://www.miniaturemarket.com/");
//        driver.findElement( By.xpath( "//a[@title='Account']" ) ).click();
//
//    }
//
//    @Then("Login as username and password")
//    public void login_as_username_and_password(DataTable cradentials) {
//
//        for(Map<Object, Object> data : cradentials.asMaps(String.class,String.class)) {
//            driver.findElement( By.xpath( "//div[@class='row']//input[@name='login[username]']" ) ).sendKeys( (CharSequence) data.get("email") );
//            driver.findElement( By.xpath( "//div[@class='row']//input[@name='login[password]']" ) ).sendKeys( (CharSequence)data.get( "password" ) );
//            driver.findElement( By.xpath( "//div[@class='row']//button[text()='Login']" ) ).click();
//        }
//
//    }
//
//    @Then( "^Enter \"(.*)\" and search box and click on search icon$" )
//    public void enter_query_and_search_box_and_click_on_search_icon(String query) throws InterruptedException {
//            driver.findElement( By.xpath( "//input[@id='search']" ) ).sendKeys( query + Keys.ENTER );
//
//    }
//
//    @Then( "^validate the search \"(.*)\"$" )
//    public void validate_the_search_result(String result)
//    {
//
//        String searchResult = driver.findElement( By.xpath( "//div[@class='product-count']" ) ).getText().replace( "( ", "" ).replace( " )", "" );
//        Assert.assertEquals( searchResult,result );
//        System.out.println( "> " + searchResult+" > "+result );
//    }
//
//    @And( "^Close browser$" )
//    public void close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }
//}
