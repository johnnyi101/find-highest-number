package numbers;

public class NumberCruncher {
    int findHighestNumber(int[] input) throws MyException
    {
    if(input.length < 1)
    {
        throw new MyException("You need numbers in the array!");
    }

    else
        {
        int i;
        int max = input[0];
        for (i = 1; i < input.length; i++)
            if (input[i] > max)
                max = input[i];
        return max;
        }
    }
}
