package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = "tests",
		dryRun = false,
		monochrome = true,
		tags = "@testesregressivos",
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"})

public class Executa {

}
