package Exam1;

public class Map {
    static char[][] Map = new char [20][20];





    public Map(int num)  {
        for (int i = 0; i < 20; i++)    {
            for (int j = 0; j < 20; j++)    {
                this.Map[i][j] = '~';
            }
        }
        // Sets the starting position of the player, 0,0
        this.Map[0][0] = '8';

        // Sets the end objective
        this.Map[19][num] = '?';
    }



    public void move_player_icon(int old_x, int old_y, int new_x, int new_y)  {
        this.Map[old_y][old_x] = '_';     // This indicates that this land has been already explored

        this.Map[new_y][new_x] = '8';    // Moves player to new place
    }

    public boolean check_question_mark(int rand_num)    {
        if (this.Map[19][rand_num] == '8')  { return true; }
        else    { return false; }
    }


    public void show() {
        System.out.println("/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\");
        for (int row = 19; row >= 0; row--) {
            System.out.print("|");
            for (int column = 0; column < 20; column++) {
                System.out.print(this.Map[row][column] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("\\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
        System.out.println("Legend:\n8 - You\n? - Boss\n_ - Area already explored\n~ - Area unexplored");
    }



    public void show_mini(int y, int x) {
        System.out.println("/~~~~~~~~~~~~~~~\\");
        for(int row = 2; row > -3; row--)    {
            System.out.print("|");
            for(int column = -2; column < 3;column++)    {
                // If out of bounds
                if (y + row > 19 || y + row < 0 ||
                        x + column > 19 || x + column < 0) {
                    System.out.print("[\\]");
                }

                else    {
                    System.out.print(" " + this.Map[y + row][x + column] + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("\\~~~~~~~~~~~~~~~/");
        System.out.println("Legend: ");
        System.out.println("[\\] - Out of bounds");
        System.out.println("_ - Explored Area");
        System.out.println("~ - Unexplored Area");
        System.out.println("8 - You!\n\n");
    }
}
