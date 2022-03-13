package Exam1;

public class Enemies {

    // Encounter-able enemies [ Health, Maximum Attack Damage ]
    static int[] a_helpless_small_box = {1,1};    // 1
    static int[] non_branded_box = {10,4};        // 2
    static int[] amazon_box = {15,6};             // 3
    static int[] HUGE_box = {18,7};               // 4

    // Bosses
    static int[] The_mother_of_all_boxes = {60,50};   // 5
    static int[] The_Man_Himself = {100,25};          // 6

    static int[] enemy;

    static int enemyHP = 0;
    static int enemyMaxAtk = 0;




    public void spawn_specific(int spawn_num)   {
        switch (spawn_num)  {
            case 1:
                System.out.println("You've encountered a helpless small box!");
                this.enemy = a_helpless_small_box;
                break;
            case 2:
                System.out.println("You've encountered a non branded box!");
                this.enemy = non_branded_box;
                break;
            case 3:
                System.out.println("You've encountered an amazon box!");
                this.enemy = amazon_box;
                break;
            case 4:
                System.out.println("You've encountered... A HUGE BOX!");
                this.enemy = HUGE_box;
                break;

                // Bosses
            case 5:
                System.out.println("Let's finish all of this.");
                this.enemy = The_mother_of_all_boxes;
                break;
            case 6:
                System.out.println("\nUhh... This is unexpected...");
                System.out.println("Time to take him out!");
                this.enemy = The_Man_Himself;
                break;
        }

        Enemy_array_to_vars(this.enemy);
    }

    private void Enemy_array_to_vars(int[] enemy)  {
        this.enemyHP = enemy[0];
        this.enemyMaxAtk = enemy[1];
    }

    public boolean new_zone_spawn() {
        int rand_num = (int) (100 * Math.random());

        // Helpless Box spawn rate 10%
        if (rand_num < 10 && rand_num > 0)  {
            spawn_specific(1);
            return true;
        }
        // Non Branded Box spawn rate 25 %
        else if (rand_num < 40 && rand_num >= 15)    {
            spawn_specific(2);
            return true;
        }
        // Amazon Box spawn rate 15%
        else if (rand_num < 60 && rand_num >= 45)    {
            spawn_specific(3);
            return true;
        }
        // HUGE Box spawn rate 5%
        else if (rand_num < 100 && rand_num >= 95)  {
            spawn_specific(4);
            return true;
        }
        else    {
            return false;
        }
    }





    public int attack()    {
        int damage = (int) (this.enemyMaxAtk  * Math.random());

        if(damage == 0) {
            System.out.println("The enemy's attack missed you!");
        }
        System.out.println("\nDamage taken: " + damage);

        return damage;
    }



    public void take_damage(int damage)    {
        System.out.println("The enemy took " + damage + " damage!\n");
        if (this.enemyHP > damage) {
            this.enemyHP -= damage;
            System.out.println("\n----------\nEnemy's remaining health: " + this.enemyHP + "\n----------");

        }
        else    {
            System.out.println("The enemy has been defeated!\n");
            this.enemyHP = 0;
        }
    }



    public boolean check_if_alive() { return this.enemyHP > 0; }
}