package Domain;
// Step 2 Create the Ladder class startPosition, Endposition and Consructor
public class Ladder {
    int startPosition;
    int endPosition;

    public Ladder(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
