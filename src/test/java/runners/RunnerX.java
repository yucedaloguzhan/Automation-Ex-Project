package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) // Bu notasyon RunnerX'in Cucumber ile calismasini  sagliyor
@CucumberOptions(
        plugin={"html:target\\cucumber-reports02.html",
                "json:target/json-reports/cucumber02.json",
                "junit:target/xml-report/cucumber02.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "",
        dryRun = false
)
public class RunnerX {
}
