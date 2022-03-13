import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int RandomNumber, Guess, Difficulty = 1;
        char Answer, DiffChange;
        boolean win = false;

        do {
            win = false;
            System.out.print("Would you like to change difficulty?\n" +
                    "The current difficulty is " + DifficultyCheck(Difficulty) + "\n\n(Y\\N): ");
            DiffChange = input.nextLine().charAt(0);

            if (Character.toUpperCase(DiffChange) == 'Y') {
                Difficulty = 0;
                ShowDifficulty();
                while (Difficulty > 4 || Difficulty < 1) {
                    System.out.print("Difficulty #");

                    Difficulty = input.nextLine().charAt(0);
                    Difficulty = Difficulty - '0';
                }
            }

            RandomNumber = (int) (9 * Math.random());

            System.out.println("Guess this next single digit number!");

            for (int Turn = 1; Turn <= 5 && win != true; ++Turn) {
                System.out.print("\nNumber Guess #" + Turn + ": ");
                Guess = input.nextInt();

                Guess = Guess - '0';

                if (Guess == RandomNumber)  {
                    System.out.println("Congrats! You guessed correctly!");
                    win = true;
                }
                else    {
                    if (Difficulty % 2 == 0) {
                        RandomNumber = AddOrSubtract(RandomNumber, Guess);

                    }
                    if (Difficulty == 1 || Difficulty == 2) {
                        DisplayHowFar(RandomNumber, Guess);
                    }
                    else    {
                        System.out.println("Wrong Number");
                    }
                }
            }
            System.out.println("Game Over! The final number was " + RandomNumber + "! (Press enter to continue)");
            input.nextLine();

            System.out.print("\n\nWould you like to play again? (Y\\N) => ");
            Answer = input.nextLine().charAt(0);

        } while (Character.toUpperCase(Answer) != 'N');

        System.out.println("Thanks for playing!");

    }


    static void ShowDifficulty() {
        System.out.println("Choose your difficulty...");
        System.out.println("1. Easy (Lower / Higher)");
        System.out.println("2. Medium (Lower / Higher with a moving number)");
        System.out.println("3. Hard (Wrong Number)");
        System.out.println("4. Omega Hard (Wrong Number with a moving Number)");
    }

    static String DifficultyCheck(int DifficultyNum) {
        switch (DifficultyNum) {
            case 1:
                return "Easy";
            case 2:
                return "Medium";
            case 3:
                return "Hard";
            case 4:
                return "Omega Hard";
            case default:
                return "null";
        }
    }

    static void DisplayHowFar (int Number, int Inputted_Guess)  {
        boolean Close = false, ReallyClose = false;
        if (Number > Inputted_Guess) {
            for (int Num = 1; Close == false || ReallyClose == false || Num >= 3; Num++) {
                if ((Number - Num) == Inputted_Guess) {

                    if (Num == 1) {
                        ReallyClose = true;
                    }
                    else {
                        Close = true;
                    }
                }
            }

            if (ReallyClose) {
                System.out.println("Your guess is lower and is REALLY close to the actual number!");
            }
            else if (Close) {
                System.out.println("Your guess is lower and close to the actual number!");
            }
            else {
                System.out.println("Your guess is lower than the actual number.");
            }
        }

        else if (Number < Inputted_Guess) {
            for (int Num = 1; Close != true || ReallyClose != true || Num >= 3; Num++) {
                if ((Number + Num) == Inputted_Guess) {

                    if (Num == 1) {
                        ReallyClose = true;
                    }
                    else {
                        Close = true;
                    }
                }
            }
            if (ReallyClose == true) {
                System.out.println("Your guess is higher and is REALLY close to the actual number!");
            }
            else if (Close == true) {
                System.out.println("Your guess is higher and close to the actual number!");
            }
            else {
                System.out.println("Your guess is higher than the actual number.");
            }
        }
    }

    static int AddOrSubtract (int num, int Difficulty) {
        int Choice = (int) (3 * Math.random());

        if (Choice == 1 && num < 9) {
            if (Difficulty == 2) {
                System.out.println("Number is moving up");
            }
            ++num;
        } else if (Choice == 2 && num > 0) {
            if (Difficulty == 2) {
                System.out.println("Number is moving down");
            }
            --num;
        }
        return num;
    }
}