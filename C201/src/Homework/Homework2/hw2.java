package Homework2;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList <Integer> ();
        // This section works for me in IntelliJ, because it requires the path of the file for some reason.
        File file1 = new File("C:\\Users\\camer\\OneDrive - Indiana University\\Other\\Code Database\\C201\\src\\Homework\\Homework2\\input1.txt");
        File file2 = new File("C:\\Users\\camer\\OneDrive - Indiana University\\Other\\Code Database\\C201\\src\\Homework\\Homework 2\\input2.txt");
        File output = new File("C:\\Users\\camer\\OneDrive - Indiana University\\Other\\Code Database\\C201\\src\\Homework\\Homework 2\\output.txt");

        // Here's the code that works for other IDEs, tested on Replit.com and it worked.
        // File file1 = new File("input1.txt");
        // File file2 = new File("input2.txt");
        // File output = new File("output.txt");

        file_to_array(Numbers, file1);
        file_to_array(Numbers, file2);

        Collections.sort(Numbers);

        array_to_file(Numbers, output);
    }


    static void file_to_array(ArrayList<Integer> ArrayNumbers, File file) {

        try(Scanner scanner = new Scanner(file))    {
            while(scanner.hasNext()) {
                ArrayNumbers.add(scanner.nextInt());
            }
        }
        catch (Exception e)  {
            System.out.println("Cannot read the file you requested!");
            e.printStackTrace();
        }
    }


    static void array_to_file(ArrayList<Integer> ArrayNumbers, File file)
    {
        try(FileWriter output = new FileWriter(file)) {
            for (Object Number : ArrayNumbers) {
                output.write(Number + " ");
            }
        }
        catch (Exception e) {
            System.out.println("Cannot write to the file!");
            e.printStackTrace();
        }
    }
}
/*

 */