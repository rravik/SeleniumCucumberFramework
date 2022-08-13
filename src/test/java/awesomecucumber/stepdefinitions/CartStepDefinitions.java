package awesomecucumber.stepdefinitions;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.testng.Assert;

public class CartStepDefinitions {

    private final CartPage cartPage;

    public CartStepDefinitions(TestContext context) {

        cartPage = PageFactoryManager.getCartPage(context.driver);

    }

    @Then("I should see {int} {product} in the cart")
    public void i_should_see_in_the_cart(int quantity, Product product) {
        Assert.assertEquals(product.getName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());

    }

    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {

        cartPage.checkout();
    }
}
