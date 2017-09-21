/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fabian
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);

     System.out.print("Enter first number: ");
     int a = userInput.nextInt();

     System.out.print("Enter second number: ");
     int b = userInput.nextInt();


     System.out.println("GCD is: " + gcdEucledian(a, b));
     System.out.println("GCD is: " + gcdPrimeFactors(a, b));
    }
    public static int gcdEucledian(int a, int b) {

     if(b == 0){
         return a;
        }
     return gcdEucledian(b, a%b);         
   }
    public static int gcdPrimeFactors(int a, int b) {
        int gcd = 1;
        List<Integer> listA = primeFactors(a);
        List<Integer> listB = primeFactors(b);
        
        for(int i = 0; i < listB.size(); i++)
        {
            if(listA.contains(listB.get(i)))
            {
                listA.remove(listB.get(i));
                gcd *= listB.get(i);
            }
        }
        return gcd;
   }   
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
