package cl.mauriciovera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  public void testSumar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.sumar(2, 3));
  }

  @Test
  public void testRestar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(2, calculadora.restar(5, 3));
  }

  @Test
  public void testMultiplicar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(20, calculadora.multiplicar(4, 5));
  }

  @Test
  public void testDividir() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.dividir(10, 2));
  }

}
