package CollectionExercises;

import java.util.ArrayList;

public class ArrayList19 {
    //编写一个 Java 程序，将数组列表的容量调整为当前列表的大小。
    public static void main(String[] args) {
        ArrayList<String> longArray = new ArrayList<>();
        longArray.add("red");
        longArray.add("green");
        longArray.add("black");
        longArray.add("white");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");
        longArray.add("pink");

        longArray.add("pink");

        System.out.println("长度是"+longArray.size());
        longArray.trimToSize();
        System.out.println(longArray);
    }


    
}
