/**
    Counting Valleys - https://www.hackerrank.com/challenges/counting-valleys/problem
 */

import java.io.*;
import java.util.*;

public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String hike = in.next();
        
        boolean atSeaLevel = true;
        boolean valley = false;
        int upCount = 0;
        int downCount = 0;
        int valleys = 0;
        
        for( int i = 0 ; i < N; i++){
            if('U' == hike.charAt(i)){
                upCount++;
            }
            else{
                if(atSeaLevel){
                    valley = true;                    
                }
                downCount++;
            }
            
            if(upCount ==  downCount){
                if(valley){
                    valleys++;
                }
                atSeaLevel = true;
                valley = false;
                upCount = 0;
                downCount = 0;
            }
            else{
                atSeaLevel = false;
            }
        }
        
        System.out.println(valleys);
        
        in.close();
    }
}