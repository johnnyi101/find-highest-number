package numbers;

public class NumberCruncher {
    int findHighestNumber(int[] input){
        int i;
        int max = input[0];
        for (i = 1; i < input.length; i++)
            if (input[i] > max)
                max = input[i];
        return max;
    }
}
