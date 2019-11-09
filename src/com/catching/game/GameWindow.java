package com.catching.game;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GameWindow extends JFrame {
    private static GameWindow gameWindow;

    public static void main(String[] args) {
        gameWindow = new GameWindow();

        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200, 100);
        gameWindow.setSize(906, 478);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
    }
}