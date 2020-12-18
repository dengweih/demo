package com.java.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Driver extends JFrame implements KeyListener {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("My Frame");
//        frame.setSize(600, 600);
//        frame.setLocation(200, 100);
//        frame.getContentPane().setBackground(Color.black);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Driver frame = new Driver();

        JPanel contentPane = new JPanel();
        contentPane.setSize(10 , 10);

        contentPane.setLocation(100, 100);
        contentPane.setBackground(Color.yellow);
        frame.add(contentPane);
        //不加上这一句设置布局，contentPanel会铺满整个frame
        frame.setLayout(null);

        contentPane.repaint();


    }
    int x = 200;
    int y = 100;
    Driver(){
        this.setSize(600, 600);
        this.setLocation(x, y);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("down");
            x += 10;
            y += 10;
//            this.setLocation(x, y);
            repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
