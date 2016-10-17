import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale inLocale = new Locale.Builder().setRegion("IN").build();

        NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        DecimalFormat myFormatter = new DecimalFormat("Rs'.'" + "###,###,###.00");
        DecimalFormatSymbols symbols = myFormatter.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs.");
        myFormatter.setDecimalFormatSymbols(symbols);

        String us = usNumberFormat.format(payment);
        String india = myFormatter.format(payment);
        String china = chNumberFormat.format(payment);
        String france = frNumberFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}