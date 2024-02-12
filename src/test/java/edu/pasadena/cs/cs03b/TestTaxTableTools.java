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
      
    TaxTableTools testTable = new TaxTableTools();

    double iResult = testTable.getTax(10000);
    assertEquals(0.1, iResult);

    double iResult2 = testTable.getTax(20000);
    assertEquals(0.12, iResult2);

    double iResult3 = testTable.getTax(80000);
    assertEquals(0.22, iResult3);

    double iResult4 = testTable.getTax(100000);
    assertEquals(0.24, iResult4);


   }
}
