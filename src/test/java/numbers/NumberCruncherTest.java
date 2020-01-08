package numbers;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_of_one()
    {
        //arrange
        int input [] = {3};
        int expectedResult = 3;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
       assertEquals(expectedResult, result);
    }
}
