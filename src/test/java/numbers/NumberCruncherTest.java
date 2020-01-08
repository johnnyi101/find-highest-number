package numbers;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_of_one() {
        //arrange
        int input[] = {3};
        int expectedResult = 3;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void if_input_were_13_4_output_should_be_13() {
        //arrange
        int input[] = {13, 4};
        int expectedResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void if_input_were_7_13_output_should_be_13() {
        //arrange
        int input[] = {7, 13};
        int expectedResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);

    }
}
