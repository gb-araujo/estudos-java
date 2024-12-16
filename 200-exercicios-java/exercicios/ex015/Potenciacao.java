package exercicios.ex015;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Potenciacao do primeiro numero elevado ao segundo");
        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        // math.pow recebe primeiro a base e depois o expoente
        int res = (int) Math.pow(num1, num2);
        System.out.println("Resultado: " + res);
    }
}
