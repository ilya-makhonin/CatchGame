package com.catching.game;

import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Image;

public class GameWindow extends JFrame {
    private static GameWindow gameWindow;
    private static Image background;
    private static Image gameOver;
    private static Image drop;
    private static String resource;

    public static void main(String[] args) {
        try {
            initialImages();
        } catch (IOException error) {
            
        }
        
        GameField gameField = new GameField();
        gameWindow = new GameWindow();

        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200, 100);
        gameWindow.setSize(906, 478);
        gameWindow.setResizable(false);
        gameWindow.add(gameField);
        gameWindow.setVisible(true);
    }

    private static void initialImages() throws IOException {
        resource = "image/";
        background = ImageIO.read(new FileInputStream(resource + "background.png"));
        gameOver = ImageIO.read(new FileInputStream(resource + "game_over.png"));
        drop = ImageIO.read(new FileInputStream(resource + "drop.png"));
    }

    private static void onRepaint(Graphics g) {
        g.drawImage(background, 0, 0, null);
        g.drawImage(drop, 100, 100, null);
        g.drawImage(gameOver, 280, 120, null);
    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}
