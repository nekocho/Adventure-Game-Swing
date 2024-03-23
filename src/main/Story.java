package com.example.game.model.main;

import com.example.game.model.items.WeaponKnife;
import com.example.game.model.items.WeaponLongSword;

public class Story {

//    Story uses the Game class, UI and Page manager
    Game game;
    UI ui;
    PageManager pageManager;
    Player player = new Player();

    public Story(Game gameG, UI userInterface, PageManager pManager){
        // Story class uses all 3 classes

        game = gameG;
        ui = userInterface;
        pageManager = pManager;
    }

    public void defaultStats(){
        // Player default stats
        player.hp = 10;
        ui.hpNumberLabel.setText("" + player.hp);

        player.currentWeapon = new WeaponKnife();
        ui.weaponNameLabel.setText(player.currentWeapon.name);

        player.coin = 100;
        ui.coinNumberLabel.setText("" + player.coin);
    }

    public void selectPosition(String nextPosition){
        switch(nextPosition){
            case "enterOakridge": enterOakridge(); break;
            case "talkToBaker": talkToBaker(); break;
            case "attackBaker": attackBaker(); break;
            case "lookAroundOakridge": lookAroundOakridge(); break;
            case "enterTavern": enterTavern(); break;
            case "talkToBarkeep": talkToBarkeep(); break;
            case "sitAtTable": sitAtTable(); break;
            case "missingPeople": missingPeople(); break;
            case "bookRoom": bookRoom(); break;
            case "buyAle": buyAle(); break;
            case "findWeapon": findWeapon(); break;
            case "searchRoom": searchRoom(); break;
            case "chillRoom": chillRoom(); break;
            case "leaveRoom": leaveRoom(); break;
            case "endDay": endDay(); break;

        }

    }

