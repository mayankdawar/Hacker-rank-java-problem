/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!" */






import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int n = scan.nextInt();
        for(int i =0; i<n ; i++){
            int p = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for (int j = 0; j < p; j++) {
                list.add(scan.nextInt());
            }
            arr.add(list);
        }
        int q = scan.nextInt();
        for(int i =0; i<q;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> ar = arr.get(x-1);
            if(ar.size() >= y){
                System.out.println(ar.get(y-1));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
