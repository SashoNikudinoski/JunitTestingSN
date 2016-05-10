/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sasho
 */
public class JunitAddTest {
    
    public JunitAddTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    
        System.out.println("Testing the class JunitAdd");
    }
    
    @AfterClass
    public static void tearDownClass() {
    
     System.out.println("All test were finished");
    
    
    }

    /**
     * Test of addNumbers method, of class JunitAdd.
     */
    @Test
    public void testAddNumbers() {
        System.out.println("addNumbers");
        int one = 2;
        int two = 3;
        JunitAdd instance = new JunitAdd();
        int expResult = 5;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
    
    
    
    @Test
    public void testAddNumbersNegative() {
        System.out.println("addNumbersNegative1");
        int one = 2;
        int two = -3;
        JunitAdd instance = new JunitAdd();
        int expResult = -1;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
    
    
      @Test
    public void testAddNumbersNegative2() {
        System.out.println("addNumbersNegative2");
        int one = 4;
        int two = -3;
        JunitAdd instance = new JunitAdd();
        int expResult = 1;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
    
    
     @Test
    public void testAddNumbersNegative3() {
        System.out.println("addNumbersNegative3");
        int one = -4;
        int two = -3;
        JunitAdd instance = new JunitAdd();
        int expResult = -7;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testAddNumbersNegativeZero() {
        System.out.println("addNumbersNegativeZero");
        int one = -4;
        int two = 0;
        JunitAdd instance = new JunitAdd();
        int expResult = -4;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testAddNumbersZero() {
        System.out.println("addNumbersZero");
        int one = 0;
        int two = 0;
        JunitAdd instance = new JunitAdd();
        int expResult = 0;
        int result = instance.addNumbers(one, two);
        assertEquals(expResult, result);
      
    }
}
