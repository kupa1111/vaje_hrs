/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kupa
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({HRS_practice.ConstantTest.class, HRS_practice.operatorTest.class, HRS_practice.CalculatorTest.class, HRS_practice.tokenTest.class, HRS_practice.Hrs_projktTest.class})
public class HRS_practiceSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
