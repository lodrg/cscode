package SLLists;

/**
 * @author lodrg
 * @date 2024/1/17 18:07:35
 */
public class IntList {
    public int first;

    @Override
    public String toString() {
        return "Lists.IntList{" +
                "first=" + first +
                ", rest=" + rest +
                '}';
    }

    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int get(int i) {
        if (this.size() <= i) {
            return -1;
        }
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }
}
