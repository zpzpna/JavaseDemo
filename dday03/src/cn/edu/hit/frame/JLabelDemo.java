package cn.edu.hit.frame;

import javax.swing.*;

public class JLabelDemo {
    /*Jlabel组件：展示文本和图片
     *
     * 构造方法：
     * JLabel(String text)
     * JLabel(Icon image)*/
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50, 50, 100, 100);
        JLabel jl2 = new JLabel("如听一席话");
        jl2.setBounds(150, 50, 100, 100);

        frame.getContentPane().add(jl1);
        frame.getContentPane().add(jl2);

        /*JLabel展示图片
         * Icon是一个接口，需要用一个实现对象来实现*/
        JLabel imgLabel1 = new JLabel(new ImageIcon("E:\\picturesForCode\\icon\\stone\\1.png"));
        imgLabel1.setBounds(50, 150, 100, 100
        );
        frame.add(imgLabel1);
        /*图片展示不全：
         * 说明像素容量不够，先查看图片的像素大小，然后设置宽和高*/

        /*多个东西位置重叠：
         * 第一个组件放在最上方，后添加的组件放在底部*/
        frame.setVisible(true);


    }
}
