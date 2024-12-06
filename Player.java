public class Player implements Comparable<Player>{
   private String name;
   private Scorecard scorecard;
   
   public Player(String n){
      name = n;
      scorecard = new Scorecard();
   }
   
   public Scorecard getScorecard(){
      return scorecard;
   }
   
   public String getName(){
      return name;
   }
   
   public String toString(){
      return name + ": "+ scorecard.getOverallScore();
   }
   
   @Override
   public int compareTo(Player other){
      int playerScore = this.getScorecard().getOverallScore();
      int otherScore = other.getScorecard().getOverallScore();
      return playerScore - otherScore;
   }
}