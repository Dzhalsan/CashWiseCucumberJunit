package BegimaiTests;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.Map;

public class Begimai_tests {
    WebDriver driver = new ChromeDriver();
    Begimai_page begimaiPage = new Begimai_page(driver);

    @Given("user logs in Cashwise account")
    public void user_logs_in_cashwise_account() throws InterruptedException {

        driver.get(" https://www.cashwise.us/main");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("admin555@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Codewiser123");
        driver.findElement(By.xpath("(//button[text()='Sign in'])[2]")).click();

    }


    @When("the user clicks on the Admin Codewise drop menu")
    public void the_user_clicks_on_the_admin_codewise_drop_menu() throws InterruptedException {
        Thread.sleep(3000);
        begimaiPage.adminCodewiseDropdown.click();
    }

    @When("the user selects the Create Account option")
    public void the_user_selects_the_create_account_option() throws InterruptedException {
        Thread.sleep(2000);
        begimaiPage.createAccount.click();
    }

    @When("the user enters new account details into all the valid fields")
    public void the_user_enters_new_account_details_into_all_the_valid_fields(DataTable values) throws InterruptedException {

        Map<String, String> accountDetails = values.asMap(String.class, String.class);

        begimaiPage.name.sendKeys(accountDetails.get("Name"));
        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        Thread.sleep(3000);
        begimaiPage.phonenumber.sendKeys(accountDetails.get("Phone Number"));
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));

        System.out.println("Test 1: User creates a new account with valid  credentials");
    }

    @When("the user clicks on the Create button")
    public void the_user_clicks_on_the_create_button() {
        begimaiPage.create.click();

    }

    @When("the user enters an invalid phone number with only zeros {string}")
    public void the_user_enters_an_invalid_phone_number_with_only_zeros(String string) {
        begimaiPage.phonenumber.sendKeys("000000000");
    }

    @When("And the user enters new account details into all the valid fields1")
    public void and_the_user_enters_new_account_details_into_all_the_valid_fields1(DataTable dataTable) throws InterruptedException {
        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);

        begimaiPage.name.sendKeys(accountDetails.get("Name"));
        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        Thread.sleep(3000);
        begimaiPage.phonenumber.sendKeys(accountDetails.get("Phone Number"));
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));
        System.out.println("Test 2: User creates successfully   with invalid email");
    }

    @When("the user enters an invalid email {string}")
    public void the_user_enters_an_invalid_email(String string) {
        begimaiPage.email.sendKeys(string);

    }

    @When("And the user enters new account details into all the valid fields")
    public void and_the_user_enters_new_account_details_into_all_the_valid_fields(DataTable dataTable) throws InterruptedException {
        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);

        begimaiPage.name.sendKeys(accountDetails.get("Name"));
        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        Thread.sleep(3000);
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));
        System.out.println("Test 2: User creates successfully   with invalid numbers 000000000");
    }

    @When("user enter valid fields and invalid confirm password")
    public void user_enter_valid_fields_and_invalid_confirm_password(DataTable dataTable) throws InterruptedException {
        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);

        begimaiPage.name.sendKeys(accountDetails.get("Name"));
        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        Thread.sleep(3000);
        begimaiPage.phonenumber.sendKeys(accountDetails.get("Phone Number"));
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));


    }

    @When("user enter only Mandatory valid fields")
    public void user_enter_only_mandatory_valid_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        Thread.sleep(3000);
        begimaiPage.phonenumber.sendKeys(accountDetails.get("Phone Number"));
        begimaiPage.password.sendKeys(accountDetails.get("Password"));


    }
    @Then("user clicks  on Accountant options on the Role radio button")
    public void user_clicks_on_accountant_options_on_the_role_radio_button() {
       begimaiPage.accountant.click();
    }



}


