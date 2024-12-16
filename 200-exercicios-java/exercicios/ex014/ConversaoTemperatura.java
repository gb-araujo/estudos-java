package exercicios.ex014;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversao de temperatura de Celsius para Fahrenheit");
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é de " + fahrenheit);

    }
}
