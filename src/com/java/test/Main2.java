package com.java.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main2 extends JFrame {
    int redis = 10;
    public static void main(String[] args) {
        MyPanel mp = new MyPanel();
        Main2 o = new Main2();
//        o.add(mp);
        o.addKeyListener(mp);
        o.setTitle("title");
        o.getContentPane().setBackground(Color.black);
        o.setSize(600, 600);
        o.setVisible(true);
        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("end");

        mp.setSize(10, 20);
        mp.setLocation(100, 200);
        mp.setBackground(Color.yellow);

        o.add(mp);
        o.setLayout(null);
//        o.getContentPane().setBackground(Color.black);
    }



    static class MyPanel extends JPanel implements KeyListener{
        int x = 10;
        int y = 10;

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.red);
            g.drawRect(x, y, 20, 20);
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int i = e.getKeyCode();
            boolean flag = true;
            switch (i){
                case KeyEvent.VK_LEFT:
                    x--;
                    break;
                case KeyEvent.VK_UP:
                    y++;
                    break;
                case KeyEvent.VK_DOWN:
                    y--;
                    break;
                case KeyEvent.VK_RIGHT:
                    x++;
                    break;
                default: flag = false;
            }
            if (flag){
                repaint();
                System.out.println("移动, 当前坐标为：(" + x + ","+ y + ")");
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
