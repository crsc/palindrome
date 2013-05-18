public class PalindromeAnalyzer {
    
    public Boolean isPalindrome(int number){
        int[] digits = stringToArray(Integer.toString(number));
        return palindromeComparator(digits);
    }

    private Boolean palindromeComparator(int[] digits) {
        for(int i=0; i < digits.length/2; i++){
            if(digits[i]!= digits[digits.length -i -1]) return false;
        }
        return true;
    }

    private int[] stringToArray(String string) throws NumberFormatException {
        int[] digits = new int[string.length()];
        
        for(int i = 0; i<string.length(); ++i)
            digits[i] = Integer.parseInt(string.substring(i, i+1));
        
        return digits;
    }
    
}