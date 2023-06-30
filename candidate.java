
    import java.util.*;

    class Candidate {
        private int candidateId;
        private String candidateName;
        private int votesReceived;

        public Candidate(int candidateId, String candidateName) {
            this.candidateId = candidateId;
            this.candidateName = candidateName;
            this.votesReceived = 0;
        }

        public int getCandidateId() {
            return candidateId;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public int getVotesReceived() {
            return votesReceived;
        }

        public void incrementVotesReceived() {
            votesReceived++;
        }
    }

    class VotingSystem {
        private ArrayList<Candidate> candidates;

        public VotingSystem() {
            candidates = new ArrayList<Candidate>();
        }

        public void addCandidate(Candidate candidate) {
            candidates.add(candidate);
        }

        public Candidate getCandidateById(int candidateId) {
            for (Candidate candidate : candidates) {
                if (candidate.getCandidateId() == candidateId) {
                    return candidate;
                }
            }
            return null;
        }

        public void castVote(int candidateId) {
            Candidate candidate = getCandidateById(candidateId);
            if (candidate != null) {
                candidate.incrementVotesReceived();
                System.out.println("Your vote has been casted for " + candidate.getCandidateName() + ".");
            } else {
                System.out.println("Invalid candidate ID.");
            }
        }

        public void displayResults() {
            System.out.println("Results:");
            for (Candidate candidate : candidates) {
                System.out.println(candidate.getCandidateName() + " - " + candidate.getVotesReceived() + " votes");
            }
        }
    }

    class EVotingCollegeProject {
        public static void main(String[] args) {
            VotingSystem votingSystem = new VotingSystem();

            Candidate candidate1 = new Candidate(1, "shivam baliyan");
            Candidate candidate2 = new Candidate(2, "divya");
            Candidate candidate3 = new Candidate(3, "divyanshi");
            Candidate candidate4 = new Candidate(4, "deepanshi");

            votingSystem.addCandidate(candidate1);
            votingSystem.addCandidate(candidate2);
            votingSystem.addCandidate(candidate3);

            votingSystem.addCandidate(candidate4);


            System.out.println("Welcome to the e-voting system.");
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Enter 1 to cast a vote, 2 to display results, or 0 to exit.");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the candidate ID to vote for:");
                        int candidateId = scanner.nextInt();
                        votingSystem.castVote(candidateId);
                        break;
                    case 2:
                        votingSystem.displayResults();
                        break;
                    case 0:
                        System.out.println("Thank you for using the e-voting system.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 0);
        }
    }


