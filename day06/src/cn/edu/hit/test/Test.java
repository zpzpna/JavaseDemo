package cn.edu.hit.test;

import cn.edu.hit.domain.Movie;

public class Test {
    // 先实体对象数据创建，然后用服务类
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "a", "10", 3, "usa", "sex", "lq", "*");
        Movie movie2 = new Movie(1, "b", "20", 4, "jp", "sex++", "dz", "**");
        Movie movie3 = new Movie(1, "c", "30", 5, "cn", "war", "ldz", "***");

        Movie[] arr = {movie1, movie2, movie3};

        MovieService movieService = new MovieService(arr);
        movieService.start();
    }

}
