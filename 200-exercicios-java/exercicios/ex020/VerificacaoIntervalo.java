package exercicios.ex020;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        if(numero < 10 || numero > 20){
            System.out.println("Não está entre 10 e 20");
        } else {
            System.out.println("O número está entre 10 e 20");
        }
    }
}
