package celso;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        double numUm = 2.0;
        double numDois = 3.0;
        double resultadoEsperado = 5.0;
        double resultadoObtido = Calculadora.soma(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void testSubtracao() {
        double numUm = 5.0;
        double numDois = 2.0;
        double resultadoEsperado = 3.0;
        double resultadoObtido = Calculadora.subtracao(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void testMultiplicacao() {
        double numUm = 2.0;
        double numDois = 3.0;
        double resultadoEsperado = 6.0;
        double resultadoObtido = Calculadora.multiplicacao(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void testDivisao() {
        double numUm = 6.0;
        double numDois = 2.0;
        double resultadoEsperado = 3.0;
        double resultadoObtido = Calculadora.divisao(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void testDivisaoPorZero() {
        double numUm = 6.0;
        double numDois = 0.0;
        double resultadoEsperado = Double.POSITIVE_INFINITY;
        double resultadoObtido = Calculadora.divisao(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void testPotenciacao() {
        double numUm = 2.0;
        double numDois = 3.0;
        double resultadoEsperado = 8.0;
        double resultadoObtido = Calculadora.potenciacao(numUm, numDois);
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }
}
