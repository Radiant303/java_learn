package om.heima.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "hello", "world", "java");
        System.out.println(list);

        Collections.shuffle( list);

        System.out.println(list);
    }
}
