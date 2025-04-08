package br.com.atividade.example;

import br.com.atividade.example.Busca.Busca;
import br.com.atividade.example.Ordenacao.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] array = {1,3,5,7,9,2,4,6,8,10,11,13,15,12,14};

        System.out.println("Tempo de execucao do Bubble Sort: "+ ordenacao.bubbleSort(array) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort: "+ ordenacao.mergeSort(array) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort: "+ ordenacao.quickSort(array) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random: "+ ordenacao.random_quickSort(array) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java: "+ ordenacao.quickSort_Java(array) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort: "+ ordenacao.countingSort(array) + " nanosegundos.");
    }
}