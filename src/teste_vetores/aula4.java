package teste_vetores;

import com.ravi.estruturadados.Vetor;

// Imprimindo o tamanho e elementos do vetor

public class aula4 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
