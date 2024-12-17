package exercicios.ex016;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        } else if(num1 < num2){
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num1 + " é igual a " + num2);
        }

        sc.close();
    }

}
