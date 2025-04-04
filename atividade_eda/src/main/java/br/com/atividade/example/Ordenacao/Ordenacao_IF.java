package br.com.atividade.example.Ordenacao;

public interface Ordenacao_IF{
    boolean checaVetorOrdenado(int[] numeros);
	
	long bubbleSort(int[] numeros); //caso não o implementem, deixem apenas um return -1 (sigam a interface!)
	
	long selectionSort(int[] numeros); //caso não o implementem, deixem apenas um return -1 (sigam a interface!)
	
	long insertionSort(int[] numeros); //caso não o implementem, deixem apenas um return -1 (sigam a interface!)
	
	long mergeSort(int[] numeros);

	long quickSort(int[] numeros); // Versão do slide
	
	long random_quickSort(int[] numeros); // Versão do slide + Shuffle (pivô aleatório)
	
	long quickSort_Java(int[] numeros); // Versão do Arrays.sort
	
	long countingSort(int[] numeros);
}