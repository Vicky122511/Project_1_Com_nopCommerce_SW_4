package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Electronics extends Utility
{
    String expectedText,actualText;
    By electronicsMenu=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellphoneHeaderText=By.xpath("//h1[normalize-space()='Cell phones']");

    By listViewOption = By.xpath("//a[@title='List']");
    By nokiaLumiaProduct=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");
    By nokiaLumiaHeaderText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By nokiaLumiaPrise=By.xpath("//span[@id='price-value-20']");
    By nokiaLumiaQty= By.xpath("//input[@id='product_enteredQuantity_20']");
    By nokiaLumiaCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By message = By.xpath("//p[@class='content']");
    By xCloseButton = By.xpath("//span[@title='Close']");
    By shoppingCart=By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By verifyMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verifyQty=By.id("product_enteredQuantity_20");
    By totalCartPrise = By.xpath("//span[@class='product-subtotal']");
    By termCondition = By.xpath("//input[@id='termsofservice']");
    By checkoutButton=By.xpath("//button[@id='checkout']");
    By verifyCheckoutHeaderText=By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By register =By.xpath("//button[normalize-space()='Register']");
    By verifyRegisterText=By.xpath("//h1[normalize-space()='Register']");
    By firstName=By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");
    By verifyRegistrationCompleteMSG = By.xpath("//div[@class='result']");
    By continueButton= By.xpath("//a[@class='button-1 register-continue-button']");
    By loginLink = By.xpath("//a[@class='ico-login']");
    By loginText = By.xpath("//input[@id='Email']");
    By passwordText=By.xpath("//input[@id='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Log in']");

    By shoppingCartText=By.xpath("//h1[normalize-space()='Shopping cart']");
    By agreeTerms = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    By fName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lName= By.xpath("//input[@id='BillingNewAddress_LastName']");
    By senderEmail = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By state = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address =By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipcode= By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    {
        /**
         * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
         * 1.1 Mouse Hover on “Electronics” Tab
         * 1.2 Mouse Hover on “Cell phones” and click
         * 1.3 Verify the text “Cell phones”
         */
        mouseHoverToElement(electronicsMenu);
        mouseHoverToElementAndClick(cellPhone);

        expectedText="Cell phones";
        actualText=getTextFromElement(cellphoneHeaderText);
        Assert.assertEquals(actualText,expectedText,"Cell Phone Page Header Text Not Matched");

    }

    public void clickOnElectronics()
    {
        mouseHoverToElement(electronicsMenu);
    }

    public void clickOnCellPhones()
    {
        mouseHoverToElementAndClick(cellPhone);
    }

    public String verifyCellPhonePageHeader()
    {
        return  getTextFromElement(cellphoneHeaderText);
    }

    public void clickOnListView()
    {
        clickOnElement(listViewOption);
    }
    public void clickOnProduct()
    {
        clickOnElement(nokiaLumiaProduct);
    }

    public String verifyProductText()
    {
        return getTextFromElement(nokiaLumiaHeaderText);
    }
    public String verifyProductPrise()
    {
        return getTextFromElement(nokiaLumiaPrise);
    }
    public void changeProductQuantity(String qty)
    {
        driver.findElement(nokiaLumiaQty).clear();
        sendTextToElement(nokiaLumiaQty,qty);
    }
    public void clickOnProductAddToCart()
    {
        clickOnElement(nokiaLumiaCart);
    }
    public String productAddedCartSuccessMSG()
    {
        return getTextFromElement(message);
    }

    public void closeSuccessMSG()
    {
        clickOnElement(xCloseButton);
    }

    public void clickAndGOTOCART()
    {
        mouseHoverToElement(shoppingCart);
        mouseHoverToElementAndClick(goToCart);
    }

    public String verifyShoppingCartMSG()
    {
        return getTextFromElement(verifyMessage);
    }
    public String verifyTotal()
    {
        return getTextFromElement(totalCartPrise);
    }

    public void iAgreeTerm()
    {
        clickOnElement(termCondition);
    }
    public void clickCheckout()
    {
        clickOnElement(checkoutButton);
    }

    public String signIN()
    {
        return getTextFromElement(verifyCheckoutHeaderText);
    }

    public void clickOnElectronicRegister()
    {
        clickOnElement(register);
    }
    public String verifyRegisterText()
    {
        return getTextFromElement(verifyRegisterText);
    }

    public void eleRegisterFirstName(String fName)
    {
        sendTextToElement(firstName,fName);
    }
    public void eleRegisterLastName(String lName)
    {
        sendTextToElement(lastName,lName);
    }
    public void eleRegisterEmail(String eMail)
    {
        sendTextToElement(email,eMail);
    }
    public void sendPassword(String ePassword)
    {
        sendTextToElement(password,ePassword);
    }
    public void sendConfirmPassword(String conPassword)
    {
        sendTextToElement(confirmPassword,conPassword);
    }

    public void clickElectronicRegisterComplete()
    {
        clickOnElement(registerButton);
    }

    public String verifyYourRegistrationComplete()
    {
        return getTextFromElement(verifyRegistrationCompleteMSG);
    }
    public void clickFinishRegistration()
    {

        //2.23 Click on “CONTINUE” tab
        clickOnElement(continueButton);
    }

    public void clickOnLoginLnk()
    {
        clickOnElement(loginLink);
    }

    public void sendEmailText(String emailText)
    {
        sendTextToElement(loginText,emailText);
    }
    public void sendEmailPassword(String password)
    {
        sendTextToElement(passwordText,password);
    }
    public void clickLoginButton()
    {
        clickOnElement(loginButton);
    }

    public String verifyElectroningShoppingCart()
    {
        return getTextFromElement(shoppingCartText);
    }

    public void cartTermsCondition()
    {
        clickOnElement(agreeTerms);
    }

    public void checkOut()
    {
        clickOnElement(checkout);
    }

    public void firstName(String fName1)
    {
        sendTextToElement(fName,fName1);
    }
    public void lastName(String lName1)
    {
        sendTextToElement(lName,lName1);
    }
    public void eleEmail(String email1)
    {
        sendTextToElement(senderEmail,email1);
    }
    public void eleCountry(String country1)
    {
        sendTextToElement(country,country1);
    }
    public void eleState(String state1)
    {
        sendTextToElement(state,state1);
    }
    public void eleCity(String city1)
    {
        sendTextToElement(city,city1);
    }
    public void eleAdd(String add1)
    {
        sendTextToElement(address,add1);
    }
    public void eleZip(String zip1)
    {
        sendTextToElement(zipcode,zip1);
    }
    public void elePhone(String phone1)
    {
        sendTextToElement(phoneNumber,phone1);
    }
}
