/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Facade;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Facade - Testing with different Test cases
 * @author sid
 * @version 1.0
 */
public class FacadePatternDemoTest {
    
    public FacadePatternDemoTest() {
    }
    ShapeMaker shapeMaker = new ShapeMaker();
    
    @Test
    public void testDrawCircle() {
        // Create an instance of Circle
        Circle c1 = new Circle();

        // Compare the output of Circle's draw method with ShapeMaker's drawCircle method
        assertEquals(shapeMaker.drawCircle(), c1.draw());
    }

    @Test
    public void testDrawRectangle() {
         // Create an instance of Rectangle
        Rectangle r1 = new Rectangle();
        // Compare the output of Rectangle's draw method with ShapeMaker's drawRectangle method        
        assertEquals(shapeMaker.drawRectangle(), r1.draw());
    }

    @Test
    public void testDrawSquare() {
        // Create an instance of Square
        Square s1 = new Square();
        // Compare the output of Square's draw method with ShapeMaker's drawSquare method
        assertEquals(shapeMaker.drawSquare(), s1.draw());
    }
}

