package Service;

import Domain.Board;
import Domain.Ladder;
import Domain.Player;
import Domain.Snake;

import java.util.HashMap;
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
        int currentPlayerNumber = 0;
        int totalPlayers = playerList.size();

        // We have to map the start and ending point of Snake and Ladder
        HashMap<Integer,Integer> snakeMap = new HashMap<>();
        for(Snake i : board.getSnakeList()){
            snakeMap.put(i.getHeadPosition(),i.getTailPosition());
        }

        HashMap<Integer,Integer> ladderMap = new HashMap<>();
        for(Ladder i : board.getLadderList()){
            ladderMap.put(i.getStartPosition(), i.getEndPosition());
        }
        // Mian Game start
        while(!gameOver){

            Player playerPlaying = playerList.get(currentPlayerNumber);
            int diceNumber = random.nextInt(6)+min; // 6-1+1 = (0 to 5)+1 == 1 to 6
            int oldPos = playerPlaying.getCurrentPosition();

            // Optinization Done so that only start playing when got 1st 6
            if(diceNumber!=6 && oldPos==0){
                if(currentPlayerNumber+1 == totalPlayers){
                    currentPlayerNumber = 0;
                }
                else{
                    currentPlayerNumber++;
                }
                System.out.println(playerPlaying.getPlayerName()+" current position is "+
                       oldPos+ " and dice number is "+ diceNumber+" . Hence change the turn. ");
                continue;
            }
            int newPos;
            if(oldPos==0 && diceNumber==6){
                newPos=1;
            }
            else{
                newPos = oldPos + diceNumber;
            }

            // here newpos might be >100 then change turn
            // all possiblity discuss below
            if(newPos>totalCells){
                // change the turn and continue
                if(currentPlayerNumber+1 == totalPlayers){
                    currentPlayerNumber = 0;
                }
                else{
                    currentPlayerNumber++;
                }

                System.out.println(playerPlaying.getPlayerName()+
                        " has rolled a dice with a number "+ diceNumber+" and position is out of bound i.e. from " +
                        oldPos+" to "+ newPos +" which is not allowed. So Changing the player. ");

                continue;

            }

            // Checking Overlapping of ladder and snake
            while(ladderMap.containsKey(newPos) || snakeMap.containsKey(newPos)){

                // check ladder
                if(ladderMap.containsKey(newPos)){
                    newPos = ladderMap.get(newPos);
                }
                // check snake
                if (snakeMap.containsKey(newPos)) {
                    newPos = snakeMap.get(newPos);
                }
            }



            //Set the final Position
            playerPlaying.setCurrentPosition(newPos);
            System.out.println(playerPlaying.getPlayerName()+
                    " has rolled a dice with a number "+ diceNumber+" and position is change from " +
                    oldPos+" to "+ newPos);

            if(newPos==totalCells){
                gameOver = true;
                System.out.println("Game over and the winner is "+ playerPlaying.getPlayerName());

            }

            // Optimization Done when a player got 6, will have i more turn
            if(diceNumber==6){
                System.out.println("Do not change the turn as dice number is "+
                        diceNumber+ " . Continue with "+ playerPlaying.getPlayerName());
                continue;
            }

            //  Now change the player (0 indexed)
            if(currentPlayerNumber+1 == totalPlayers){
                currentPlayerNumber = 0;
            }
            else{
                currentPlayerNumber++;
            }


        }
    }
}
