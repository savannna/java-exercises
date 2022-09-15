package ArrayExercises;

public class Exercise5 {
    public static void main(String[] args) {
        int[] test1 ={12,13,141,151,41,425,425,6,46727,6,7356,4,25};
        System.out.println(contain(test1,45));
        System.out.println(contain(test1,12));
    }
    public static boolean contain(int[] arr,int num){
        for(int e:arr){
            if(e==num) {
                System.out.println("哈喽 1这步运行了么");
                return true;
            }
//            else {
//                System.out.println("哈喽 2这步运行了么");
//                return false;
//            }
        }
        //return：是使整个函数返回的，后面的不管是循环里面还是循环外面的都不执行
        //因为在else中return了，所以3永远不会被执行
        //如果去掉else部分
        //如果if 语句都不匹配，则不会返回任何内容，这是不允许的。
        System.out.println("哈喽 3这步运行了么");
        return false;
    }

}
