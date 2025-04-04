package br.com.atividade.example.Ordenacao;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quickSort'");
    }

    @Override
    public long random_quickSort(int[] numeros) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'random_quickSort'");
    }

    @Override
    public long quickSort_Java(int[] numeros) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quickSort_Java'");
    }

    @Override
    public long countingSort(int[] numeros) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countingSort'");
    }
    
}
