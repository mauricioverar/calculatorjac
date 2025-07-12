package cl.mauriciovera;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  void testSumar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.sumar(2, 3));
  }

  @Test
  void testRestar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(2, calculadora.restar(5, 3));
  }

  @Test
  void testMultiplicar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(20, calculadora.multiplicar(4, 5));
  }

  @Test
  void testDividir() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.dividir(10, 2));
  }

  @Test
  void testDividirPorCero() {
    Calculadora calculadora = new Calculadora();
    try {
      calculadora.dividir(10, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("No se puede dividir por cero", e.getMessage());
    }
  }

  @Test
  void testSumarConHamcrest() {
    Calculadora calculadora = new Calculadora();
    assertThat(calculadora.sumar(2, 3), is(equalTo(5)));
  }
}
