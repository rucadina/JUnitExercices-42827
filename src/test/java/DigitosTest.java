import org.example.Digitos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitosTest {

    Digitos digito;

    @BeforeEach
    public void setup(){
        digito = new Digitos();
    }

    @Test
    public void mediaTest(){
        assertEquals(3,digito.CalculoDigito(126),"calculo errado");
    }
}
