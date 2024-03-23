package com.example.game.model.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    // Things the main game needs
    UI ui = new UI();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    PageManager pageManager = new PageManager(ui);
    Story story = new Story(this, ui, pageManager);

    // Sets up position statements for transition on button click in Story Class
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;


    public static void main(String[] args){
        // Start new game
        new Game();
    }
    public Game() {
        ui.createUI(choiceHandler); // Controls the button responses from UI
        story.defaultStats(); // Access stats from Story Class
        pageManager.showTitleScreen(); // Default start is Title screen
    }

    // Choicehandler is responsible for choice mecahnic,
    // takes position from story choice to selectPosition method in story to call correct method.
    public class ChoiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String playerChoice = event.getActionCommand();

            switch(playerChoice){
                case "START": pageManager.titleToTown(); story.enterOakridge(); break; // When start button pressed, show Game screen
                case "c1": story.selectPosition(nextPosition1); break; // Links choices made in Story class to these buttons
                case "c2": story.selectPosition(nextPosition2); break;
                case "c3": story.selectPosition(nextPosition3); break;
                case "c4": story.selectPosition(nextPosition4); break;

            }
        }

    }

}
