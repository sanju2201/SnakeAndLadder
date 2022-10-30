package Service;

import Domain.Board;
import Domain.Player;

import java.util.List;
import java.util.Random;

// Step 5 Create the GameServive Class and playGame method
public class GameService {

    public void playGame(Board board, List<Player> playerList){
        // Main logic of the code
    boolean gameOver = false;
        Random random=new Random();
        int min = 1;
        int max = 6;
        int totalCells = board.getTotalCells();
        int currentNumber = 1;
        int totalPlayers = playerList.size();

    }
}
