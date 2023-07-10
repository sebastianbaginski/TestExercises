import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Exercise1.feature",
        plugin = {"pretty"},
        glue = {"steps"},
        publish = true
)
public class TestRunner {
}
