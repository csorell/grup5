/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entorns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josep
 */
public class AdministrarEmpleadosTest {
    
    public AdministrarEmpleadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularSalarioBruto method, of class AdministrarEmpleados.
     */
    @Test
    public void testCalcularSalarioBrutoVendedor() throws Exception {
        System.out.println("calcularSalarioBrutoVendedor");
        String empleados = "Vendedor";
        int ventasMes = 1300;
        int horasExtra = 6;
        float expResult = 1220.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(empleados, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalcularSalarioBrutoEncargado() throws Exception {
        System.out.println("calcularSalarioBrutoEncargado");
        String empleados = "Encargado";
        int ventasMes = 1550;
        int horasExtra = 6;
        float expResult = 1820.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(empleados, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    @Test (expected = Exception.class)
    public void testCalcularSalarioBrutoErrorName() throws Exception {
        System.out.println("calcularSalarioBruto");
        String empleados = "Encargados";
        int ventasMes = 1550;
        int horasExtra = 6;
        float expResult = 1820.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(empleados, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void testCalcularSalarioBrutoVentes() throws Exception {
        System.out.println("calcularSalarioBruto");
        String empleados = "Encargado";
        int ventasMes = 600;
        int horasExtra = 0;
        float expResult = 1500.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(empleados, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcularSalariNet method, of class AdministrarEmpleados.
     */
    @Test
    public void testCalcularSalariNet1500() throws Exception {
        System.out.println("calcularSalariNet");
        float salariBrut = 1500.0F;
        float expResult = 1230.0F;
        float result = AdministrarEmpleados.calcularSalariNet(salariBrut);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalcularSalariNet1000() throws Exception {
        System.out.println("calcularSalariNet");
        float salariBrut = 1000.0F;
        float expResult = 840.0F;
        float result = AdministrarEmpleados.calcularSalariNet(salariBrut);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalcularSalariNet0() throws Exception {
        System.out.println("calcularSalariNet");
        float salariBrut = 0F;
        float expResult = 0F;
        float result = AdministrarEmpleados.calcularSalariNet(salariBrut);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalcularSalariNetNegative() throws Exception {
        System.out.println("calcularSalariNet");
        float salariBrut = -100F;
        float expResult = -100F;
        float result = AdministrarEmpleados.calcularSalariNet(salariBrut);
        assertEquals(expResult, result, 0.0);
    }
    
}
