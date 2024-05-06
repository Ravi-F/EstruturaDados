package com.ravi.estruturadados;

import java.util.Arrays;

public class Vetor {
    private String [] elementos;
    private int tamanho;
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
// método simples de adição sem retorno de tamanho

    /* public void adiciona (String elemento){
        for(int i =0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }*/

// método de adição com restrição de tamanho com mensagem de Exception

    /*public void adiciona (String elemento) throws Exception {

        if(this.tamanho< this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

        }else {
            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos.");
        }
    }*/


// Método de adição de elementos e restrição por bootlean
    public boolean adiciona (String elemento)  {
        this.aumentaCapacidade();
        if(this.tamanho< this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else {
            return false;
        }
    }

        public boolean adiciona (int posicao, String elemento){

            if(!(posicao>=0 && posicao<tamanho)){
                throw new IllegalArgumentException("Posição Inválida");
            }

            this.aumentaCapacidade();

        // mover todos os elementos
            for(int i = this.tamanho-1; i>=posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;

            return false;
        }

        // para aumentar a capacidade do vetor
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i =0; i<this.elementos.length; i++){
                elementosNovos[i]= this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
// Obter posição do elemento
    public String busca(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        return this.elementos[posicao];
    }
// Verificar se o elemento existe
    public int busca(String elemento){
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
