package step_definitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class DzhalsanHooks {



    @Before("@Dzhalsan")
    public void setUp(Scenario scenario){
        System.out.println(scenario.getName() + " ---- " + scenario.getStatus());

    }

    @After("@Dzhalsan")
    public void tearDown(){
        Driver.closeBrowser();
    }
}
