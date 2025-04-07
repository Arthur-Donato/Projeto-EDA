package br.com.atividade.example.Busca;

public class Busca implements Busca_IF{

    @Override
    public int[] geraVetorNumericoOrdenado(int tamanho) {
        // TODO Auto-generated method stub
        int[] numeros = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            numeros[i] = i + 1;
        }

        return numeros;
    }

    @Override
    public boolean buscaLinear_iterativa(int[] numeros, int k) {
        for(int i : numeros){
            if(i == k){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean buscaLinear_recursiva(int[] numeros, int k) {
       return  buscaLinearRecursivaAux(numeros, k, 0);

    }

    public boolean buscaLinearRecursivaAux(int[] numeros, int numeroProcurado, int indice){
        if(indice < numeros.length){
            if(numeros[indice] == numeroProcurado){
                return true;
            }
            else{
                return buscaLinearRecursivaAux(numeros, numeroProcurado, indice + 1);
            }
        }

        return false;
    }

    @Override
    public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
        int i = 0;
        int j = numeros.length - 1;
        while(i < numeros.length){
            if(numeros[i] == k || numeros[j] == k){
                return true;
            }
            else{
                i++;
                j--;
            }
        }

        return false;
    }

    @Override
    public boolean buscaBinaria_iterativa(int[] numeros, int k) {
        int indiceInicio = 0;
        int indiceFinal = numeros.length - 1;

        while(indiceInicio <= indiceFinal){
            int indiceMeio = indiceInicio + (indiceFinal - indiceInicio) / 2;

            if(numeros[indiceMeio] == k){
                return true;
            }
            else if(k < numeros[indiceMeio]){
                indiceFinal = indiceMeio - 1;
            }
            else if(k > numeros[indiceMeio]){
                indiceInicio = indiceMeio + 1;
            }
        }
        return false;
    }

    @Override
    public boolean buscaBinaria_recursiva(int[] numeros, int k) {
        return buscaBinariaRecursivaAux(numeros, k, 0, numeros.length - 1);
    }

    public boolean buscaBinariaRecursivaAux(int[] numeros, int numeroProcurado, int indiceInicio, int indiceFinal){

        if(indiceInicio > indiceFinal){
            return false;
        }
        int indiceDoMeio = indiceInicio + (indiceFinal - indiceInicio) / 2;
        System.out.println(indiceDoMeio);

        if(numeros[indiceDoMeio] == numeroProcurado){
            return true;
        }
        else if(numeroProcurado < numeros[indiceDoMeio]){
            return buscaBinariaRecursivaAux(numeros, numeroProcurado, indiceInicio, indiceDoMeio - 1);
        }
        else if(numeroProcurado > numeros[indiceDoMeio]){
            return buscaBinariaRecursivaAux(numeros, numeroProcurado, indiceDoMeio + 1, indiceFinal);
        }
        return false;
    }
    
}