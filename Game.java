import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Game{
   private List<Player> players;
   private Player currentPlayer;
   private List<Die> dice;
   private int round;
   private Scanner keyboard = new Scanner(System.in);
   
   public Game(List<Player> p){
      dice = new ArrayList<Die>();
      players = p;
      for(int i=0; i<5; i++){
         Die d = new Die();
         d.roll();
         dice.add(d);
      }
   }

   public void startGame(){
      currentPlayer = players.get(0);
      round = 1;
   }
   
   public void playersTurn(){
      for(Die d: dice){
         d.roll();
      }
      int count = 0;
      int[] intChoice = new int[0];
      do{//do while to limit the number of rerolls
         //Collections.sort(dice);
         System.out.println("Dice = "+dice);
         System.out.print("Enter index of dice to reroll or -1 to keep all: ");
         String[] strChoice = keyboard.nextLine().split(",");
         intChoice = new int[strChoice.length];
         for(int i=0; i<strChoice.length; i++){
            intChoice[i] = Integer.parseInt(strChoice[i]);
         }
         System.out.println(Arrays.toString(intChoice));
         count++;
         //TODO given the array intChoice if it does not contain -1 then reroll the appropriate dice
         if(intChoice[0] != -1){
            //reroll appropriate dice
         }
      }while(count < 3 && intChoice[0] != -1);
      //Now that the rolls are done, show the available options to put in the scorecard
      //Have the user select an option and update the score
      System.out.println("Available options are:");
      ArrayList<Category> availableCategories = currentPlayer.getScorecard().availableCategories();
      for(int i=0; i<availableCategories.size(); i++){
         System.out.println((i+1)+") "+availableCategories.get(i));
      }
      System.out.print(currentPlayer+" select an option: ");
      int selection = keyboard.nextInt();
      keyboard.nextLine();
      //TODO based on selection update the scorecard
      availableCategories.get(selection-1).setScore(dice);
   }

   public void nextTurn(){
      int nextPlayerIndex = (players.indexOf(currentPlayer)+1) % players.size();
      if(nextPlayerIndex == 0){
         round++;
      }
      currentPlayer = players.get(nextPlayerIndex);
   }

   public Boolean isGameOver(){
      for(Player p: players){
         if(p.getScorecard().availableCategories().size() > 0){
            return false;
         }
      }
      return true;
      // return round > 13;
   }

   public void declareWinner(){
      //TODO find and declare winner
      ArrayList<Player> tempPlayers = new ArrayList<Player>();
      for(Player p: players){
         tempPlayers.add(p);
      }
      Collections.sort(tempPlayers, Collections.reverseOrder());
      System.out.println(tempPlayers);
   }
   
   public Player getCurrentPlayer(){
      return currentPlayer;
   }
   
   public int getRound(){
      return round;
   }
}