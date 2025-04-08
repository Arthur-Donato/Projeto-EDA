package br.com.atividade.example.Ordenacao;
import java.util.Random;
public class Ordenacao implements Ordenacao_IF{

    @Override
    public boolean checaVetorOrdenado(int[] numeros) {
        boolean ordenado = true;

        for(int i = 0; i < numeros.length - 1; i++){
            if(numeros[i] > numeros[i + 1]){
                ordenado = false;
            }
        }

        return ordenado;
    }

    @Override
    public long bubbleSort(int[] numeros) {
        long tempoInicial = System.nanoTime();
        if(checaVetorOrdenado(numeros)){
            return 0;
        }
        else{
            for(int i = 0; i < numeros.length - 1; i++) {
                for(int j = 0; j < numeros.length - 1; j++) {
                    if(numeros[j] > numeros[j + 1]){
                        int numeroTemporario = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = numeroTemporario;
                    }
                }
            }
        }
        return System.nanoTime() - tempoInicial;
    }

    @Override
    public long selectionSort(int[] numeros) {
        return -1;
    }

    @Override
    public long insertionSort(int[] numeros) {
        return -1;
    }

    @Override
    public long mergeSort(int[] numeros) {
        long tempoInicial = System.nanoTime();

        if (numeros == null || numeros.length < 2) {
            return 0;
        }

        mergeSortHelper(numeros, 0, numeros.length - 1);

        return System.nanoTime() - tempoInicial;
    }

    private void mergeSortHelper(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            mergeSortHelper(array, esquerda, meio);
            mergeSortHelper(array, meio + 1, direita);

            merge(array, esquerda, meio, direita);
        }
    }

    private void merge(int[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[esquerda + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[meio + 1 + j];

        int i = 0, j = 0;
        int k = esquerda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public long quickSort(int[] numeros) {
        long tempoInicial = System.nanoTime();
        if(checaVetorOrdenado(numeros)){
        }
        else{
            quickSortPrimeiroElemento(numeros, 0, numeros.length - 1);
        }
        return System.nanoTime() - tempoInicial;
    }

    public void quickSortPrimeiroElemento(int[] numeros, int primeiroIndice, int ultimoIndice){
        if(primeiroIndice < ultimoIndice){
            int pivot = particaoPivotPrimeiroElemento(numeros, primeiroIndice, ultimoIndice);
            quickSortPrimeiroElemento(numeros, primeiroIndice, pivot - 1);
            quickSortPrimeiroElemento(numeros, pivot + 1, ultimoIndice);
        }
    }

    public int particaoPivotPrimeiroElemento(int[] numeros, int primeiroIndice, int ultimoIndice){
        int pivot = numeros[primeiroIndice];
        int i = primeiroIndice + 1;
        int j = ultimoIndice;

        while(i <= j){
            if(numeros[i] <= pivot){
                i++;
            }
            else if(numeros[j] > pivot){
                j--;
            }
            else{
                trocarElementos(numeros, i, j);
            }
        }
        trocarElementos(numeros, primeiroIndice, j);
        return j;
    }


    @Override
    public long random_quickSort(int[] numeros) {
        long tempoInicial = System.nanoTime();
        if(checaVetorOrdenado(numeros)){
        }
        else{
            quickSortElementoRandom(numeros, 0, numeros.length - 1);
        }
        return System.nanoTime() - tempoInicial;
    }

    public void quickSortElementoRandom(int[] numeros, int primeiroIndice, int ultimoIndice){
        if(primeiroIndice < ultimoIndice){
            int pivot = particaoPivotElementoAleatorio(numeros, primeiroIndice, ultimoIndice);
            quickSortElementoRandom(numeros, primeiroIndice, pivot - 1);
            quickSortElementoRandom(numeros, pivot + 1, ultimoIndice);
        }
    }

    public int particaoPivotElementoAleatorio(int[] numeros, int primeiroIndice, int ultimoIndice){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(primeiroIndice, ultimoIndice);

        trocarElementos(numeros, indiceAleatorio, ultimoIndice);
        int pivot = numeros[ultimoIndice];
        int i = primeiroIndice - 1;

        for(int j = primeiroIndice; j < ultimoIndice; j++){
            if(numeros[j] < pivot){
                i++;
                trocarElementos(numeros, i, j);
            }
        }
        trocarElementos(numeros, i + 1, ultimoIndice);
        return i + 1;
    }

    @Override
    public long quickSort_Java(int[] numeros) {
        long tempoInicial = System.nanoTime();
        if(checaVetorOrdenado(numeros)){
        }
        else{
            quickSortJava(numeros, 0, numeros.length - 1);
        }
        return System.nanoTime() - tempoInicial;
    }

    public void quickSortJava(int[] arr, int low, int high){
        if (low < high) {
            // Seleciona dois pivôs
            int pivot1, pivot2;
            if (arr[low] > arr[high]) {
                trocarElementos(arr, low, high);
            }
            pivot1 = arr[low];
            pivot2 = arr[high];

            int lt = low + 1;
            int gt = high - 1;
            int i = lt;

            while (i <= gt) {
                if (arr[i] < pivot1) {
                    trocarElementos(arr, i, lt);
                    lt++;
                } else if (arr[i] > pivot2) {
                    trocarElementos(arr, i, gt);
                    gt--;
                    i--; // Decrementa i pra reavaliar o elemento trocado
                }
                i++;
            }

            lt--;
            gt++;

            trocarElementos(arr, low, lt);
            trocarElementos(arr, high, gt);

            // Recursão nas três regiões
            quickSortJava(arr, low, lt - 1);
            quickSortJava(arr, lt + 1, gt - 1);
            quickSortJava(arr, gt + 1, high);
        }
    }

    @Override
    public long countingSort(int[] numeros) {
        long tempoInicial = System.nanoTime();
        long operacoes = 0L;

        if (numeros == null || numeros.length == 0) {
            return operacoes;
        }

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            operacoes++;
            if (numeros[i] > max) {
                max = numeros[i];
            }
            operacoes++;
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        operacoes += numeros.length - 1;

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            count[numeros[i] - min]++;
            operacoes++;
        }
        operacoes += numeros.length;

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
            operacoes++;
        }
        operacoes += count.length - 1;

        for (int i = numeros.length - 1; i >= 0; i--) {
            output[--count[numeros[i] - min]] = numeros[i];
            operacoes++;
        }
        operacoes += numeros.length;

        System.arraycopy(output, 0, numeros, 0, numeros.length);
        operacoes += numeros.length;

        return System.nanoTime() - tempoInicial;
    }

    public void trocarElementos(int[] numeros, int primeiroIndice, int segundoIndice){
        int numeroTemporario = numeros[primeiroIndice];
        numeros[primeiroIndice] = numeros[segundoIndice];
        numeros[segundoIndice] = numeroTemporario;
    }

}