    public void enterOakridge(){
        ui.mainTextArea.setText("It's a bright sunny day when you enter Oakridge, a small humble village.  \nThe smell of fresh bread fills the air as you walk past the baker. \nLooking around you notice that everyone looks really tense... \n\n What do you do?");
        ui.choice1.setText("Talk to the baker");
        ui.choice2.setText("Look around");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "talkToBaker";
        game.nextPosition2 = "lookAroundOakridge";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void talkToBaker(){
        ui.mainTextArea.setText("You approach the baker and he looks up. You notice a Tavern next door. You ask him why everyone is so tense and he responds: \n'Someone's been causing trouble, people going missing... got everyone scared' \n\n What do you do?");
        ui.choice1.setText("Thank him and leave");
        ui.choice2.setText("Go to the Tavern");
        ui.choice3.setText("Attack Baker");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "enterOakridge";
        game.nextPosition2 = "enterTavern";
        game.nextPosition3 = "attackBaker";
        game.nextPosition4 = "";
    }

    public void attackBaker(){
        ui.mainTextArea.setText("As you draw your weapon, a guard nearby attacks you. \n\n(You take 3 damage)");
        player.hp = player.hp - 3; // Reduce player health
        ui.hpNumberLabel.setText("" + player.hp); // Update player health number display
        ui.choice1.setText("Leave");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "enterOakridge";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void lookAroundOakridge(){
        ui.mainTextArea.setText("You see a few people buying bread from the baker, next to the bakery is a Tavern. \nNothing else really stands out.");
        ui.choice1.setText("Go to the Tavern");
        ui.choice2.setText("Talk to the Baker");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "enterTavern";
        game.nextPosition2 = "talkToBaker";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void enterTavern(){
        ui.mainTextArea.setText("The Tavern is small but friendly, a barkeep is quietly observing you while cleaning a glass at the bar. \nThere are a few tables and chairs around. \n\nWhat do you do?");
        ui.choice1.setText("Talk to the Barkeep");
        ui.choice2.setText("Grab a seat at the table");
        ui.choice3.setText("Leave");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "talkToBarkeep";
        game.nextPosition2 = "sitAtTable";
        game.nextPosition3 = "enterOakridge";
        game.nextPosition4 = "";
    }

    public void talkToBarkeep(){
        ui.mainTextArea.setText("'How's your day going? new here?' \n\nWhat do you do?");
        ui.choice1.setText("Ask about the town");
        ui.choice2.setText("Ask for a room");
        ui.choice3.setText("Ask for an Ale (5 coins)");
        ui.choice4.setText("Leave");

        // Sets next positions on button click
        game.nextPosition1 = "missingPeople";
        game.nextPosition2 = "bookRoom";
        game.nextPosition3 = "buyAle";
        game.nextPosition4 = "enterOakridge";

    }

    public void sitAtTable(){
        ui.mainTextArea.setText("You sit at the nearest table. The barkeep approaches and asks if you'd like a drink. \n\nWhat do you do?");
        ui.choice1.setText("Ask about the Town");
        ui.choice2.setText("Ask for a room");
        ui.choice3.setText("Ask for an Ale (5 coins)");
        ui.choice4.setText("Get up and leave");

        // Sets next positions on button click
        game.nextPosition1 = "missingPeople";
        game.nextPosition2 = "bookRoom";
        game.nextPosition3 = "buyAle";
        game.nextPosition4 = "enterOakridge";
    }

    public void missingPeople(){
        ui.mainTextArea.setText("'The people are friendly but something darker is happening, people are going missing... everyone's scared. There's a rumour of someone calling themselves The Illusionist that's causing these disappearances...' \n\nWhat do you do?");
        ui.choice1.setText("Buy another Ale (5 coins)");
        ui.choice2.setText("Ask for a room");
        ui.choice3.setText("Thank him and Leave");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "buyAle";
        game.nextPosition2 = "bookRoom";
        game.nextPosition3 = "enterOakridge";
        game.nextPosition4 = "";

    }

    public void buyAle(){
        ui.mainTextArea.setText("The barkeep brings you your Ale (-5 coins) \n\n What do you want to do?");
        player.coin = player.coin - 5; // Reduce player coin by 5
        ui.coinNumberLabel.setText("" + player.coin); // Update coin number display each time
        ui.choice1.setText("Talk to the barkeep");
        ui.choice2.setText("Buy another Ale (5 coins)");
        ui.choice3.setText("Leave");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "talkToBarkeep";
        game.nextPosition2 = "buyAle";
        game.nextPosition3 = "enterOakridge";
        game.nextPosition4 = "";
    }

    public void bookRoom() {
        ui.mainTextArea.setText("The barkeep takes you to your room. \n\nWhat do you do?");
        ui.choice1.setText("Search Room");
        ui.choice2.setText("Leave Room");
        ui.choice3.setText("Rest for the day");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "searchRoom";
        game.nextPosition2 = "leaveRoom";
        game.nextPosition3 = "endDay";
        game.nextPosition4 = "";
    }

    public void searchRoom(){
        ui.mainTextArea.setText("Searching a room, you notice a loose floorboard. \n\nWhat do you do?");
        ui.choice1.setText("Lift it up");
        ui.choice2.setText("Leave it alone");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "findWeapon";
        game.nextPosition2 = "chillRoom";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void findWeapon(){
        ui.mainTextArea.setText("Under the floorboard you find a Long Sword! (Obtained a Long Sword)");
        player.currentWeapon = new WeaponLongSword(); //change weapon from knife to long sword
        ui.weaponNameLabel.setText(player.currentWeapon.name); //set weapon name label in UI to new weapon
        ui.choice1.setText("Next");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "chillRoom";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void chillRoom(){
        ui.mainTextArea.setText("The room is simple and cosy, there is a bed, a small table and chair and an empty wardrobe to store your clothes. \n\nWhat would you like to do?");
        ui.choice1.setText("Leave the room");
        ui.choice2.setText("Rest for the Day");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // Sets next positions on button click
        game.nextPosition1 = "leaveRoom";
        game.nextPosition2 = "endDay";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void leaveRoom(){

    }

    public void endDay(){

    }



    }
