package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by Acer on 13.12.2016.
 */
public class InsertPage {
    @FindBy(id = "ff14642ac1c__us_login")
    public WebElement loginInput;
    @FindBy (id = "ff14642ac1c__us_email")
    public WebElement emailInput;
    @FindBy (id = "ff14642ac1c__us_password")
    public WebElement passInput;
    @FindBy (id = "ff14642ac1c__confirm_password")
    public WebElement confPassInput;
    @FindBy (id = "ff14642ac1c__us_fname")
    public WebElement FNameInput;
    @FindBy (id = "ff14642ac1c__us_lname")
    public WebElement LNameInput;
    @FindBy (id = "ff14642ac1c__us_city")
    public WebElement cityInput;
    @FindBy (id = "ff14642ac1c__us_phone")
    public WebElement phoneInput;
    @FindBy (name = "button_save")
    private WebElement saveButton;
    @FindBy(xpath = "//*[contains(@class, 'errors_container')]")
    private WebElement errorMsgElement;


    private WebDriver driver;

    private static final String URL_INS = "http://80.92.229.236:81/players/insert";

    public InsertPage(WebDriver driver) {

        this.driver = driver;
        initElements(driver, this);
    }

    public void open() {
        driver.get(URL_INS);
    }


    public void fillUsername(String username) {
        loginInput.sendKeys(username);
    }

    public void fillEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void fillPassword(String pass) {
        passInput.sendKeys(pass);
    }

    public void fillConfPassword(String confPass) {
        confPassInput.sendKeys(confPass);
    }

    public void fillFirstName(String fname) {
        FNameInput.sendKeys(fname);
    }

    public void fillLastName(String lname) {
        LNameInput.sendKeys(lname);
    }


    public void fillCity(String city) {
        cityInput.sendKeys(city);
    }

    public void fillPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void clickOnSave() {
        saveButton.click();
    }

    public String getErrorMessage() {
        String errorMsg = errorMsgElement.getText();
        return errorMsg;
    }



}
