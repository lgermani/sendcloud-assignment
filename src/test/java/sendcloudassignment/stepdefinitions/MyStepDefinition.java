package sendcloudassignment.stepdefinitions;

import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStepDefinition {

    private static final Logger LOG = LoggerFactory.getLogger(MyStepDefinition.class);

    @Given("I am logging something")
    public void loginSomething(){
        LOG.info("-------- THIS IS A LOG MESSAGE XABLAU --------");
    }
}
