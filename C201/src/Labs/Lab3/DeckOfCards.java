package Lab3;

public class DeckOfCards
{
    private Card[][] deck;

    public DeckOfCards()
    {
        deck = new Card[4][13];
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        // Your code goes here
        for (int suitListNum = 0; suitListNum < suits.length; suitListNum++ )  {
            for (int faceListNum = 0; faceListNum < faces.length; faceListNum++) {
                this.deck[suitListNum][faceListNum] = new Card(suits[suitListNum],faces[faceListNum]);
            }
        }

    }
    
    public Card dealCard (String s, String f)
    {
        for (int suitListNum = 0; suitListNum < 4; suitListNum++ )  {
            for (int faceListNum = 0; faceListNum < 13; faceListNum++)  {
                if (deck[suitListNum][faceListNum] == null);
                else    {
                    if (deck[suitListNum][faceListNum].toString().equals(f + "of" + s)) {
                        Card temp = deck[suitListNum][faceListNum];
                        deck[suitListNum][faceListNum] = null;
                        return temp;
                    }
                }
            }
        }
        return null;
    }
    
    public void showCards()
    {
        System.out.println("\nHere are my current available cards:\n");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<13; j++)
            {
                if(deck[i][j]!=null)
                {
                    System.out.println(deck[i][j].toString());
                }
            }
        }
    }
}