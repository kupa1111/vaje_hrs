/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kupa
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of isAssociative method, of class Calculator.
     */
    @Test
    public void testIsAssociative() {
        System.out.println("isAssociative");
        String token = "";
        int type = 0;
        Calculator instance = new Calculator();
        boolean expResult = false;
        boolean result = instance.isAssociative(token, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOperator method, of class Calculator.
     */
    @Test
    public void testIsOperator() {
        System.out.println("isOperator");
        String token = "";
        Calculator instance = new Calculator();
        boolean expResult = false;
        boolean result = instance.isOperator(token);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cmpPrecedence method, of class Calculator.
     */
    @Test
    public void testCmpPrecedence() {
        System.out.println("cmpPrecedence");
        String token1 = "";
        String token2 = "";
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.cmpPrecedence(token1, token2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build_RPN_tree method, of class Calculator.
     */
    @Test
    public void testBuild_RPN_tree() {
        System.out.println("build_RPN_tree");
        String[] tokens = null;
        Calculator instance = new Calculator();
        instance.build_RPN_tree(tokens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluvate method, of class Calculator.
     */
    @Test
    public void testEvaluvate() {
        System.out.println("evaluvate");
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.evaluvate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRPN_notations method, of class Calculator.
     */
    @Test
    public void testGetRPN_notations() {
        System.out.println("getRPN_notations");
        Calculator instance = new Calculator();
        ArrayList expResult = null;
        ArrayList result = instance.getRPN_notations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRPN_notation method, of class Calculator.
     */
    @Test
    public void testSetRPN_notation() {
        System.out.println("setRPN_notation");
        ArrayList<String> RPN = null;
        Calculator instance = new Calculator();
        instance.setRPN_notation(RPN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
