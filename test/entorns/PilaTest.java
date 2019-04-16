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
 * @author marcjoan
 */
public class PilaTest {
   
    public PilaTest() {
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
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object o = 5;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
    }
    @Test
    public void testPushNull() {
        System.out.println("push");
        Object o = null;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
    }
    @Test
    public void testPushLong() {
        System.out.println("push");
        Object o = 1000000000000000000L;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
    }
    @Test
    public void testPushDouble() {
        System.out.println("push");
        Object o = 9.25;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
    }
    @Test
    public void testPushNegative() {
        System.out.println("push");
        Object o = -9.25;
        Pila instance = new Pila();
        instance.push(o);
        Object result = instance.top();
        assertEquals(o, result);
    }
 
    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new Pila();
        instance.push(5);
        instance.push(6);
        instance.push(1);
        instance.push(3);
        Pila result = new Pila();
        for (int i = 0; i < instance.size() - 1; i++) {
            result.push(instance.get(i));
        }
        instance.pop();
        assertEquals(instance, result);
    }
    @Test
    public void testPopNull() {
        System.out.println("pop");
        Pila instance = new Pila();
        instance.push(5);
        instance.push(null);
        Pila result = new Pila();
        for (int i = 0; i < instance.size() - 1; i++) {
            result.push(instance.get(i));
        }
        instance.pop();
        assertEquals(instance, result);
    }
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPopEmpty() {
        System.out.println("popEmpty");
        Pila instance = new Pila();
        instance.pop();
    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Pila instance = new Pila();
        instance.push(5);
        instance.push(6);
        instance.push(1);
        instance.push(3);
        Object expResult = 3;
        Object result = instance.top();
        assertEquals(expResult, result);
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTopEmpty() {
        System.out.println("top");
        Pila instance = new Pila();
        Object expResult = "Is Empty";
        Object result = instance.top();
        assertEquals(expResult, result);
    }
    @Test
    public void testTopNull() {
        System.out.println("top");
        Pila instance = new Pila();
        instance.push(null);
        Object expResult = null;
        Object result = instance.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Pila instance;
        instance = new Pila();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(5);
        instance.push(6);
        instance.push(1);
        instance.push(3);
        instance.sort();
        result.push(1);
        result.push(3);
        result.push(5);
        result.push(6);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSortNull() {
        System.out.println("sortNull");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(null);
        instance.push(null);
        instance.push(null);
        instance.sort();
        result.push(null);
        result.push(null);
        result.push(null);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testSortNegative() {
        System.out.println("sortNegative");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(6);
        instance.push(-2);
        instance.push(1);
        instance.push(-5);
        instance.sort();
        result.push(-5);
        result.push(-2);
        result.push(1);
        result.push(6);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testSortEquals() {
        System.out.println("sortEquals");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(6);
        instance.push(3);
        instance.push(3);
        instance.push(-5);
        instance.sort();
        result.push(-5);
        result.push(3);
        result.push(3);
        result.push(6);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }

    /**
     * Test of concat method, of class Pila.
     */
    @Test
    public void testConcat() {
        System.out.println("concat");
        Pila instance = new Pila();
        Pila instance2 = new Pila();
        Pila result = new Pila();
        instance.push(5);
        instance.push(6);
        instance2.push(1);
        instance2.push(3);
        result.push(5);
        result.push(6);
        result.push(1);
        result.push(3);
        instance.concat(instance2);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testConcatNull() {
        System.out.println("concatNull");
        Pila instance = new Pila();
        Pila instance2 = new Pila();
        Pila result = new Pila();
        instance.push(null);
        instance2.push(3);
        result.push(null);
        result.push(3);
        instance.concat(instance2);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testConcatEquals() {
        System.out.println("concatEquals");
        Pila instance = new Pila();
        Pila instance2 = new Pila();
        Pila result = new Pila();
        instance.push(3);
        instance2.push(3);
        result.push(3);
        result.push(3);
        instance.concat(instance2);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testConcatNegative() {
        System.out.println("concatNegative");
        Pila instance = new Pila();
        Pila instance2 = new Pila();
        Pila result = new Pila();
        instance.push(-3);
        instance2.push(3);
        result.push(-3);
        result.push(3);
        instance.concat(instance2);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of shift method, of class Pila.
     */
    @Test
    public void testShift() {
        System.out.println("shift");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(5);
        instance.push(6);
        instance.shift();
        result.push(6);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testShiftNull() {
        System.out.println("shiftNull");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(null);
        instance.push(null);
        instance.shift();
        result.push(null);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testShiftNegative() {
        System.out.println("shiftNull");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push(-2);
        instance.push(-65);
        instance.shift();
        result.push(-65);
        Pila expResult = instance;
        assertEquals(expResult, result);
    }
    @Test
    public void testShiftStringEquals() {
        System.out.println("shiftNull");
        Pila instance = new Pila();
        Pila result = new Pila();
        instance.push("hola");
        instance.push("hola");
        instance.shift();
        result.push("hola");
        Pila expResult = instance;
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class Pila.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Pila instance = new Pila();
        instance.push(5);
        instance.push(6);
        Object expResult = 5;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }
    @Test
    public void testPeekNull() {
        System.out.println("peekNull");
        Pila instance = new Pila();
        instance.push(null);
        instance.push(null);
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }
    @Test
    public void testPeekNegative() {
        System.out.println("peekNull");
        Pila instance = new Pila();
        instance.push(-5);
        instance.push(-2);
        Object expResult = -5;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }
    @Test
    public void testPeekEquals() {
        System.out.println("peekNull");
        Pila instance = new Pila();
        instance.push(5);
        instance.push(5);
        Object expResult = 5;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }
}