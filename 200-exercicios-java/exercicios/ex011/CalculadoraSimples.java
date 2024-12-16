package exercicios.ex011;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.printf(
                "Resultado \n" +
                "Soma: " + (num1 + num2) + "\n" +
                "Subtração: " + (num1 - num2) + "\n" +
                "Multiplicação: " + (num1 * num2) + "\n" +
                "Divisão: " + (num1 / num2) + "\n" +
                "Módulo: " + (num1 % num2) + "\n"
        );

        scanner.close();

    }
}
