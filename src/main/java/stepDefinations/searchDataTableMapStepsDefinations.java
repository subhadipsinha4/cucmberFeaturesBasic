//package stepDefinations;
//
//import gherkin.lexer.Th;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Map;
//
//public class searchDataTableMapStepsDefinations {
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
//    public void Enter_search_query_and_check_number_of_result(DataTable cradentials) throws InterruptedException {
//        for(Map<Object, Object> data : cradentials.asMaps(String.class,String.class) ){
//            String q= data.get( "query" ).toString();
//            String v=data.get("value").toString();
//            driver.findElement( By.xpath( "//input[@id='search']" ) ).sendKeys(q+ Keys.ENTER);
//            Thread.sleep( 3000 );
//            String searchResult=driver.findElement( By.xpath( "//div[@class='product-count']" ) ).getText().replace( "( ","" ).replace( " )","" );
//             Assert.assertEquals( v,searchResult );
//        }
//
//    }
//
//    @Then( "^Close Browser$" )
//    public void close_Browser()
//    {
//        driver.close();
//        driver.quit();
//    }
//
//}
