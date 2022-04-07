package Homework9.P1;
import java.util.*;
import java.io.File;

public class HW09P1 
{ 
    public static void main(String[] args) 
    {
        Set<String> colorSet = new HashSet<String>();
        
        File inputFile = new File("colors.txt");
        try (Scanner input = new Scanner(inputFile))
        {
            while(input.hasNext())
            {
                // your code goes here
                // 1. read every word (color) from inputFile
                // 2. store the color (word) in colorSet.
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        // your code goes here
        // 1. display the total number of unique colors from colorSet
        // 2. display all colors from colorSet    
    }
}

/*
A correctly implemented program should display:

Total number of different colors: 139
Floral-white
Black
African-violet
Caribbean-green
Orange
Antique-white
Apple-green
Alloy-orange
Columbia-blue
Electric-green
Earth-yellow
Dark-pastel
Violet
French-lime
Baby-powder
Dark-sea-green
Magenta
Olive
Deep-pink
Barbie-pink
Yellow
Dark-orchid
English-vermillion
Android-green
Dark-electric-blue
Deep-chestnut
Deep-saffron-blue
French-lilac
Duke-blue
English-lavender
Antique-brass
Dark-magenta
Chocolate-black
Fuchsia-purple
Antique-fuchsia
Bright-green
Dark-red
Egyptian-blue
English-green
Blossom-Pink
Dark-sienna
Maroon
Cyan
Blue
Deep-cerise
Blood-red
Barn-red
Dark-brown
Amaranth-red
Cadmium-red
Dark-violet
Red
Carnation-pink
Fluorescent-blue
Bright-lilac
Dark-goldenrod
Crimson
Olden
Charcoal
French-pink
Dark-byzantium
French-violet
jeans-blue
Plum
Cadmium-orange
Dark-green
Navy-blue
Dartmouth-green
French-mauve
Aero
Dark-spring-green
China-rose
English-red
Gray
Azure
French-raspberry
Deep-jungle
Battleship-grey
French-sky-blue
Brick-red
Plive-black
Chinese-red
French-blue
English-violet
French-rose
Baby-pink
Silver
Cadmium-green
Fuchsia-rose
Khaki
Pink
Dark-purple
Ivory
Deep-champagne
Antique-bronze
Antique-ruby
Cadmium-yellow
Chinese-violet
Dark-turquoise
Dark-cyan
Brown
Ash-gray
Dark-moss-green
Pea-green
Dark-khaki
Dark-orange
Sapphire-blue
China-pink
Lime
Dark-liver
Dutch-white
Coral-pink
French-bistre
French-beige
Electric-blue
Amaranth-purple
Cadet-blue
Hot-pink
Chinese-yellow
Dark-slate
Coffee-black
Dark-sky
Forest-green
Dark-blue-gray
Amaranth-pink
Dark-salmon
French-fuchsia
Baby-blue
Blue-violet
Dark-olive
Deep-taupe
White
Purple
Congo-pink
Scarlet
Dark-jungle
Green
Dark-lava
Dark-cornflower-blue

*/