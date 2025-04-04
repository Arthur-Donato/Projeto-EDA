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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countingSort'");
    }

    public void trocarElementos(int[] numeros, int primeiroIndice, int segundoIndice){
        int numeroTemporario = numeros[primeiroIndice];
        numeros[primeiroIndice] = numeros[segundoIndice];
        numeros[segundoIndice] = numeroTemporario;
    }
    
}
