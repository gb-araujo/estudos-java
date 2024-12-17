package exercicios.ex019;
import java.util.Scanner;

public class ElegibilidadeVotacao {
    public static void main(String[] args) {
        System.out.println("Digite sua idade pra verificar se pode ou não votar");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Não pode votar");
        } else {
            System.out.println("Pode votar");
        }
    }
}
