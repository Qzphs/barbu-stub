abstract class Minigame {
    protected Contract contract;
    protected int dealer;
    protected boolean gamePlayed = false;
    public Minigame(int dealer) { this.dealer = dealer; }
    abstract public void play();
    abstract public int score(int player);
}
