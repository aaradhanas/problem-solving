/**
 * Problem statement:
 * Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store.
 * The store n sells different brands of keyboards and  m different brands of USB drives. Monica has
 * exactly s dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost
 * of her purchase must be maximal). Given the price lists for the store's keyboards and USB drives,
 * find and print the amount of money Monica will spend. If she doesn't have enough money to buy one
 * keyboard and one USB drive, print -1 instead.
 *
 * Input 1:
 * 10 2 3
 * 3 1
 * 5 2 8
 *
 * Output 1:
 * 9
 *
 * Input 2:
 * 5 1 1
 * 4
 * 5
 *
 * Output 2:
 * -1
 *
 **/
public class Solution5 {

    private static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int max_sum = 0;

        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                int sum = keyboards[i] + drives[j];
                if(sum > max_sum && sum <= s){
                    max_sum = sum;
                }
            }
        }

        return max_sum > s || max_sum == 0 ? -1 : max_sum;
    }

    public static void main(String[] args) {

        int[] keyboards = {3,1};
        int[] drives = {5, 2, 8};
        int s = 10;
        System.out.println(getMoneySpent(keyboards, drives, s));
    }
}
