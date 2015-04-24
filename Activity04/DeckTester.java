package Activity04;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
    {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();
    }
    public static void main1(String[] args)
    {
		System.out.println("**** New Deck ****");
		String[] ranks1 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits1 = {"spades", "hearts", "clubs", "diamonds"};
		int[] pointValues1 = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		Deck d1 = new Deck(ranks1, suits1, pointValues1);
		System.out.println();
		System.out.println();
		
		System.out.println("  toString:\n" + d1.toString());
		System.out.println("  isEmpty: " + d1.isEmpty());
		System.out.println("  size: " + d1.size());
		System.out.println();
		System.out.println();
    }
	public static void main2(String[] args)
	{
		String[] ranks2 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits2 = {"spades", "hearts", "clubs", "diamonds"};
		int[] pointValues2 = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println();
		System.out.println();
	    
		System.out.println("**** Shuffle Cards ****");
		d2.shuffle();
		System.out.println("  toString:\n" + d2.toString());
		System.out.println("  isEmpty: " + d2.isEmpty());
		System.out.println("  size: " + d2.size());
    }
}

