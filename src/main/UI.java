package com.example.game.model.main;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel; // Set spaces for objects
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel, coinLabel, coinNumberLabel; // Text labels
    Font titleFont = new Font("Monospaced", Font.PLAIN, 35);
    Font normalFont = new Font("Monospaced", Font.PLAIN, 28);
    Font smallFont = new Font("Monospaced", Font.PLAIN, 18);

    Font smallerFont = new Font("Monospaced", Font.PLAIN, 13);
    JButton startButton, choice1, choice2, choice3, choice4; // Buttons
    JTextArea mainTextArea; // Text specific area
    public void createUI(Game.ChoiceHandler choiceHandler){
        // Window set up for app
        window = new JFrame();
        window.setSize(800, 600); // Sets size of window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes sure the window will close properly
        window.getContentPane().setBackground(Color.black); // Sets background colour of window
        window.setLayout(null); // Use BorderLayout

        con = window.getContentPane();

        // TITLE SCREEN

        // Title panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 250);
        titleNamePanel.setBackground(Color.black); // Title box background colour
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white); // Title Text colour
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel); // Add title to title box
        con.add(titleNamePanel);

        // Start Button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 300, 200, 75);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("START");
        startButtonPanel.add(startButton);
        con.add(startButtonPanel); // Add button panel to the center of the window

        // GAME SCREEN

        // Text area
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Place holder text for main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(smallFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        // Multiple choice options
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(choiceButtonPanel);

        // Buttons
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.black);
        choice1.setFont(smallerFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.black);
        choice2.setFont(smallerFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.black);
        choice3.setFont(smallerFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.black);
        choice4.setFont(smallerFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        // Player stats

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        window.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setForeground(Color.white);
        hpLabel.setFont(smallerFont);
        playerPanel.add(hpLabel);

        hpNumberLabel = new JLabel();
        hpNumberLabel.setForeground(Color.white);
        hpNumberLabel.setFont(smallerFont);
        playerPanel.add(hpNumberLabel);

        coinLabel = new JLabel("Coin: ");
        coinLabel.setForeground(Color.white);
        coinLabel.setFont(smallerFont);
        playerPanel.add(coinLabel);

        coinNumberLabel = new JLabel();
        coinNumberLabel.setForeground(Color.white);
        coinNumberLabel.setFont(smallerFont);
        playerPanel.add(coinNumberLabel);

        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(smallerFont);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(smallerFont);
        playerPanel.add(weaponNameLabel);



        window.setVisible(true); // Make the window visible after adding components
    }
}
