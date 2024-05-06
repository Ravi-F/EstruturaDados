package teste_vetores;

import com.ravi.estruturadados.Lista;
import com.ravi.estruturadados.VetorObjetos;

public class aula11 {
    public static void main(String[] args) {
        Lista<contato> vetor = new Lista<contato>(3);

        contato c1 = new contato("joao","(43)89387-2323","joaozinho@gmail.com");
        contato c2 = new contato("maria","(43)43243-2323","maria@gmail.com");
        contato c3 = new contato("gogo","(43)32424-2323","goku@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);



        System.out.println(vetor);
    }
}
