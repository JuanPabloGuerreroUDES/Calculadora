/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PAQUETE;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juang
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        Calculadora prueba = new Calculadora(5,5);
        double expResult = 10;
        double result = prueba.getSuma();
        assertEquals(expResult, result, 0.0000001); 
    }
    
    @Test
    public void testGetResta() {
        System.out.println("getResta");
        Calculadora prueba = new Calculadora(10,4);
        double expResult = 6;
        double result = prueba.getResta();
        assertEquals(expResult, result, 0.0000001);    
    }
    
    @Test
    public void testGetMultiplicacion() {
        System.out.println("getMultiplicacion");
        Calculadora prueba = new Calculadora(2,4);
        double expResult = 8;
        double result = prueba.getMultiplicacion();
        assertEquals(expResult, result, 0.0000001);    
    }
    
    @Test
    public void testGetDivision() {
        System.out.println("getDivision");
        Calculadora prueba = new Calculadora(15,3);
        double expResult = 5;
        double result = prueba.getDivision();
        assertEquals(expResult, result, 0.0000001);  
    }
}
