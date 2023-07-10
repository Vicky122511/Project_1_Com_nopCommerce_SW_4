package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility
{
    By menu=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public void clickOnTopMenu()
    {
        clickmenu(menu);
    }
}
