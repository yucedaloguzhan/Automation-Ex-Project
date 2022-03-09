package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US04Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.IOException;

public class US04StepDefinition {



    @Given("kullanici AutoExercise sayfasina gider")
    public void kullaniciAutoExerciseSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("AutoExcsUrl"));


    }

/*
    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.automationexercise.com/";
        Assert.assertTrue(actualUrl.equals(expectedUrl));

    }*/
    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        US04Page us04Page=new US04Page();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        us04Page.viewProductButtonu.click();

    }
    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        US04Page us04Page=new US04Page();
        Assert.assertTrue(us04Page.availabilityYazisi.isDisplayed());
    }

    @Then("increase quatity to yapilir")
    public void increaseQuatityToYapilir() {
        US04Page us04Page=new US04Page();
        us04Page.quatityElementi.clear();
        us04Page.quatityElementi.sendKeys("4");
    }

    @And("Add to cart tiklanir")
    public void addToCartTiklanir() {
        US04Page us04Page=new US04Page();
        us04Page.addCartElementi.click();

    }






    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        US04Page us04Page=new US04Page();

        //Verify that product is displayed in cart page with exact quantity
        //  String sayi=us04Page.quantityYazisi.getText();
        //   Assert.assertTrue(us04Page.quatityElementi.equals(us04Page.quantityYazisi));
    }
    

    @And("Add products to cart")
    public void addProductsToCart() {
        US04Page us04Page=new US04Page();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us04Page.addproducttoCartElementi.click();
    }
    @And("View Cart tıklanır")
    public void viewCartTıklanır() {
    US04Page us04Page=new US04Page();
    us04Page.viewCartElementi.click();
    }

    @And("Click Cart button")
    public void clickCartButton() {
        US04Page us04Page=new US04Page();
        us04Page.cartButtonElementi.click();
      //  us04Page.hereButtonu.click();
    }


    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        US04Page us04Page=new US04Page();
        Assert.assertTrue(us04Page.shoppingCartYazisi.isDisplayed());
    }

    @Then("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        US04Page us04Page=new US04Page();
        us04Page.proceedToCheckoutElementi.click();
    }

    @And("Click Register  Login button")
    public void clickRegisterLoginButton() {
        US04Page us04Page=new US04Page();
        us04Page.registerLoginLinki.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        US04Page us04Page=new US04Page();
        Faker faker=new Faker();
        us04Page.nameButtonu.sendKeys(faker.name().firstName());
        us04Page.emailButtonu.sendKeys(faker.internet().emailAddress());
        us04Page.signupButtonu.click();
        us04Page.titleRadioButton.click();
        us04Page.passwordButtonu.sendKeys("123456789");
        Select select=new Select(us04Page.daydropboxEleementi);
        select.selectByIndex(1);
        select=new Select(us04Page.mounthdropboxElementi);
        select.selectByIndex(2);
        select=new Select(us04Page.yearsdropboxElementi);
        select.selectByIndex(18);
        us04Page.firstBoxElementi.click();
        us04Page.secondBoxElementi.click();
        us04Page.firstnameElementi.sendKeys(faker.name().firstName());
        us04Page.lastnameElementi.sendKeys(faker.name().fullName());
       us04Page.companyElemwnti.sendKeys(faker.company().toString());
       us04Page.address1elementi.sendKeys(faker.address().toString());
       us04Page.address2elementi.sendKeys(faker.address().toString());
       select=new Select(us04Page.countryDropBox);
       select.selectByIndex(3);
      us04Page.stateElementi.sendKeys(faker.country().countryCode2());
      us04Page.cityElement.sendKeys(faker.country().countryCode3());
      us04Page.zipcodeElementi.sendKeys(faker.code().toString());
      us04Page.numberElementi.sendKeys(faker.number().digit());
      us04Page.createAccountElementi.click();



    }



    @And("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        US04Page us04Page=new US04Page();
        Assert.assertTrue(us04Page.accountCreatedYazisi.isDisplayed());
        us04Page.continueButtonu.click();


    }


    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        US04Page us04Page=new US04Page();
        Assert.assertTrue(us04Page.loggedinasEleementi.isDisplayed());
    }


    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        US04Page us04Page=new US04Page();
        Assert.assertTrue(us04Page.addressDetailsElementi.isDisplayed());
        Assert.assertTrue(us04Page.reviewyourorderElementi.isDisplayed());

        
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        US04Page us04Page=new US04Page();
        us04Page.textAreaElementi.sendKeys("thank you for everything");
        us04Page.placeOrderElementi.click();
        
    }

    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        US04Page us04Page=new US04Page();
     Faker faker=new Faker();
     us04Page.paymentCardName.sendKeys(faker.name().firstName());
     us04Page.cardNumberElementi.sendKeys("1234567891234567");
     us04Page.cvcElementi.sendKeys("123");
     us04Page.expirationElementi.sendKeys("25");
     us04Page.yearElementi.sendKeys("2025");


    }


    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        US04Page us04Page=new US04Page();
        us04Page.payandConfirmOrderButtonu.click();

    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() throws IOException {
        US04Page us04Page=new US04Page();

        ReusableMethods.getScreenshot("succesfully");
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        US04Page us04Page=new US04Page();
        us04Page.deleteButtonu.click();
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {

    }


    @And("Click Signup  Login button")
    public void clickSignupLoginButton() {
        US04Page us04Page=new US04Page();
        us04Page.signupLogginButtonu.click();
    }



    @Then("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {
        US04Page us04Page=new US04Page();
        us04Page.emailLoginBox.sendKeys("asddfh1@gmail.com");
        us04Page.passwordLoginBox.sendKeys("1234");
        us04Page.loginButton.click();
    }



}
