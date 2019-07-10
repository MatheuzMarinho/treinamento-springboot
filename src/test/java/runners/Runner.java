package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/teste.feature",
		glue = "steps",
		plugin = {"pretty"},
		snippets = SnippetType.CAMELCASE
		)
public class Runner {

}
