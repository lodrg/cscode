package org.example;

import org.example.Map.ArrayMap;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

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
        Integer expected = 5;
        assertEquals(expected, am.get(2));
        throw new IllegalArgumentException("key:" + am.get(2) + "do not exit");
        //ArrayMap<String, Integer> amp = new ArrayMap<>();
        //amp.put("univers", 3);
        //System.out.println(amp.get("univers"));
    }
}
