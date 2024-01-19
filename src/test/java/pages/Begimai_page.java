package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Begimai_page {

    WebDriver driver;

    public Begimai_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Admin Codewise']")
    public WebElement adminCodewiseDropdown;

    @FindBy(xpath = "//*[text()='Create account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[@name='first_name']")
    public WebElement name;

    @FindBy(xpath = "//*[@name='last_name']")
    public WebElement surename;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;


    @FindBy(xpath = "//*[@name='phone_number']")
    public WebElement phonenumber;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='repeat_password']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@value='ACCOUNTANT']")
    public WebElement accountant;

    @FindBy(xpath = "//*[@value='ADMIN']")
    public WebElement admin;

    @FindBy(xpath = "//*[@value='CASHIER']")
    public WebElement cashier;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement create;

}
