package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage {

    public DefaultPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//h4/span[@id='account_activity_link']")
    public WebElement CheckingAccountActivity;

    @FindBy(xpath = "//li/a[@href='/bank/redirect.html?url=account-summary.html']")
    public WebElement AccountSummary;


}
