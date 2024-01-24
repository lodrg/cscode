package org.example;

import org.example.DLLists.DLList;
import org.junit.Test;

public class DLListTest {
    @Test
    public void testDLList() {
        DLList d1 = new DLList();
        System.out.println(d1);
        d1.addFirst(2);
        System.out.println(d1.getFirst());
        d1.addLast(33);
        System.out.println(d1.getLast());
        System.out.println(d1.size());
    }
}
