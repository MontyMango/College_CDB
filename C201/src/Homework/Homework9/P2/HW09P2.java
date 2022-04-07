package Homework9.P2;
import java.util.*;
import java.io.File;

public class HW09P2 
{ 
    public static void main(String[] args) 
    {
        Map<String, Integer> colorMap = new HashMap<>();
        
        File inputFile = new File("colors.txt");
        try (Scanner input = new Scanner(inputFile))
        {
            while (input.hasNext())
            {
                // your code goes here
                // 1. read every word (color) from inputFile
                // 2. store the color (word) in colorMap and update 
                //    the value field (increase by 1).
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        // your code goes here
        // 1. display the total number of unique colors from colorSet
        // 2. display all colors and their occurances        
    }
}

/*
A correctly implemented program should display:

Total number of unique colors: 139
Here are their number of occurance:
Floral-white: 1
Black: 4
African-violet: 1
Caribbean-green: 1
Orange: 4
Antique-white: 1
Apple-green: 1
Alloy-orange: 1
Columbia-blue: 1
Electric-green: 1
Earth-yellow: 1
Dark-pastel: 1
Violet: 4
French-lime: 1
Baby-powder: 1
Dark-sea-green: 1
Magenta: 1
Olive: 1
Deep-pink: 1
Barbie-pink: 1
Yellow: 6
Dark-orchid: 1
English-vermillion: 1
Android-green: 1
Dark-electric-blue: 1
Deep-chestnut: 1
Deep-saffron-blue: 1
French-lilac: 1
Duke-blue: 1
English-lavender: 1
Antique-brass: 1
Dark-magenta: 1
Chocolate-black: 1
Fuchsia-purple: 1
Antique-fuchsia: 1
Bright-green: 1
Dark-red: 1
Egyptian-blue: 1
English-green: 1
Blossom-Pink: 1
Dark-sienna: 1
Maroon: 1
Cyan: 1
Blue: 16
Deep-cerise: 1
Blood-red: 1
Barn-red: 1
Dark-brown: 1
Amaranth-red: 1
Cadmium-red: 1
Dark-violet: 1
Red: 5
Carnation-pink: 1
Fluorescent-blue: 1
Bright-lilac: 1
Dark-goldenrod: 1
Crimson: 3
Olden: 1
Charcoal: 1
French-pink: 1
Dark-byzantium: 1
French-violet: 1
jeans-blue: 1
Plum: 1
Cadmium-orange: 1
Dark-green: 2
Navy-blue: 1
Dartmouth-green: 1
French-mauve: 1
Aero: 2
Dark-spring-green: 1
China-rose: 1
English-red: 1
Gray: 3
Azure: 1
French-raspberry: 1
Deep-jungle: 1
Battleship-grey: 1
French-sky-blue: 1
Brick-red: 1
Plive-black: 1
Chinese-red: 1
French-blue: 1
English-violet: 1
French-rose: 1
Baby-pink: 1
Silver: 1
Cadmium-green: 1
Fuchsia-rose: 1
Khaki: 1
Pink: 1
Dark-purple: 1
Ivory: 1
Deep-champagne: 1
Antique-bronze: 1
Antique-ruby: 1
Cadmium-yellow: 1
Chinese-violet: 1
Dark-turquoise: 1
Dark-cyan: 1
Brown: 5
Ash-gray: 1
Dark-moss-green: 1
Pea-green: 1
Dark-khaki: 1
Dark-orange: 1
Sapphire-blue: 1
China-pink: 1
Lime: 1
Dark-liver: 2
Dutch-white: 1
Coral-pink: 1
French-bistre: 1
French-beige: 1
Electric-blue: 1
Amaranth-purple: 1
Cadet-blue: 1
Hot-pink: 1
Chinese-yellow: 1
Dark-slate: 2
Coffee-black: 1
Dark-sky: 1
Forest-green: 3
Dark-blue-gray: 1
Amaranth-pink: 1
Dark-salmon: 1
French-fuchsia: 1
Baby-blue: 2
Blue-violet: 2
Dark-olive: 1
Deep-taupe: 1
White: 2
Purple: 1
Congo-pink: 1
Scarlet: 1
Dark-jungle: 1
Green: 10
Dark-lava: 1
Dark-cornflower-blue: 1
*/