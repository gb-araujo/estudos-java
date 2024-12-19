package exercicios.ex025;

import java.util.Scanner;

public class VerificacaoPositivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int positivo = 0;

        if(num1 > 0) positivo++;
        if(num2 > 0) positivo++;
        if(num3 > 0) positivo++;

        if(positivo > 2){
            System.out.println("Pelo menos dois são positivos");
        } else {
            System.out.println("Menos de dois são positivos");
        }



    }
}
