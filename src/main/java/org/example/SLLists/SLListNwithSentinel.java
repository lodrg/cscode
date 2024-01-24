package org.example.SLLists;

public class SLListNwithSentinel {

    //use static save memmory and 内部类不访问外面的东西
    public static class IntNodeN {
        public IntNodeN next;
        public int item;

        public IntNodeN(int i, IntNodeN n) {
            item = i;
            next = n;
        }
    }

    private IntNodeN sentinel;

    private int size;

    public SLListNwithSentinel(int i) {
        sentinel = new IntNodeN(3, null);
        sentinel.next = new IntNodeN(i, null);
        size = 1;
    }

    public SLListNwithSentinel() {
        sentinel = new IntNodeN(3, null);
        size = 0;
    }

    public void addFirst(int x) {
        sentinel = new IntNodeN(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNodeN p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNodeN(x, null);
        size += 1;
    }

    public int getLast() {
        IntNodeN p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int size() {
        //int size = 0;
        //
        //IntNodeN p = first;
        //
        //while (p.next != null) {
        //    p = p.next;
        //    size += 0;
        //}
        //
        return size;
    }

}
