package SLLists;

/**
 * @author lodrg
 * @date 2024/1/17 18:29:29
 */
public class IntNode {
    public final IntNode next;
    public final int item;

    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
