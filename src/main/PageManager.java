package com.example.game.model.main;

public class PageManager {

    UI ui;
    public PageManager(UI userInterface){
        ui = userInterface;
    }


    public void showTitleScreen(){

        // Show title screen
        ui.titleNamePanel.setVisible(true); // Show Title Name
        ui.startButtonPanel.setVisible(true); //Show Start Button

        // Hide game screen stuff
        ui.mainTextPanel.setVisible(false); // Hide main text panel
        ui.choiceButtonPanel.setVisible(false); // Hide Choices
        ui.playerPanel.setVisible(false); //Hide Player stats

    }

    public void titleToTown(){

        // Hide title screen
        ui.titleNamePanel.setVisible(false); // Hide Title
        ui.startButtonPanel.setVisible(false); // Hide start button

        // Show game screen stuff
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }

}
