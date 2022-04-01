package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*
        GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage();
        chrome.testThePage();
        chrome.closeBrowser();

        FireFox firefox=new FireFox();
        fireFox.openBrowser();
        fireFox.loadPage();
        fireFox.testThePage();
        fireFox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage();
        safari.testThePage();
        safari.closeBrowser();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage();
        ie.testThePage();
        ie.closeBrowser();*/

        Browser[] browsers={new GoogleChrome(),new FireFox(),new Safari(),new IE()};

        for (Browser b:browsers) {
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }


    }

}
