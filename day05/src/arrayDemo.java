public class arrayDemo {
    public static void main(String[] args) {
        arrayTest();
        int[] arr1 = {1, 2, 3, 4, 5};
        // 用length自动获取数组长度
        System.out.println("arr长度" + arr1.length);
        printArray(arr1);
    }

    public static void arrayTest() {
        // 注意：单纯int[] arr;只是创建了数组变量，没有分配内存

        // 静态初始化方式
        // 完整写法：需要右边new int[]
        int[] arr1 = new int[]{1, 2, 3, 5, 6};
        // 简略写法：不需要右边new int[]
        double[] arr2 = {11.11, 22.22};
        System.out.println(arr1);
        System.out.println(arr2);
        //直接输出数组名：最左边 [ 代表当前空间，是数组类型空间，后面一个大写字母代表具体元素类型，在后面@是分隔符，@后面是数组的内存地址（十六进制）
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            // 可以使用快捷键 arr.fori

        }
    }

    public static void arrayDynamic() {
        // 此时创建的是动态初始化的数组，里面数据都是默认值
        /*各种类型默认值
         * 整数：0
         * 小数：0.0
         * 布尔：false
         * ----------
         * 字符：'\u0000'  ---> 常见为空白效果
         * 字符串（其实是引用数据类型：数组，类，接口）：null
         * */

        //只有个数用动态初始化，只给具体值用静态初始化
        int[] arr = new int[10];
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
