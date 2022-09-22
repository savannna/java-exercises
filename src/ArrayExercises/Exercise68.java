package ArrayExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise68 {
    //68.编写一个 Java 程序来创建给定不同整数数组的所有可能排列。
    public static void main(String[] args) {
        int[] test1 ={1, 2, 3, 4};
        int[] test2 ={1, 2, 3};
       // List<List<Integer>> result1 =new solution().permute(test1);
       // result1.forEach(System.out::println);

    }
    public List<List<Integer>> permute(int[] nums){
        //创建一个大list包含每一种排列的小list
        List<List<Integer>> result =new ArrayList<>();
        permutation(0,nums,result);
        return result;
    }
    public static void permutation (int i,int[]nums,List<List<Integer>> result){
        //i=0   4-1
        if (i ==nums.length -1){
            //创建一个存放一种排列的小list
            List<Integer> list =new ArrayList<>();
            for(int e:nums){
               list.add(e);
               result.add(list);
            }
        }else {
            //for 第一次初始化 i=0，判断，执行{循环体}，然后i++
            //第一次之后，初始化就没用了。  先执行判断，执行{循环体}，然后i++
            for (int j = i; i < nums.length; j++) {
                //i，j互换
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                //?????????
                permutation(i+1,nums,result);
                //i,j互换
                temp=nums[j];
                nums[j]= nums[i];
                nums[i]=temp;
            }
        }
    }
}
