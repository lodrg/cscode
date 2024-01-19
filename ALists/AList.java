package ALists;

import org.w3c.dom.ls.LSException;
import sun.reflect.ReflectionFactory;

/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList {
    private static final int RFACTOR = 3;
    /**
     * Creates an empty list.
     */
    int[] list;
    int size;

    public AList() {
        list = new int[10];
        size = 0;
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(int x) {
        if (size == list.length) {
            resize(size * RFACTOR);
        }
        list[size] = x;
        size++;
    }

    private void resize(int i) {
        int[] l0 = new int[i];
        System.arraycopy(list, 0, l0, 0, size);
    }

    /**
     * Returns the item from the back of the list.
     */
    public int getLast() {
        return list[size];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public int get(int i) {
        return list[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public int removeLast() {
        size--;
        return 0;
    }
} 