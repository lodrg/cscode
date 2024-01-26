package org.example.DisjointSets;

import java.util.Arrays;

/**
 * @author lodrg
 * @date 2024/1/26 10:31:16
 */
public class QuicFindDS implements DisjointSets{
    private int[] id;

    public QuicFindDS(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void connect(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    @Override
    public String toString() {
        return "QuicFindDS{" +
                "id=" + Arrays.toString(id) +
                '}';
    }

    @Override
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }
}
