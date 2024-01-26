package org.example.DisjointSets;

import java.util.Arrays;

/**
 * @author lodrg
 * @date 2024/1/26 16:24:08
 */
public class QuicUnionDS implements DisjointSets{
    private int[] parent;

    public QuicUnionDS(int num) {
        parent = new int[num];
        for (int i = 0; i < num; i++) {
            parent[i] = i - 1;
        }
    }

    public int find(int p) {
        //System.out.println(parent[p]);
        while (parent[p] >= 0) {
            p = parent[p];
        }
        return p;
    }

    @Override
    public void connect(int p, int q) {
        int i = find(p);
        int j = find(q);
        parent[i] = j;
    }

    @Override
    public String toString() {
        return "QuicUnionDS{" +
                "parent=" + Arrays.toString(parent) +
                '}';
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }
}
