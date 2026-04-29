/**
 * Problem: Player Performance Analysis
 *
 * Tasks:
 * - Create a Player class (POJO)
 * - Store 5 players in an array
 * - Calculate batting average (runs / matches)
 * - Find player with highest average
 * - Find players with above team average
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

// POJO Class
class Player {

    private int playerId;
    private String name;
    private int runs;
    private int matches;

    public Player(int playerId, String name, int runs, int matches) {
        this.playerId = playerId;
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    public int getPlayerId() { return playerId; }
    public String getName() { return name; }
    public int getRuns() { return runs; }
    public int getMatches() { return matches; }

    // Calculate batting average
    public double getBattingAverage() {
        return (matches == 0) ? 0 : (double) runs / matches;
    }

    // Display player details
    public void display() {
        System.out.printf(
            "ID: %d | Name: %s | Runs: %d | Matches: %d | Avg: %.2f%n",
            playerId, name, runs, matches, getBattingAverage()
        );
    }
}

// Main Class
public class PlayerAnalysis {

    public static void main(String[] args) {

        Player[] players = {
            new Player(1, "Virat", 12000, 250),
            new Player(2, "Rohit", 10000, 230),
            new Player(3, "Dhoni", 10500, 300),
            new Player(4, "Kane", 8000, 180),
            new Player(5, "Joe", 9500, 210)
        };

        Player highest = findHighestAveragePlayer(players);
        double teamAverage = calculateTeamAverage(players);

        System.out.println("Player with Highest Batting Average:");
        highest.display();

        System.out.println("\nPlayers Above Team Average:");
        displayAboveAverage(players, teamAverage);

        System.out.printf("\nTeam Average: %.2f%n", teamAverage);
    }

    // Find player with highest average
    public static Player findHighestAveragePlayer(Player[] players) {

        Player highest = players[0];

        for (Player p : players) {
            if (p.getBattingAverage() > highest.getBattingAverage()) {
                highest = p;
            }
        }

        return highest;
    }

    // Calculate team average
    public static double calculateTeamAverage(Player[] players) {

        double total = 0;

        for (Player p : players) {
            total += p.getBattingAverage();
        }

        return total / players.length;
    }

    // Display players above team average
    public static void displayAboveAverage(Player[] players, double teamAverage) {

        for (Player p : players) {
            if (p.getBattingAverage() > teamAverage) {
                p.display();
            }
        }
    }
}