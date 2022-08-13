package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.constants.MyConstants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MyStepDefinitions {

    private WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepDefinitions(TestContext context) {
        //System.out.println("STEP DEF: DI: SCENARIO NAME: "+ context.scenarioName);
        driver = context.driver;
    }











}

