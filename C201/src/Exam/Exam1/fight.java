package Exam1;

import java.util.Scanner;

public class fight {
    static PlayerAction player_do;
    static PlayerCharacter player;
    static Enemies enemy;

    static boolean AutoFight = false;




    public fight(PlayerCharacter player_import, PlayerAction player_do_import, Enemies enemy_import)    {
        player_do = player_do_import;
        player = player_import;
        enemy = enemy_import;
    }

    public void fight_routine(int boss_fight_stun) {
        System.out.println("Let's see who goes first!");
        boolean player_turn;

        // Boss only
        if(boss_fight_stun == 1)   {
            System.out.println("The Mother Box was stunned by your response! You get the first turn!");
            player_turn = true;
        }
        // Other enemies than boss
        else    {
            player_turn = goes_first();
        }

        while(PlayerCharacter.check_if_alive() && enemy.check_if_alive())    {
            // Player's turn
            if (player_turn == true)    {

                System.out.println("\n\nYour turn");

                // Autofight off
                if (AutoFight == false)    {
                    int choice = this.fight_menu();

                    // Fight (Yes, the only option)
                    if(choice == 1) {
                        enemy.take_damage(player_do.damage_enemy());
                    }
                }

                // Autofight on
                else    {
                    enemy.take_damage(player_do.damage_enemy());
                }

                // End turn
                player_turn = false;
            }

            // Enemy's turn
            else   {
                System.out.println("\n\nEnemy's turn\n~~~~~~~~~~~~~");

                // Extra credit: Rogue has a 15% chance to completely dodge and attack
                if(PlayerCharacter.get_player_class().equals("Rogue") && rogue_dodge_roll())  {
                    System.out.println("You completely dodged the attack and countered!");
                    enemy.take_damage(player_do.damage_enemy());
                }

                // If they are another class or missed the dodge roll
                else    { player_do.take_damage(enemy.attack()); }
                player_turn = true;
            }
        }

        System.out.println("\n\nEND OF BATTLE\n---------------");

        if (PlayerCharacter.check_if_alive())    {
            System.out.println("Congrats! You won!\n");
        }

        // If the player gets defeated during the battle
        else    {
            System.out.println("You fall to the ground, exhausted.");
            System.out.println("The enemy uses the opportunity to call the other boxes.");
            System.out.println("You look up and there's two boxes. They open their lids and boxnap you.");
            System.out.println("You try to kick and rip the box open... but the box is too strong.");
            System.out.println("Well, I guess there's no way of saving anything anymore...");
            System.out.println("rip /(-_-)\\");
        }
    }

    private int fight_menu()    {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("~~~~~~~~~~~~~~~");
            System.out.println("1. Fight");
            System.out.println("~~~~~~~~~~~~~~~");

            choice = input.nextInt();
        } while(choice != 1);

        return choice;
    }

    private boolean goes_first()    {
        int rand_num = (int) (3 * Math.random());
        if (rand_num == 2)  {
            System.out.println("Looks like you go first...\n\n");
            return true;
        }
        else    {
            System.out.println("The enemy strikes first.\n\n");
            return false;
        }
    }



    // Part of Extra Credit method
    private boolean rogue_dodge_roll()    {
        int num = (int) (100 * Math.random());
        return num <= 15;
    }


    // set Methods
    public void setAutoFight()  {
        if(AutoFight == false)  {
            AutoFight = true;
            System.out.println("\nAuto Fight has been turned on.\n");
        }
        else    {
            AutoFight = false;
            System.out.println("\nAuto fight has been turned off\n");
        }
    }

    // get Methods
    public boolean getAutoFight() {
        return AutoFight;
    }
}
