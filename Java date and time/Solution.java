/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
For example, if you are given the date , the method should return  as the day on that date./*
/*Input Format
A single line of input containing the space separated month, day and year, respectively, in    format.*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DATE,day);
        cal.set(Calendar.YEAR,year);
        
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch(week)
        {
            case 1:
            return "SUNDAY";
            case 2:
            return "MONDAY";                
            case 3:
            return "TUESDAY";
            case 4:
            return "WEDNESDAY";
            case 5:
            return "THURSDAY";            
            case 6:
            return "FRIDAY";    
            case 7:
            return "SATURDAY";   
            default:
            return "ERROR";         
        }
       
    }};


public class Solution {
