/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ds_lab8;

/**
 * Fibonacci sequence - 1, 1, 2, 3, 5, 8, 13, 21, etc.
 * @author Benjamin Bowen
 */
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int fib, n = 48;
        fib = fib(n);
        
        System.out.println("Term " + n + " of the Fibonacci sequence: " + fib);
    }
    
    public static int fib(int number)
    {
        if (number < 3)
            return 1;
        else if (number >= 3)
            return fib(number - 2) + fib(number - 1);
        else
            return 0;
    }
}
