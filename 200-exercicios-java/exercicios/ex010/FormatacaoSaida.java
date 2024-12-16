package exercicios.ex010;

import java.util.Locale;

public class FormatacaoSaida {
    public static void main(String[] args) {

        Locale locale = new Locale("en", "US");
        double variavel = 1.23456789;
        System.out.printf(locale , "%.2f%n", variavel);
    }
}