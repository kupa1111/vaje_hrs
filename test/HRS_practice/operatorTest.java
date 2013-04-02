/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

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
public class operatorTest {
    
    public operatorTest() {
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
     * Test of evaluvate method, of class operator.
     */
    @Test
    public void testEvaluvate() {
        System.out.println("evaluvate");
        operator instance = null;
        double expResult = 0.0;
        double result = instance.evaluvate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class operator.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        operator instance = null;
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
