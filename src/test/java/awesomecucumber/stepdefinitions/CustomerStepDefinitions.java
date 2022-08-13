package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.MyConstants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerStepDefinitions {

    private TestContext context;
    private final StorePage storePage;



    public CustomerStepDefinitions(TestContext context) {
        this.context = context;

        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;

    }


    @Given("I'm a guest user")
    public void iMAGuestUser() {

        // driver = DriverFactory.getDriver();
        storePage.load(MyConstants.STORE);
    }


}
