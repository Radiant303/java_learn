package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int[4][4];

    //记录空白方块移动的坐标
    int x = 0;
    int y = 0;

    String path = "day18-code\\image\\animal\\animal3\\";

    int[][] win = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //统计步数
    int step = 0;
    //创建按钮
    JButton jtb = new JButton("点我啊");

    //创建下面的条目
    JMenuItem replayJMenu = new JMenuItem("重新游戏");
    JMenuItem reLoginJMenu = new JMenuItem("重新登录");
    JMenuItem closeJMenu = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    public GameJFrame(){
        initJFrame();

        initJMenuBar();
        
        initData();
        
        initImage();

    }


    private void initData() {
        //打乱一维数组
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] temp = new int[16];
        for (int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random()*arr.length);
            int temp1 = arr[i];
            arr[i] = arr[index];
            arr[index] = temp1;
        }
        //存放到二维数组

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                x = i/4;
                y = i%4;
            }
            data[i/4][i%4] = arr[i];

        }

    }

    private void initImage() {
        this.getContentPane().removeAll();
        if (victory()){
            JLabel winJLable = new JLabel(new ImageIcon("day18-code\\image\\win.png"));
            winJLable.setBounds(203,283,197,73);
            this.getContentPane().add(winJLable);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建JLable对象
                JLabel jlable = new JLabel(new ImageIcon(path+number+".jpg"));
                //指定图片位置
                jlable.setBounds(105*j+83,105*i+134,105,105);

                //给图片添加边框
                jlable.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器加入到窗口
                this.getContentPane().add(jlable);
            }
        }

        //加载步数
        JLabel stepJLable = new JLabel("步数"+step);
        stepJLable.setBounds(50,30,100,20);
        this.getContentPane().add(stepJLable);

        //创建背景图片
        JLabel background = new JLabel(new ImageIcon("day18-code\\image\\background.png"));

        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        this.repaint();   // 让整个窗口重绘
    }

    private void initJMenuBar() {
        //初始化菜单
        JMenuBar jmenuBar = new JMenuBar();

        //创建功能:功能 关于我们

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");



        functionJMenu.add(replayJMenu);
        functionJMenu.add(reLoginJMenu);
        functionJMenu.add(closeJMenu);

        aboutJMenu.add(accountItem);

        jmenuBar.add(functionJMenu);
        jmenuBar.add(aboutJMenu);

        //给条目绑定事件
        replayJMenu.addActionListener(this);
        reLoginJMenu.addActionListener(this);
        closeJMenu.addActionListener(this);
        accountItem.addActionListener(this);

        this.setJMenuBar(jmenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);

        this.setTitle("拼图游戏单机V1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);

        //取消图片居中放置
        this.setLayout(null);//绝对布局

        this.addKeyListener(this);
        this.setVisible( true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //创建背景图片
            JLabel background = new JLabel(new ImageIcon("day18-code\\image\\background.png"));

            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();   // 让整个窗口重绘

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory())return;
        int code = e.getKeyCode();
        //左:37 上:38 右:39 下:40
        if(code == 37){
            if (y == 3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            step++;
            initImage();
        }else if(code == 38){
            if (x == 3){
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        }else if(code == 39){
            if (y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            step++;
            initImage();
        }else if(code == 40){
            if (x == 0){
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }
    //判断data中数据是否与win相同
    public boolean victory(){
        for (int i = 0; i < win.length; i++) {
            for (int j = 0; j < win[i].length; j++) {
                if (win[i][j] != data[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayJMenu){
            //重新开始游戏
            step = 0;
            this.initData();
            this.initImage();

        }else if (source == reLoginJMenu){
            //重新登录
            this.setVisible(false);//销毁当前窗口
            new LoginJFrame();
        }else if (source == closeJMenu){
            //关闭游戏
            System.exit(0);
        }else if (source == accountItem){
            //创建弹框对象
            JDialog jDialog = new JDialog();
            jDialog.setTitle("公众号");

            JLabel jLabel = new JLabel(new ImageIcon("day18-code/image/about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(350,350);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);//弹窗必须关闭才能后续操作
            jDialog.setVisible(true);

        }
    }
}
