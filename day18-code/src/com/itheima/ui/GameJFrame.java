package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameJFrame extends JFrame implements MouseListener {
    int[][] data = new int[4][4];
    //创建按钮
    JButton jtb = new JButton("点我啊");

    public GameJFrame(){
        initJFrame();

        initJMenuBar();
        
        initData();
        
        initImage();

    }

    private void initData() {
        //打乱一维数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] temp = new int[16];
        for (int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random()*arr.length);
            int temp1 = arr[i];
            arr[i] = arr[index];
            arr[index] = temp1;
        }
        //存放到二维数组

        for (int i = 0; i < arr.length; i++) {
            data[i/4][i%4] = arr[i];
        }

    }

    private void initImage() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建JLable对象
                JLabel jlable = new JLabel(new ImageIcon("day18-code\\image\\animal\\animal3\\"+number+".jpg"));
                //指定图片位置
                jlable.setBounds(105*j+83,105*i+134,105,105);

                //给图片添加边框
                jlable.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器加入到窗口
                this.getContentPane().add(jlable);
            }
        }

        //创建背景图片
        JLabel background = new JLabel(new ImageIcon("day18-code\\image\\background.png"));

        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
    }

    private void initJMenuBar() {
        //初始化菜单
        JMenuBar jmenuBar = new JMenuBar();

        //创建功能:功能 关于我们

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建下面的条目
        JMenuItem replayJMenu = new JMenuItem("重新游戏");
        JMenuItem reLoginJMenu = new JMenuItem("重新登录");
        JMenuItem closeJMenu = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayJMenu);
        functionJMenu.add(reLoginJMenu);
        functionJMenu.add(closeJMenu);

        aboutJMenu.add(accountItem);

        jmenuBar.add(functionJMenu);
        jmenuBar.add(aboutJMenu);


        this.setJMenuBar(jmenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);

        this.setTitle("拼图游戏单机V1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);

        //取消图片居中放置
        this.setLayout(null);


        jtb.setBounds(0,0,100,50);
        jtb.addMouseListener(this);
        this.getContentPane().add(jtb);


        this.setVisible( true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下了");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("抬起了");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
