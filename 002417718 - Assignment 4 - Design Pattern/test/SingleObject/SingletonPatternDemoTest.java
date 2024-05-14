/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SingleObject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * SingleObject - Testing with a Test case
 * @author sid
 * @version 1.0
 */
public class SingletonPatternDemoTest {
    
    public SingletonPatternDemoTest() {
    }
    
    @Test
    public void testGetInstance() {
        SingleObject obj1=SingleObject.getInstance();
        SingleObject obj2=SingleObject.getInstance();
        assertTrue(obj1.equals(obj2));
    }

    
}
