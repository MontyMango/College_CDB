package Exam1;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    private static PlayerCharacter Player = set_up();
    private static PlayerAction Player_do = new PlayerAction(Player);
    private static Enemies enemy = new Enemies();

    private static fight battle = new fight(Player, Player_do, enemy);

    // Path for lore things
    private static int path = 0;

    public static void main (String[] args) {
        while(Player.check_if_alive()) {
            if (path == 0) { set_up_lore(); }
            else if (path == 1) { after_set_up_lore(); }
            else if (path == 2) { display_menu(); }
            else if (path == 3) { endgame(); }
            else if (path == 4) { end(); }
            else if (path == 5) { actual_end(); }
            else    { break; }
        }
        System.out.println("Thanks for playing!");
    }



    static void display_menu()   {
        int choice;
        System.out.println("\nMenu");
        System.out.println("*****************");
        System.out.println("1. Move");
        System.out.println("2. Show full map");
        System.out.println("3. Check stats");
        if (battle.getAutoFight() == false) {
            System.out.println("4. Turn on auto fight");
        }
        else    {
            System.out.println("4. Turn off auto fight");
        }
        System.out.println("5. Set facing location");
        System.out.println("*****************");


        System.out.print("\nYour choice: ");
        choice = input.nextInt();

        if (choice == 1) {
            move_menu();
        }
        else if (choice == 2) {
            Player_do.show_map();
        }
        else if (choice == 3) {
            System.out.println("Name: " + Player.get_player_name());
            System.out.println("Class: " + Player.get_player_class());
            System.out.println("HP: " + Player.getHP());
            System.out.println("Armor: " + Player.getArmor());
            System.out.println("Facing location: " + Player.getPlayer_facing());
        }
        else if (choice == 4)   {
            battle.setAutoFight();
        }
        else if (choice == 5)   {
            Player_do.facing();
        }
        else    {
            System.out.println("\n! - That option doesn't exist!\n");
        }
    }

    static void move_menu() {
        int movement;

        Player_do.show_mini_map();
        System.out.println("Where would you like to move?\n");

        // Displays the choices and moves depending on class
        switch (Player.get_player_class()) {
            case "Mage":
                System.out.println("  1  2  3  ");
                System.out.println("  4  _  5  ");
                System.out.println("  6  7  8  ");

                do {
                    System.out.print("\n Move: ");
                    movement = input.nextInt();
                } while (movement < 1 || movement > 8);

                switch (movement) {
                    case 1: // Up-Left
                        Player_do.move(1, -1);
                        break;
                    case 2: // Up
                        Player_do.move(1, 0);
                        break;
                    case 3: // Up-Right
                        Player_do.move(1, 1);
                        break;
                    case 4: // Left
                        Player_do.move(0, -1);
                        break;
                    case 5: // Right
                        Player_do.move(0, 1);
                        break;
                    case 6: // Down-Left
                        Player_do.move(-1, -1);
                        break;
                    case 7: // Down
                        Player_do.move(-1, 0);
                        break;
                    default: // Down-Right
                        Player_do.move(-1, 1);
                        break;
                }
                break;

            case "Rogue":
                System.out.println("[\\] 1 [\\]");
                System.out.println(" 2  _  3  ");
                System.out.println("[\\] 4 [\\]");

                do {
                    System.out.print("\n Move: ");
                    movement = input.nextInt();
                } while (movement < 1 || movement > 4);

                switch (movement) {
                    case 1: // Up
                        Player_do.move(1, 0);
                        Player_do.move(1, 0);
                        break;
                    case 2: // Left
                        Player_do.move(0, -1);
                        Player_do.move(0, -1);
                        break;
                    case 3: // Right
                        Player_do.move(0, 1);
                        Player_do.move(0, 1);
                        break;
                    default: // Down
                        Player_do.move(-1, 0);
                        Player_do.move(-1, 0);
                        break;
                }
                break;

            case "Warrior":
                System.out.println("[\\] 1 [\\]");
                System.out.println(" 2  _  3  ");
                System.out.println("[\\] 4 [\\]");

                do {
                    System.out.print("\n Move: ");
                    movement = input.nextInt();
                } while (movement < 1 || movement > 4);

                switch (movement) {
                    case 1: // Up
                        Player_do.move(1, 0);
                        break;
                    case 2: // Left
                        Player_do.move(0, -1);
                        break;
                    case 3: // Right
                        Player_do.move(0, 1);
                        break;
                    default: // Down
                        Player_do.move(-1, 0);
                        break;
                }
                break;
        }

        if(Player_do.check_if_on_question_mark())  {
           path++;
        }

        // Checks for new enemies
        if(enemy.new_zone_spawn())  {
            battle.fight_routine(0);
        }
        else    {
            System.out.println("No new enemies show up...");
        }
    }

    // All game set up methods
    static PlayerCharacter set_up() {
        Scanner input = new Scanner(System.in);
        int chosen_class;
        String Name;

        // Name
        System.out.println("Welcome adventurer! What is your name?");
        System.out.print("Name: ");
        Name = input.nextLine();

        // Class selection
        System.out.println("\n\nNow, please select a class number to get started with your adventure!");
        System.out.println("1. Warrior");
        System.out.println("2. Rogue");
        System.out.println("3. Mage");
        System.out.print("\nYour choice: ");

        chosen_class = input.nextInt();

        while (chosen_class >= 4 || chosen_class <= 0) {
            chosen_class = input.nextInt();
        }

        switch (chosen_class) {
            case 1:
                System.out.println("\nCongratulations for picking the warrior!");
                return new PlayerCharacter(Name, "Warrior");
            case 2:
                System.out.println("\nCongratulations for picking the Rogue!");
                return new PlayerCharacter(Name, "Rogue");
            default:
                System.out.println("\nCongratulations for picking the mage!");
                return new PlayerCharacter(Name, "Mage");
        }
    }

    // Repetitive methods
    static void press_enter_to_continue()   {
        System.out.print("[Press enter to continue]");
        input.nextLine();
        System.out.println("\n\n");
    }

    static int y_or_n_response()  {
        int num;
        System.out.println("\n1. Yes\n2. No\n");
        System.out.print("Choice: ");

        do {
            num = input.nextInt();
        } while(num != 1 && num != 2);
        return num;
    }

    // Story but don't look at it if you didn't play yet!
    static void set_up_lore()   {
        System.out.println("You awake, with no memory, in a small broken household, with an old man reading a book...");
        press_enter_to_continue();

        System.out.println("The old man looks up and then says...\n");
        System.out.println("\"Ahem... Welcome! Uhh... what's your name??? Hmm......\"");
        System.out.println("\nHe looks in his book for you name, and then aggressively turns the pages...");
        System.out.println("Eventually, he finds you name. And then says");
        System.out.println("\"Oh, " + Player.get_player_name() + "! Good morning! So, you have been summoned.");
        System.out.println("Haha... Yes! But this is for a great reason...\"");
        press_enter_to_continue();

        System.out.println("\"You see... Well, you don't see. Uhh... There's these boxes");
        System.out.println("that love to boxnap people, and you are here to stop these boxnappings");
        System.out.println("from happening. Yes? Anyways, here's a map of the facility...\"");
        System.out.println("The old man hands you a map, you grab it and look at it.");
        press_enter_to_continue();

        Player_do.show_map();
        press_enter_to_continue();

        System.out.println("\"I found this map on a dead box. And I think that it's like a facility map?");
        System.out.println("Also there's a question mark (?) on the top. I think that's where the boss is? Not sure...\"");
        press_enter_to_continue();

        System.out.println("When the old man finished talking, a swarm of 3 boxes come in!");
        System.out.println("\"Ah! Uh. What do we do? Wait! Use your weapon! Use your wea-\"");
        press_enter_to_continue();

        System.out.println("The old man got swallowed and taken away by two boxes.");
        System.out.println("I guess he was boxnapped? Not sure... But there is still one box left.");
        System.out.println("There's nothing else I can do, I'm going to have to attack.");
        press_enter_to_continue();

        enemy.spawn_specific(2);
        battle.fight_routine(0);

        path++;
    }

    static void after_set_up_lore()    {
        int first_encounter;

        System.out.println("\"Okay the box is down... Now, I got to find that dumb old man.\"");
        System.out.println("You look at the map and they you hear the echos of the old man.");
        System.out.println("\" ~ come find me at the question mark (?) ~ \"");
        System.out.println("Did you want to question the echos?");
        first_encounter = y_or_n_response();

        if(first_encounter == 1)    {
            System.out.println("\"What do you mean question mark? Also how can you hear me?\"");
            System.out.println("...\n...\n...");
            System.out.println("Okay, he's not responding. I guess it was really an echo.");
            System.out.println("But, it's time to move. We have to find the old man before it's too late.");
        }
        else    {
            System.out.println("You nod, it's time to move. Let's go.");
        }
        press_enter_to_continue();

        path++;
    }

    static void endgame()  {
        int response1;
        System.out.println("You arrive at the question mark...");
        press_enter_to_continue();

        System.out.println("uhm, there's nothing? what happened now?");
        System.out.println("\"Hello? HELLO???\"");
        System.out.println("As you probably predicted, the ground shakes and a box appears!");
        System.out.println("This was no regular box. This was the mother of all boxes!");
        System.out.println("\"Hey! " + Player.get_player_name() + "! I'm up here!\"");
        press_enter_to_continue();

        System.out.println("You look up and the old man was in cardboard shackles on the top of the box.");
        System.out.println("You say \"Couldn't you just break your shackles?\"");
        System.out.println("The box replies \"Don't give him any ideas\"");
        System.out.println("The mother of all boxes raises her voice and says...");
        System.out.println("Greetings " + Player.get_player_class() + "! Are you sure that you want to fight my army?");
        response1 = y_or_n_response();


        enemy.spawn_specific(5);
        if(response1 == 1)  {
            System.out.println("Okay good! Let's fight!");
            battle.fight_routine(1);
        }
        else    {
            System.out.println("\"Oh... Okay... Uh... I wasn't expecting that response... Uhh...\"");
            battle.fight_routine(1);
        }

        path++;
    }

    static void end()   {
        System.out.println("The cardboard crumbles! Everything falls to the ground.");
        System.out.println("You look up and the top of the place pour in with water.");
        System.out.println("This water makes the cardboard weak and break away.");
        press_enter_to_continue();

        System.out.println("You see the old man on the ground. You run over and see that he's alive.");
        System.out.println("He says \"Thank you... Thank you...\" But nothing else...");
        System.out.println("You see your body fading away as you teleport to another place.");
        System.out.println("\"No problem old man...\" You look towards the sky.");
        press_enter_to_continue();

        System.out.println("You feel someone grab your arm. You look over and it was the old man.");
        System.out.println("You ask \"Do you need~\" and then you got teleported back to your place.");
        press_enter_to_continue();

        System.out.println("You see the old man still grabbing your arm, you pushed him away from your arm.");
        System.out.println("You asked \"What do you want?\" He takes his cane and then tries to smack you!");
        System.out.println("\"What is wrong with you?\" He replies \"Oh... Haha-ha. " + Player.get_player_name() + ". You didn't know?");
        System.out.println("I am part of the box army.\" Oh no, this guy turned out to be evil...");
        press_enter_to_continue();

        // Spawn the man and fight him
        enemy.spawn_specific(6);
        battle.fight_routine(1);
        path++;
    }

    static void actual_end()    {
        System.out.println("The old man hits the floor knocked out.");
        System.out.println("You sign and picked him up to take him to your teleporter.");
        System.out.println("You placed him in the teleporter and then set the location ");
        System.out.println("back to the place of the boxes. The teleporter warms up and ");
        System.out.println("as it warms up you hear radio static...");
        press_enter_to_continue();

        System.out.println("You move closer and hear from the radio \"Old man? Hello?\"");
        System.out.println("\"Dang it, the trap didn't work! Everyone fallback!\"");
        System.out.println("You shake your head at the old man as the teleporter teleported him back.");
        System.out.println("I guess this war isn't over...");
        press_enter_to_continue();
        path++;
    }
}
