package com.syntax.class25;




    public interface WebDriver {
        //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
        // closeBrowser(), maximizeWindow(), findElement().
        // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
        void openBrowser();
        void closeBrowser();
        void maximizeWindow();
        void findElements();

    }
     class ChromeDriver implements WebDriver{

        @Override
        public void openBrowser() {
            System.out.println("Open Chrome Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Chrome Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Chrome Window");
        }

        @Override
        public void findElements() {
            System.out.println("Finding element on Chrome Driver");
        }
    }
    class FirefoxDriver implements WebDriver{

        @Override
        public void openBrowser() {
            System.out.println("Open Firefox Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Firefox Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximizing the FireFox Browser");
        }

        @Override
        public void findElements() {
            System.out.println("Finding elements on Firefox browser");
        }
    }

























