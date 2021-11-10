/*
    Author: Angaran Yogeswaran
    Date: November 9th 2021
 */



package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();


        float age = 0.0f;
        boolean isValidInput = false; //sentinel variable

        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter a age greater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("Error: You must enter a valid floating point number");
                keyboard.nextLine();
                isValidInput = false;
            }

        }
        while (!isValidInput);


        //System.out.print("Please enter your age: ");
        //age = keyboard.nextFloat();
        //System.out.printf("Error: %s",e.getMessage());

        //output
        System.out.println();
        System.out.printf("You entered: %s \n",name);
        System.out.printf("You entered: %.2f",age);
    }
}
