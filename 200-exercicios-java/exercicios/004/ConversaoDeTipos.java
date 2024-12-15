
/**
 * Escreva um programa que converta um valor double em int e outro valor int em double. Exiba os resultados das conversões.
 * Explique a diferença entre conversão explícita e implícita
 * TypeCasting
 * 
 * 
 * Resolução Abaixo
 * Explicação Conversão Explícita e Implícita:
 * A conversão explicita é declara por parenteses antes do valor a ser convertido, informando diretamente que o valor deve ser convertido.
 * Já a conversão implicita é feita de forma automática ao atribuir o valor em outra váriavel de tipo diferente.
 */

public class ConversaoDeTipos {
    public static void main(String[] args) {
        // CONVERSÃO EXPLICITA
        double valorDouble = 9.99;
        double valorConvertido = (int) valorDouble;
        System.out.println(valorConvertido);
        // CONVERSÃO IMPLICITA
        int valorInt = 10;
        double valorConvertido2 = valorInt;
        System.out.println(valorConvertido2);
    }    
}
