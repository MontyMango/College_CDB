package Lab7;

import java.text.MessageFormat;

public class PollingStation
{
    String locationName;
    private final int LIMIT = 1000000;
    Voter[] votes;
    private int currentVotes;
    
    public PollingStation(String locationName)
    {
        this.locationName = locationName;
        votes = new Voter[LIMIT];
        currentVotes = 0;
    }
    
    public void castVote(Voter v)
    {
        votes[currentVotes] = v;
        currentVotes++;
        System.out.println(v.getID() + " cast a vote.");
    }
    
    // use selection sort to sort voters in the array
    // in increasing order of voterID
    public void sortVoters()
    {
        int n = currentVotes; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
            {
                if (votes[j].getID() < votes[min_idx].getID())
                {
                    min_idx = j;
                }
            }
  
            Voter temp = votes[min_idx]; 
            votes[min_idx] = votes[i]; 
            votes[i] = temp; 
        } 
    }
    
    public Voter searchVoter(int voterID)
    {
        return binarySearch(0, currentVotes, voterID);
    }
    
    // binary search function
    // first is the left index of the remaining array to be searched
    // last is the right index of the remaining array to be searched

    private Voter binarySearch(int first, int last, int voterID) {
        // your code goes here
        // use recursive binary search mechanism to look for the voter in the array
        // based on voter ID (voterID)
        int mid_idx = first + (int) ((last - first) / 2);

        if (first > last)   {
            return null;
        }
        else {
            // If the voter is found, return it
            if (voterID == votes[mid_idx].getID()) {
                return votes[mid_idx];
            }
            else if (voterID < votes[mid_idx].getID()) {
                return binarySearch(first, mid_idx - 1, voterID);
            }
            else if (voterID > votes[mid_idx].getID()) {
                return binarySearch(mid_idx + 1, last, voterID);
            }
        }
        return null;
    } 
}