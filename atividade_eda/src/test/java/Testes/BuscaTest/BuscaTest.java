package Testes.BuscaTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.atividade.example.Busca.Busca;

public class BuscaTest {

    private final int[] numerosOrdenados = {
        1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
    };

    private final Busca busca = new Busca();

    
  //Testando com valor encontrado...

    @Test
    public void testBuscaLinearIterativa() throws Exception {
        assertTrue( busca.buscaLinear_iterativa(numerosOrdenados, 10) );
    }
    
    @Test
    public void testBuscaLinearRecursiva() throws Exception {
    	assertTrue( busca.buscaLinear_recursiva(numerosOrdenados, 10) );
    }
    
    @Test
    public void testBuscaBinariaIterativa() throws Exception {
    	assertTrue( busca.buscaBinaria_iterativa(numerosOrdenados, 10) );
    }

    @Test
    public void testBuscaBinariaRecursiva() throws Exception {
    	assertTrue( busca.buscaBinaria_recursiva(numerosOrdenados, 10) );
    }

    @Test
    public void testBuscaLinearIterativa2Pontas() throws Exception {
    	assertTrue( busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, 10) );
    }
    
    //Testando com valor inexistente...
    
    @Test
    public void testBuscaLinearIterativa_valorInexistente() throws Exception {
    	assertFalse( busca.buscaLinear_iterativa(numerosOrdenados, -1) );
    }
    
    @Test
    public void testBuscaLinearRecursiva_valorInexistente() throws Exception {
    	assertFalse( busca.buscaLinear_recursiva(numerosOrdenados, -1) );
    }
    
    @Test
    public void testBuscaBinariaIterativa_valorInexistente() throws Exception {
    	assertFalse( busca.buscaBinaria_iterativa(numerosOrdenados, -1) );
    }

    @Test
    public void testBuscaBinariaRecursiva_valorInexistente() throws Exception {
    	assertFalse( busca.buscaBinaria_recursiva(numerosOrdenados, -1) );
    }

    @Test
    public void testBuscaLinearIterativa2Pontas_valorInexistente() throws Exception {
    	assertFalse( busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, -1) );
    }

}
