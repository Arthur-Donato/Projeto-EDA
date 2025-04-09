package br.com.atividade.example.Ordenacao;

import java.util.Random;

public class OrdenacaoMain {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();

        int[] vetorOrdenado100k = geraVetorOrdenado(100000);
        int[] vetorOrdenado10k = geraVetorOrdenado(10000);
        int[] vetorOrdenado1k = geraVetorOrdenado(1000);

        int[] vetorAleatorio100k = geraVetorAleatorio(100000);
        int[] vetorAleatorio10k = geraVetorAleatorio(10000);
        int[] vetorAleatorio1k = geraVetorAleatorio(1000);

        int[] vetorOrdemInversa100k = gerarVetorDeOrdemInversa(100000);
        int[] vetorOrdemInversa10k = gerarVetorDeOrdemInversa(10000);
        int[] vetorOrdemInversa1k = gerarVetorDeOrdemInversa(1000);

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO BUBBLE SORT COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Bubble Sort (1000 elementos): "+ ordenacao.bubbleSort(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (10000 elementos): "+ ordenacao.bubbleSort(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (100000 elementos): "+ ordenacao.bubbleSort(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO BUBBLE SORT COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Bubble Sort (1000 elementos): "+ ordenacao.bubbleSort(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (10000 elementos): "+ ordenacao.bubbleSort(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (100000 elementos): "+ ordenacao.bubbleSort(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO BUBBLE SORT COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Bubble Sort (1000 elementos): "+ ordenacao.bubbleSort(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (10000 elementos): "+ ordenacao.bubbleSort(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Bubble Sort (100000 elementos): "+ ordenacao.bubbleSort(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO MERGE SORT COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Merge Sort (1000 elementos): "+ ordenacao.mergeSort(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (10000 elementos): "+ ordenacao.mergeSort(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (100000 elementos): "+ ordenacao.mergeSort(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO MERGE SORT COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Merge Sort (1000 elementos): "+ ordenacao.mergeSort(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (10000 elementos): "+ ordenacao.mergeSort(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (100000 elementos): "+ ordenacao.mergeSort(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO MERGE SORT COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Merge Sort (1000 elementos): "+ ordenacao.mergeSort(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (10000 elementos): "+ ordenacao.mergeSort(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Merge Sort (100000 elementos): "+ ordenacao.mergeSort(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO QUICK SORT COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Quick Sort (1000 elementos): "+ ordenacao.quickSort(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (10000 elementos): "+ ordenacao.quickSort(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (100000 elementos): "+ ordenacao.quickSort(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Quick Sort (1000 elementos): "+ ordenacao.quickSort(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (10000 elementos): "+ ordenacao.quickSort(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (100000 elementos): "+ ordenacao.quickSort(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Quick Sort (1000 elementos): "+ ordenacao.quickSort(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (10000 elementos): "+ ordenacao.quickSort(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort (100000 elementos): "+ ordenacao.quickSort(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO QUICK SORT RANDOM COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Quick Sort Random (1000 elementos): "+ ordenacao.random_quickSort(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (10000 elementos): "+ ordenacao.random_quickSort(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (100000 elementos): "+ ordenacao.random_quickSort(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT RANDOM COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Quick Sort Random (1000 elementos): "+ ordenacao.random_quickSort(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (10000 elementos): "+ ordenacao.random_quickSort(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (100000 elementos): "+ ordenacao.random_quickSort(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT RANDOM COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Quick Sort Random (1000 elementos): "+ ordenacao.random_quickSort(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (10000 elementos): "+ ordenacao.random_quickSort(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Random (100000 elementos): "+ ordenacao.random_quickSort(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO QUICK SORT JAVA COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Quick Sort Java (1000 elementos): "+ ordenacao.quickSort_Java(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (10000 elementos): "+ ordenacao.quickSort_Java(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (100000 elementos): "+ ordenacao.quickSort_Java(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT JAVA COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Quick Sort Java (1000 elementos): "+ ordenacao.quickSort_Java(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (10000 elementos): "+ ordenacao.quickSort_Java(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (100000 elementos): "+ ordenacao.quickSort_Java(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO QUICK SORT JAVA COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Quick Sort Java (1000 elementos): "+ ordenacao.quickSort_Java(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (10000 elementos): "+ ordenacao.quickSort_Java(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Quick Sort Java (100000 elementos): "+ ordenacao.quickSort_Java(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO COUNTING SORT COM VETOR ORDENADO");
        System.out.println("Tempo de execucao do Counting Sort (1000 elementos): "+ ordenacao.countingSort(vetorOrdenado1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (10000 elementos): "+ ordenacao.countingSort(vetorOrdenado10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (100000 elementos): "+ ordenacao.countingSort(vetorOrdenado100k) + " nanosegundos.");
        System.out.println("TESTANDO COUNTING SORT COM VETOR ALEATORIO");
        System.out.println("Tempo de execucao do Counting Sort (1000 elementos): "+ ordenacao.countingSort(vetorAleatorio1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (10000 elementos): "+ ordenacao.countingSort(vetorAleatorio10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (100000 elementos): "+ ordenacao.countingSort(vetorAleatorio100k) + " nanosegundos.");
        System.out.println("TESTANDO COUNTING SORT COM VETOR DE ORDEM INVERSA");
        System.out.println("Tempo de execucao do Counting Sort (1000 elementos): "+ ordenacao.countingSort(vetorOrdemInversa1k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (10000 elementos): "+ ordenacao.countingSort(vetorOrdemInversa10k) + " nanosegundos.");
        System.out.println("Tempo de execucao do Counting Sort (100000 elementos): "+ ordenacao.countingSort(vetorOrdemInversa100k) + " nanosegundos.");
        System.out.println("------------------------------------------------------");
    }

    public static int[] geraVetorOrdenado(int tamanho){
        int[] vetorOrdenado = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            vetorOrdenado[i] = i;
        }

        return vetorOrdenado;
    }

    public static int[] geraVetorAleatorio(int tamanho){
        int[] vetorAleatorio = new int[tamanho];
        Random random = new Random();
        for(int i = 0; i < tamanho; i++){
            vetorAleatorio[i] = random.nextInt(101);
        }

        return vetorAleatorio;
    }

    public static int[] gerarVetorDeOrdemInversa(int tamanho){
        int[] vetorDeOrdemInversa = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            vetorDeOrdemInversa[i] = tamanho - i;
        }

        return vetorDeOrdemInversa;
    }
    
}
