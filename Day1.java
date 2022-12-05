import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day1{
  public static void main(String[] args){
    try{
      File file = new File("Day1.txt");
      Scanner input = new Scanner(file);
      int max = 0;
      int calCount = 0;
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(line.equals("")){
          if (calCount >= max){
            max = calCount;
          }
          calCount = 0;
        }
        else{
          calCount += Integer.parseInt(line);
        }
      }
      System.out.println(max);
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
    try{
      File file = new File("Day1.txt");
      Scanner input = new Scanner(file);
      int max1 = 0;
      int max2 = 0;
      int max3 = 0;
      int calCount = 0;
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(!line.equals("")){
          calCount += Integer.parseInt(line);
        }
        else{
          if (calCount >= max1){
            max3 = max2;
            max2 = max1;
            max1 = calCount;
          }
          else if(calCount >= max2){
            max3 = max2;
            max2 = calCount;
          }
          else if(calCount >= max3){
            max3 = calCount;
          }
          calCount = 0;
        }
      }
      System.out.println(max1+max2+max3);
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}
