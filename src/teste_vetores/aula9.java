package teste_vetores;

import com.ravi.estruturadados.Vetor;

public class aula9 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");



        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover elemento E ");

        int pos = vetor.busca("E");
            if(pos > -1){
                vetor.remove(pos);
            } else {
                System.out.println("Elemento não existe no vetor");
            }
        System.out.println(vetor);
    }
}
