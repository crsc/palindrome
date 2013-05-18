public class PalindromeAnalyzer {
    
    public Boolean isPalindrome(int number){
        String string = Integer.toString(number);
        int[] digits = new int[string.length()];

        for(int i = 0; i<string.length(); ++i){
            digits[i] = Integer.parseInt(string.substring(i, i+1));
        }
        for(int i=0; i < digits.length/2; i++){
            if(digits[i]!= digits[digits.length -i -1]){
                return false;
            }
        }
        return true;
    }
    
}