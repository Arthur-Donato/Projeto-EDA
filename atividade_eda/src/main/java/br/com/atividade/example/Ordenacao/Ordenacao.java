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
        if(checaVetorOrdenado(numeros)){
            return 0;
        }
        else{
            for(int i = 0; i < numeros.length - 1; i++) {
                for(int j = 0; j < numeros.length - 1; j++) {
                    if(numeros[j] < numeros[j + 1]){
                        int numeroTemporario = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = numeroTemporario;
                    }
                }
            }
        }
        return 1;
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
        long startTime = System.currentTimeMillis();

        if (numeros == null || numeros.length < 2) {
            return 0;
        }

        mergeSortHelper(numeros, 0, numeros.length - 1);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
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
        if(checaVetorOrdenado(numeros)){
            return 0;
        }
        else{
            quickSortPrimeiroElemento(numeros, 0, numeros.length - 1);
            return 1;
        }
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
        if(checaVetorOrdenado(numeros)){
            return 0;
        }
        else{
            quickSortElementoRandom(numeros, 0, numeros.length - 1);
            return 1;
        }
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
        if(checaVetorOrdenado(numeros)){
            return 0;
        }
        else{
            quickSortJava(numeros, 0, numeros.length - 1);
            return 1;
        }
    }

    public void quickSortJava(int[] numeros, int primeiroIndice, int ultimoIndice){
        if(primeiroIndice < ultimoIndice){
            if(numeros[primeiroIndice] > numeros[ultimoIndice]){
                trocarElementos(numeros, primeiroIndice, ultimoIndice);
            }

            int primeiroPivot = numeros[primeiroIndice];
            int segundoPivot = numeros[ultimoIndice];

            int i = primeiroIndice + 1;
            int j = ultimoIndice - 1;
            int k = i;

            while(k <= j){
                if(numeros[i] < primeiroPivot){
                    trocarElementos(numeros, k,i);
                    i++;
                }
                else if(numeros[i] > segundoPivot){
                    trocarElementos(numeros, k, j);
                    j--;
                    k--;
                }
                k++;
            }
            i--;
            j++;

            trocarElementos(numeros, primeiroIndice, i);
            trocarElementos(numeros, ultimoIndice, j);

            quickSortJava(numeros, primeiroIndice, i - 1);
            quickSortJava(numeros, i + 1, j - 1);
            quickSortJava(numeros, j + 1, ultimoIndice);
        }
    }

    @Override
    public long countingSort(int[] numeros) {
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

        return operacoes;
    }

    public void trocarElementos(int[] numeros, int primeiroIndice, int segundoIndice){
        int numeroTemporario = numeros[primeiroIndice];
        numeros[primeiroIndice] = numeros[segundoIndice];
        numeros[segundoIndice] = numeroTemporario;
    }

}
