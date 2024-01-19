package cn.edu.hit.useapi.msystem;

public class SystemDemo {
    public static void main(String[] args) {
        /*常用方法：
         * public static void exit(int status) 终止当前jvm，如果返回非0代表异常终止
         * public static long currentTimeMills() 返回当前系统时间毫秒形式（从1970年1.1日0时0分0秒到现在的毫秒）
         * public static void arraycopy(Object src，srcPos，Object dest，int destPos，int length) 数组拷贝*/

        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[3];

        System.arraycopy(arr, 1, arr2, 0, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
