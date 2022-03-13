package Lab7;

public class Lab07
{
    public static void main(String[] Args)
    {
        PollingStation PS = new PollingStation("Riverside Library");

        Voter v1 = new Voter(2013, "July 4, 1954", "333-22-4444", "John", "Smith", Party.Republican, "100 Northwood Drive, South Bend, IN");
        Voter v2 = new Voter(5083, "July 4, 1964", "333-44-4444", "Joe", "Smith", Party.Democractic, "200 Northwood Drive, South Bend, IN");
        Voter v3 = new Voter(4026, "July 4, 1954", "333-22-4444", "Lucy", "Smith", Party.Republican, "400 Northwood Drive, South Bend, IN");
        Voter v4 = new Voter(1023, "July 4, 1964", "333-44-4444", "Lisa", "Smith", Party.Democractic, "600 Northwood Drive, South Bend, IN");
        Voter v5 = new Voter(2035, "July 4, 1954", "333-22-4444", "Kevin", "Smith", Party.Independent, "110 Northwood Drive, South Bend, IN");
        Voter v6 = new Voter(7023, "July 4, 1964", "331-44-4444", "Joe", "Smith", Party.Democractic, "220 Northwood Drive, South Bend, IN");
        Voter v7 = new Voter(8074, "July 4, 1974", "323-22-4444", "Lucy", "Smith", Party.Republican, "400 Northwood Drive, South Bend, IN");
        Voter v8 = new Voter(9083, "July 4, 1984", "343-44-4444", "Lisa", "Duke", Party.Democractic, "550 Northwood Drive, South Bend, IN");
        Voter v9 = new Voter(1111, "July 4, 1969", "333-45-4444", "Lisa", "Town", Party.Independent, "570 Northwood Drive, South Bend, IN");


        PS.castVote(v1);
        PS.castVote(v2);
        PS.castVote(v3);
        PS.castVote(v4);
        PS.castVote(v5);
        PS.castVote(v6);
        PS.castVote(v7);
        PS.castVote(v8);
        PS.castVote(v9);
        
        PS.sortVoters();
        Voter temp = PS.searchVoter(2035);
        if(temp != null) System.out.println(temp.getName() + " cast his/her vote");
        else System.out.println("This person has not voted yet");
        
        temp = PS.searchVoter(5555);
        if(temp != null) System.out.println(temp.getName() + " cast his/her vote");
        else System.out.println("This person has not voted yet");
    }
}
/*
A correctly implemented program should display:

2013 cast a vote.
5083 cast a vote.
4026 cast a vote.
1023 cast a vote.
2035 cast a vote.
7023 cast a vote.
8074 cast a vote.
9083 cast a vote.
1111 cast a vote.
Kevin Smith cast his/her vote
This person has not voted yet
*/