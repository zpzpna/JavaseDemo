package cn.edu.hit.tools;

public class ArrayTools {
    /*工具类:
     * 所有方法都是给别人提供服务,自己完全没数据
     * 一般使用static修饰方法,这样不用创建对象也可以使用方法
     * 由于不需要创建对象,一般把构造方法加上private,不让人创建多余工具类对象*/

    private ArrayTools() {

    }

    public static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxValue = maxValue > arr[i] ? maxValue : arr[i];
        }
        return maxValue;
    }

    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minValue = minValue < arr[i] ? minValue : arr[i];
        }
        return minValue;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
