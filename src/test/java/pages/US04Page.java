package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04Page {

  public  US04Page(){

      PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButtonu;

  @FindBy  (xpath = "//b[text()='Availability:']")
  public WebElement availabilityYazisi;

    @FindBy (xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
    public WebElement addCartElementi;

    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement quatityElementi;


  @FindBy (xpath = "//u[text()='View Cart']")
  public WebElement viewCartElementi;

  @FindBy (xpath = "//button[@class='disabled']")
  public WebElement quantityYazisi;

//TC14
 @FindBy  (xpath ="(//a[@data-product-id='1'])[1]")
  public WebElement addproducttoCartElementi;


    @FindBy (xpath = "//li[@class='active']")
    public WebElement shoppingCartYazisi;

 @FindBy (xpath = "//a[@class='btn btn-default check_out']")
public WebElement proceedToCheckoutElementi;

 @FindBy(xpath = "(//a[@href='/login'])[2]")
    public WebElement registerLoginLinki;

 @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement nameButtonu;

 @FindBy (xpath = "(//input[@type='email'])[2]")
    public WebElement  emailButtonu;


@FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButtonu;


@FindBy (xpath = "//input[@id='id_gender2']")
    public WebElement titleRadioButton;

@FindBy (xpath = "//input[@type='password']")
    public WebElement passwordButtonu;

@FindBy (xpath = "//select[@id='days']\n")
    public WebElement daydropboxEleementi;

@FindBy (xpath = "//select[@id='months']")
    public WebElement mounthdropboxElementi;


@FindBy (xpath = "//select[@id='years']")
    public WebElement yearsdropboxElementi;

@FindBy (xpath = "//input[@id='newsletter']")
    public WebElement firstBoxElementi;

@FindBy(xpath = "//input[@id='optin']")
    public WebElement  secondBoxElementi;

@FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstnameElementi;

@FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastnameElementi;

@FindBy(xpath = "//input[@id='company']")
    public WebElement companyElemwnti;
@FindBy(xpath = "//input[@id='address1']")
    public WebElement address1elementi;
@FindBy(xpath = "//input[@id='address2']")
    public WebElement  address2elementi;

@FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropBox;

@FindBy(xpath = "//input[@id='state']")
    public WebElement stateElementi;

@FindBy(xpath = "//input[@id='city']")
    public WebElement cityElement;

@FindBy (xpath = "//input[@id='zipcode']")
    public WebElement zipcodeElementi;

@FindBy (xpath = "//input[@id='mobile_number']")
    public WebElement numberElementi;

@FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement createAccountElementi;

@FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accountCreatedYazisi;

@FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement continueButtonu;

@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")
    public WebElement loggedinasEleementi;

@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]")
 public WebElement cartButtonElementi;

@FindBy(xpath = " //h2[contains(text(),'Address Details')]")
    public WebElement addressDetailsElementi;

@FindBy(xpath = "//h2[contains(text(),'Review Your Order')]")
    public WebElement reviewyourorderElementi;

@FindBy (xpath = "//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]")
    public WebElement textAreaElementi;

@FindBy (xpath = "//a[contains(text(),'Place Order')]")
    public WebElement placeOrderElementi;

 @FindBy ( xpath = "//input[@name='name_on_card']")
   public WebElement paymentCardName;
 @FindBy(xpath = "//input[@name='card_number']")
 public WebElement cardNumberElementi;
 @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvcElementi;
 @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement expirationElementi;
 @FindBy (xpath = "//input[@name='expiry_year']")
 public WebElement yearElementi;

 @FindBy(xpath = "//button[@id='submit']")
    public WebElement payandConfirmOrderButtonu;

 @FindBy(xpath = "//a[@xpath='1']")
    public WebElement deleteButtonu;
 @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    public WebElement signupLogginButtonu;
 @FindBy (xpath = "//input[@name='email']")
public WebElement emailLoginBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordLoginBox;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButton;

  @FindBy (xpath = "//u[contains(text(),'here')]")
    public WebElement hereButtonu;








//a[@class='btn btn-default add-to-cart']
//(//i[@class='fa fa-shopping-cart'])[3]



}
