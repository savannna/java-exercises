package CollectionExercises;

import java.util.LinkedList;

public class LinkedList24 {
    public static void main(String[] args) {
        LinkedList<String> test1 = new LinkedList<>();
        test1.add("本");
        test1.add("网");
        test1.add("站");
        test1.add("使用");
        LinkedList<String> test2 = new LinkedList<>();
        test2.add("本");
        test2.add("网");
        test2.add("页");
        test2.add("使用");
        LinkedList<String> result = new LinkedList<>();
        for(String e:test1){
            result.add(test2.contains(e)?"yes":"no");
        }
        System.out.println(result);
    }
}
