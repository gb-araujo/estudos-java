package exercicios.ex021;

import java.util.Scanner;

public class ComparacaoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1.equals(str2));

        sc.close();

    }
}
