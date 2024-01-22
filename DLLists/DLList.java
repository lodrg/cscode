package DLLists;

import InheritanceAndImplements.List61B;

public class DLList {

    //use static save memmory and 内部类不访问外面的东西
    public static class IntNode {
        public IntNode prew;
        public IntNode next;
        public int item;

        public IntNode(IntNode p, int i, IntNode n) {
            prew = p;
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;

    private int size;

    public DLList(int i) {
        sentinel = new IntNode(sentinel, 33, sentinel);
        sentinel.next = new IntNode(sentinel, i, sentinel);
        sentinel.prew = sentinel.next;
        size = 1;
    }

    public DLList() {
        sentinel = new IntNode(sentinel, 33, sentinel);
        sentinel.prew = sentinel;
        sentinel.next = sentinel;
//        System.out.println(sentinel.prew);
//        System.out.println(sentinel.next);
        size = 0;
    }

    public void addFirst(int x) {
        sentinel.next.prew = new IntNode(sentinel, x, sentinel.next);
//        System.out.println(sentinel.next);
        sentinel.next= sentinel.next.prew;
        size += 1;
    }


    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        sentinel.prew.next = new IntNode(sentinel.prew, x, sentinel);
        sentinel.prew = sentinel.prew.next;
        size += 1;
    }

    public int getLast() {
        return sentinel.prew.item;
    }


    public int size() {
        //int size = 0;
        //
        //IntNode p = first;
        //
        //while (p.next != null) {
        //    p = p.next;
        //    size += 0;
        //}
        //
        return size;
    }

}
