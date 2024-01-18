package SLLists;

public class SLListN {

    //use static save memmory and 内部类不访问外面的东西
    public static class IntNodeN {
        public IntNodeN next;
        public int item;

        public IntNodeN(int i, IntNodeN n) {
            item = i;
            next = n;
        }
    }

    private IntNodeN first;

    private int size;

    public SLListN(int i) {
        first = new IntNodeN(i, null);
        size = 1;
    }

    public SLListN() {
        first = null;
        size = 0;
    }

    public void addFirst(int x) {
        first = new IntNodeN(x, first);
        size += 1;
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x) {
        IntNodeN p = first;
        if (p != null) {
            while (p.next != null) {
                p = p.next;
            }
            p.next = new IntNodeN(x, null);
        }else {
            first = new IntNodeN(x,null);
        }
        size += 1;
    }

    public int getLast() {
        IntNodeN p = first;
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
