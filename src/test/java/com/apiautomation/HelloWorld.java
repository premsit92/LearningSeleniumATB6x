package com.apiautomation;

import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}