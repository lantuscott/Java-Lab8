
public class Deck
{
	public final int DECK_SIZE = 52;
	
	private Card[] cards;
	private int nextCard;
	
	public Deck()
	{
		// create standard 52 card deck
		cards = new Card[52];

		for(int index=0; index<52; index++)
		{
			cards[index] = new Card(index);
		}
	}
		
	public void shuffle()
	{
		// use Liang's shuffle - or better: Knuth shuffle

	}
	
	public Card dealNextCard()
	{
		return cards[nextCard++];
	}
	
	public static void main (String[] args)
	{
		Deck deck = new Deck();

		for(int i=0; i<52; i++)
		{
			Card c = deck.dealNextCard();
			System.out.println(c.toString());
		}
	}

}
