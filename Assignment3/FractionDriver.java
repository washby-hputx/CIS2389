import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class FractionDriver{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("values.txt"));
      Fraction[] fractionList = new Fraction[1];
      
      int count = 0;
      
      while(fin.hasNextInt()){
         int n = fin.nextInt();
         int d = fin.nextInt();
         Fraction f;
         if(d == 0){
            f = new Fraction(n,1);
         }else{
            f = new Fraction(n,d);
         }
         if(count >= fractionList.length){
            fractionList = resizeArray(fractionList, fractionList.length*2);
         }
         fractionList[count] = f;
         count++;
      }
      System.out.println(Arrays.toString(fractionList));
      fractionList = resizeArray(fractionList, count);
      System.out.println(Arrays.toString(fractionList));
      mySort(fractionList);
      for(int i=0; i<fractionList.length; i++){
         System.out.print(fractionList[i]+" -> ");
         fractionList[i].reduce();
         System.out.println(fractionList[i]);
      }
      
   }
   
   public static Fraction[] resizeArray(Fraction[] a, int newSize){
      Fraction[] temp = new Fraction[newSize];
      
      for(int i=0; i<Math.min(newSize, a.length); i++){
         temp[i] = a[i];
      }
      
      return temp;
   }
   
   public static void mySort(Fraction[] a){
      for(int i=1; i<a.length; i++){
         Fraction key = a[i];
         int j = i-1;
         
         while((j >= 0) && ((a[j].getNumerator()*key.getDenominator()) > (key.getNumerator() * a[j].getDenominator()))){
            a[j+1] = a[j];
            j--;
         }
         a[j+1] = key;
      }
   }
}