package com.syntax.class25;

public class WebDriverTester {
    public static void main(String[] args) {

                WebDriver[]web={new ChromeDriver(),new FirefoxDriver()};
                for (WebDriver driver:web){
                    driver.openBrowser();
                    driver.findElements();
                    driver.maximizeWindow();
                    driver.closeBrowser();
                }



    }


}
