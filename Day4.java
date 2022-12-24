import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day4{
  public static void main(String[] args) {
    try{
      File file = new File("Day4.txt");
      Scanner input = new Scanner(file);
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
      System.out.println("Count :"+count);

    } catch(FileNotFoundException e){
      // File not found
    }
  }
}
