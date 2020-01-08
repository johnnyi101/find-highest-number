package numbers;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_of_one() throws MyException
    {
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
    public void if_input_were_13_4_output_should_be_13()throws MyException
    {
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
    public void if_input_were_7_13_output_should_be_13()throws MyException
    {
        //arrange
        int input[] = {7, 13};
        int expectedResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void if_several_highest_numbers_are_equal_only_one_should_return()throws MyException
    {
        //arrange
        int input[] = {7, 13, 16, 16, 4, 5, 6, 8};
        int expectedResult = 16;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void if_list_contains_negatives_and_positive_the_highest_should_be_shown()throws MyException
    {
        //arrange
        int input[] = {4,5,-8,3,11,-21,6};
        int expectedResult = 11;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void exceptio_if_nothing_in_array()
    {
        int input[] = {};
        NumberCruncher cut = new NumberCruncher();
        assertThrows(
                MyException.class,
                () -> cut.findHighestNumber(input));


    }
}
