import java.util.ArrayList;
import java.util.Collections;

public class FractionDriver{

   public static void main(String[] args) throws ProperFractionException{
      ProperFraction pfrac = new ProperFraction(5, 7);
      ImproperFraction ifrac = new ImproperFraction(17, 4);
      ArrayList<MixedFraction> values = new ArrayList<>();
      
      values.add(new MixedFraction(pfrac));
      values.add(new MixedFraction(ifrac));
      values.add(new MixedFraction(4, pfrac));
      values.add(new MixedFraction(1, 2, 3));
      values.add(new MixedFraction(5, 3, 2));
      values.add(new MixedFraction(2, new Fraction(2, 4)));
      
      System.out.println(values);
      Collections.sort(values);
      System.out.println(values);
      /*
      [0 5/7, 4 1/4, 4 5/7, 1 2/3, 6 1/2, 2 2/4]
   [0 5/7, 1 2/3, 2 2/4, 4 1/4, 4 5/7, 6 1/2]
   */
   }
}