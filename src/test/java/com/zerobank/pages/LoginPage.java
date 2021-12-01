package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//div/input[@type='text']")
    public WebElement userName;

    @FindBy(xpath="//li/button[@type='button']")
    public WebElement signInButton;


    @FindBy(xpath="//div/input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//div/input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div/button[@id='primary-button']")
    public WebElement BacktoSafetyButton;






    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }
    //BREAK UNTIL 12:10

}
