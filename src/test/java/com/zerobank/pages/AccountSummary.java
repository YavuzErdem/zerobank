package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {

    public AccountSummary(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="(//td/a[@style='text-decoration: underline'])[1]")
    public WebElement Savings;

    @FindBy(xpath="(//td/a[@style='text-decoration: underline'])[3]")
    public WebElement Brokerage;

    @FindBy(xpath="(//td/a[@style='text-decoration: underline'])[4]")
    public WebElement Checking;

    @FindBy(xpath="(//td/a[@style='text-decoration: underline'])[5]")
    public WebElement CreditCard;

    @FindBy(xpath="(//td/a[@style='text-decoration: underline'])[6]")
    public WebElement Loan;



}
