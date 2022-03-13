package Exam1;
import java.util.Scanner;

public class PlayerAction {

    private static Scanner input = new Scanner(System.in);

    private static final int number = 4; // (int) ((Math.random() * 20) / 2);
    private static Map map = new Map(number);

    PlayerCharacter Player;





    public PlayerAction(PlayerCharacter imported_player) {
        Player = imported_player;
    }

    public int damage_enemy() {
        double damage = 0;

        switch (this.Player.get_player_class()) {
            case "Warrior":
                // Damage ranges from 10 - 15
                damage = (15 - 10 + 1) * (Math.random() + 5);
                break;

            case "Rogue":
                // Damage is just 13
                damage = 13;
                break;

            case "Mage":
                // Damage ranges from 0 - 25
                damage = (Math.random() * 25);
                break;
        }
        return (int) damage;
    }

    public void take_damage(int damage) {
        double Armor_Damage = 0, HP_Damage = 0;

        // Decides damage by class
        switch (this.Player.get_player_class()) {
            case "Warrior":
                Armor_Damage = damage * 0.80;
                HP_Damage = damage * 0.20;
                break;
            case "Rogue":
                Armor_Damage = damage * 0.40;
                HP_Damage = damage * 0.60;
                break;
            case "Mage":
                Armor_Damage = damage * 0.20;
                HP_Damage = damage * 0.80;
                break;
        }

        // Armor Damage sayings
        if (this.Player.getArmor() >= Armor_Damage)  {
            System.out.println("Cling!");

            if (Player.getArmor() == Armor_Damage)    {
                System.out.println("Oof! There goes my armor...");
            }
        }

        // No armor left calculations and sayings
        else if (Player.getArmor() == 0)   {
            System.out.println("ouch!");
            HP_Damage += Armor_Damage;
            Armor_Damage = 0;
        }

        // Armor being Destroyed sayings and damage calculations
        else if (Player.getArmor() < Armor_Damage)    {

            // Remaining armor damage
            double temp;
            temp = Armor_Damage - Player.getArmor();
            Armor_Damage -= temp;   // To zero the armor out and not get a negative

            // Add to HP Damage
            HP_Damage += temp;
            System.out.println("Ouch! Well, there goes my armor...");
        }

        Player.subtract_armor_and_HP((int) Armor_Damage,(int) HP_Damage);

        // Display stats
        System.out.println("\n==========\nCurrent armor: " + Player.getArmor() + "\nCurrent HP: " + Player.getHP() + "\n==========");
    }



    public void move(int down_up, int left_right)  {
        boolean facing_wall = false;
        int new_x = this.Player.getPlayer_x();
        int new_y = this.Player.getPlayer_y();

        // Mage has a 10% chance when moving to randomly teleport to a new location
        if (this.Player.get_player_class().equals("Mage") && mage_roll())  {

            System.out.println("You randomly teleport to a random location!");

            new_x = (int) (19 * Math.random());
            new_y = (int) (19 * Math.random());

            this.map.move_player_icon(this.Player.getPlayer_x(),this.Player.getPlayer_y(),new_x,new_y);
            this.Player.move_location(new_x, new_y);

            this.map.show();

            return;
        }


        // Extra Credit: Enforce edge of grid rules – don’t allow movement out of bounds.

        // For diagonal movement
        if (down_up != 0 && left_right != 0)    {
            if (this.Player.getPlayer_y() + down_up > 19 || this.Player.getPlayer_y() + down_up < 0 ||
                    this.Player.getPlayer_x() + left_right > 19 || this.Player.getPlayer_x() + left_right < 0)   {
                facing_wall = true;
            }
            else    {
                new_y += down_up;
                new_x += left_right;
            }
        }

        // For y axis movement
        else if (down_up != 0) {
            // Checks if they are near the end of the map
            if (this.Player.getPlayer_y() + down_up > 19 || this.Player.getPlayer_y() + down_up < 0) {
                facing_wall = true;
            }

            // Change facing direction
            else    {
                new_y += down_up;
            }
        }

        // For x axis movement
        else if (left_right != 0)    {
            // Checks if they are near the end of the map
            if (this.Player.getPlayer_x() + left_right > 19 || this.Player.getPlayer_x() + left_right < 0)    {
                facing_wall = true;
            }

            // Change facing direction
            else    {
                new_x += left_right;
            }
        }


        if (facing_wall == true) {
            System.out.println("! - Can't move there! There's a wall there!\n\n");
        }
        else {
            map.move_player_icon(this.Player.getPlayer_x(),this.Player.getPlayer_y(),new_x,new_y);
            this.Player.move_location(new_x, new_y);
            System.out.println("\n\nYou dash into a new land!");
        }
    }

    public void facing()    {
        int num_choice;

        System.out.println("Where would you like to face?");
        System.out.println("[\\] 1 [\\]");
        System.out.println(" 2  _  3  ");
        System.out.println("[\\] 4 [\\]");
        do {
            num_choice = input.nextInt();
        } while(num_choice < 4 && num_choice > 1);

        this.Player.facing(num_choice);

        System.out.println("\nYou are now facing the letter " + this.Player.getPlayer_facing() + "...");
        System.out.println("Wow, that's a nice letter and that you can't see!\n");
    }

    public boolean check_if_on_question_mark()  {
        return this.map.check_question_mark(number);
    }

    // Part of Extra credit method
    public boolean mage_roll()  {
        int num = (int) (100 * Math.random());
        return num <= 10;
    }

    // Show methods to pass to Main
    public void show_map()  { this.map.show(); }

    public void show_mini_map() {
        map.show_mini(this.Player.getPlayer_y(), this.Player.getPlayer_x());
    }
}