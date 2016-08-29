import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String pattern = in.nextLine();
            try {
                Pattern p = Pattern.compile(".+@gmail\\.com");
                Matcher m = p.matcher(pattern);
                boolean b = m.matches();
                String firstWord = null;
                if (b) {
                    if (pattern.contains(" ")) {
                        firstWord = pattern.substring(0, pattern.indexOf(" "));
                    }
                    names.add(firstWord);
                }

            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }

        Collections.sort(names);

        for (String str : names) {
            if (str != null) {
                System.out.println(str);
            }
        }
    }
}
