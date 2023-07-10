package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerMenuInAlphaBaticalOrder extends Utility
{
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By nameZToA = By.xpath("//option[contains(text(),'Name: Z to A')]");

    public void clickOnComputerMenu()
    {
        mouseHoverToElement(computer);
    }
    public void clickOnDeskTop()
    {
        mouseHoverToElement(desktop);
        mouseHoverToElementAndClick(desktop);
    }
    public void selectSortFromZToA()
    {
        clickOnElement(nameZToA);
    }



}
