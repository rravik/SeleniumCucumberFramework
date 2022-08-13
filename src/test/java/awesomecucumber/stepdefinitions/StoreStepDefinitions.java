package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinitions {


    private final StorePage storePage;
    public StoreStepDefinitions(TestContext context) {


        storePage = PageFactoryManager.getStorePage(context.driver);

    }

    @Given("I'm on the store page")
    public void i_m_on_the_store_page() {
        //driver = DriverFactory.getDriver();
        storePage.load(EndPoint.STORE.url);
    }

 @When("I add a {product} to the cart")
    public void i_add_a_to_the_cart(Product product) {


     storePage.addToCart(product.getName());
}


    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() throws InterruptedException {

        storePage.addToCart("Blue Shoes");

    }
}
