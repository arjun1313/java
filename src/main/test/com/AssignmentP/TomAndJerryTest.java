package main.test.com.AssignmentP;

import main.java.com.AssignmentP.TomAndJerry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {

    TomAndJerry temp;

    @Before
    public void setUp() throws Exception {
        temp = new TomAndJerry();
    }

    @After
    public void tearDown() throws Exception {
        temp = null;
    }

    @Test

    public void TomAndJerryTestPositive(){
        String expected = "Tom";
        //Act
        String result = temp.main(24);
        assertEquals(expected,result);
        //assertTrue(result);
    }
}