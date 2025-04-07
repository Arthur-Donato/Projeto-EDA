package br.com.atividade.example;

import br.com.atividade.example.Busca.Busca;
import br.com.atividade.example.Ordenacao.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] array = {2,1,5,4};

        long retornoDeFuncao = ordenacao.random_quickSort(array);

        if(retornoDeFuncao == 0){
            System.out.println("O vetor ja estava ordenado");
        }
        else if(retornoDeFuncao == 1){
            System.out.println("O vetor foi ordenado com sucesso!");
        }

        for(int i : array){
            System.out.println(i);
        }

        Busca buscarPorElemento = new Busca();

        boolean resultado = buscarPorElemento.buscaBinaria_iterativa(buscarPorElemento.geraVetorNumericoOrdenado(5), 5);

        System.out.println(resultado);
    }
}