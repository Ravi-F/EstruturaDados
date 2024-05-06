package teste_vetores;

import java.util.ArrayList;

public class aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1,"F");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("Z");
        if (existe){
            System.out.println("Elemento existe no Array");
        }else {
            System.out.println("Elemento não existe no Array");
        }
        int pos = arrayList.indexOf("C");
        if (pos > -1){
            System.out.println("Elemento existe no Array");
        }else {
            System.out.println("Elemento não existe no Array");
        }

        System.out.println(arrayList.get(2));
    }
}
