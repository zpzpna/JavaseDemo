package cn.edu.hit.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerDemo {
    /*监听键盘的所有字符*/
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn = new JButton();
        btn.setBounds(0, 0, 100, 100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点了");
            }
        });
        /*焦点：
         * JFrame会自动将焦点放在创建出来的按钮，导致按了按钮后窗体监听没有反应
         * 因此需要按钮提前将焦点释放*/
        btn.setFocusable(false);
        frame.add(btn);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                /*这个只能监听字母和数字等常规案件，
                 * fn，ctrl，ecs，上下左右听不到
                 * fn,ctrl,ecs,上下左右听不到*/
                System.out.println("键入了");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case 37:
                        System.out.println("左方向");
                        break;
                    case 38:
                        System.out.println("上方向");
                        break;
                    case 39:
                        System.out.println("右方向");
                        break;
                    case 40:
                        System.out.println("下方向");
                        break;
                    default:
                        System.out.println("随便点的");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("这是松开来");
            }
        });

        frame.setVisible(true);
    }
}
