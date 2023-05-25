abstract class Minigame {
    protected Contract contract;
    protected int dealer;
    protected int[][] doubles;
    protected boolean gamePlayed = false;
    public Minigame(int dealer) {
        this.dealer = dealer;
        this.doubles = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
    }
    abstract public void play();
    abstract public int score(int player);
}
