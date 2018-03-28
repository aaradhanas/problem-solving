/**
 * Problem statement:
 * When you select a contiguous block of text in a PDF viewer, the selection is highlighted
 * with a blue rectangle. In this PDF viewer, each word is highlighted independently. You will be
 * given a list of letter heights in the alphabet and a string. Using the letter heights given,
 * determine the area of the rectangle highlight in  mm^2 assuming all letters are 1mm wide.
 *
 * Input:
 * 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
 * abc
 *
 * Output:
 * 9
 *
 * Explanation:
 * Letter heights are a = 1, b = 3 and c = 1. The tallest letter, b, is 3mm high. The selection area
 * for this word is 3 * 1mm * 3mm = 9 mm^2.
 **/


public class Solution4{

    private static int designerPdfViewer(int[] h, String word) {
        int num_chars = word.length();
        int area;
        int max_height = 0;

        for(int i = 0 ; i < num_chars; i++){

            //ASCII value of character 'a' is 97
            int index = word.charAt(i) - 97;

            if(h[index] > max_height ){
                max_height = h[index];
            }
        }

        area = num_chars * 1 * max_height;
        return area;
    }
    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        designerPdfViewer(h, "abc");
    }
}