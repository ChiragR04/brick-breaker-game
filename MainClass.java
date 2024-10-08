/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brick_breaker_game_final1;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.util.Scanner.*;
/**
 *
 * @author DELL
 */
public class MainClass {
    public static void main(String[] args)
    {
        String username = JOptionPane.showInputDialog(null, "Enter your name:", "Player Name", JOptionPane.INFORMATION_MESSAGE);

        // If user clicks Cancel or closes the dialog, playerName will be null
        if (username == null || username.trim().isEmpty()) {
            username = "Player"; // Default name if none provided
        }
        
        JFrame obj=new JFrame();
        
        GamePlay gamePlay=new GamePlay(username);
        obj.setBounds(10,10,700,600);
        obj.setTitle("BRICK BLAST BLITZ");
        
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        Font titleFont = new Font("Verdana", Font.BOLD, 20);
        obj.setFont(titleFont);
        gamePlay.startGame();
    }
    
}