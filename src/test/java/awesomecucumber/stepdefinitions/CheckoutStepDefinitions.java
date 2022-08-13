package awesomecucumber.stepdefinitions;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutStepDefinitions {
    private final TestContext context;
    private final CheckoutPage checkoutPage;

    public CheckoutStepDefinitions(TestContext context) {
        this.context = context;

        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }



    @When("I provide billing details")
    public void iProvideBillingDetails() {

        checkoutPage.setBillingDetails(context.billingDetails);
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
        checkoutPage.placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {

        Assert.assertEquals(checkoutPage.getNotice(), "Thank you. Your order has been received.");
    }
}
