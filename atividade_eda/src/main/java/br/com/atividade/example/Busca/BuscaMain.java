package br.com.atividade.example.Busca;

public class BuscaMain {
    public static void main(String[] args) {
        Busca busca = new Busca();

        int[] tamanhos = {100, 1000, 10000};
        int valorBuscado = -1; // um valor que não existe, para forçar o pior caso

        for (int tamanho : tamanhos) {
            int[] vetor = busca.geraVetorNumericoOrdenado(tamanho);

            // Tempo da busca linear iterativa
            long inicioLinear = System.nanoTime();
            boolean resultadoLinear = busca.buscaLinear_iterativa(vetor, valorBuscado);
            long fimLinear = System.nanoTime();
            long tempoLinear = fimLinear - inicioLinear;

            // Tempo da busca binária iterativa
            long inicioBinaria = System.nanoTime();
            boolean resultadoBinaria = busca.buscaBinaria_iterativa(vetor, valorBuscado);
            long fimBinaria = System.nanoTime();
            long tempoBinaria = fimBinaria - inicioBinaria;

            System.out.println("Tamanho do vetor: " + tamanho);
            System.out.println("Busca Linear Iterativa: " + tempoLinear + " nanosegundos (Resultado: " + resultadoLinear + ")");
            System.out.println("Busca Binária Iterativa: " + tempoBinaria + " nanosegundos (Resultado: " + resultadoBinaria + ")");
            System.out.println("-----------------------------------------------------");
        }
    }
}
