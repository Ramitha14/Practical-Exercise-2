public class NumberPalindrome {
    //to check for number palindrome
    public String checkPalindrome(int number)
    {
        int temp=number;
        int digit,sum=0;
        while(number>0)
        {
            digit=number%10;
            sum=(sum*10)+digit;
            number=number/10;
        }
        if(temp==sum)
        {
            return "palindrome";
        }
        else
        {
            return "Not palindrome";
        }
    }
}
