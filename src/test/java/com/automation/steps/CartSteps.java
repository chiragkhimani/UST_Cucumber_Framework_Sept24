package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        cartPage.clickOnCheckoutBtn();
    }

}
