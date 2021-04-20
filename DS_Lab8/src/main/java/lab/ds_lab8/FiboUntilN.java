/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ds_lab8;

import java.util.Scanner;
/**
 * Prints all the numbers in the Fibonacci sequence before a number N
 * @author Benjamin Bowen
 */
public class FiboUntilN 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Print all the Fibonacci numbers before a number n. Provide n: ");
        n = s.nextInt();
        
        System.out.println("All the Fibonacci numbers before " + n + ":");
        printNumbers(n);
    }
    
    public static void printNumbers(int number)
    {
        int temp = number;
        
        for (int i = 1; i <= number; i++)
        {
            temp = fibo(i);
            if (temp < number) // only print the number if it is less than n
                System.out.print(temp + " ");
            else
                break; // after fibo(i) exceeds n, we can stop printing now
        }
    }
    
    // finds the nth term in the Fibonacci sequence
    public static int fibo(int number)
    {
        if (number < 3)
            return 1;
        else if (number >= 3)
            return fibo(number - 2) + fibo(number - 1);
        else
            return 0;
    }
}
