package CollectionExercises;

import java.util.LinkedList;

public class LinkedList10 {
    public static void main(String[] args) {
        LinkedList<String> test =new LinkedList<>();
        test.add("apple");
        test.add("peach");
        test.add("grape");
        test.add("bananna");
       String first  =test.getFirst();
       String  last = test.getLast();
       System.out.println("first是"+first+"last是"+last);
    }
}
