public class FindFactorialOfNumber {
    public int FindFactorialOfGivenNumber(int number) {
        int factorial = 1, Max_value = 2147483647,result=0;
        if (number == 0) {
            result= 1;
        }
        else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            // System.out.print("Factorial of "+number+" is");
            if (factorial <= Max_value)
            {
                result=factorial;
            }
        }
        return result;
    }
}

