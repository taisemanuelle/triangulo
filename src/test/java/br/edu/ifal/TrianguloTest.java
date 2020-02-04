package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo T1;
    Triangulo T2;
    Triangulo T3;
    Triangulo T4;
    Triangulo T5;
    Triangulo T6;

    @Before
    public void inicializacao() {
        
    T1 = new Triangulo(2, 3, 4);
    T2 = new Triangulo(0, 0, 0);
    T3 = new Triangulo(4, 4, 6);
    T4 = new Triangulo(4, 4, 4);
    T5 = new Triangulo(4, 3 ,8);
    T6 = new Triangulo(-1,3 ,5);
    

    }
    
    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero(){
        
        String validadeRetornada =  T2.getTipo(T2);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);

    }
      
    @Test
    public void deveRetornarIlegalSempreQueUmLadoForMenorQueASubtracaoDosOutrosDois(){
        
        String validadeRetornada =  T5.getTipo(T5);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);
    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes(){
        
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarIsoscelesParaDoisLadosIguais(){
        
        String validadeRetornada =  T3.getTipo(T3);
        String validadeEsperada = "Isosceles";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarEquilateroParaTodosOsLadosIguais(){
        
        String validadeRetornada =  T4.getTipo(T4);
        String validadeEsperada = "Equilatero";
        assertEquals(validadeEsperada,validadeRetornada);
    }

    @Test
    public void deveRetornarEscalenoSe2ForMaiorQue4Menos3(){
        
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarEscalenoSe4ForMaiorQue2Menos3(){
        
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarEscalenoSe3ForMaiorQue2Menos4(){
        
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarEquilateroSe4ForMaiorQue4Menos4(){
        
        String validadeRetornada =  T4.getTipo(T4);
        String validadeEsperada = "Equilatero";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarIsoscelesSe4ForMaiorQue4Menos6(){
        
        String validadeRetornada =  T3.getTipo(T3);
        String validadeEsperada = "Isosceles";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    @Test
    public void deveRetornarIsoscelesSe6ForMaiorQue4Menos4(){
        
        String validadeRetornada =  T3.getTipo(T3);
        String validadeEsperada = "Isosceles";
        assertEquals(validadeEsperada,validadeRetornada);
    }

    @Test
    public void deveRetornarIlegalParaLadosComNumerosNegativos(){
        
        String validadeRetornada =  T6.getTipo(T6);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);

    }
    




    



}