package org.example.Bridge;

public class Square extends Shape{

    public Square(Colour colour) {
        super(colour);
    }

    @Override
   public void applyColourToShape() {
        System.out.println("Square is filled with colour ");
        colour.applyColour();
    }
}
