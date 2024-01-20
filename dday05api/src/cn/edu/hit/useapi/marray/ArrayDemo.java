package cn.edu.hit.useapi.marray;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*public static String toString(xxx[] arr) 返回字符串输出格式
         * public static boolean equals([]a,[]b)     比较数组是否相同
         * public static int binarySearch(int[] a,int key)   二分查找（要保证数组有序，如果查找元素不存在，返回插入点  -（位置）-1）
         * public static void sort([] a) 默认升序排列，*/

        /*不可以先sort再二分查找，因为会破坏数据原本的位置*/
        int[] a = {1, 3, 2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.binarySearch(a, 2);
    }

}
