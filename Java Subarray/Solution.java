/*We define the following:
A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format
The first line contains a single integer, n, denoting the length of array A = [a1,a2,a3,a4 ........an-1]
The second line contains n space-separated integers describing each respective element,ai, in array A.

Output Format
Print the number of subarrays of A having negative sums.*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int count =0;
        int[] arr = new int[n];
        for(int i= 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<n;i++){
            for(int j = 0; j<=i;j++){
               int sum=0;
                for(int z = j;z <=i;z++){
                     sum = sum + arr[z];
                }
                if (sum < 0){
                ++count;
            }
            }
        }
        System.out.println(count);
    }
}
