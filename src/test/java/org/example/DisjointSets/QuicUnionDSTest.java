package org.example.DisjointSets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lodrg
 * @date 2024/1/26 16:29:52
 */
public class QuicUnionDSTest {
    @Test
    public void testQuicUnionDs() {
        QuicUnionDS quds = new QuicUnionDS(10);

        System.out.println(quds.toString());
        System.out.println(quds.find(3));
        System.out.println(quds.find(4));
        System.out.println(quds.find(9));
        boolean connected = quds.isConnected(3, 5);
        System.out.println(connected);
    }

}