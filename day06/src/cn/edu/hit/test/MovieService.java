package cn.edu.hit.test;

import cn.edu.hit.domain.Movie;

import java.util.Scanner;

public class MovieService {
    /*理解
     * 首先：写的业务类基本都不是数据类，
     * 为了执行功能，业务类需要有实体类成员变量组存数据
     * 提供一个start一样的功能菜单接口，用户直接用，而每个功能都是一个private方法
     * 这种业务类不可以给用户getset
     * 实际使用时，先用实体类建造数据，然后业务类装在数据，然后使用
     * 不同包注意导入：不然会要求全类名*/
    private Movie[] arr;

    public MovieService(Movie[] arr) {
        this.arr = arr;
        // 注意public虽然可用，但是不同包需要导入
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            // 先界面后输入和功能
            System.out.println("-----电影管理系统-----");
            System.out.println("1.查询全部电影");
            System.out.println("2.使用id查询");
            System.out.println("3.退出");
            System.out.println("请输入你的选择:");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> getMovieInfos();
                case 2 -> getbyId();
                case 3 -> {
                    break loop;
                } //结束名字为loop的循环！！，注意加了括号才可以，不然会当作语法自动的break重复的break
                default -> System.out.println("error,重新输入");
            }
        }
    }

    private void getbyId() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i].getId()) {
                System.out.println("id:" + arr[i].getId() + "-title:" + arr[i].getTitle() + "-time" + arr[i].getTime() + "-score" + arr[i].getScore());
                break;
            }
        }
    }

    private void getMovieInfos() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println("id:" + arr[i].getId() + "-title:" + arr[i].getTitle() + "-time" + arr[i].getTime() + "-score" + arr[i].getScore());
        }
    }

}
