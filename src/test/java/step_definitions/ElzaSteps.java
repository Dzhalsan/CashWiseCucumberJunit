package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ElzaNewAdmin;
import pages.SalesPage;
import utilities.Driver;
import utilities.UtilWait;

import java.sql.Time;
import java.time.Duration;

public class ElzaSteps {

    WebDriver driver = Driver.getDriver();
    ElzaNewAdmin elzaNewAdmin = new ElzaNewAdmin(driver);

    @Given("user go on {string}")
    public void user_go_on(String page) {
        driver.get(page);
    }

    @When("user clicks on SignIn button")
    public void user_clicks_on_sign_in_button() {
        elzaNewAdmin.signInBtn.click();
    }

    @Then("user clicks on email line and delete previous users credential")
    public void user_clicks_on_email_line_and_delete_previous_users_credential() {
        elzaNewAdmin.logInEmail.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();

    }
    @Then("user add correct {string}")
    public void user_add_correct(String email) {
        elzaNewAdmin.logInEmail.sendKeys(email);
    }

    @Then("user clicks on password line and delete previous users credential")
    public void user_clicks_on_password_line_and_delete_previous_users_credential() {
        elzaNewAdmin.logInPassword.click();
        Actions actions = new Actions(driver);
       actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
    }
    @Then("user insert correct {string}")
    public void user_insert_correct(String password) {
        elzaNewAdmin.logInPassword.sendKeys(password);
    }

    @Then("user clicks on SignIn2 button")
    public void user_clicks_on_sign_in2_button() {
        elzaNewAdmin.confirmSignInBtn.click();
    }




    @When("user clicks on account button")
    public void user_clicks_on_account_button() {
        elzaNewAdmin.adminCodewiseBtn.click();
    }
    @Then("user clicks on Create account button")
    public void user_clicks_on_create_account_button() {
        elzaNewAdmin.createAccount.click();
    }
    @Then("user add {string}")
    public void user_add(String name) {
        elzaNewAdmin.name.sendKeys(name);
    }
    @Then("user write {string}")
    public void user_write(String surname) {
        elzaNewAdmin.lastName.sendKeys(surname);
    }
    @Then("user add {string} with inccorect credential")
    public void user_add_with_inccorect_credential(String emails) {
        elzaNewAdmin.email.sendKeys(emails);
    }
    @Then("user add phoneNum {string}")
    public void user_add_phone_num(String num) {
       elzaNewAdmin.phoneNum.sendKeys(num);
    }
    @Then("user add pass {string}")
    public void user_add_pass(String pass) {
        elzaNewAdmin.password.sendKeys(pass);
    }

    @Then("user confirm {string}")
    public void user_confirm(String password) {
        elzaNewAdmin.repeatPassword.sendKeys(password);

    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        elzaNewAdmin.createBtn.click();
    }
    @Then("user should not be able to create account, must see {string}")
    public void user_should_not_be_able_to_create_account_must_see(String notification) {
        Assert.assertEquals(notification, elzaNewAdmin.note.getText());
        System.out.println("note confirm");
    }

    @Then("user add {string} with correct credentials")
    public void user_add_with_correct_credentials(String email) {
        elzaNewAdmin.email.click();
        Actions actions = new Actions(driver);
       actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
        elzaNewAdmin.email.sendKeys(email);
    }

    @Then("user add {int} digits {string}")
    public void user_add_digits(Integer int1, String password) {
        elzaNewAdmin.password.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
        elzaNewAdmin.password.sendKeys(password);
    }
    @Then("user confirm {int} digits {string}")
    public void user_confirm_digits(Integer int1, String pass) {
        elzaNewAdmin.repeatPassword.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
        elzaNewAdmin.repeatPassword.sendKeys(pass);
    }
    @Then("user should not be able to create account, must see note {string}")
    public void user_should_not_be_able_to_create_account_must_see_note(String note2) {
        Assert.assertEquals(note2, elzaNewAdmin.note2.getText());
    }

    @Then("user choose accountant from a check box")
    public void user_choose_accountant_from_a_check_box() {
        elzaNewAdmin.accountant.click();
    }

    @Then("user should be able to create accountant profile and see the notification {string}")
    public void user_should_be_able_to_create_accountant_profile(String note3) {

        Assert.assertEquals(note3, elzaNewAdmin.notification.getText());

    }

    @Then("user again add pass {string}")
    public void user_again_add_pass(String pass4) {
        elzaNewAdmin.password.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
        elzaNewAdmin.password.sendKeys(pass4);
    }
    @Then("user again confirm {string}")
    public void user_again_confirm(String confPass) {
        elzaNewAdmin.repeatPassword.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.DELETE).keyUp("a").keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
        elzaNewAdmin.repeatPassword.sendKeys(confPass);
    }

    @Given("user choose admin from a check box")
    public void user_choose_admin_from_a_check_box() {
     elzaNewAdmin.cashier.click();
    }

    @And("user should be able to create cashier profile and see the notification {string}")
    public void user_should_be_able_to_create_cashier_profile(String noteLast) {
        Assert.assertEquals(noteLast, elzaNewAdmin.notification.getText());

    }

}

