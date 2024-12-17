package exercicios.ex017;

import java.util.Scanner;

public class VerificacaoParidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        if (valor % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
