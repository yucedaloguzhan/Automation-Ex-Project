Feature:US03


Scenario:TC01_Search_Product Test

 Given kullanici automation ana sayfasina gider
 And Verify that home page is visible successfully
 And Click on the 'Products' button
 And Verify user is navigated to ALL PRODUCTS page successfully
 And Enter product name in search input and click search button
 And Verify 'SEARCHED PRODUCTS' is visible


Scenario:TC02_Verify Subscription in home page

 Given kullanici automation ana sayfasina gider
 And Verify that home page is visible successfully
 And Scroll down to footer
 And Verify text 'SUBSCRIPTION'
 And Enter email address in input and click arrow button
 And Verify success message 'You have been successfully subscribed!' is visible


Scenario: TC03_Verify Subscription in Cart page

 Given kullanici automation ana sayfasina gider
 And Verify that home page is visible successfully
 And  Click 'Cart' button
 And Scroll down to footer
 And Verify text 'SUBSCRIPTION'
 And Enter email address in input and click arrow button
 And Verify success message 'You have been successfully subscribed!' is visible


 Scenario: TC04_Add Products in Cart

  Given kullanici automation ana sayfasina gider
  And Verify that home page is visible successfully
  And Click on the 'Products' button
  And Hover over first product and click 'Add to cart'
  And  Click Continue Shopping button
  And Hover over second product and click 'Add to cart'
  And  Click View Cart button
  And Verify both products are added to Cart
  And Verify their prices, quantity and total price




