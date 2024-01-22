package InheritanceAndImplements;

import DLLists.GList;
import SLLists.SLList;
import SLLists.SLListNwithSentinel;

/**
 * @author lodrg
 * @date 2024/1/22 11:33:12
 */
public class Long {
    public static void main(String[] args) {
        GList<String> glist = new GList<String>("hh");
        glist.addFirst("ddddddd");
        glist.addFirst("www");
        String longest = longest(glist);
        System.out.println(longest);

        LL ll = new LL();
        ll.print();
    }

    private static String longest(GList<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(max);
            String thisString = list.get(i);
            if (thisString.length() > s.length()) {
               max = i;
            }
        }
        return list.get(max);
    }
}
