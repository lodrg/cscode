package ALists;

import java.util.Arrays;

/**
 * @author lodrg
 * @date 2024/1/19 10:58:55
 */
public class AListTest {
    public static void 	main(String[] args) {
        AList aList = new AList();
        aList.addLast(2);
        aList.addLast(3);
        aList.removeLast();
        log(aList.get(0));

        int[] ints = new int[3];
        ints[0] = 2;
        ints[1] = 2;
        ints[2] = 2;

        int[] ints1 = new int[5];
        System.arraycopy(ints, 0, ints1, 0, 2);
        log(ints1[0]);
        log(ints1[1]);
        log(ints1[2]);
        log(ints1[0], ints1[2]);
    }

    private static void log(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}
