package org.example.Bridge;

public class Triangle extends Shape{
    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColourToShape() {
        System.out.println("Triangle is filled with ");
        colour.applyColour();
    }
}
