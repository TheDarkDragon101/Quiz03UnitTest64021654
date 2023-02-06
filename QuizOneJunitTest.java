package lib;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuizOneJunitTest {

    @Test
    public void testSquare() {
        QuizOneJunit quizOne = new QuizOneJunit();
        int result = quizOne.square(2);
        assertEquals(4, result);
    }

    @Test
    public void testCountLetterA() {
        QuizOneJunit quizOne = new QuizOneJunit();
        int result = quizOne.countLetterA("Apple");
        assertEquals(1, result);
    }
    @Test
    public void checkTwoLetter_withStringLengthLessThan2_shouldReturnFalse() {
        QuizOneJunit quizOneJunit = new QuizOneJunit();
        boolean result = quizOneJunit.checkTwoLetter("a");
        assertFalse(result);
    }

    @Test
    public void checkTwoLetter_withStringLengthEqualTo2_shouldReturnTrue() {
        QuizOneJunit quizOneJunit = new QuizOneJunit();
        boolean result = quizOneJunit.checkTwoLetter("ab");
        assertTrue(result);
    }

    @Test 
    public void checkTwoLetter_withStringLengthGreaterThan2_shouldReturnFalseIfFirstAndLastLettersAreDifferent() { 
        QuizOneJunit quizOneJunit = new QuizOneJunit(); 
        boolean result = quizOneJunit.checkTwoLetter("abcdz"); 
        assertFalse(result); 
    }  	
}