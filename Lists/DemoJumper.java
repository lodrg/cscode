package Lists;

/**
 * @author lodrg
 * @date 2024/1/17 18:01:50
 */
public class DemoJumper {
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(10, null);
        System.out.println(L.toString());


        IntList L1 = new IntList(5, null);
        L1 = new IntList(10,L1);
        L1 = new IntList(10,L1);
        System.out.println(L1.toString());

        System.out.println(L.size());
        System.out.println(L.get(3));

        new IntNode(3,null);
        SLList slList = new SLList(5);
        slList.addFirst(1);
        slList.getFirst();

        SLList SL = new SLList(6);
        SL.addFirst(3);
        SL.addFirst(5);
        int first = SL.getFirst();
        System.out.println(first);

    }
}
