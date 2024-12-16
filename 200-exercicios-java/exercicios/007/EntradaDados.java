import java.util.Scanner;

public class EntradaDados {
    /*
     * Escreva um programa que leia um número inteiro e um número decimal do teclado e, em seguida, exiba a soma desses números no console.  utilize o pacote/classe Scanner.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numInt = scanner.nextInt();
        System.out.println("Digite um número Decimal");
        double numDec = scanner.nextDouble();
        System.out.println("Soma: " + (numInt + numDec));
        scanner.close();


    }
}
