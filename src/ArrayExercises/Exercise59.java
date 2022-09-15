package ArrayExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise59 {
    public static void main(String[] args) {
      //59.编写一个 Java 程序，找出给定整数数组中两个整数的最大乘积。
        int[] test1 ={2, 3, 5, 7, -7, 5, 8, -5 };
        maxProduct(test1);

    }
    public static void maxProduct (int[] arr){
        //不停的赋值乘积值与任意两个数乘积比较
        int max_Product=Integer.MIN_VALUE;
        int maxIndex1=-1;
        int maxIndex2=-1;
        //两次遍历 初始不同 外层是i=0,内层是j=i+1。使得不重复索引的在数组中取两个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max_Product<arr[i]*arr[j]){
                    max_Product=arr[i]*arr[j];
                    maxIndex1=i;
                    maxIndex2=j;
                    System.out.println("乘积/值1/值2："+max_Product+"，"+arr[maxIndex1]+"，"+arr[maxIndex2]);
                }
            }
        }

        System.out.println("两个数字是 "+arr[maxIndex1]+","+arr[maxIndex2]+"。乘积是："+max_Product);
    }
}
