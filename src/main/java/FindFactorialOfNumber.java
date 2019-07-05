public class FindFactorialOfNumber {
    //to find the factorial of given number
    public int findFactorialOfGivenNumber(int number) {
        int factorial = 1, Max_value = 2147483647,result=0;
        if (number == 0) {
            result= 1;
        }
        else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            if (factorial <= Max_value)
            {
                result=factorial;
            }
        }
        return result;
    }
}

