package br.com.atividade.example;

import br.com.atividade.example.Ordenacao.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] array = {2,1,4,5};
        System.out.println(ordenacao.bubbleSort(array));
    }
}