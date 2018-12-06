/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import test.folder.text;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ASUS
 */
public class textNGTest {
    
    public textNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of textrandom method, of class text.
     */
    @Test
    public void testTextrandom() {
        System.out.println("textrandom");
        text instance = new text();
        String expResult = "";
        String result = instance.textrandom();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t1 method, of class text.
     */
    @Test
    public void testT1() {
        System.out.println("t1");
        text instance = new text();
        String expResult = "";
        String result = instance.t1();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t2 method, of class text.
     */
    @Test
    public void testT2() {
        System.out.println("t2");
        text instance = new text();
        String expResult = "";
        String result = instance.t2();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t3 method, of class text.
     */
    @Test
    public void testT3() {
        System.out.println("t3");
        text instance = new text();
        String expResult = "";
        String result = instance.t3();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t4 method, of class text.
     */
    @Test
    public void testT4() {
        System.out.println("t4");
        text instance = new text();
        String expResult = "";
        String result = instance.t4();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of t5 method, of class text.
     */
    @Test
    public void testT5() {
        System.out.println("t5");
        text instance = new text();
        String expResult = "";
        String result = instance.t5();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
