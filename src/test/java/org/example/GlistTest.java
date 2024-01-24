package org.example;

import org.example.DLLists.GList;
import org.junit.Test;

public class GlistTest {
    @Test
    public void testGlist() {
        GList<String> G = new GList<>("happy");
        System.out.println("happy:"+G.getFirst());
        G.addFirst("new");
        System.out.println("new:"+G.getFirst());
        G.addLast("year");
        System.out.println("year:"+G.getLast());
        System.out.println("G.getFirst() = " + G.getFirst());

        GList<String> G2 = new GList<>();
        System.out.println(G2);
        G2.addFirst("bird");
        System.out.println(G2.getFirst());
    }
}
