package com.company.java.features.java8;

@FunctionalInterface
interface Drawable {
    public void draw();
}
public class JavaLambda {
    public static void main(String[] args) {
        int width = 10;

        Drawable d2 = ()-> {
            System.out.println("drawing " + width);
        };
        d2.draw();

    }
}
