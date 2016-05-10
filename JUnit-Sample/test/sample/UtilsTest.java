/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sasho
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        System.out.println("* UtilsTest: @BeforeClass method");
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
         System.out.println("* UtilsTest: @AfterClass method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void helloWorldCheck(){
        
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
            
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", " , "world" , "!"));
        
        
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test(timeout=1000)
        public void testWithTimeout(){
         
             System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
            final int factorial=1+(int)(30000 * Math.random());
            System.out.println("computing" + factorial+"!");
           
            
            
        }
    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test(expected=IllegalArgumentException.class)
    
    public void checkExpectedException(){
         System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
          final int factorial=-5;
          System.out.println(factorial + "! = " + Utils.computeFactorial(factorial));
        
        
        
    }
   
    
}
