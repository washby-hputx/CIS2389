public class Fraction implements Comparable<Fraction>{
   protected int numerator;
   protected int denominator;
   
   public Fraction(int n, int d){
      numerator = n;
      denominator = d;
   }
   
   public Fraction(int n){
      numerator = n;
      denominator = 1;
   }
   
   public String toString(){
      return numerator + "/" + denominator;
   }
   
   public int getNumerator(){ return numerator; }
   public int getDenominator(){ return denominator; }
   
   public int compareTo(Fraction f){
      return numerator*f.getDenominator() - denominator*f.getNumerator();
   }
   
   public void reduce(){
      int gcd = findGCD();
      numerator /= gcd;
      denominator /= gcd;
   }
   
   private int findGCD(){
      int min = Math.min(numerator, denominator);
      while(numerator % min != 0 && denominator % min != 0){
         min--;
      }
      return 1;
   }
}