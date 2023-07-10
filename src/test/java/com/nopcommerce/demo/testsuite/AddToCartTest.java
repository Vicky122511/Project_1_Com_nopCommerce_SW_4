package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ProductAddedToCart;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest
{
    String actualText,expectedText;
    ProductAddedToCart cart = new ProductAddedToCart();

    @Test
    public void TestAddToCart() throws InterruptedException
    {
        //cart.verifyProductShouldAddedToCartSuccessfully();
        cart.clickOnComputerMenu();
        cart.clickOnDesktop();
        cart.selectByPositionAToZ();
        cart.clickOnAddToCart();

        //2.5 Verify the Text "Build your own computer"
        expectedText="Build your own computer";
        actualText=cart.getTextBuildYourComputer();
        Assert.assertEquals(actualText,expectedText,"Build Your Computer Text Not Matched");

        cart.selectProcessor();
        cart.selectRam();
        cart.selectHDD();
        cart.selectOS();
        cart.selectOfficeAndCommander();

        Thread.sleep(3000);
        //2.11 Verify the price "$1,475.00"
        expectedText="$1,475.00";
        actualText= cart.getPrise();
        Assert.assertEquals(actualText,expectedText,"Prise Not Matched");

        cart.clickOnAddToCart1();

        expectedText="The product has been added to your shopping cart";
        actualText=cart.verifyAddToCartMessage();
        Assert.assertEquals(actualText,expectedText,"Add Shopping Cart Message Not Matched");

        cart.clickOnCrossButton();
        cart.mouseHoverOnShoppingCartAndClickGOTOCART();

        //2.15 Verify the message "Shopping cart"
        expectedText="Shopping cart";
        actualText=cart.verifyShoppingCartText();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart Header Message Not Matched");

        Thread.sleep(3000);
        cart.updateQuantity();

        //2.17 Verify the Total"$2,950.00"
        expectedText="$2,950.00";
        actualText=cart.verifyTotal();
        Assert.assertEquals(actualText,expectedText,"Total Cart Prise Not Matched");

        cart.clickOnAgreeTermsandConditions();
        cart.clickOnCHECKOUT();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        expectedText="Welcome, Please Sign In!";
        actualText=cart.verifyWelcomeSIGNINText();
        Assert.assertEquals(actualText,expectedText,"Checkout Welcome Message Not Matched");

        cart.clickOnCHECKOUTAsGuest();
        cart.enterFirstName("Vicky");
        cart.enterLastName("Patel");
        cart.enterEmail("vicky.shah7928@yahoo.com");
        cart.enterCountry("Unnited States");
        cart.selectState("Alaska");
        cart.enterCity("New York");
        cart.enterAddress("123 Street, xyaz slop");
        cart.zipcode("388330");
        cart.enterPhone("1234567890");

        cart.clickOnContinueRegister();
        cart.clickOnRadioNextDay();
        cart.clickOnNextDayButton();
        Thread.sleep(3000);

        cart.selectCreditCardOption();
        cart.selectCardTypeOption();
        cart.cardHolderName("Vicky Shah");
        cart.cardNumber("5354568052254288");
        cart.selectExpiryMonth("07");
        cart.selectExpiryYear("2026");
        cart.enterCVV("109");
        cart.cardOptionContinueButton();

        expectedText="Payment Method: Credit Card";
        actualText=cart.verifyPaymentMethod();
        Assert.assertEquals(actualText,expectedText,"Payment Method Display Message Not Matched");

        expectedText="Shipping Method: Next Day Air";
        actualText=cart.verifyShippingMethod();
        Assert.assertEquals(actualText,expectedText,"Shipping Method Not Matched");

        expectedText="$2,950.00";
        actualText=cart.verifyTotalCart();
        Assert.assertEquals(actualText,expectedText,"Total Cart After Card Details Not Matched");

        cart.clickOnConfirm();

        expectedText="Thank you";
        actualText=cart.verifyThankYOu();
        Assert.assertEquals(actualText,expectedText,"Thank You Text Message Not Matched");

        expectedText="Your order has been successfully processed!";
        actualText= cart.orderSuccessfullyProcessed();
        Assert.assertEquals(actualText,expectedText,"Order Confirm Message Not Matched");

        cart.finishProcess();

        expectedText="Welcome to our store";
        actualText=cart.verifyWelComeText();
        Assert.assertEquals(actualText,expectedText,"Welcome Message Not Matched");

    }
}
