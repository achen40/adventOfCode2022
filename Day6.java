import java.util.*;
import java.io.*;
public class Day6{
  public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(new File("Day6.txt"));
    String inputString = input.next();
    // for(int i = 4; i < inputString.length(); i++){
    //   if(uniqueString1(inputString.substring(i-4,i))){
    //     System.out.println("Answer to part 1 : "+i);
    //     i += inputString.length();
    //   }
    // }
    for(int i = 14; i < inputString.length(); i++){
      if(uniqueString(inputString.substring(i-14,i))){
        System.out.println("Answer to part 2 : "+i);
        i += inputString.length();
      }
    }
  }
  public static boolean uniqueString(String word){
    if(word.length() == 0){
      return true;
    }
    else{
      char letter = word.charAt(word.length() - 1);
      for(int i = 0; i < word.length() - 1; i++){
        if(letter == word.charAt(i)){
          return false;
        }
      }
      return uniqueString(word.substring(0,word.length() - 1));
    }
  }
}
