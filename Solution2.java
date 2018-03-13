/**
 * Problem statement:
 * Given a string, return the first valid US phone number in the string. If none is present, return "NONE".
 * Valid patterns of US phone numbers are "123-456-7890" and "(123) 456-7890".
 *
 * Input 1:
 * xx000-000-1111xxx
 * Output 1:
 * 000-000-1111
 *
 * Input 2:
 * 123-456-7890(000) 000-0000
 * Output 2:
 * 123-456-7890
 *
 * Input 3:
 * 1234567890
 * Output 3:
 * NONE
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {

    static String find_phone_number(String text) {

        boolean match = Pattern.matches(
            "[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][a-z0-9]"
            , text);

        String pattern1 = "[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";
        String pattern2 = "[(][0-9][0-9][0-9][)]\\s[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";

        Pattern pattern = Pattern.compile(pattern1);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()) {
            return matcher.group(0);
        }
        return "NONE";
    }

    public static void main(String[] args) {
        String text1 = "xx000-000-1111xxx";
        String text = " 123-456-7890(000)  000-0000 ";

        System.out.println(find_phone_number(text));
    }
}
