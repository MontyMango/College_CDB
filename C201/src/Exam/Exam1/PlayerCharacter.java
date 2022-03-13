package Exam1;

public class PlayerCharacter {

    static String Player_Name = "String";
    static String Player_Class;

    static int Player_HP = 100;
    static int Player_Armor = 100;

    static boolean dead = false;

    // Used for boundaries & directions
    static int Player_x = 0;
    static int Player_y = 0;
    static char player_facing = 'N';



    // Set up
    public  PlayerCharacter(String name, String Chosen_class) {
        this.Player_Name = name;
        this.Player_Class = Chosen_class;
    }


    // Value changing methods
    public static void subtract_armor_and_HP(int Armor_Damage, int HP_Damage) {
        //
        Player_Armor -= Armor_Damage;
        Player_HP -= HP_Damage;
        check_hp();
    }

    public static void move_location(int row, int column) {
        Player_x = row;
        Player_y = column;
    }

    public static void facing(int facing_position_num) {
        if(facing_position_num == 1)    {player_facing = 'N';}
        else if (facing_position_num == 2)  {player_facing = 'E';}
        else if (facing_position_num == 3)  {player_facing = 'W';}
        else    {player_facing = 'S';}
    }

    // Check and change methods
    private static void check_hp()  {
        if (Player_HP <= 0)    {
            dead = true;
        }
    }


    // get methods
    // General
    public static boolean check_if_alive()   {
        if (dead == false) { return true; }
        else { return false; }
    }

    public static int getHP()  { return Player_HP; }

    public static int getArmor()  { return Player_Armor; }

    public static String get_player_class()    { return Player_Class; }

    public static String get_player_name() { return Player_Name; }

    public static char getPlayer_facing()   { return player_facing; }

    // Player location
    public static int getPlayer_x()    { return Player_x; }

    public static int getPlayer_y()    { return Player_y; }
}