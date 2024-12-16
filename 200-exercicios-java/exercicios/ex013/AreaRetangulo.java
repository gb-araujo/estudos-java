package exercicios.ex013;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        System.out.println("Area do Retangulo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura do retangulo");
        double altura = scanner.nextDouble();

        double area = largura * altura;
        System.out.println("A aréa é de : " + area);
    }
}
