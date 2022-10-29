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
}
