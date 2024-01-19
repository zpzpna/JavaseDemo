package cn.edu.hit.frame;

import javax.swing.*;

public class JButtonDemo {
    public static void main(String[] args) {
        /*窗体-面板-组件：
         * 组件放在面板上，组件是一个个对象如JButton
         *
         * 按钮：
         * JButton()
         * JButton(String text)
         *
         * 获取面板对象+添加组件
         * 窗体对象.getContentPane().add(组件)
         * 用窗体对象获取对应的面板对象，然后添加组件
         *
         * 组件设置具体流程：
         * 1.窗体对象取消默认布局
         * 2.创建组件对象
         * 3.设置位置
         * 4.面板对象添加组件*/

        JFrame frame = new JFrame();
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*窗体中存在默认布局，取消掉才能自己设置细节
         *
         * 如果取消了默认布局，就必须要自己设置组件的摆放位置,
         * frane取消默认布局，然后按钮自己设置位置*/

        frame.setLayout(null);

        JButton btn = new JButton("是真男人就来点我");
        btn.setBounds(50, 50, 100, 100);
        frame.getContentPane().add(btn);// 可以用Container类获取这个面板对象

        frame.setVisible(true);
    }
}
