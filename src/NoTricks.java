import java.util.Random;

public class NoTricks extends Minigame {
    private int[] tricksTaken = {0, 0, 0, 0};
    public NoTricks(int dealer) {
        super(dealer);
        contract = Contract.NOTRICKS;
    }
    public void play() {
        Random random = new Random();
        for (int ii=0; ii<13; ii++) {
            tricksTaken[random.nextInt(4)] += 1;
        }
    }
    public int score(int player) {
        if (!gamePlayed) {
            return 0;
        }
        return -2 * tricksTaken[player];
    }
}
