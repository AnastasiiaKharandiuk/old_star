package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.net.URL;

import static Pages.LoginPage.URL;
import static org.openqa.selenium.support.PageFactory.*;

/**
 * Created by Acer on 04.12.2016.
 */
public class EditPage {
    @FindBy(id = "ff14642ac1c__us_email")
    private WebElement emailInput;
    @FindBy (id = "ff14642ac1c__us_fname")
    private WebElement FNameInput;
    @FindBy (id = "ff14642ac1c__us_lname")
    private WebElement LNameInput;
    @FindBy (id = "ff14642ac1c__us_city")
    private WebElement cityInput;
    @FindBy (id = "ff14642ac1c__us_phone")
    private WebElement phoneInput;

    @FindBy (id = "ff14642ac1c__us_email")
    private WebElement newemailInput;
    @FindBy (id = "ff14642ac1c__us_fname")
    private WebElement newFNameInput;
    @FindBy (id = "ff14642ac1c__us_lname")
    private WebElement newLNameInput;
    @FindBy (id = "ff14642ac1c__us_city")
    private WebElement newcityInput;
    @FindBy (id = "ff14642ac1c__us_phone")
    private WebElement newphoneInput;
    @FindBy(name = "button_save")
    private WebElement saveButton;

    private WebDriver driver;

    public EditPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {

        driver.get(URL);
    }

    public final String username =  "jack52325";
    public String email = username + "@gmail.com";

    public void assertFields() {
        Assert.assertEquals(emailInput.getText(), email, "Invalid data");
        Assert.assertEquals(FNameInput.getText(), "Jack", "Invalid data");
        Assert.assertEquals(LNameInput.getText(), "Nicolson", "Invalid data");
        Assert.assertEquals(cityInput.getText(), "Las Vegas", "Invalid data");
        Assert.assertEquals(phoneInput.getText(), "9379992", "Invalid data");
    }


    public void fillNewEmail(String newEmail) {
        newemailInput.clear();
        newemailInput.sendKeys(newEmail);
    }

    public void fillNewFirstName(String newfname) {
        newFNameInput.clear();
        newFNameInput.sendKeys(newfname);
    }

    public void fillNewLastName(String newlname) {
        newLNameInput.clear();
        newLNameInput.sendKeys(newlname);
    }

    public void fillNewCity(String newcity) {
        newcityInput.clear();
        newcityInput.sendKeys(newcity);

    }

    public void fillNewPhone(String newphone) {
        newphoneInput.clear();
        newphoneInput.sendKeys(newphone);
    }

    public void clickOnSave() {
        saveButton.click();
    }
}
