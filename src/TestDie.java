public class TestDie
{
    public static void main(String[] args)
    {
        Die die1 = new Die();

        int value = die1.getLastRoll();

        System.out.printf("The value is: %d.\n",die1.getLastRoll());
    }
}
