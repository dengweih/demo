package com.java.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main3 {
    public static void main(String[] args) {
        KeyListener k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("112");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

    }
}
