package org.example.Bridge;

public class Circle extends Shape{


    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColourToShape() {
        System.out.println("Circle filled with colour ");
        colour.applyColour();
    }
}
