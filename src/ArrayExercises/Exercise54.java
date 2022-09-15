package ArrayExercises;

import java.util.HashSet;
import java.util.Set;

public class Exercise54 {
    public static void main(String[] args) {
        //编写一个 Java 程序来检查给定数组是否包含总和为 0 的子数组
        int[] test1 ={-1, -2, -3, 4, 5, 6};
        int[] test2={1, 2, -2, 3, 4, 5, 6};
        int[] test3={ 1, 2, -3, 4, 5 , 6};
        int[] test4={ 1, 2, 3, 4, 5 , 6};
        System.out.println("test1："+ifSubarraySumIsZero(test1));
        System.out.println("test2："+ifSubarraySumIsZero(test2));
        System.out.println("test3："+ifSubarraySumIsZero(test3));
        System.out.println("test4："+ifSubarraySumIsZero(test4));
    }
    public static boolean ifSubarraySumIsZero(int[] arr){
        //set不包含重复元素，hashset不维护插入顺序
        //子列元素是挨着的
        //每次累加一个元素到sum里，并将sum添加到集合中。
        //集合一旦出现重复值（即重复的sum数值），说明在该元素前，有子列元素加加减减和为0，使得sum值与该子列之前所有元素和一样。
        Set<Integer> set =new HashSet<>();
        set.add(0);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("这是和"+sum);
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
            System.out.println("打印set");
           set.forEach(System.out::println);
        }

        return false;
    }
}
