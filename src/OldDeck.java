
public class OldDeck
{
	static String[] suits =
	{ "Spades", "Hearts", "Clubs", "Diamonds" };

	static String[] ranks =
	{ "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public static int[] buildDeck()
	{
		int[] newDeck = new int[52];

		// Initialize cards
		for (int i = 0; i < newDeck.length; i++)
			newDeck[i] = i;

		return newDeck;
	}

	public static void shuffle(int[] deck)
	{
		// notice how assigning to deck[i] affects actual param contents!

		for (int i = 0; i < deck.length; i++)
		{
			// Generate an index randomly (sez Liang) but...
			// ALERT! This is NOT a truly-random shuffle.
			// Details in class...

			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}

	public static String getSuit(int card)
	{
		return suits[card / 13];
	}

	public static String getRank(int card)
	{
		return ranks[card % 13];
	}

	public static void main(String[] args)
	{
		// create and initialize new deck

		int[] deck = buildDeck();

		// shuffle the cards

		shuffle(deck);

		// Display the first four cards
		
		for (int i = 0; i < 4; i++)
		{
			String suit = getSuit(deck[i]); // suits[deck[i] / 13];
			String rank = getRank(deck[i]); // ranks[deck[i] % 13];

			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
