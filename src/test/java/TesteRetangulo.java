import org.example.Retangulo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteRetangulo {

    Retangulo retangulo = new Retangulo();


    @Test
    public void test1(){
        assertEquals(15,retangulo.area(3,5),"area errada");
        assertEquals(16,retangulo.perimetro(3,5),"perimetro errado");
    }

    @Test
    public void test2(){
        assertEquals(40,retangulo.area(5,8),"area errada");
        assertEquals(26,retangulo.perimetro(5,8),"perimetro errado");
    }

    @Test
    public void test3(){
        assertEquals(8,retangulo.area(2,4),"area errada");
        assertEquals(12,retangulo.perimetro(2,4),"perimetro errado");
    }

    @Test
    public void TriangleTest(){
        assertTrue(retangulo.isTriangle(2,2,3),"nao e triangulo");
    }


}
