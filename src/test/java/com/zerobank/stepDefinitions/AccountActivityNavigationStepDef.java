package com.zerobank.stepDefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.DefaultPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigationStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        DefaultPage defaultPage= new DefaultPage();
        LoginPage loginPage = new LoginPage();

        loginPage.signInButton.click();
        loginPage.login(username,password);
        loginPage.BacktoSafetyButton.click();

        defaultPage.CheckingAccountActivity.click();
        defaultPage.AccountSummary.click();
    }
    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String link) {
        AccountSummary accountSummary = new AccountSummary();

        if(link.equals("Savings")){
            accountSummary.Savings.click();
        }else if (link.equals("Brokerage")){
            accountSummary.Brokerage.click();
        }else if (link.equals("Checking")){
            accountSummary.Checking.click();
        }else if (link.equals("Credit Card")){
            accountSummary.CreditCard.click();
        }else if (link.equals("Loan")){
            accountSummary.Loan.click();
        }




    }
    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Activity",actualTitle);



    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() throws InterruptedException {
        Thread.sleep(4000);
        AccountActivity  accountActivity = new AccountActivity();

        String expected = "Savings";
        String actual = accountActivity.getDefaultAccountDropDown();

        Assert.assertEquals(expected, actual);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }
    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() throws InterruptedException {
        Thread.sleep(4000);
        AccountActivity  accountActivity = new AccountActivity();

        String expected = "Brokerage";
        String actual = accountActivity.getDefaultAccountDropDown();

        Assert.assertEquals(expected, actual);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }
    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() throws InterruptedException {
        Thread.sleep(4000);
        AccountActivity  accountActivity = new AccountActivity();

        String expected = "Checking";
        String actual = accountActivity.getDefaultAccountDropDown();

        Assert.assertEquals(expected, actual);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }
    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() throws InterruptedException {
        Thread.sleep(4000);
        AccountActivity  accountActivity = new AccountActivity();

        String expected = "Credit Card";
        String actual = accountActivity.getDefaultAccountDropDown();

        Assert.assertEquals(expected, actual);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }
    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() throws InterruptedException {
        Thread.sleep(4000);
        AccountActivity  accountActivity = new AccountActivity();

        String expected = "Loan";
        String actual = accountActivity.getDefaultAccountDropDown();

        Assert.assertEquals(expected, actual);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }





}
