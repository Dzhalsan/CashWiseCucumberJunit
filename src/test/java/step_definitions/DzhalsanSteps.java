package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KarinaPage;
import pages.SalesPage;
import step_definitions.hooks.DzhalsanHooks;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

    @Then("I click on Create invoice button")
    public void i_click_on_create_invoice_button() {
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
        Date futureDate = faker.date().future(10, TimeUnit.DAYS);
        String pattern = "MM/dd/yyyy";

        // Create a SimpleDateFormat object and pass the pattern
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        // Format the date to a string using the format() method
        String formattedDate = formatter.format(futureDate);
        salesPage.payUntil.sendKeys(formattedDate);
    }

    @Then("I put description")
    public void i_put_description() {
        String fakeDescription = faker.beer().name();
        salesPage.writeDescription.sendKeys(fakeDescription);
    }

    @When("I select product or service")
    public void i_select_product_or_service() {
        karinaPage.selectProductButton.click();
        karinaPage.pickTitle.click();
    }

    @When("I click on Save Button")
    public void i_click_on_save_button() {
        karinaPage.saveButton.click();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(salesPage.invoiceCreatedSuccess));
        System.out.println(salesPage.invoiceCreatedSuccess.getText());
    }

}
