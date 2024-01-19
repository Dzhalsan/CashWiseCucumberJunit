package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.KarinaPage;
import pages.SalesPage;
import utilities.Driver;

public class DzhalsanSteps {

    WebDriver driver = Driver.getDriver();

    SalesPage salesPage = new SalesPage(driver);
    KarinaPage karinaPage = new KarinaPage(driver);
    Faker faker = new Faker();
    Actions actions = new Actions(driver);

    @Given("I am logged in")
    public void i_am_logged_in() {
        Driver.cashWiseSignIn();
    }

    @Then("I click on Sales button")
    public void i_click_on_sales_button() {
        salesPage.sales.click();
    }

    @Then("I click on Invoice button")
    public void i_click_on_invoice_button() {
        karinaPage.invoiceButton.click();
    }

    @Then("I click on Create invoce button")
    public void i_click_on_create_invoce_button() {
        karinaPage.createInvoiceButton.click();
    }

    @Then("I put Invoice name")
    public void i_put_invoice_name() {
        String name = faker.ancient().god();
        karinaPage.invoiceName.sendKeys(name);
    }

    @Then("I select client in Whom field")
    public void i_select_client_in_whom_field() {
        karinaPage.whomButton.click();
        actions.sendKeys(Keys.ENTER).perform();

    }

    @Then("I put date in Pay until")
    public void i_put_date_in_pay_until() {
        //faker.date().between(01/2/2025,24/12/2025)
      //  karinaPage.payUntil.sendKeys();
    }

    @Then("I put description")
    public void i_put_description() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I select product or service")
    public void i_select_product_or_service() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on Save Button")
    public void i_click_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I shoul see a success message")
    public void i_shoul_see_a_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
