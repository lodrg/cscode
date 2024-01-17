package Lists;

public class SLListN {

    //use static save memmory and 内部类不访问外面的东西
    public static class IntNodeN {
        public  IntNodeN next;
        public  int item;

        public IntNodeN(int i, IntNodeN n) {
            item = i;
            next = n;
        }
    }

    private IntNodeN first;

    public SLListN(int i) {
        first = new IntNodeN(i, null);
    }

    public void addFirst(int x) {
        first = new IntNodeN(x, first);
    }

    public int getFirst() {
        return first.item;
    }
}
