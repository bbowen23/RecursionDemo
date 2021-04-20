/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ds_lab8;

/**
 * Factorial with recursion
 * @author Benjamin Bowen
 */
public class Factorial 
{
    public static void main(String[] args)
    {
        int value, n = 0;
        n = 5;
        value = factorial(n);
        System.out.println("The factorial of " + n + " is: " + value);
        
        n = 7;
        value = factorial(n);
        System.out.println("The factorial of " + n + " is: " + value);
        
        n = 8;
        value = factorial(n);
        System.out.println("The factorial of " + n + " is: " + value);
        
        n = 9;
        value = factorial(n);
        System.out.println("The factorial of " + n + " is: " + value);
        
        n = 10;
        value = factorial(n);
        System.out.println("The factorial of " + n + " is: " + value);
    }
    
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
