package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.US03HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static utilities.ReusableMethods.getScreenshot;
import static utilities.ReusableMethods.waitFor;

public class US03StepDefinitions {

    HomePage homePage = new HomePage();
    US03HomePage us03HomePage = new US03HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici automation ana sayfasina gider")
    public void kullanici_automation_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AutoExcsUrl"));

    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String url = Driver.getDriver().getCurrentUrl();
        url.contains("https://automationexercise.com/");
    }

    @Given("Click on the {string} button")
    public void click_on_the_button(String string) {

        homePage.productButtonElement.click();

    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {

        String allProducts = us03HomePage.allProductsText.getText();
        Assert.assertTrue(allProducts.contains("ALL PRODUCT"));

    }

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        us03HomePage.searchProductBox.sendKeys(ConfigReader.getProperty("ProductName"));
        us03HomePage.searchProductBoxClickButton.click();

    }

    @Given("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(us03HomePage.searchedProductsText.isDisplayed());

    }

    @And("Close the page")
    public void closeThePage() {
        Driver.getDriver().close();
    }

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Given("Verify text {string}")
    public void verify_text(String string) {
        String Subscription = us03HomePage.subscriptionText.getText();
        Assert.assertTrue(Subscription.contains("SUBSCRIPTION"));

    }

    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() throws InterruptedException {
        us03HomePage.yourEmailAddressBox.sendKeys(ConfigReader.getProperty("Email"));
        waitFor(5);
        us03HomePage.yourEmailAddressBoxEnterButton.click();


    }

    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) throws IOException {
        getScreenshot("Successfully");

    }
    @Given("Click {string} button")
    public void click_button(String string) {
        us03HomePage.cartButton.click();
    }

    @Given("Hover over first product and click {string}")
    public void hover_over_first_product_and_click(String string) throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .clickAndHold(us03HomePage.firstProduct)
                .doubleClick(us03HomePage.firstProductAddToCartButton)
                .perform();

        us03HomePage.firstProductAddToCartButton.click();

    }
    @Given("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        us03HomePage.continueShoppingButton.click();

    }
    @Given("Hover over second product and click {string}")
    public void hover_over_second_product_and_click(String string) {
        us03HomePage.addToCartSecond.click();

    }
    @Given("Click View Cart button")
    public void click_view_cart_button() {
        us03HomePage.viewCartButton.click();

    }
    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(us03HomePage.cartFirstProduct.isDisplayed());
        Assert.assertTrue(us03HomePage.cartSecondProduct.isDisplayed());
    }
    @Given("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {

        String price1=us03HomePage.price1.getText();
        Assert.assertTrue(price1.contains("Rs. 500"));

        String price2=us03HomePage.price2.getText();
        Assert.assertTrue(price2.contains("Rs. 400"));

        String quantity1=us03HomePage.quantity1.getText();
        Assert.assertTrue(quantity1.contains("1"));

        String quantity2=us03HomePage.quantity2.getText();
        Assert.assertTrue(quantity2.contains("1"));

        //us03HomePage.proceedToCheckout.click();

        //String totalAmount=us03HomePage.totalAmount.getText();
        //Assert.assertTrue(totalAmount.contains("Rs. 900"));

    }

}