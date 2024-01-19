package cn.edu.hit.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo {
    /*ActionListener 动作监听
     * 监听鼠标点击和空格*/

    /*这里事件源是Button,只要鼠标或者空格点击就会有反应*/
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn = new JButton("你敢点我？");
        btn.setBounds(0, 0, 100, 100);
        frame.getContentPane().add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了呜呜呜");
            }
        });

        frame.setVisible(true);
    }
}
