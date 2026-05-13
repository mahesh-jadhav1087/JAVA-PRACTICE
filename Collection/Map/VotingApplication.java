import java.util.HashMap;
import java.util.Map;

public class VotingApplication {

    public static void main(String[] args) {

        HashMap<String, Integer> votes =
                new HashMap<>();

        // Casting votes
        addVote(votes, "Rahul");
        addVote(votes, "Mahesh");
        addVote(votes, "Rahul");
        addVote(votes, "Prajwal");
        addVote(votes, "Mahesh");
        addVote(votes, "Rahul");

        System.out.println("Voting Results:\n");

        // Display results
        for (Map.Entry<String, Integer> entry
                : votes.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " -> "
                    + entry.getValue()
                    + " votes");
        }
    }

    // Method to add vote
    public static void addVote(
            HashMap<String, Integer> votes,
            String candidate) {

        if (votes.containsKey(candidate)) {

            votes.put(candidate,
                    votes.get(candidate) + 1);

        } else {

            votes.put(candidate, 1);
        }
    }
}