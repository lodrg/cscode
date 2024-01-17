package Lists;

/**
 * @author lodrg
 * @date 2024/1/17 18:29:29
 */
public class IntNode {
    private final IntNode next;
    private final int item;

    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
