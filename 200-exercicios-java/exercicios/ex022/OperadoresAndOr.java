package exercicios.ex022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadoresAndOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;


        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();


        if(num1 > 10 || num2 > 10 || num3 > 10){
            System.out.println("Pelo menos um deles é maior que 10");
        } else {
            System.out.println("Nenhum é maior que 10");
        }

        if(num1 > 10 && num2 > 10 && num3 > 10){
            System.out.println("Todos são maior que 10");
        } else{
            System.out.println("Nem todos são maiores que 10");
        }

        sc.close();

    }
}
