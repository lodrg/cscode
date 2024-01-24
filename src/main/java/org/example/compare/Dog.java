package org.example.compare;

import java.util.Comparator;
import java.util.concurrent.CompletionException;

/**
 * @author lodrg
 * @date 2024/1/24 11:33:05
 */
public class Dog implements Comparable<Dog>{
    private String name;
    private int size;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    private static class NameComparator implements Comparator<Dog> {
        @Override
        public int compare(Dog o1, Dog o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }
    public static Comparator<Dog> getNameComparator02() {
        return new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.name.compareTo(o2.name);
            }
        };
    }
    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    @Override
    public int compareTo(Dog o) {
        Dog uddaDog = o;
        return this.size - uddaDog.size;
    }

    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {
            int comp = items[i].compareTo(items[maxDex]);
            if (comp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }
}
