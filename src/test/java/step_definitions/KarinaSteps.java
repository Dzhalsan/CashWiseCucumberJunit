package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.KarinaPage;

public class KarinaSteps {

    WebDriver driver = new ChromeDriver();
    KarinaPage karinaPage = new KarinaPage(driver);

    @Given("User logs in Cashwise account")
    public void user_logs_in_cashwise_account() throws InterruptedException {

        driver.get(" https://www.cashwise.us/main");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("admin555@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Codewiser123");
        driver.findElement(By.xpath("(//button[text()='Sign in'])[2]")).click();
        Thread.sleep(7000);
        karinaPage.salesButton.click();
        Thread.sleep(3000);
        karinaPage.invoiceButton.click();
    }
    @Given("user clicks on Accept payment button")
    public void user_clicks_on_accept_payment_button() throws InterruptedException {
        Thread.sleep(3000);
        KarinaPage.acceptPayment.click();
    }
    @Then("user click on Payment method drop-down box")
    public void user_click_on_payment_method_drop_down_box() {
        KarinaPage.selectPaymentMethod.click();
    }
    @Then("user clicks on bank method")
    public void user_clicks_on_bank_method() {
        KarinaPage.bank.click();
    }
    @Then("user clicks to which check")
    public void user_clicks_to() {
        KarinaPage.toWhichCheck.click();
    }
    @Then("user have to create new check")
    public void user_have_to_create_new_check() {
        KarinaPage.CreateNewCheck.click();
    }
    @Then("user enters  details into all the valid fields")
    public void user_enters_details_into_all_the_valid_fields() throws InterruptedException {
        Faker faker = new Faker();
        KarinaPage.title.sendKeys(faker.name().title());
        KarinaPage.balance.sendKeys("1000");
        Thread.sleep(3000);
    }
    @Then("user clicks to save button")
    public void user_clicks_to_button() {
        KarinaPage.SaveNewCheck.click();
    }
    @Then("user clicks to created check")
    public void user_clicks_to_crested_check() {
        KarinaPage.paid.click();


    }
    @Then("user write comment")
    public void user_write_comment() {
        KarinaPage.comment.sendKeys("Payment");


    }
    @Then("click to save button")
    public void click_to_button() {
        KarinaPage.saveButton2.click();

        driver.quit();
    }

}