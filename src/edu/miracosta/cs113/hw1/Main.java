package edu.miracosta.cs113.hw1;

import java.util.Scanner;

/**
 * @author Oscar Lugo
 */

public class Main
{
    public static void main(String[] args)
    {
        long number;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to be checked");
        number = in.nextLong();

        if(IsPowerOfTwo(number))
        {
            System.out.print("Number " + number+ " is power of two");
        }
        else
        {
            System.out.print("Number " + number + " it is NOT power of two");
        }
    }

    /**
     *  Using simple algorithm found online where number is checked bitwise for power of two
     * @param number to be checked if it is a power of two
     * @return true if number is a power of 2 , false if not
     */
    public static boolean IsPowerOfTwo(long number)
    {
        return (number != 0) && ((number & (number-1))==0) ;
    }
}
