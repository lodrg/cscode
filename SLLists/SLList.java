package SLLists;

import InheritanceAndImplements.List61B;

/**
 * @author lodrg
 * @date 2024/1/17 18:31:56
 */
public class SLList {
    private IntNode first;

    public SLList(int i) {
        first = new IntNode(i, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public int removeLast() {
        return 1;
    }
}
