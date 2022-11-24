import org.example.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    @DisplayName("teste soma")
    public void testSoma() {
        Calculadora calculo = new Calculadora();
        int soma = calculo.soma(2,5);
        int testSoma = 7;
        assertEquals (soma, testSoma, "Erro no calculo da soma!");
    }

}
