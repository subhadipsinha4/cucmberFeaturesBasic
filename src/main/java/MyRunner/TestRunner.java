package MyRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\unbxd\\IdeaProjects\\BDDwithCucumber\\src\\main\\resources\\Features\\hoockes.feature",
        glue={"stepDefinations"},
        plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" },
        //strict = true,
        //monochrome = true,
        dryRun=false

        )

public class TestRunner {

}
