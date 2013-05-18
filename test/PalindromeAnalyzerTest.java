/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Crstn
 */
public class PalindromeAnalyzerTest {
    
    @Test
    public void isPalindrome() {
        PalindromeAnalyzer palindrome = new PalindromeAnalyzer();
        assertEquals(true, palindrome.isPalindrome(1234321));
    }
}