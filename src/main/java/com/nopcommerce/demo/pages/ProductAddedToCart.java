package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductAddedToCart extends Utility
{
    String expectedText,actualText;
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By sortAToZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By buildYourComp = By.xpath("//strong[contains(text(),'Build your own computer')]");
    By buildYourComputerText=By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.id("product_attribute_1");
    By ram= By.id("product_attribute_2");
    By hdd=By.xpath("//label[@for='product_attribute_3_7']");
    By os = By.xpath("//label[@for='product_attribute_4_9']");
    By softwareOption1= By.xpath("//input[@id='product_attribute_5_10']");
    By softwareOption2=By.xpath("//input[@id='product_attribute_5_12']");
    By price=By.xpath("//span[@id='price-value-1']");
    By addCartButton=By.xpath("//button[@id='add-to-cart-button-1']");
    By addCartMessage=By.xpath("//p[@class='content']");
    By msgCloseButton=By.xpath("//span[@title='Close']");
    By shoppingCartTop=By.xpath("//span[@class='cart-label']");
    By shoppingCartButton = By.xpath("//button[@class='button-1 cart-button']");
    By shoppingCartHeader=By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantity = By.xpath("//input[@class='qty-input']");
    By updateCartButton=By.xpath("//button[@id='updatecart']");
    By totalCartPrise = By.xpath("//span[@class='product-subtotal']");
    By agreeTerms = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");
    By checkoutWelcomemsg=By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By asGuestButton=By.xpath("//button[normalize-space()='Checkout as Guest']");
    By firstName=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName=By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email=By.xpath("//input[@id='BillingNewAddress_Email']");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phone=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By state=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
   //common Methods
    By continueButton=By.xpath("//button[@onclick='Billing.save()']");
    By shippingNextDay=By.xpath("//input[@id='shippingoption_1']");
    By shippingContinueButton=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard=By.xpath("//input[@id='paymentmethod_1']");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth=By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cvvCode= By.xpath("//input[@id='CardCode']");
    By cardContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By paymentMethod=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    By shippingMethod= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By totalCartMain=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    By finalContinue = By.xpath("//button[normalize-space()='Confirm']");
    By paymentMethodContinueButton= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By thanksText= By.xpath("//h1[contains(text(),'Thank you')]");
    By orderConfirmMessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By lastContinueButton=By.xpath("//button[contains(text(),'Continue')]");

    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void clickOnComputerMenu()
    {
        mouseHoverToElement(computer);
    }
    public void clickOnDesktop()
    {
        mouseHoverToElement(desktop);
        mouseHoverToElementAndClick(desktop);
    }

    public void selectByPositionAToZ()
    {
        clickOnElement(sortAToZ);
    }

    public void clickOnAddToCart()
    {
        driver.navigate().to("https://demo.nopcommerce.com/build-your-own-computer");
    }

    public String getTextBuildYourComputer()
    {
        return getTextFromElement(buildYourComputerText);
    }
    public void selectProcessor()
    {
        WebElement processorDropdown = driver.findElement(processor);
        Select select = new Select(processorDropdown);
        select.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRam()
    {
        WebElement ramDropdown = driver.findElement(ram);
        Select select1 = new Select(ramDropdown);
        select1.selectByVisibleText("8GB [+$60.00]");
    }
    public void selectHDD()
    {
        clickOnElement(hdd);
    }
    public void selectOS()
    {
        clickOnElement(os);
    }
    public void selectOfficeAndCommander()
    {
        clickOnElement(softwareOption1);
        clickOnElement(softwareOption1);
        clickOnElement(softwareOption2);
    }
    public String getPrise()
    {
        return getTextFromElement(price);
    }
    public void clickOnAddToCart1()
    {
        clickOnElement(addCartButton);
    }

    public String verifyAddToCartMessage()
    {
        return getTextFromElement(addCartMessage);
    }

    public void clickOnCrossButton()
    {
        clickOnElement(msgCloseButton);
    }
    public void mouseHoverOnShoppingCartAndClickGOTOCART()
    {
        WebElement shopingCart= driver.findElement(shoppingCartTop);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(shopingCart).build().perform();
        actions2.moveToElement(shopingCart).click().build().perform();
        clickOnElement(shoppingCartButton);
    }

    public String verifyShoppingCartText()
    {
        return getTextFromElement(shoppingCartHeader);
    }
    public void updateQuantity()
    {
        driver.findElement(quantity).clear();
        sendTextToElement(quantity,"2");
        clickOnElement(updateCartButton);
    }
    public String verifyTotal()
    {
        return getTextFromElement(totalCartPrise);
    }
    public void clickOnAgreeTermsandConditions()
    {
        clickOnElement(agreeTerms);
    }
    public void clickOnCHECKOUT()
    {
        clickOnElement(checkout);
    }
    public String verifyWelcomeSIGNINText()
    {
        return getTextFromElement(checkoutWelcomemsg);
    }
    public void clickOnCHECKOUTAsGuest()
    {
        clickOnElement(asGuestButton);
    }
    public void enterFirstName(String fName)
    {
        sendTextToElement(firstName,fName);
    }
    public void enterLastName(String lName)
    {
        sendTextToElement(lastName,lName);
    }
    public void enterEmail(String email1)
    {
        sendTextToElement(email,email1);
    }
    public void enterCountry(String country1)
    {
        sendTextToElement(country,country1);
    }
    public void selectState(String stateName)
    {
        WebElement stateDropDown= driver.findElement(state);
        Select select4 = new Select(stateDropDown);
        select4.selectByVisibleText(stateName);
    }
    public void enterCity(String eCity)
    {
        sendTextToElement(city,eCity);
    }
    public void enterAddress(String add)
    {
        sendTextToElement(address,add);
    }
    public void zipcode(String zip)
    {
        sendTextToElement(zipcode,zip);
    }
    public void enterPhone(String phoneNum)
    {
        sendTextToElement(phone,phoneNum);
    }
    public void clickOnContinueRegister()
    {
        clickOnElement(continueButton);
    }

    public void clickOnRadioNextDay()
    {
        clickOnElement(shippingNextDay);
    }

    public void clickOnNextDayButton()
    {
        clickOnElement(shippingContinueButton);
    }
    public void selectCreditCardOption()
    {
        clickOnElement(creditCard);
        clickOnElement(paymentMethodContinueButton);
    }
    public void selectCardTypeOption()
    {
        WebElement crediCardDropdown= driver.findElement(creditCardType);
        Select select3 = new Select(crediCardDropdown);
        select3.selectByVisibleText("Master card");
    }
    public void cardHolderName(String cName)
    {
        sendTextToElement(cardHolderName,cName);
    }
    public void cardNumber(String cNum)
    {
        sendTextToElement(cardNumber,cNum);
    }

    public void selectExpiryMonth(String expMonth)
    {
        WebElement monthDropdown = driver.findElement(expiryMonth);
        Select monthExp = new Select(monthDropdown);
        monthExp.selectByVisibleText(expMonth);
    }
    public void selectExpiryYear(String expYear)
    {
        WebElement yearDropdown = driver.findElement(expiryYear);
        Select yearExp = new Select(yearDropdown);
        yearExp.selectByVisibleText(expYear);

    }
    public void enterCVV(String cvv)
    {
        sendTextToElement(cvvCode,cvv);
    }
    public void cardOptionContinueButton()
    {
        clickOnElement(cardContinueButton);
    }

    public String verifyPaymentMethod()
    {
        return getTextFromElement(paymentMethod);
    }
    public String verifyShippingMethod()
    {
        return getTextFromElement(shippingMethod);
    }
    public String verifyTotalCart()
    {
        return getTextFromElement(totalCartMain);
    }
    public void clickOnConfirm()
    {
        clickOnElement(finalContinue);
    }

    public String verifyThankYOu()
    {
        return getTextFromElement(thanksText);
    }
    public String orderSuccessfullyProcessed()
    {
        return getTextFromElement(orderConfirmMessage);
    }
    public void finishProcess()
    {
        clickOnElement(lastContinueButton);
    }
    public String verifyWelComeText()
    {
        return getTextFromElement(welcomeText);
    }

}
