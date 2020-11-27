package calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void sumarTest(){
        //Resultado esperado: 10.0
        Calculadora calculadora = new Calculadora();

        assertEquals(-10.0, calculadora.sumar(-3, -7), 0.001);
    }

    @Test
    public void restarTest(){
        //Resultado esperado: -4.0
        Calculadora calculadora = new Calculadora();

        assertEquals(12.0, calculadora.restar(5, -7), 0.001);
    }

    @Test
    public void multiplicarTest(){
        //Resultado esperado 9.0
        Calculadora calculadora = new Calculadora();

        assertEquals(12.0, calculadora.multiplicar(4, 3), 0.001);
    }

    @Test
    public void dividirTest(){
        //Resultado esperado: 4.0
        Calculadora calculadora = new Calculadora();

        assertEquals(5.0, calculadora.dividir(10, 2), 0.001);
    }

    @Test
    public void potenciarTest(){
        //Resultado esperado: 8.0
        Calculadora calculadora = new Calculadora();

        assertEquals(4.0, calculadora.potenciar(2, 2), 0.001);
    }
    
}
