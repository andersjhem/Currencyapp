package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrencyConverter {
    private static final double SEK_TO_USD_RATE = 0.10;
    private static final double USD_TO_SEK_RATE = 9.96;
    private static final double SEK_TO_EURO_RATE = 0.09;
    private static final double EURO_TO_SEK_RATE = 10.98;
    private static final double USD_TO_EURO_RATE = 0.91;
    private static final double EURO_TO_USD_RATE = 1.10;

    public double convertSEKtoUSD(double amount) {
        return formatOutput(amount * SEK_TO_USD_RATE);
    }

    public double convertUSDtoSEK(double amount) {
        return formatOutput(amount * USD_TO_SEK_RATE);
    }

    public double convertSEKtoEuro(double amount) {
        return formatOutput(amount * SEK_TO_EURO_RATE);
    }

    public double convertEuroToSEK(double amount) {
        return formatOutput(amount * EURO_TO_SEK_RATE);
    }

    public double convertUSDtoEuro(double amount) {
        return formatOutput(amount * USD_TO_EURO_RATE);
    }

    public double convertEuroToUSD(double amount) {
        return formatOutput(amount * EURO_TO_USD_RATE);
    }

    private double formatOutput(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }

    public String getCurrentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
