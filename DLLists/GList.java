package DLLists;

public class GList<T> {

    public T get(int max) {
        IntNode p = sentinel;
        for (int i = 0; i < max; i++) {
            p = p.next;
        }
        return p.item;
    }

    //use static save memmory and 内部类不访问外面的东西
    public class IntNode {
        public IntNode prew;
        public IntNode next;
        public T item;

        public IntNode(IntNode p, T i, IntNode n) {
            prew = p;
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;

    private int size;

    public GList(T i) {
        sentinel = new IntNode(sentinel, i, sentinel);
        sentinel.next = new IntNode(sentinel, i, sentinel);
        sentinel.prew = sentinel.next;
        size = 1;
    }

    public GList() {
        sentinel = new IntNode(sentinel, null, sentinel);
        sentinel.prew = sentinel;
        sentinel.next = sentinel;
//        System.out.println(sentinel.prew);
//        System.out.println(sentinel.next);
        size = 0;
    }

    public void addFirst(T x) {
        sentinel.next.prew = new IntNode(sentinel, x, sentinel.next);
//        System.out.println(sentinel.next);
        sentinel.next= sentinel.next.prew;
        size += 1;
    }

    public T getFirst() {
        return sentinel.next.item;
    }

    public void addLast(T x) {
        sentinel.prew.next = new IntNode(sentinel.prew, x, sentinel);
        sentinel.prew = sentinel.prew.next;
        size += 1;
    }

    public T getLast() {
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
