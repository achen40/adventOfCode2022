import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day3{
public static void main(String[]arga){
try{
File file = new File(Day3.txt);
Scanner input = new Scanner(file);
String stringResult = "";
int intResult = 0;
while(input.hasNextLine()){
String line = input.nextLine();
String compart1 = line.substring(0,line.length() / 2);
String compart2 = line.substring(line.length/2);
for(int index = 0; index < (line.length() / 2); index++){
for(int i = 0; i < (line.length() / 2); i++){
if(compart1.chartAt(index) == compart2.charAt(i)){
stringResult += compart1.charAt(index);
}
}
}
}
for(int i = 0; i < stringResult.length; i++){
intResult += (int)(stringResult.charAt(i);
}
System.out.println(intResult);
} catch (FileNotFoundException e){
//File not found
}
}
}
