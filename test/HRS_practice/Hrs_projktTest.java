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
public class Hrs_projktTest {

    public Hrs_projktTest() {
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
     * Test of main method, of class Hrs_projkt.
     */
    @Test
    public void testMain() {
        
        System.out.println("main");
        String[] args = null;
        Hrs_projkt.main(args);
        
        double result;
        
        String izraz1="3 * 4 + 4";
        String izraz3 = "-3 + -8 + 1 + 2 * 3 + ( 3 + 7 )";
        String izraz2 = "2 + ( 3 * ( -4 + 5 ) )";
        
        String[] iz1 = izraz1.split(" ");
        String[] iz2 = izraz2.split(" ");
        String[] iz3 = izraz3.split(" ");


        Calculator calc = new Calculator();

        //test1
        calc.build_RPN_tree(iz1);
        result = calc.evaluvate();
        assertEquals(16.0, result, 0.0);

        //test2
        calc.build_RPN_tree(iz2);
        result = calc.evaluvate();
        assertEquals(5.0, result, 0.0);
        
          //test2
        calc.build_RPN_tree(iz3);
        result = calc.evaluvate();
        assertEquals(6.0, result, 0.0);


    }
}
