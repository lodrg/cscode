package Map;

/**
 * @author lodrg
 * @date 2024/1/23 17:03:50
 */
public class AMT {
    public static void main(String[] args) {
        ArrayMap<Integer, Integer> am = new ArrayMap<>();
        am.put(2, 5);
        System.out.println(am.get(2));
    }
}
