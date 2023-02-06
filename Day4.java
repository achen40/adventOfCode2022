import java.util.*;
import java.io.*;
public class Day4{
  public static void main(String[] args) throws Exception{
      Scanner input = new Scanner(new File("Day4.txt"));
      int count = 0;
      while(input.hasNextLine()){
        String assignment = input.nextLine();
        String[]pairs = assignment.split(",");
        String[]elf1 = pairs[0].split("-");
        String[]elf2 = pairs[1].split("-");
        int elf1min = Integer.parseInt(elf1[0]);
        int elf1max = Integer.parseInt(elf1[1]);
        int elf2min = Integer.parseInt(elf2[0]);
        int elf2max = Integer.parseInt(elf2[1]);
        if((elf1min >= elf2min && elf1max <= elf2max) || (elf2min >= elf1min && elf2max <= elf1max)){
          count++;
        }
      }
      System.out.println("Count : "+count);

      File file = new File("Day4.txt");
      Scanner input1 = new Scanner(new File("Day4.txt"));
      int totalPairs = 0;
      int overlapCount = 0;
      while(input1.hasNextLine()){
        totalPairs++;
        String assignment = input1.nextLine();
        String[]pairs = assignment.split(",");
        String[]elf1 = pairs[0].split("-");
        String[]elf2 = pairs[1].split("-");
        int elf1min = Integer.parseInt(elf1[0]);
        int elf1max = Integer.parseInt(elf1[1]);
        int elf2min = Integer.parseInt(elf2[0]);
        int elf2max = Integer.parseInt(elf2[1]);
        if(elf1min >= elf2min && elf1max <= elf2max){
          overlapCount++;
        }
        else if (elf2min >= elf1min && elf2max <= elf1max){
          overlapCount++;
        }
      }
      System.out.println("Count : "+(totalPairs - count));
  }
}
