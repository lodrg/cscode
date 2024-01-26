package org.example.Tree;

/**
 * @author lodrg
 * @date 2024/1/26 18:32:34
 */
public class BST<Key> {
    private Key key;
    private BST left;
    private BST right;

    public BST(Key key, BST left, BST right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public BST(Key key) {
        this.key = key;
    }

    public BST find(BST T, Key key) {
        if (T == null) {
            return null;
        }
        if (key.equals(T.key)) {
            return T;
        } else if (key.lessThen(T.key)) {
            return find(T.left, key);
        } else {
            return find(T.right, key);
        }

    }
}
