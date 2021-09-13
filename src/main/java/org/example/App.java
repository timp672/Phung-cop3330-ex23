/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String q1, q2, q3, q4, q5, q6;
        //prompt
        System.out.println("Is the car silent when you turn the key?");
        Scanner scan1 = new Scanner(System.in);
        q1 = scan1.nextLine();
        //if else tree
        if (q1.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            Scanner scan2 = new Scanner(System.in);
            q2 = scan2.nextLine();

            if (q2.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            Scanner scan3 = new Scanner(System.in);
            q3 = scan3.nextLine();

            if (q3.equals("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                Scanner scan4 = new Scanner(System.in);
                q4 = scan4.nextLine();

                if (q4.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    Scanner scan5 = new Scanner(System.in);
                    q5 = scan5.nextLine();

                    if (q5.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        Scanner scan6 = new Scanner(System.in);
                        q6 = scan6.nextLine();

                        if (q6.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
