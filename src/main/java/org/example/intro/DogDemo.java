package org.example.intro;

/**
 * @author lodrg
 * @date 2024/1/17 17:54:07
 */
public class DogDemo {
    public static void main(String[] args) {
        /* Create an array of two dogs. */
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);

        /* Yipping will result, since dogs[0] has weight 8. */
        dogs[0].makeNoise();

        Dog d = new Dog(15);
        Dog d2 = new Dog(100);
        System.out.println(d.maxDog(d2));
    }
}
