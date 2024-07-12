package com.apiautomation;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab300 {
    public static void main(String[] args) {
        //SearchContext driver = new EdgeDriver();//Dynamic Dispatch (Runtime Polymorphism)

        //Possible but only two functions which is not much used.
//        driver.findElement();
//        driver.findElements();

       // WebDriver driver = new EdgeDriver();
        //12 functions which is good.


       // RemoteWebDriver driver = new EdgeDriver();

      //  EdgeDriver driver1 = new EdgeDriver();

        //Scenarios

        //1. Want to run on Edge or Chrome

//        EdgeDriver driver = new EdgeDriver();
//        ChromeDriver driver1 = new ChromeDriver();

        //2. Do you want to run on Chrome then change to Edge?
//        WebDriver driver = new ChromeDriver();
//        driver = new EdgeDriver();
//
        //3. Do you want to run on Multiple Browsers?
       // RemoteWebDriver diver (with Grid) -Advance (Last 2 Scenario)



    }
}
