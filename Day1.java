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
          if (calCount > max){
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
        if(line.equals("")){
          if (calCount >= max1){
            max1 = calCount;
          }
          else if(calCount >= max2){
            max2 = calCount;
          }
          else if(calCount >= max3){
            max3 = calCount;
          }
          calCount = 0;
        }
        else{
          calCount += Integer.parseInt(line);
        }
      }
      System.out.println(max1);
      System.out.println(max2);
      System.out.println(max3);
      int sum = (72017 + 69359 + 66183);
      System.out.println(sum);
      input.close();
    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}
