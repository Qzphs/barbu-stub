import java.util.ArrayList;

public class Game {
    private ArrayList<Minigame> minigames = new ArrayList<>();
    public Game() {
    }
    public void addGame(Contract contract, int dealer) {
        switch (contract) {
            case NOTRICKS: minigames.add(new NoTricks(dealer));
        }
    }
    public int score(int player) {
        int runningSum = 0;
        for (Minigame minigame: minigames) {
            runningSum += minigame.score(player);
        }
        return runningSum;
    }
}
