package com.ravi.estruturadados;

import java.lang.reflect.Array;

public class Lista<T> {
    private T [] elementos;
    private int tamanho;
    public Lista(int capacidade){
        this.elementos = (T[]) new Object [capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse,capacidade);
        this.tamanho = 0;
    }

    // Método de adição de elementos e restrição por bootlean
    public boolean adiciona (T elemento)  {
        this.aumentaCapacidade();
        if(this.tamanho< this.elementos.length){
            this.elementos[this.tamanho] = (T) elemento;
            this.tamanho++;
            return true;
        }else {
            return false;
        }
    }

    public boolean adiciona (int posicao, Object elemento){

        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        this.aumentaCapacidade();

        // mover todos os elementos
        for(int i = this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = (T) elemento;
        this.tamanho++;

        return false;
    }

    // para aumentar a capacidade do vetor
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i =0; i<this.elementos.length; i++){
                elementosNovos[i]= this.elementos[i];
            }
            this.elementos = (T[]) elementosNovos;
        }
    }
    // Obter posição do elemento
    public Object busca(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        return this.elementos[posicao];
    }
    // Verificar se o elemento existe
    public int busca(T elemento){
        for(int i = 0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for(int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    // Imprimir tamanho do vetor
    public int tamanho(){
        return this.tamanho;
    }
// Imprimir elementos do vetor

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0 ; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();

    }
}
