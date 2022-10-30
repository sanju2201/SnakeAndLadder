package Domain;
// Step 3 Create the Board class totalCalls,numberOfSnakes, numbrOfLadder,numberOfPlayers,SnakerList,LadderList and Consructor
import java.util.List;

public class Board {
  int totalCells;
  int numberOfSnakes;
  int numberOfLadder;
  int numberOfPlayers;
  List<Snake> snakeList;
  List<Ladder> ladderList;

    public Board(int totalCells, int numberOfSnakes, int numberOfLadder, int numberOfPlayers) {
        this.totalCells = totalCells;
        this.numberOfSnakes = numberOfSnakes;
        this.numberOfLadder = numberOfLadder;
        this.numberOfPlayers = numberOfPlayers;
    }

    // step 8 before calling list create getter setter on board class
public void setSnakeList(List<Snake> snakeList){
        this.snakeList = snakeList;
}
public void setLadderList(List<Ladder> ladderList){
        this.ladderList= ladderList;
}

    public int getTotalCells() {
        return totalCells;
    }

    public List<Snake> getSnakeList() {
        return snakeList;
    }

    public List<Ladder> getLadderList() {
        return ladderList;
    }
}
