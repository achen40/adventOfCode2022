import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day3{
  public static void main(String[]arga){
    try{
      File file = new File("Day3.txt");
      Scanner input = new Scanner(file);
      String stringResult = "";
      while(input.hasNextLine()){
        String line = input.nextLine();
        String compart1 = line.substring(0,line.length() / 2);
        String compart2 = line.substring(line.length()/2);
        for(int i = 0; i < compart1.length(); i++){
          for(int i0 = 0; i0 < compart2.length(); i0++){
            if(compart1.charAt(i) == compart2.charAt(i0)){
              stringResult += compart1.charAt(i);
              i += compart1.length();
              i0 += compart2.length();
            }
          }
        }
      }
      int prioritySum = 0;
      for(int i = 0; i < stringResult.length(); i++){
        if((int)(stringResult.charAt(i)) >= 97){
          prioritySum += ((int)(stringResult.charAt(i)) - 96);
        }
        else{
          prioritySum += ((int)(stringResult.charAt(i)) - 38);
        }
      }
      System.out.println("Priority sum : "+prioritySum);
    } catch (FileNotFoundException e){
      //File not found
    }

    try{
      File file = new File("Day3.txt");
      Scanner input = new Scanner(file);
      int everyThreeLines = 1;
      String line1 = "";
      String line2 = "";
      String line3 = "";
      String result = "";
      while(input.hasNextLine()){
        if(everyThreeLines == 1){
          line1 = input.nextLine();
        }
        else if(everyThreeLines == 2){
          line2 = input.nextLine();
        }
        else if(everyThreeLines == 3){
          line3 = input.nextLine();
        }
        else{
          everyThreeLines = 0;
        }

        if(everyThreeLines == 3){
          for(int i = 0; i < line1.length(); i++){
            for(int i0 = 0; i0 < line2.length(); i0++){
              for(int i1 = 0; i1 < line3.length(); i1++){
                if(line3.charAt(i1) == line1.charAt(i) && line3.charAt(i1) == line2.charAt(i0)){
                  result += line3.charAt(i1);
                  i += line1.length();
                  i0 += line2.length();
                  i1 += line3.length();
                }
              }
            }
          }
        }
        everyThreeLines++;
      }
      int prioritySum = 0;
      for(int i = 0; i < result.length(); i++){
        if((int)(result.charAt(i)) >= 97){
          prioritySum += ((int)(result.charAt(i)) - 96);
        }
        else{
          prioritySum += ((int)(result.charAt(i)) - 38);
        }
      }
      System.out.println("Priority sum : "+prioritySum);
    } catch(FileNotFoundException e){
      //File not found
    }
  }
}
