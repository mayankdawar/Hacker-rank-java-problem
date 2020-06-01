/*A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .
Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
Input Format
A single line containing an integer, n(the number to be checked).
Output Format
If n is a prime number, print prime; otherwise, print not prime.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger big = new BigInteger(n);
        boolean bool;
      
         bool = big.isProbablePrime(1);
        if( bool){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }

        scanner.close();
    }
}
