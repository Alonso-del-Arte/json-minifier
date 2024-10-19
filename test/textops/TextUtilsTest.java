/*
 * Copyright (C) 2024 Alonso del Arte
 *
 * This program is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation, the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more 
 * details.
 *
 * You should have received a copy of the GNU General Public License along with 
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package textops;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of the TextUtils class.
 * @author Alonso del Arte
 */
public class TextUtilsTest {
    
    private static final Random RANDOM = new Random();
    
    @Test
    public void testBracketsBalancedEmptyString() {
        String s = "";
        String msg = "Brackets should be balanced for \"" + s + "\"";
        assert TextUtils.bracketsBalanced(s) : msg;
    }
    
    @Test
    public void testBracketsBalancedPerfectNesting() {
        int numberOfPairs = RANDOM.nextInt(2, 20);
        char[] openers = new char[numberOfPairs];
        char[] closers = new char[numberOfPairs];
        Arrays.fill(openers, '{');
        Arrays.fill(closers, '}');
        String sFirstHalf = new String(openers);
        String sSecondHalf = new String(closers);
        String s = sFirstHalf + sSecondHalf;
        String msg = "Brackets should be balanced for \"" + s + "\"";
        assert TextUtils.bracketsBalanced(s) : msg;
    }
    
    @Test
    public void testBracketsNotBalancedIfOneMoreOpenerThanClosers() {
        int numberOfPairs = RANDOM.nextInt(2, 20);
        char[] openers = new char[numberOfPairs];
        char[] closers = new char[numberOfPairs];
        Arrays.fill(openers, '{');
        Arrays.fill(closers, '}');
        String sFirstHalf = new String(openers);
        String sSecondHalf = new String(closers);
        String s = sFirstHalf + '{' + sSecondHalf;
        String msg = "Brackets should not be balanced for \"" + s 
                + "\", which is of length " + s.length();
        assert !TextUtils.bracketsBalanced(s) : msg;
    }
    
    @Test
    public void testBracketsNotBalancedIfOneMoreCloserThanOpeners() {
        int numberOfPairs = RANDOM.nextInt(2, 20);
        char[] openers = new char[numberOfPairs];
        char[] closers = new char[numberOfPairs];
        Arrays.fill(openers, '{');
        Arrays.fill(closers, '}');
        String sFirstHalf = new String(openers);
        String sSecondHalf = new String(closers);
        String s = sFirstHalf + '}' + sSecondHalf;
        String msg = "Brackets should not be balanced for \"" + s 
                + "\", which is of length " + s.length();
        assert !TextUtils.bracketsBalanced(s) : msg;
    }
    
    /**
     * Test of bracketsBalanced method, of class TextUtils.
     */
//    @Test
    public void testBracketsBalanced() {
        System.out.println("bracketsBalanced");
        String s = "";
        boolean expResult = false;
        boolean result = TextUtils.bracketsBalanced(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    // TODO: Write test for s including escaped brackets

    /**
     * Test of quotesBalanced method, of class TextUtils.
     */
//    @Test
    public void testQuotesBalanced() {
        System.out.println("quotesBalanced");
        String s = "";
        boolean expResult = false;
        boolean result = TextUtils.quotesBalanced(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    // TODO: Write test for s including escaped quotes

}
