package exercicios.ex018;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " (1num) é maior");
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " (2num) é maior");
        }
        else {
            System.out.println(num3 + " (3num)  é o maior");
        }
    }
}
