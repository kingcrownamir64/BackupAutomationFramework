import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends CommonAPI {


    @FindBy(id = "ap_customer_name")
    private WebElement YourNameBox;

    @FindBy(id = "ap_email")
    private WebElement EmailBox;

    @FindBy(id = "ap_password")
    private WebElement PasswordBox;

    @FindBy(id = "ap_password_check")
    private WebElement RetypePasswordBox;

    @FindBy(id = "continue")
    private WebElement CreateYourAccountButton;

    @FindBy(css = ".a-alert-content")
    private WebElement PasswordMustMatchAlert;


    public void EnterYourName(String text) throws InterruptedException {
        this.YourNameBox.sendKeys(text);
        Thread.sleep(2000);
    }

    public void EnterEmail(String text) throws InterruptedException {
        this.EmailBox.sendKeys(text);
        Thread.sleep(2000);
    }

    public void EnterPassword(String text) throws InterruptedException {
        this.PasswordBox.sendKeys(text);
        Thread.sleep(2000);
    }

    public void ReEnterPassword(String text) throws InterruptedException {
        this.RetypePasswordBox.sendKeys(text);
        Thread.sleep(2000);
    }

    public void CreateAccountButton() { this.CreateYourAccountButton.click();
    }
}