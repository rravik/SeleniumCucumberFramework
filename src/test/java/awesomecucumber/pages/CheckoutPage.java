package awesomecucumber.pages;

import awesomecucumber.domainobjects.BillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{
    @FindBy(id = "billing_first_name") private WebElement firstNameFld;
    @FindBy(id = "billing_last_name") private WebElement lastNameFld;
    @FindBy(css = "#billing_address_1") private WebElement addressOneFld;
    @FindBy(id = "billing_city") private WebElement cityFld;
    @FindBy(id = "billing_state") private WebElement stateDropDown;
    @FindBy(id = "billing_postcode") private WebElement zipcodeFld;
    @FindBy(id = "billing_email") private WebElement emailAddressFld;
    @FindBy(id = "place_order") private WebElement placeOrderBtn;
    @FindBy(css = ".woocommerce-notice") private WebElement noticeTxt;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterBillingFirstName(String billingFirstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(firstNameFld));
        e.clear();
        e.sendKeys(billingFirstName);
        return this;
    }

    public CheckoutPage enterBillingLastName(String billingLastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(lastNameFld));
        e.clear();
        e.sendKeys(billingLastName);
        return this;
    }

    public CheckoutPage enterBillingAddressLineOne(String billingAddressLineOne) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(addressOneFld));
        e.clear();
        e.sendKeys(billingAddressLineOne);
        return this;
    }

    public CheckoutPage enterBillingCity(String billingCity) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(cityFld));
        e.clear();
        e.sendKeys(billingCity);
        return this;
    }

    public CheckoutPage selectBillingState(String billingStateName) {
        Select select = new Select(wait.until(ExpectedConditions.visibilityOf(stateDropDown)));
        select.selectByVisibleText(billingStateName);
        return this;
    }

    public CheckoutPage enterBillingZip(String billingZip) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(zipcodeFld));
        e.clear();
        e.sendKeys(billingZip);
        return this;
    }

    public CheckoutPage enterBillingEmail(String billingEmail) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(emailAddressFld));
        e.clear();
        e.sendKeys(billingEmail);
        return this;
    }

    public CheckoutPage setBillingDetails(BillingDetails billingDetails) {

       return enterBillingFirstName(billingDetails.getBillingFirstName())
                .enterBillingLastName(billingDetails.getBillingLastName())
                .enterBillingAddressLineOne(billingDetails.getBillingAddressOne())
                .enterBillingCity(billingDetails.getBillingCity())
                .selectBillingState(billingDetails.getBillingStateName())
                .enterBillingZip(billingDetails.getBillingZip())
                .enterBillingEmail(billingDetails.getBillingEmail());

    }

    public CheckoutPage placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
        return this;
    }

    public String getNotice() {
        return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
    }
}
