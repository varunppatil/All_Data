package Practice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

public class CG_ProgrammingIsGood {
 public static void main(String[] args) {
     
     String str = "Programing is good";
     String [] strArr = str.split(" ");
     
     StringBuffer bf = new StringBuffer();
     
     for(int i=strArr.length-1;i>=0;i--){
      //   System.out.println(bf.toString().isEmpty());
      //   System.out.println("".isBlank());
         bf.append(" "+strArr[i]);
         
     }
     System.out.println(bf.toString().trim());
     
     
 }
}