package cn.edu.hit.frame;

import javax.swing.*;

public class JFrameDemo {
    public static void main(String[] args) {
        // 创建对象
        JFrame frame = new JFrame();

        // 设置窗体大小，这个数值单位代表像素点
        frame.setSize(500, 800);
        // 修改窗体关闭模式,通过ctrl查源码来输入。（如果api解释不清楚，就查看源码）
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setTitle("这是一个普通的窗体");

        // 设置窗体可见，一定要放到最后，所有都可见后再设置窗体
        frame.setVisible(true);


    }
}
