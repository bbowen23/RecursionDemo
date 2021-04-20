/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ds_lab8;

/**
 * Not the Fibonacci sequence
 * @author Benjamin Bowen
 */
public class FibModel 
{
    public static void main(String[] args)
    {
        int fib, n = 64;
        fib = fib(n);
        
        System.out.println("Result of " + n + ": " + fib);
    }
    
    public static int fib(int number)
    {
        int result = 0;
        if (number <= 4)
            result = 1;
        else
            result = fib(number / 2) + fib(number / 4);
        return result;
    }
}
