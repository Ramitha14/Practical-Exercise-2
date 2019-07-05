public class CheckGivenNumberisPowerOf4 {
 //to check the power of 4
    public boolean givenNumberisPowerOf4ornot(int number)
    {
        if(number%2!=0)
        {
            return false;
        }
        else
        {
            for(int i=0;i<=number/2;i++)
            {
                if(Math.pow(4,i)==number)
                {
                    return true;
                }
            }
           return false;
        }
    }
}
