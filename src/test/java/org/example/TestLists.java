package org.example;

import org.example.SLLists.*;
import org.junit.Test;

/**
 * @author lodrg
 * @date 2024/1/17 18:01:50
 */
public class TestLists {
    @Test
    public void tsetALList() {
        //way to new list
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(10, null);
        System.out.println(L.toString());

        //another way to new list
        IntList L1 = new IntList(5, null);
        L1 = new IntList(10,L1);
        L1 = new IntList(10,L1);
        System.out.println(L1.toString());

        System.out.println(L.size());
        System.out.println(L.get(3));
        //this list is naked recursive

        //sllist improve a little
        new IntNode(3,null);
        SLList slList = new SLList(5);
        slList.addFirst(1);
        slList.getFirst();

        SLList SL = new SLList(6);
        SL.addFirst(3);
        SL.addFirst(5);
        int first = SL.getFirst();
        System.out.println(first);

        //sllsitN is a Nested classes way to improve list
        SLListN slListN = new SLListN(3);
        slListN.addFirst(3);
        slListN.addFirst(8);
        int slListNFirst = slListN.getFirst();
        System.out.println(slListNFirst);

        //addlast and getlast
        slListN.addLast(9);
        int last = slListN.getLast();
        System.out.println(last);

        int size = slListN.size();
        System.out.println(size);

        SLListN sllnull = new SLListN();
        sllnull.addLast(3);
        System.out.println(sllnull.size());

        //sentinel way to buid
        SLListNwithSentinel ss = new SLListNwithSentinel();
        ss.addFirst(3);
        ss.addLast(33);
        System.out.println(ss.size());
    }
}
