package org.example.DisjointSets;

/**
 * @author lodrg
 * @date 2024/1/26 10:07:27
 */
public interface DisjointSets {
    void connect(int p, int q);

    boolean isConnected(int p, int q);
}
