package cl.mauriciovera;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest {

  @DisplayName("Test de suma")
  @Test
  void testSumar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.sumar(2, 3));
  }

  @DisplayName("Test de resta")
  @Test
  void testRestar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(2, calculadora.restar(5, 3));
  }

/*   @DisplayName("Test de multiplicación")
  @Test
  void testMultiplicar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(20, calculadora.multiplicar(4, 5));
  } */

  @DisplayName("Test de división")
  @Test
  void testDividir() {
    Calculadora calculadora = new Calculadora();
    assertEquals(5, calculadora.dividir(10, 2));
  }

  @DisplayName("Test de división por cero")
  @Test
  void testDividirPorCero() {
    Calculadora calculadora = new Calculadora();
    try {
      calculadora.dividir(10, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("No se puede dividir por cero", e.getMessage());
    }
  }

  // test con Hamcrest
  @DisplayName("Test de suma con Hamcrest")
  @Test
  void testSumarConHamcrest() {
    Calculadora calculadora = new Calculadora();
    assertThat(calculadora.sumar(2, 3), is(equalTo(5)));
  }

  // test con Assumptions
  @DisplayName("Test de multiplicación con Assumptions")
  @Test
  void testMultiplicarConAssume() {
    Calculadora calculadora = new Calculadora();
    boolean featureActiva = true; // Simulando una característica activa

    assumeTrue(featureActiva);
    assertEquals(-20, calculadora.multiplicar(4, -5));
  }

  // test con parametrización
  @DisplayName("Test de números pares")
  @ParameterizedTest
  @ValueSource(ints = {2, 4, 6, 8})
  void testEsPar(int numero) {
    Calculadora calculadora = new Calculadora();
    assertTrue(calculadora.esPar(numero), "El número " + numero + " debería ser par");
  }

  @DisplayName("Test de números impares")
  @ParameterizedTest
  @ValueSource(ints = {1, 3, 5, 7})
  void testEsImpar(int numero) {
    Calculadora calculadora = new Calculadora();
    assertTrue(!calculadora.esPar(numero), "El número " + numero + " debería ser impar");
  }
}
