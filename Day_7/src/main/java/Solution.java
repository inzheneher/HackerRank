import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < n; i++){
            arr.add(in.nextInt());
        }
        in.close();
        Collections.reverse(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
