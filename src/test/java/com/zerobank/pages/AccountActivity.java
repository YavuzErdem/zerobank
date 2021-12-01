package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivity {

    @FindBy (xpath = "(//td/a[text()='Savings'])[1]")
    public WebElement Saving;
    @FindBy (xpath = "(//td/a[text()='Brokerage'])[1]")
    public WebElement Brokerage;
    @FindBy (xpath = "(//td/a[text()='Checking'])[1]")
    public WebElement Checking;
    @FindBy (xpath = "(//td/a[text()='Credit Card'])[1]")
    public WebElement CreditCard;
    @FindBy (xpath = "(//td/a[text()='Loan'])[1]")
    public WebElement Loan;


    @FindBy (xpath = "//div/select[@id='aa_accountId']")
    public WebElement dropdownElement;




    public WebElement accountTypeSelection(String string){
        WebElement accountType = Saving;

        switch (string){
            case "Saving":
                accountType=Saving;
                break;
            case "Brokerage":
                accountType=Brokerage;
                break;
            case "Checking":
                accountType=Checking;
                break;
            case "Credit Card":
                accountType=CreditCard;
                break;
            case "Loan":
                accountType=Loan;
                break;

        }

        return accountType;
    }
    public String getDefaultAccountDropDown() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select select = new Select(Driver.get().findElement(By.className("input-xlarge")));
        WebElement option = select.getFirstSelectedOption();

        String defaultItem = option.getText();

        return defaultItem;

    }
}


