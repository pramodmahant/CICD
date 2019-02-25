package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.Calculator;
import com.qaagility.javaee.*;
 

public class AppTest {

Calculator myCalc = new Calculator();

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }
	
	
      public void testCalc() {
        assertEquals("Result", 9, myCalc.add(3,6));
      }


	@Test	
      public void testCalculator() {
        
	assertEquals(new Calcmul().mul(),20);
	assertEquals(new Calculator().add(),9);
      
      }

    }
