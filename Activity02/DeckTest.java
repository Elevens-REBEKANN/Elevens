package Activity02;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeckTest
{
    String[] ranks = {"jack", "queen", "king"};
    String[] suits = {"blue", "red"};
    int[] pointValues = {11, 12, 13};

    /**
     * Default constructor for test class DeckTest
     */
    public DeckTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void constructorTest()
    {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);
    }
    
    @Test 
    public void isEmptyTest()
    {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
    }

    @Test 
    public void sizeTest()
    {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck e = new Deck(ranks, suits, pointValues);
        e.size();
    }

    @Test
    public void dealTest()
    {
        String[] rank = {"jack", "queen", "king"};
        String[] suit = {"blue", "red"};
        int[] pointValue = {11, 12, 13};
        Deck e = new Deck(rank, suit, pointValue);
        e.deal();
    }

}
