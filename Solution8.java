import java.io.IOException;
import java.util.Scanner;

public class Solution8 {

    /*
     * Complete the canModify function below.
     */
    static String canModify(int[] a) {
        /*
         * Write your code here.
         */

        boolean modified = false;
        String result = "";
        for(int i = 0 ;i < a.length - 1; i++){
            if(a[i+1] < a[i]){
                if(!modified) {
                    a[i + 1] = a[i] + 1;
                    modified = true;
                    result = "YES";
                }
                else{
                    result = "NO";
                }
            }
        }

        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] a  = {5, 7, 7, 11, 15, 22, 24};

        String result = canModify(a);
        System.out.println(result);
    }
}
