package org.example;

import org.example.Bridge.*;

public class Main {
    public static void main(String[] args) {
        Bridge1();
    }

    public static void Bridge1() {
        //Testing Bridge Design Pattern
       Shape s3 = new Triangle(new YellowColour());
       s3.applyColourToShape();


    }
}