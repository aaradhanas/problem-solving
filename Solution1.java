/**
 * Problem statement:
 * Given an array of numbers in ascending order, return a string which contains clubs
 * consecutive numbers (atleast 3) into a range.. For non-consecutive numbers, the
 * the numbers should be directly appended.
 *
 * Input:
 * 2,3,4,5,6,7,8,9,11,13
 *
 * Output:
 * 2-4,5,6,7-9,11,13
 */

public class Solution1 {
    static String solution(int[] array) {
        String range = "";
        int numStart = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1 || array[i] - array[i + 1] != -1) {
                if (count >= 2) {
                    range += numStart + "-" + array[i] + ",";
                    count = 0;
                } else if (count == 1) {
                    range += array[i - 1] + "," + array[i] + ",";
                    count =0;
                } else {
                    range += array[i] + ",";
                }
            } else {
                count++;
                if (count == 1) {
                    numStart = array[i];
                }
            }
        }

        if(! range.isEmpty()){
            return range.substring(0,range.length() - 1);
        }
        else{
            return "";
        }

    }

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,11,13};
        System.out.println(solution(array));
    }
}
