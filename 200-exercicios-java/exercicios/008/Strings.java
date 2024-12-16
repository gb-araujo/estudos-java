import java.util.Scanner;

class Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();
        System.out.println("Boas vindas " + nome + " " + sobrenome);
        scanner.close();

    }
}