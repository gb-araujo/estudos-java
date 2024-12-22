import java.util.Arrays;

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

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){
                throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];

    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i ++){
            s.append(this.elementos[i]);
            s.append( ", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }



}
