package Lab3;

public class Lab03
{
    public static void main(String[] args)
    {
        DeckOfCards mydeck = new DeckOfCards();
        
        deal(mydeck, "Hearts", "Three");
        deal(mydeck, "Clubs", "Five");
        deal(mydeck, "Hearts", "Ace");
        deal(mydeck, "Diamonds", "Five");
        deal(mydeck, "Hearts", "Ace"); // not available
        deal(mydeck, "Clubs", "Three");
        deal(mydeck, "Spades", "Five");
        deal(mydeck, "Diamonds", "Five"); // not available
        deal(mydeck, "Diamonds", "King");
        
        mydeck.showCards();
    }
    
    public static void deal(DeckOfCards DoC, String picked_suit, String picked_face)
    {
        Card current_card = DoC.dealCard(picked_suit, picked_face);
        if(current_card == null)
        {
            System.out.println("Homework.Card (" + picked_suit + ", " + picked_face +") is not available.");
        }
        
        else
        {
            System.out.println(current_card.toString() + " is out.");
        }
    }
}

/*
A correctly implemented program should disply:

ThreeofHearts is out.
FiveofClubs is out.
AceofHearts is out.
FiveofDiamonds is out.
Homework.Card (Hearts, Ace) is not available.
ThreeofClubs is out.
FiveofSpades is out.
Homework.Card (Diamonds, Five) is not available.
KingofDiamonds is out.

Here are my current available cards:

DeuceofHearts
FourofHearts
FiveofHearts
SixofHearts
SevenofHearts
EightofHearts
NineofHearts
TenofHearts
JackofHearts
QueenofHearts
KingofHearts
AceofSpades
DeuceofSpades
ThreeofSpades
FourofSpades
SixofSpades
SevenofSpades
EightofSpades
NineofSpades
TenofSpades
JackofSpades
QueenofSpades
KingofSpades
AceofClubs
DeuceofClubs
FourofClubs
SixofClubs
SevenofClubs
EightofClubs
NineofClubs
TenofClubs
JackofClubs
QueenofClubs
KingofClubs
AceofDiamonds
DeuceofDiamonds
ThreeofDiamonds
FourofDiamonds
SixofDiamonds
SevenofDiamonds
EightofDiamonds
NineofDiamonds
TenofDiamonds
JackofDiamonds
QueenofDiamonds

*/