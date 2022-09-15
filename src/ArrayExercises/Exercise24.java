package ArrayExercises;

public class Exercise24 {
    public static void main(String[] args) {
        int[] test ={1,2,3,4,5,7,8,9,10};
        System.out.println(miss(test));
    }
    public static int miss (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int sub =arr[i]-arr[i+1];
            if (Math.abs(sub)!=1){
                return (arr[i]+arr[i+1])/2;
            }
        }
        return 0;
    }
}
