import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day25{
  public static void main(String[] args){
    try{
      File file = new File("Day25.txt");
      Scanner input = new Scanner(file);
      int sum = 0;
      while(input.hasNextLine()){
        int lineSum = 0;
        String line = input.nextLine();
        int place = 1;
        for(int i = line.length() - 1; i >= 0; i--){
          if(line.charAt(i) != '-' || line.charAt(i) != '='){
            lineSum += Character.getNumericValue(line.charAt(i)) * place;
          }
          else if(line.charAt(i) == '-'){
            lineSum += -1 * place;
          }
          else if(line.charAt(i) == '='){
            lineSum += -2 * place;
          }
          place *= 5;
        }
        sum += lineSum;
      }
      System.out.println("Snafu sum : "+convertToSnafu(sum));
    }catch(FileNotFoundException e){
      // File not found
    }
  }
  public String convertToSnafu(int toBeConverted){
    String result = "";

    // find the number of decimal places there are in the final answer
    int decimalPlaces = 1;
    int valueCheck = 1;
    boolean intExceeded = false;
    while(!intExceeded){
      if(valueCheck * 5 <= toBeConverted){
        decimalPlaces++;
        valueCheck *= 5;
      }
      else{
        intExceeded = true;
      }
    }

    // converts to SNAFU
    for(int i = 0; i < decimalPlaces; i++){
      
    }




    while)
    for(int i =)
    int leftMostValue =
    for(int i = 0; i < toBeConvertedString.length(); i++){

    }
    return "";
  }
}
