package com.syntax.class26;

//import com.sun.deploy.cache.BaseLocalApplicationProperties;
//import com.syntax.class25.ChromeDriver;
//import com.syntax.class25.WebDriver;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        //shoppingCart.originalPrice=100;
        //shoppingCart.discount=.20;
       //shoppingCart.setDiscount(.20);
        System.out.println(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();

        //WebDriver webdriver=new ChromeDriver();


        //webDriver.get("www.google.com");
    }
}
