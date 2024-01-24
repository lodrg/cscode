package org.example.compare;

import org.junit.Test;

import java.io.UTFDataFormatException;
import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * @author lodrg
 * @date 2024/1/24 11:45:29
 */
public class DogTest {

    @Test
    public void testMax() {
        Dog[] dogs = {new Dog("f", 3), new Dog("h", 2), new Dog("x", 9)};
        Comparable max = Dog.max(dogs);
        System.out.println(max.toString());
        Comparator<Dog> nameComparator = Dog.getNameComparator();
        int compare = nameComparator.compare(new Dog("ff", 1), new Dog("hh", 9));
        System.out.println(compare);
        Comparator<Dog> nameComparator02 = Dog.getNameComparator02();
        //nameComparator02.compare();
    }
}