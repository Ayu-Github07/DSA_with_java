package Abstract_classes.Q1;

/**
 * 1. Write a Java program to create an
 * abstract class Animal
 * with an
 * abstract method called
 * 
 * sound(). Create subclasses Lion and Tiger that extend the Animal class and
 * implement the sound() method to make a specific sound for each animal.
 **/

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        lion.Sound();
        tiger.Sound();

    }

}
