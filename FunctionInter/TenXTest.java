package FunctionInter;

import java.security.cert.X509Certificate;
import java.util.function.Function;

/**
 * @author lodrg
 * @date 2024/1/22 17:56:23
 */
public class TenXTest {
    public static void main(String[] args) {
        System.out.println(do_twice(new TenX(),2));

        Function<Integer,Integer> function = (x) -> 10 * x;
        System.out.println(function.apply(function.apply(3)));
    }

    private static int do_twice(IntUnaryFunction f, int i) {
        return f.apply(f.apply(i));
    }
}
