import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day2{
  public static void main(String[] args){
    try{
      File file = new File("Day2.txt");
      Scanner input = new Scanner(file);
      int score = 0;
      while(input.hasNextLine()){
        String line = input.nextLine();
        char opp = line.charAt(0);
        char self = line.charAt(2);
        if(self == 'X'){
          score += 1;
          self = 'A';
        }
        else if(self == 'Y'){
          score += 2;
          self = 'B';
        }
        else if(self == 'Z'){
          score += 3;
          self = 'C';
        }
        if((int)self == (int)opp){
          score += 3;
        }
        else if((int)self == (int)opp + 1 || (int)self == (int)opp - 2){
          score += 6;
        }
      }
      System.out.println(score);
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
    try{
      File file = new File("Day2.txt");
      Scanner input = new Scanner(file);
      int score = 0;
      while(input.hasNextLine()){
        String line = input.nextLine();
        char opp = line.charAt(0);
        char self = 'X';
        char outcome = line.charAt(2);
        if(outcome == 'X'){ //lose
          if(opp == 'A'){
            self = 'C';
          }
          else{
            self = (char)((int)(opp) - 1);
          }
        }
        else if(outcome == 'Y'){ //draw
          score += 3;
          self = opp;
        }
        else if(outcome == 'Z'){ //win
          score += 6;
          if(opp == 'C'){
            self = 'A';
          }
          else{
            self = (char)((int)(opp) + 1);
          }
        }
        score += ((int)(self)-64);
      }
      System.out.println(score);
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}
