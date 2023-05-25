import java.util.Random;

public class NoTricks extends Minigame {
    private int[] tricksTaken = {0, 0, 0, 0};
    public NoTricks(int dealer) {
        super(dealer);
        contract = Contract.NOTRICKS;
    }
    public void makeDouble(int doubler, int doubled) {
        doubles[doubler][doubled] += 1;
        doubles[doubled][doubler] += 1;
    }
    public void play() {
        Random random = new Random();
        for (int ii=0; ii<13; ii++) {
            tricksTaken[random.nextInt(4)] += 1;
        }
    }
    private int baseScore(int player) {
        return -2 * tricksTaken[player];
    }
    public int score(int player) {
        if (!gamePlayed) {
            return 0;
        }
        int finalScore = baseScore(player);
        for (int opponent=0; opponent<4; opponent++) {
            finalScore += doubles[player][opponent] * (baseScore(player) - baseScore(opponent));
        }
        return finalScore;
    }
}
