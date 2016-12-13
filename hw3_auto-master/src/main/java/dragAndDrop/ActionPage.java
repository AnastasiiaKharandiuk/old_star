package dragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Acer on 13.12.2016.
 */
public class ActionPage {
    @FindBy(xpath = "//*[@id = 'sortable']/li[1]")
    public WebElement sourceElement1;

    /*@FindBy(xpath = "//*[@id = 'sortable']/li[2]")
    public WebElement sourceElement2;

    @FindBy(xpath = "//*[@id = 'sortable']/li[3]")
    public WebElement sourceElement3;

    @FindBy(xpath = "//*[@id = 'sortable']/li[4]")
    public WebElement sourceElement4;

    @FindBy(xpath = "//*[@id = 'sortable']/li[5]")
    public WebElement sourceElement5;

    @FindBy(xpath = "//*[@id = 'sortable']/li[6]")
    public WebElement sourceElement6;

    @FindBy(xpath = "//*[@id = 'sortable']/li[7]")
    public WebElement sourceElement7;*/

    @FindBy(xpath = "//*[@id='drop']")
    public WebElement targetElement;

    private WebDriver driver;
    private final static String URL = "file:///C:/Users/Acer/Downloads/drag_and_drop2/drag_and_drop2/drag_and_drop2/index.html";

    ActionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {

        driver.get(URL);
    }

    void dragAndDrop() {
        Actions action = new Actions(driver);
        action.dragAndDrop(sourceElement1, targetElement).perform();
    }

    void dismissAlert() {

        driver.switchTo().alert().dismiss();
    }

    void acceptAlert() {

        driver.switchTo().alert().accept();
    }

    void switchToMainPage() {

        driver.switchTo().defaultContent();
    }

    /* void tryToSort(){
        sourceElement1.getText();
        return;
        sourceElement2.getText();
        return;
        sourceElement3.getText();
        return;
        sourceElement4.getText();
        return;;
        sourceElement5.getText();
        return;
        sourceElement6.getText();
        return;
        sourceElement7.getText();
        return;

    }*/
}


