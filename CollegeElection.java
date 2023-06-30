import java.util.Scanner;

public class CollegeElection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display the list of candidates
        System.out.println("List of Candidates:");
        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");
        System.out.println("4. Candidate D");

        // Get the number of voters
        System.out.print("Enter the number of voters: ");
        int numVoters = sc.nextInt();

        // Initialize the vote counters for each candidate
        int voteCountA = 0;
        int voteCountB = 0;
        int voteCountC = 0;
        int voteCountD = 0;

        // Get the vote from each voter
        for (int i = 1; i <= numVoters; i++) {
            System.out.print("Voter " + i + ", please enter your vote (1-4): ");
            int vote = sc.nextInt();

            // Increment the vote count for the candidate chosen by the voter
            switch (vote) {
                case 1:
                    voteCountA++;
                    break;
                case 2:
                    voteCountB++;
                    break;
                case 3:
                    voteCountC++;
                    break;
                case 4:
                    voteCountD++;
                    break;
                default:
                    System.out.println("Invalid vote!");
                    break;
            }
        }

        // Display the final vote counts
        System.out.println("Final Vote Counts:");
        System.out.println("Candidate A: " + voteCountA);
        System.out.println("Candidate B: " + voteCountB);
        System.out.println("Candidate C: " + voteCountC);
        System.out.println("Candidate D: " + voteCountD);

        // Determine the winner
        if (voteCountA > voteCountB && voteCountA > voteCountC && voteCountA > voteCountD) {
            System.out.println("Candidate A is the winner!");
        } else if (voteCountB > voteCountA && voteCountB > voteCountC && voteCountB > voteCountD) {
            System.out.println("Candidate B is the winner!");
        } else if (voteCountC > voteCountA && voteCountC > voteCountB && voteCountC > voteCountD) {
            System.out.println("Candidate C is the winner!");
        } else if (voteCountD > voteCountA && voteCountD > voteCountB && voteCountD > voteCountC) {
            System.out.println("Candidate D is the winner!");
        } else {
            System.out.println("There is a tie!");
        }
    }
}
