import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("(<{1}(\\w+)>{1})(<{1}(\\w+)>{1})*\\w+(\\s*\\w*)*(<{1}/{1}\\4>{1})*(<{1}/{1}\\2>{1})");

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            //Write your code here

            Matcher m = p.matcher(line);

            System.out.println(m.matches());

            testCases--;
        }
    }
}
