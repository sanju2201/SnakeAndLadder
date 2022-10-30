package Service;
// Step 6 Create the SnakeLadder class andMain funtion, this is main class where all the coding to be done
import Domain.Board;
import Domain.Ladder;
import Domain.Player;
import Domain.Snake;

import java.util.*;
import java.util.List;

public class SnakeLadder {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Step 7 Board to be Created
        int totalCells = sc.nextInt();
        int totalSnakes = 9;
        int totalLadder = 6;
        int totalPlayer = sc.nextInt();


        Board board = new Board(totalCells,totalSnakes,totalLadder,totalPlayer);
           // step 9 to set the Snake on the board we have to Create the Snake list
        ArrayList<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(62,20));
        snakeList.add(new Snake(90,2));
        snakeList.add(new Snake(45,23));
        snakeList.add(new Snake(26,7));
        snakeList.add(new Snake(99,9));
        snakeList.add(new Snake(85,60));
        snakeList.add(new Snake(52,19));
        snakeList.add(new Snake(43,11));
        snakeList.add(new Snake(32,5));

        board.setSnakeList(snakeList);

        ArrayList<Ladder> ladderList = new ArrayList<>();

        ladderList.add(new Ladder(5,15));
        ladderList.add(new Ladder(50,75));
        ladderList.add(new Ladder(12,65));
        ladderList.add(new Ladder(20,67));
        ladderList.add(new Ladder(33,97));
        ladderList.add(new Ladder(29,69));

        board.setLadderList(ladderList);

        // here the board is Ready

        // Now add Players

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(101,"Sanju",0));
        players.add(new Player(102,"Nikki",0));

        GameService game = new GameService();

        game.playGame(board,players);


    }

}
