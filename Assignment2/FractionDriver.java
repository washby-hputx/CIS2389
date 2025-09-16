import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FractionDriver{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("values.txt"));
      while(fin.hasNextInt()){
         int n = fin.nextInt();
         int d = fin.nextInt();
         Fraction f;
         if(d == 0){
            f = new Fraction(n,1);
         }else{
            f = new Fraction(n,d);
         }
         System.out.println("Current fraction is "+f);
      }
   }
}