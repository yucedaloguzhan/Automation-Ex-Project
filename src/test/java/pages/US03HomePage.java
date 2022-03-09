package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03HomePage {

  public US03HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement allProductsText;

  @FindBy(xpath = "//input[@id='search_product']")
  public WebElement searchProductBox;

  @FindBy(xpath = "//body/section[@id='advertisement']/div[1]/button[1]/i[1]")
  public WebElement searchProductBoxClickButton;

  @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
  public WebElement searchedProductsText;

/////////

  @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
  public WebElement subscriptionText;

  @FindBy(xpath = "//input[@id='susbscribe_email']")
  public WebElement yourEmailAddressBox;

  @FindBy(xpath = "//body/footer[@id='footer']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]/i[1]")
  public WebElement yourEmailAddressBoxEnterButton;


//////////

@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
  public WebElement cartButton;

@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
public WebElement firstProduct;

@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")
  public WebElement firstProductAddToCartButton;

@FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
  public WebElement continueShoppingButton;

@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
  public WebElement secondProduct;

@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]")
  public WebElement secondProductAddToCartButton;

@FindBy(xpath = "//div[@class='alert-success alert']")
  public WebElement successfullyText;

@FindBy(xpath = "//u[contains(text(),'View Cart')]")
  public WebElement viewCartButton;

@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
public WebElement addToCartSecond;

@FindBy(xpath = "//tbody/tr[@id='product-1']/td[1]/a[1]/img[1]")
  public WebElement cartFirstProduct;

  @FindBy(xpath = "//tbody/tr[@id='product-2']/td[1]/a[1]/img[1]")
  public WebElement cartSecondProduct;

  @FindBy(xpath = "//tbody/tr[@id='product-1']/td[5]/p[1]")
  public WebElement price1;

  @FindBy(xpath = "//tbody/tr[@id='product-2']/td[5]/p[1]")
  public WebElement price2;

  @FindBy(xpath = "//tbody/tr[@id='product-1']/td[4]/button[1]")
  public WebElement quantity1;

  @FindBy(xpath = "//tbody/tr[@id='product-2']/td[4]/button[1]")
  public WebElement quantity2;

@FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
  public WebElement proceedToCheckout;

@FindBy(xpath = "//p[contains(text(),'Rs. 900')]")
  public WebElement totalAmount;


}
