package org.example.DisjointSets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lodrg
 * @date 2024/1/26 10:36:46
 */
public class QuicFindDSTest {
    @Test
    public void testDs() {
        QuicFindDS qds = new QuicFindDS(5);

        qds.connect(2, 3);
        System.out.println(qds.toString());
        System.out.println(qds.isConnected(2,4));
    }

}