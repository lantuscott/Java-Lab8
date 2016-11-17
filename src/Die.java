
public class Die
{
	// Instance fields (variables) may be declared anywhere in class body
	// Convention: put at top

	private int lastRoll;
	
	// Constructors (object initializers) also can be declared anywhere
	// Convention: after instance fields/variables
	
	public Die() // Constructor
	{
		this.roll();
	}
	
	// Instance methods can also be declared anywhere
	// Convention: after constructors
	
	public int getLastRoll()
	{
		// fix this
		return this.lastRoll;
	}
	
	public void roll()
	{
		this.lastRoll = (int)(1 + 6*Math.random());
	}
	
	// static methods can go anywhere - but at end is standard
	
	public String toString()
	{
		return "Die value is: "+this.lastRoll; // return as per Lab 8-3
	}
	
	public static void main(String[] args)
	{
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();

		System.out.printf("The value is : %d.\n", die1.getLastRoll());
		System.out.printf("The value is : %d.\n", die2.getLastRoll());
		System.out.printf("The value is : %d.\n", die3.getLastRoll());

		System.out.println(die1.toString());
		System.out.println(die2.toString());
		System.out.println(die3.toString());
	}

}
