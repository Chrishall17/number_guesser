package number_guesser;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessesTooLowReturnsHigher() {
        NumberGuesser game = new NumberGuesser(10);
        String actual = game.guess(9);
        Assert.assertEquals("Higher", actual);
    }

    @Test
    public void testGuessesTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(8);
        String actual = game.guess(9);
        Assert.assertEquals("Lower", actual);
    }

    @Test
    public void testGuessesRightReturnsCorrect() {
        NumberGuesser game = new NumberGuesser(9);
        String actual = game.guess(9);
        Assert.assertEquals("Correct!", actual);
    }
}
