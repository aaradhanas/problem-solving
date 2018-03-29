/**
    Day of the Programmer - https://www.hackerrank.com/challenges/day-of-the-programmer/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    static String solve(int year){
        // Complete this function
        int days = 0;
        
        if( year == 1918 ){
            //special case
            days = getNumDays(false) - 13;
        }
        else{
             if(isLeapYear(year, year < 1918 ? "J": "G")){
                days = getNumDays(true);
            }
            else{
                days = getNumDays(false);
            }
        }
        
        int remDays = 256 - days;
        int month = 9;
        
        if(remDays > 30){
            month += 1;
            remDays = remDays - 30;
        }
        return remDays+"."+"0"+month+"."+year;
    }
    
    static int getNumDays(boolean isLeap){
        return isLeap ? 244 : 243;
    }
    
    static boolean isLeapYear(int year, String calendar){
        if("J".equals(calendar)){
            return year % 4 == 0;
        }
        else{
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 );
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}