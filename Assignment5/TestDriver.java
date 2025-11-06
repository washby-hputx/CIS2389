/**
 *  You need to create the needed files to make the following work with ProperFraction and ImproperFraction 
 * inheriting down from the Fraction class to make it easier. Make sure you create the needed ProperFractionException
 * and implement the needed interfaces.
 *
**/
import java.util.Arrays;


public class TestDriver{
   public static void main(String[] args){
      ImproperFraction[] irfs = new ImproperFraction[7];
      ProperFraction[] pfs = new ProperFraction[5];
      
      irfs[0] = new ImproperFraction(10, 20);
      irfs[1] = new ImproperFraction(13, 15);
      irfs[2] = new ImproperFraction(2, 7);
      irfs[3] = new ImproperFraction(3, 5);
      irfs[4] = new ImproperFraction(1, 10);
      irfs[5] = new ImproperFraction(3, 2);
      irfs[6] = new ImproperFraction(4, 10);
      
      int i=0;
      while(i<5){
         try{
            pfs[i] = new ProperFraction(irfs[i].getNumerator(), irfs[i].getDenominator());
            i++;
         }catch(ProperFractionException e){
            System.out.println("Could not convert "+irfs[i]+" to proper fraction.");
         }
      }
      
      System.out.print("ImproperFraction array = "+irfs+"\nSoring array...");
      Arrays.sort(irfs);
      System.out.println("It is now "+irfs);
      
      System.out.print("ProperFraction array = "+pfs+"\nSoring array...");
      Arrays.sort(pfs);
      System.out.println("It is now "+pfs);
   }
}
