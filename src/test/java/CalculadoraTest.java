import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarDoisValores() {
        Calculadora calculadora= new Calculadora();
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.somar(valorA, valorB);

        Assertions.assertEquals(30, resultado);

    }
    @Test
    public void deveSubtrairDoisValores() {
        Calculadora calculadora = new Calculadora();
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.subtracao(valorA, valorB);

        Assertions.assertEquals(-10, resultado);

    }
    @Test
    public void deveMultiplicarDoisValores() {
        Calculadora calculadora = new Calculadora();
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.multiplicar(valorA, valorB);

        Assertions.assertEquals(200, resultado);
    }

    @Test
    public void deveDividirDoisValores() {
        Calculadora calculadora = new Calculadora();
        double valorA = 10;
        double valorB = 20;

        double resultado = calculadora.dividir(valorA, valorB);

        Assertions.assertEquals(0.5, resultado);
    }

}
