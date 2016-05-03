/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliedmed.exercises.sumofbits;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author zmichaels
 */
public class TestSumOfBits {       
    @Test
    public void test() {
        final Random random = new Random();
        
        for(int i = 0; i < 10000; i++) {
            final int test = random.nextInt();
            
            assertEquals(Integer.bitCount(test), SumOfBits.sumOfBits(test));
        }
    }
}
