public class Main {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("Gabriel");
        vetor.adiciona("Mara");
        vetor.adiciona("Iasmin");
        System.out.println(vetor.tamanho());
    }
}
