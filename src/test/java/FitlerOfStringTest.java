import org.example.FilterOfString;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class FitlerOfStringTest {
    @Test
    public void shouldNoLongerBoardThan() {
        String[] board = {"Szymon","Pawel","Adam"};

        int lenOfBoard = 2;

        String[] result = FilterOfString.notLonger(board,lenOfBoard);


        assertEquals(lenOfBoard,result.length);
        assertArrayEquals(new String[] {"Szymon","Pawel"},result);
    }


    @Test
    public void shouldLongerBoardThan() {
        String[] board = {"Szymon","Pawel","Adam"};

        int lenOfBoard = 2;

        String[] result = FilterOfString.notLonger(board,lenOfBoard);

        assertEquals(0,result.length);
        assertArrayEquals(new String[] {""},result);

    }
}
