package Activity02;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeckTester
{
    String[] rank1 = {"Jack", "Queen", "King"};
    String[] suit1 = {"Hearts", "Diamonds"};
    int[] value1 = {5, 6, 7};
    String[] rank2 = {"Frank", "Ralph", "George", "Felipe"};
    String[] suit2 = {"Fish", "Dogs", "Cats"};
    int[] value2 = {4, 3, 2, 1};
    String[] rank3 = {"Harry", "Hermione", "Ronald", "Hagrid", "Severous"};
    String[] suit3 = {"Super", "Ew", "Awesome", "Muggle"};
    int[] value3 = {5, 9, 10, 11, 12};
    Deck deck1 = new Deck(rank1, suit1, value1);
    Deck deck2 = new Deck(rank2, suit2, value2);
    Deck deck3 = new Deck(rank3, suit3, value3);
    /**
     * Default constructor for test class DeckTester
     */
    public DeckTester()
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
    public void testIsEmpty()
    {
        assertFalse(deck1.isEmpty());
        assertFalse(deck2.isEmpty());
        assertFalse(deck3.isEmpty());
    }
    
    @Test
    public void testSize()
    {
        assertEquals(6, deck1.size());
        assertEquals(12, deck2.size());
        assertEquals(20, deck3.size());
    }
    
    @Test
    public void testDeal()
    {   
        Card Deck1 = deck1.deal();
        Card Deck2 = deck2.deal();
        Card Deck3 = deck3.deal();
        
        assertEquals("King", Deck1.rank());
        assertEquals("Diamonds", Deck1.suit());
        assertEquals(7, Deck1.pointValue());
        
        assertEquals("Felipe", Deck2.rank());
        assertEquals("Cats", Deck2.suit());
        assertEquals(1, Deck2.pointValue());
        
        assertEquals("Severous", Deck3.rank());
        assertEquals("Muggle", Deck3.suit());
        assertEquals(12, Deck3.pointValue());
    }
}
