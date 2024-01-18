package DLLists;

public class DLListTest {
    public static void main(String[] args) {
        DLList d1 = new DLList();
        System.out.println(d1);
        d1.addFirst(2);
        System.out.println(d1.getFirst());
        d1.addLast(33);
        System.out.println(d1.getLast());
        System.out.println(d1.size());
    }
}
