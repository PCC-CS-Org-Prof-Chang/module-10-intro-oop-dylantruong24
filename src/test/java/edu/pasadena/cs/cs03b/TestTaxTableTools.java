package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestTaxTableTools {

   @Test
   public void testGetValue()
   {
     // create an instance of the class
      TaxTableTools ttt = new TaxTableTools();

     // action
     double iResult = ttt.getTaxRate(10000);
     // assertion
     assertEquals(0.1, iResult);

     // TODO: add more test cases for all public instance methods

   }
}
