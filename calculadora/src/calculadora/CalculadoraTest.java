package calculadora;

import static org.junit.jupiter.api.Assertions.*; // Para las aserciones
import org.junit.jupiter.api.BeforeEach;         // Importación de @BeforeEach
import org.junit.jupiter.api.AfterEach;          // Importación de @AfterEach
import org.junit.jupiter.api.Test;               // Importación de @Test

class CalculadoraTest {
	// Declaración de la calculadora a nivel de clase
    Calculadora calc;
    
    @BeforeEach
    public void setUp() {
        // Inicializar la calculadora antes de cada prueba
        calc = new Calculadora();
        System.out.println("Inicializando la calculadora...");
    }
    
    @AfterEach
    public void tearDown() {
        // Limpiar los recursos después de cada prueba
        calc = null;
        System.out.println("Finalizando prueba y limpiando recursos");
    }
    
    @Test
    public void testSumar() {
        // Probar el método sumar
        assertEquals(5, calc.sumar(2, 3));
    }
    
    @Test
    public void testRestar() {
        // Probar el método sumar
        assertEquals(1, calc.restar(3, 2));
    }
	
    @Test
    public void testMultiplicar() {
    	// Probar el método sumar
    	assertEquals(6, calc.multiplicar(2, 3));
    }
    
    @Test
    public void testDividir() {
    	// Probar el método sumar
    	assertEquals(2, calc.dividir(10, 5));
    }
    
}
