package om.heima.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "岑金", "柯南", "张北斗","李品话",
                "张活佛","孟庆","程泰宁","锅台平");
        Collections.shuffle( list);
    }
}
