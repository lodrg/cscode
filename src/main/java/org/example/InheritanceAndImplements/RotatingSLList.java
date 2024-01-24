package org.example.InheritanceAndImplements;


import org.example.SLLists.SLList;

/**
 * @author lodrg
 * @date 2024/1/22 16:25:33
 */
public class RotatingSLList extends SLList {
    public RotatingSLList(int i) {
        super(i);
    }

    public void rotateRight() {
        int x = removeLast();
        addFirst(x);
    }
}
