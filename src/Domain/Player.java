package Domain;
// Step 4 Create the Player class playerId,name,current position and Consructor
public class Player {
    int playerId;
    String playerName;
    int currentPosition;

    public Player(int playerId, String playerName, int currentPosition) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getPlayerName() {
        return playerName;
    }
}
