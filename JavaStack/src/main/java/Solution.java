import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();


            try {
                while (in.readLine() != null) {
                    String text = in.readLine();
                    stack.push(text);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        System.out.println(stack.size());

    }
}
