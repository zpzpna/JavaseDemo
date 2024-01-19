public class arrayTDDemo {
    public static void main(String[] args) {
        arrayTDTest();
    }

    public static void arrayTDTest() {
        // 二维数组静态初始化
        int[][] arr = new int[][]{{11, 22, 33}, {44, 22, 11}};

        // 二维数组遍历：注意第一次循环数组长度是1d数组数目，然后1d根据长度再次循环
        // 也可以先取出1d数组，然后循环，不用【i】【j】
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void arrayTDDynamic() {
        // 动态初始化
        int[][] arr = new int[3][3];
    }
}
