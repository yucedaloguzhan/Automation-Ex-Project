Feature: US04   Ordering processes
   @zuhal





  Scenario:TC13 Verify Product quantity in Cart
    Given kullanici AutoExercise sayfasina gider
     # And Verify that home page is visible successfully
  And Click View Product for any product on home page
  And Verify product detail is opened
  Then increase quatity to yapilir
  And Add to cart tiklanir
  And View Cart tıklanır
    And Verify that product is displayed in cart page with exact quantity


  Scenario:TC14 Place Order: Register while Checkout
    Given kullanici AutoExercise sayfasina gider
   # And Verify that home page is visible successfully
  And    Add products to cart
  And    Click Cart button
  And Verify that cart page is displayed
  Then   Click Proceed To Checkout
   And Click Register  Login button
    And  Fill all details in Signup and create account
  And Verify ACCOUNT CREATED! and click Continue button
    And  Verify Logged in as username at top
    And Click Cart button
    Then Click Proceed To Checkout
    And  Verify Address Details and Review Your Order
    And  Enter description in comment text area and click Place Order
    Then  Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
  Then  Click Delete Account button
    And  Verify ACCOUNT DELETED! and click Continue button



  Scenario:TC15 Place Order: Register before Checkout
    Given kullanici AutoExercise sayfasina gider
   # And Verify that home page is visible successfully
   And Click Signup  Login button
    Then  Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    And  Verify Logged in as username at top
    And Add to cart tiklanir
   # And Add products to cart
    Then Click Cart button
    And Verify that cart page is displayed
    Then Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And  Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    Then Click Delete Account button
    And Verify ACCOUNT DELETED! and click Continue button


  Scenario:TC16 Place Order: Login before Checkout
    Given kullanici AutoExercise sayfasina gider
   # And Verify that home page is visible successfully
    And Click Signup  Login button
    Then Fill email, password and click Login button
    And  Verify Logged in as username at top
    And Add to cart tiklanir
   # And Add products to cart  bunsuz çalıştı
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And  Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
   Then  Click Delete Account button
    And  Verify ACCOUNT DELETED! and click Continue button






