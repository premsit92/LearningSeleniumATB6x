package com.apiautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lab299 {
    public static void main(String[] args) {
        //Import concept of OOPs
        //Interface interfaceRef = new Class();
        //1. Inheritance
        //2. Upcasting -- Dynamic Dispatch

        WebDriver driver = new EdgeDriver();
        WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new FirefoxDriver();
        WebDriver driver4 = new InternetExplorerDriver();
        WebDriver driver5 = new SafariDriver();

        //Opera is removed from Selenium 4

        //SearchContext(I) (2)
        //--> WebDriver (I) (10)
        //--> RemoteWebDriver(C) (15)
        //--> ChromiumDriver (c) (25)
        //--> EdgeDriver (c) (45)

        //SearchContext(I) (2)
        //--> WebDriver (I) (10)
        //--> RemoteWebDriver(C) (15)
        //--> ChromiumDriver (c) (25)
        //--> ChromeDriver (c) (45)


        //Selenium - Arch - API
        //Create a session, Commands or Functions --> API Requests to API Browser Driver
        //Pass the command as API



    }
}
