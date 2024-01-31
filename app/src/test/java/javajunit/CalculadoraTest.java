package javajunit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {


    @BeforeAll
    static void executaAlgumaCoisa(){
        System.out.println("Executando algo antes de tudo");
    }

    @BeforeEach
    void executaAlgumaCoisaParaCadaTeste(){
        System.out.println("Executando algo para cada teste");
    }


    @Test
    @DisplayName("Testando se esta somando correntamente")
    void deveSomarCorrentamente(){
        assertEquals(5+5,Calculadora.somar(5,5));
    }

    @Test
    void deveSubtrairCorrentamente(){
        assertEquals(10-2,Calculadora.subtrair(10,2));
    }

    @Test
    void deveDividirCorrentamente(){
        assertEquals(20.0/3,Calculadora.dividir(20,3));
    }

    @Test
    void deveMultiplicarCorrentamente(){
        assertEquals(3*5,Calculadora.multiplicar(3,5));
    }

    @Test
    void verificaSeLancaExcecaoAoDividirPorZero(){
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(5,0));
    }
}
