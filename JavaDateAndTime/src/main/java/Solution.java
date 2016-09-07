import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Date date = null;
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();

        String composition = day + "/" + month + "/" + year;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date = format.parse(composition);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        format.applyPattern("EEEE");

        System.out.println(format.format(date).toUpperCase());

    }
}