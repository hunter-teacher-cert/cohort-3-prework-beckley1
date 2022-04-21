import java.io.*;
import java.util.*;

public class Loops{

  //exercise 2 Chap. 7
  public static double squareRoot(double a){
    double guess = a/2;
    double newGuess = a/2;
    double difference = 0;
    do{
      guess = newGuess;
      newGuess = (guess + a/guess)/2;
      difference = Math.abs(newGuess - guess);
      System.out.println(difference);
      }
      while(difference > .00001);
      return newGuess;
      }
  //exercise 3 Chap. 7
  public static double power(double x, int n){
    
  }

  //exercise 4 Chap. 7
  public static double factorial(){

    
  }
  
  public static void main(String[] args){
    squareRoot(9.0);
 //not working?
}
}
