public class StringPalindrome {
  // to check for string palindrome
    public String checkPalindrome(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            return "palindrome";
        }
        else
        {
            return "Not palindrome";
        }
    }
}
