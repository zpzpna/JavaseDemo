package cn.edu.hit.stonepuzzle;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {
    /*为什么用这个类继承JFrame，因为JFrame功能固定，不能移动重置，我们需要添加功能*/
    private int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}

    };

    private int[][] win = {/*避免每次判断胜利都创建*/
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}};
    private int row;
    private int col;

    /*重点：一个类既可以是当前类对象又可以是实现类对象*/
    public MainFrame() {
        /*通过this和super使用类对象，通过本类实现接口，this又变成实现类对象*/
        this.addKeyListener(this);
        createFrame();
        shuffleData();
        paintPicture();
        setVisible(true);
    }


    /*用到面向对象后，原本要返回的数据，要么作为成员变量，如data，
     * 要么就是父类继承下来，可以直接用里面方法，不用创变量，或者用super调用
     *
     * 注意：区分使用本类创建对象的方法，和本类对象要操作的方法
     * 什么意思：
     * 在本类中，使用this，super，或者默认使用父类方法在本类的非静态方法时，本身就代表使用本类的对象或者父类的对象操作，也就是说
     * 在类的非静态方法中，默认已经有了本类或者子类对象*/
    private void createFrame() {
        /*注意：在这个方法中，默认了存在对象并使用方法，所以直接用父类方法进行了操作*/

        setSize(514, 595);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("石头迷阵单机版V1.0");

        setAlwaysOnTop(true); // 最重要的东西，窗体置顶，代表不管我点什么别的东西，他都不会被覆盖，除非我主动让他隐藏
        setLocationRelativeTo(null); // 传入null自动设置窗体居中

        setLayout(null);

    }

    private void paintPicture() {

        /*更新数据，首先删除所有原数据*/
        this.getContentPane().removeAll();

        if (isVectory()) {
            /*必须一开始就加载，因为数据显示后加入会在底下
             *
             * 本质上，代表最后一次刷新时，移动和胜利标志同时出现*/
            JLabel vicImg = new JLabel(new ImageIcon("E:\\picturesForCode\\end\\win.png"));
            vicImg.setBounds(124, 230, 266, 88);
            getContentPane().add(vicImg);
        }


        /*重新开始：
         * 用一个按钮监听就行*/
        JButton btn = new JButton("重新开始");
        btn.setFocusable(false);
        btn.setBounds(350, 20, 100, 20);
        getContentPane().add(btn);
        btn.addActionListener(e -> {
            shuffleData();
            paintPicture();
        });
        /*初始化数据和图片重点：
         * 加入图片时，循环加入，但是难以设置加入哪一张，使用对应数组存放序号，接着用序号做字符串连接组成图片
         *
         * 这个存储显示图片的东西，通过改变里面数字的顺序，然后重新刷新一遍界面，从而实现移动的效果
         * */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel labelImg = new JLabel(new ImageIcon("E:\\picturesForCode\\icon\\stone\\" + data[i][j] + ".png"));
                labelImg.setBounds(50 + j * 100, 90 + i * 100, 100, 100);
                super.getContentPane().add(labelImg);
                /*一定要注意先get面板对象再add*/
            }
        }

        JLabel labelImg = new JLabel(new ImageIcon("E:\\picturesForCode\\backGroud\\background.png"));
        labelImg.setBounds(26, 30, 450, 484);
        getContentPane().add(labelImg);

        /*每次更新，删除和重新添加数据后，要用刷新函数刷新目前显示的窗体*/
        this.getContentPane().repaint();

    }

    private boolean isVectory() {
        return Arrays.deepEquals(data, win);
        /*数组比较也是对象*/
    }

    private void shuffleData() {
        /*本质上这个shuffle是通过对每个位置都随机交换一次位置进行打乱*/
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                swap(data, i, j, randomX, randomY);
                /*如果用异或，会出现两个0空位？这个bug回去想想*/
            }
        }
        end:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (0 == data[i][j]) {
                    row = i;
                    col = j;
                    break end;
                    /*标签只能紧贴循环上
                     * break 标签会破坏到对应标签循环为止*/
                }
            }
        }
    }

    /*适配器是自己这个类*/
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        move(e);
        paintPicture();// 重新加载和刷新图片
    }

    private void move(KeyEvent e) {
        /*业务的本质：
         * 就是先底层对数据做操作，然后通过控制画面的代码删去所有原来数据，重新添加和刷新
         *
         * 更改底层数据的代码和修改显示的代码是分开的，最后在一个高级函数中顺序执行*/
        if (isVectory()) {
            /*用来防止胜利之后继续修改移动的东西
             *
             * 停止底层使用的函数，让他一开始就返回空就行*/
            return;
        }
        switch (e.getKeyCode()) {

            case 37:
                if (col > 0) {
                    swap(data, row, col, row, col - 1);
                    col--;
                }
                break;
            case 38:
                if (row > 0) {
                    swap(data, row, col, row - 1, col);
                    row--;
                }
                break;
            case 39:
                if (col < 3) {
                    swap(data, row, col, row, col + 1);
                    col++;
                }
                break;
            case 40:
                if (row < 3) {
                    swap(data, row, col, row + 1, col);
                    row++;
                }
                break;
            case ' ':
                data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                row = 3;
                col = 3;
        }
    }

    private void swap(int[][] arr, int row1, int col1, int row2, int col2) {
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}