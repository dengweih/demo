package com.java.test;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main1 extends JFrame {
    static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        Point p = new Point(0,0);
        p.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                boolean flag = true;
                switch (key){
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
                    System.out.println("移动, 当前坐标为：(" + x + ","+ y + ")");
                }
            }
        });
    }

    class Spot implements Runnable , KeyListener {
        Point p;


        @Override
        public void run() {
            synchronized (this){
                while (true){
//                    p.move();
                }

            }
        }
        void move(){

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    static class Point extends JFrame{
        int x;
        int y;
        int vol;
        Point(int x, int y){
            this.x = x;
            this.y = y;
            this.vol = 1;
        }
        void setVol(int vol){
            this.vol = vol;
        }
        void move(KeyEvent e){
            int key = e.getKeyCode();
            boolean flag = true;
            switch (key){
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
                System.out.println("移动, 当前坐标为：(" + x + ","+ y + ")");
            }
        }
    }
}
