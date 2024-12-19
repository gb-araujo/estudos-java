package exercicios.ex023;

import java.util.Scanner;

public class VerificacaoMaioria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade1, idade2, idade3, maioridade;

        idade1 = sc.nextInt();
        idade2 = sc.nextInt();
        idade3 = sc.nextInt();
        maioridade = 0;

        if(idade1 >= 18)  maioridade++;
        if (idade2 >= 18) maioridade++;
        if (idade3 >= 18) maioridade++;
        System.out.println("Maioridade = " + maioridade);

        sc.close();

    }
}
