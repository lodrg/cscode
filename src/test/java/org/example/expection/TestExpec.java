package org.example.expection;

import org.junit.Test;

/**
 * @author lodrg
 * @date 2024/1/25 15:15:14
 */
public class TestExpec {
    @Test
    public void testExpection() {
        String today = "Thursday";
        if (today == "Thursday") {
            throw new RuntimeException("as a joke");
        }
    }
}
