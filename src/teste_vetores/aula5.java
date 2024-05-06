package teste_vetores;

import com.ravi.estruturadados.Vetor;

//busca de elementos

public class aula5 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("elemento 1"); //0
        vetor.adiciona("elemento 2"); //1
        vetor.adiciona("elemento 3"); //2
        vetor.adiciona("elemento 4"); //3

        System.out.println(vetor.busca(3));
    }
}
