package Homework;

/* 	
Name: Cameron Harter
Date: 9/8/2021
Homework #: 2
Question #: 2
Source File: H2_P2_CH
 */
import java.util.Scanner;

public class H2_P2_CH {
    public static void main(String[] args)
    {
        double PI = 3.14, Radius, Volume, SurfaceArea;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("This will calculate the volume and surface area" +
                " of a sphere with entered radius.");
        System.out.println("Enter the radius of the sphere");
        
        Radius = Input.nextDouble();
        
        Volume = 4/3 * PI * Radius * Radius * Radius;
        SurfaceArea = 4 * PI * Radius * Radius;
        
        System.out.println("The volume of the sphere is " + Volume);
        System.out.println("The surface area is " + SurfaceArea);
        
    }
}
/*
This will calculate the volume and surface area of a sphere with entered radius.
Enter the radius of the sphere
3.5
The volume of the sphere is 134.6275
The surface area is 153.86
 */