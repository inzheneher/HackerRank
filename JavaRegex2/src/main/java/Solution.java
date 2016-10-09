import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


    public static void main(String[] args) {
        String pattern = "(?i)\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            input = input.replaceAll(r.pattern(), "$1");
            System.out.println(input);
            testCases--;
        }
    }
}
