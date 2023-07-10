package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.ProductAddedToCart;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest
{

    String actualText,expectedText;
    Electronics electronics = new Electronics();
    ProductAddedToCart cart1 = new ProductAddedToCart();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    {
        electronics.verifyUserShouldNavigateToCellPhonesPageSuccessfully();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException
    {
        //electronics.verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully();
        electronics.clickOnElectronics();
        electronics.clickOnCellPhones();

        expectedText="Cell phones";
        actualText=electronics.verifyCellPhonePageHeader();
        Assert.assertEquals(actualText,expectedText,"Cell Phone Page Header Text Not Matched");

        electronics.clickOnListView();
        Thread.sleep(3000);

        electronics.clickOnProduct();

        expectedText="Nokia Lumia 1020";
        actualText=electronics.verifyProductText();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia Header Text Not Matched");

        expectedText="$349.00";
        actualText=electronics.verifyProductPrise();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia Prise Not Matched");

        Thread.sleep(1000);

        electronics.changeProductQuantity("2");
        electronics.clickOnProductAddToCart();

        expectedText="The product has been added to your shopping cart";
        actualText=electronics.productAddedCartSuccessMSG();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia 2010 Product Has Been Added Message Not Matched");

        electronics.closeSuccessMSG();
        Thread.sleep(1000);

        electronics.clickAndGOTOCART();

        expectedText="Shopping cart";
        actualText=electronics.verifyShoppingCartMSG();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart Header Text Not Matched");

        Thread.sleep(3000);

        expectedText="$698.00";
        actualText= electronics.verifyTotal();
        Assert.assertEquals(actualText,expectedText,"Total Cart Prise Not Matched");

        electronics.iAgreeTerm();
        electronics.clickCheckout();

        expectedText="Welcome, Please Sign In!";
        actualText=electronics.signIN();
        Assert.assertEquals(actualText,expectedText,"Welcome Sign In Message Not Matched");

        electronics.clickOnElectronicRegister();

        expectedText="Register";
        actualText= electronics.verifyRegisterText();
        Assert.assertEquals(actualText,expectedText,"Register Header Text Not Matched");

        electronics.eleRegisterFirstName("Vicky");
        electronics.eleRegisterLastName("Patel");
        electronics.eleRegisterEmail("vicky.shah17@yahoo.com");
        electronics.sendPassword("abc@1234");
        electronics.sendConfirmPassword("abc@1234");
        electronics.clickElectronicRegisterComplete();

        expectedText="Your registration completed";
        actualText=electronics.verifyYourRegistrationComplete();
        Assert.assertEquals(actualText,expectedText,"Registration Complete Message Not Matched");

        electronics.clickFinishRegistration();

        electronics.clickOnLoginLnk();
        electronics.sendEmailText("vicky.shah17@yahoo.com");
        electronics.sendPassword("abc@1234");
        electronics.clickLoginButton();

        String expectedShopping = "Shopping cart";
        String actualShopping = electronics.verifyElectroningShoppingCart();
        Assert.assertEquals(actualShopping, expectedShopping,"Shopping Cart Message Not Matched");

        electronics.cartTermsCondition();
        electronics.checkOut();

        electronics.firstName("Vicky");
        electronics.lastName("Patel");
        //electronics.eleEmail("vicky.shah15@yahoo.com");
        electronics.eleCountry("United States");
        //cart1.eleState("Alaska");
        cart1.selectState("Alaska");
        electronics.eleCity("New york");
        electronics.eleAdd("Mayfair Road");
        electronics.eleZip("388450");
        electronics.elePhone("1234567890");

        cart1.clickOnContinueRegister();
        cart1.clickOnRadioNextDay();
        cart1.clickOnNextDayButton();
        Thread.sleep(3000);

        cart1.selectCreditCardOption();
        cart1.selectCardTypeOption();
        cart1.cardHolderName("Vicky Shah");
        cart1.cardNumber("5354568052254288");
        cart1.selectExpiryMonth("07");
        cart1.selectExpiryYear("2026");
        cart1.enterCVV("109");
        cart1.cardOptionContinueButton();

        expectedText="Payment Method: Credit Card";
        actualText=cart1.verifyPaymentMethod();
        Assert.assertEquals(actualText,expectedText,"Payment Method Display Message Not Matched");

        expectedText="Shipping Method: Next Day Air";
        actualText=cart1.verifyShippingMethod();
        Assert.assertEquals(actualText,expectedText,"Shipping Method Not Matched");

        expectedText="$698.00";
        actualText=cart1.verifyTotalCart();
        Assert.assertEquals(actualText,expectedText,"Total Cart After Card Details Not Matched");

        cart1.clickOnConfirm();

        expectedText="Thank you";
        actualText=cart1.verifyThankYOu();
        Assert.assertEquals(actualText,expectedText,"Thank You Text Message Not Matched");

        expectedText="Your order has been successfully processed!";
        actualText= cart1.orderSuccessfullyProcessed();
        Assert.assertEquals(actualText,expectedText,"Order Confirm Message Not Matched");

        cart1.finishProcess();


    }

}
