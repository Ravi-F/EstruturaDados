package teste_vetores;

import com.ravi.estruturadados.Vetor;

//busca de elemento sequencial, verificar se ele existe

public class aula6 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("elemento 1"));
    }
}
