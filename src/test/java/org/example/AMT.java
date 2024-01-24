package org.example;

import org.example.Map.ArrayMap;
import org.junit.Test;

/**
 * @author lodrg
 * @date 2024/1/23 17:03:50
 */
public class AMT {
    @Test
    public void testArrayMap() {
        ArrayMap<Integer, Integer> am = new ArrayMap<>();
        am.put(2, 5);
        System.out.println(am.get(2));
    }
}
