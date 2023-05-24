abstract class Minigame {
    protected Contract contract;
    protected boolean gamePlayed = false;
    abstract public void play();
    abstract public int score(int player);
}
