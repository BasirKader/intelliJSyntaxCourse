package com.syntax.class24;

class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website" +websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website" +websiteLink + " in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the  GoogleChrome browser");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the FireFox browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website" +websiteLink + " in FireFox");
    }
    void testThePage(){
        System.out.println("Testing the page in FireFox");
    }
    void closeBrowser(){
        System.out.println("Closing the  FireFox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the Safari browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website" +websiteLink + " in Safari");
    }
    void testThePage(){
        System.out.println("Testing the page in Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the  Safari browser");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening the IE browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website" +websiteLink + " in IE");
    }
    void testThePage(){
        System.out.println("Testing the page in IE");
    }
    void closeBrowser(){
        System.out.println("Closing the  IE browser");
    }
}