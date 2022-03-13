package Lab3;

public class Card
{
    private final String suit;
    private final String face;

    //constructor
    public Card(String suit, String face)
    {
        this.suit = suit;
        this.face = face;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public String getFace()
    {
        return face;
    }
    
    //return String representation of the card
    public String toString()
    {
        return face + "of" + suit;
    }
}