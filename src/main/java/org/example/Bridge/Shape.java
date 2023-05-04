package org.example.Bridge;

//Abstraction
public abstract class Shape {
    Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract void applyColourToShape();

    @Override
    public String toString() {
        return "Shape{" +
                "colour=" + colour +
                '}';
    }
}
