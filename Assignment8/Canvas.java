import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Canvas{
   protected char[][] canvas;
   
   public Canvas(){
      //TODO Create a constructor that defaults the canvas size to 10 by 10
   }
   
   public Canvas(int height, int width){
      //TODO Create a constructor to set the dimensions based on the values passed to the constructor
   }
   
   public void paint(char ch, int row, int col){
      //TODO set the charactare at the row and col value to the char passed
   }
   
   public void paintByInstructions(File f) throws FileNotFoundException{
      //TODO read the instructions in the file passed and paint based on the values
      //Each line in the file will be int int char where the first int is the row the second is the col and the char is to be painted at that position
   }
   
   public String toString(){
      //TODO create the string so it prints the canvas "framed" with the "=" sign on top and "|" down the sides
      // You can look at the ArtDriver file to see example outputs.
   }
}