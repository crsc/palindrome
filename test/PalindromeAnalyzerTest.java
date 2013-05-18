
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeAnalyzerTest {
    
    @Test
    public void isPalindrome() {
        PalindromeAnalyzer palindrome = new PalindromeAnalyzer();
        assertEquals(true, palindrome.isPalindrome(1234321));
        assertEquals(true, palindrome.isPalindrome(567765));
    }
    
    @Test
    public void isNotPalindrome(){
        PalindromeAnalyzer palindrome = new PalindromeAnalyzer();
        assertEquals(false, palindrome.isPalindrome(1234));
        assertEquals(false, palindrome.isPalindrome(0121));
    }
}