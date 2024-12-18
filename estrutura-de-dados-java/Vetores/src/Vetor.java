public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
// O(n) no pior caso

  /*
      public void adiciona(String elemento){
            for (int i = 0; i < elementos.length; i++){
                if (this.elementos[i] == null){
                    this.elementos[i] = elemento;
                    break;
                }
            }
        }
    */

// O(1) constante
    // Outra opção é utilizar BOOLEAN no lugar de lançar exceções.
    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor está cheio");
        }
    }
}
