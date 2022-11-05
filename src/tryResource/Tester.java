package tryResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Tester {
   public static void main(String[] args) throws IOException {
      System.out.println(readData("try resourcess s"));
   } 
   static String readData(String message) throws IOException {
      Reader inputString = new StringReader(message);
      BufferedReader br = new BufferedReader(inputString);
      try (br) {// this is object nothing the try with resource.
         return br.readLine();
      }
   }
}