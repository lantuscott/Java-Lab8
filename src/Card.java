
public class Card
{
	static String[] SUITS =
	{ "Spades", "Hearts", "Clubs", "Diamonds" };

	static String[] RANKS =
	{ "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	private int cardValue;
	
	public Card(int num)
	{
		this.cardValue = num;
	}
	
	public Card(int rank, String suit)
	{
		
	}
	
	public int getRank()
	{
		return 1+cardValue%13;
	}
	
	public String getSuit()
	{
		return this.SUITS[this.cardValue/13];
	}
	
	public String toString()
	{
		return RANKS[this.getRank()-1]+" of "+this.getSuit();
	}
	
	public static void main(String[] args)
	{
		Card card1 = new Card(0);

		System.out.println(card1.getRank());
		System.out.println(card1.getSuit());
		System.out.println(card1.toString());
	}

}
